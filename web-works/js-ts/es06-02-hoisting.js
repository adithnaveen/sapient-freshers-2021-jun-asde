
helloWorld();
function helloWorld() {
    console.log('====================================');
    console.log("Hello World Function ");
    console.log('====================================');
}

// if the function is defined to a variable then it is not hoisted -> to arrow style 
var helloWorld1 = () =>  {
    console.log("HELLOWORLD1");
}
helloWorld1()

console.log(myval);

var myval=100; 

console.log(myval);


// console.log(new Emp());
// class Emp {}

