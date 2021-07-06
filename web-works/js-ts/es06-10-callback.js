// working with callbacks

console.log("Start of Script ");

function divide(num1, num2, callback) {
    if(typeof callback !=='function') {
        throw new Error("sorry please pass last arg as function")
    }
    setTimeout(() => {

        if(typeof num1 !=='number') {
            callback("Please pass first arg as number");
            return; 
        }

        if(typeof num2 !=='number') {
            callback("Please pass second arg as number");
            return; 
        }

        if(num2 ===0) {
            callback("Sorry Please pass second arg as non zero")
            return; 
        }

        callback(null, num1 / num2)
    }, 1000);
}

let num1 = 10; 
let num2 = 6;
let result = divide(num1, num2, (err, result) => {
    if(err) {
        console.log("Error " , err);
    }else {
        console.log("Result : " + result);
    }
}); 

console.log("End of Script ");