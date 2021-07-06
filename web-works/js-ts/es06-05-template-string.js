// working with template strings 
const name1= "Krishna"; 
const name2 = "Rohit"; 
const age = 12; 

console.log("Name 1 " + name1 +" Name 2 " + name2); 
console.log("Name 1 ", name1 +" Name 2 " + name2);
console.log(`Name 1 ${name1}, Name 2 ${name2}`)
console.log(`${age>18?"Major":"Minor"}`);

//function with template string 
function myFunction(string, p1, p2, p3) {
    console.log(string);
    console.log("P1 : " , p1);
    console.log("P2 : " , p2);
    console.log("P3 : " , p3);        
}

// myFunction("One", "Two", "Three")
myFunction `Name 1 ${name1}, Name 2 ${name2}, age is ${age>20?"Major":"Minor"}`

// in a function if you have spread operator then it should be last 
// it has got capability to take any number of arguments 
// and max you can have only 1 rest operator in function 
function myRestFunction(type, ...products) {
    console.log(type);
    console.log(products);
}

myRestFunction("Electronics", new Array("laptop", "keyboard", "presenter"));  
myRestFunction("conmetics");  
myRestFunction `Name 1 ${name1}, Name 2 ${name2}, age is ${age>20?"Major":"Minor"}`



