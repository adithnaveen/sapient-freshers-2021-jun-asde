// working with spread operator (...)

let nums =[45,65,98,32,987,3,456]; 
console.log(nums);

let newNums = [100, 200, ...nums];
console.log(newNums);

let newNums1 = newNums; 
console.log(newNums1);
newNums1.push(888); 
console.log(newNums);

let address = {city:"Bengaluru", pin:"560053"}; 
let employee = {name:"Harry", email:"Harry@barry.com", ...address}

console.log(address);
console.log(employee);
address.country="india"; 
console.log(employee);

let employee1 = {...employee}; 
console.log(employee1===employee);
