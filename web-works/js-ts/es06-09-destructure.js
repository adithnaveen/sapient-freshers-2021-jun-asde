// destructuring 

let p1 = {
    name:"Naveen", 
    passport:"12345", 
    email:"naveen@gmail.com", 
    address: {
        hno:123, 
        city:"Bengaluru",
        state:"KA", 
        country:"IN"
    }
};

console.log(p1);

let personName = p1.name; 
let personPassport = p1.passport;
let personEmail = p1.email; 

console.log(`Name : ${personName}, Passport : ${personPassport}, Email : ${personEmail}`);

let {name, passport, email} = p1; 
console.log(`Name : ${name}, Passport : ${passport}, Email : ${email}`);

let {name:name2, passport:passport2} = p1
console.log(`Name : ${name2}, Passport : ${passport2}`);

let {address} = p1; 
console.log(address);

let {state } = address; 
console.log(state);



let nums =[45,65,98,32,987,3,456]; 
let [num1, num2, ...otherValues] = nums; 
console.log(`${num1}, ${num2}`);
console.log(otherValues);