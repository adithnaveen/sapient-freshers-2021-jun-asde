// introducing new features of ES6 with loops 

const names =["Priyadarshan", "Suhas", "Prateek", "Kanav", "Amit", "Ann"]; 

names.forEach(name => {
    console.log(name.charAt(0))
})

console.log("--------------------------------------");
/// better syntax 
let firstChars = names.map(name =>   name.charAt(0)); 

console.log(firstChars);
// iterate each element 
let firstCharsArr = names.map(name =>   name.charAt(0)).forEach(val => {
    console.log(val);
})
console.log(firstCharsArr);


// to find prateek position 
// for(i=0; i<names.length; i++) {
//     if(names[i]==="Prateek") {
//         console.log("Found at " + i );
//         break; 
//     }
// }

const foundPos = names.findIndex(name => name ==="Prateek Kumar");
console.log(foundPos);

const filterResult = names.filter(name => name.length>5); 
console.log(filterResult);