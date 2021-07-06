// working with promise 

function divide(num1, num2) {
    return new Promise((resolve, reject) => {
        if(typeof num1 !== 'number') {
            reject("Sorry First arg should be number"); 
            return; 
        }
        
        if(typeof num2 !== 'number') {
            reject("Sorry Second arg should be number"); 
            return; 
        }

        if(num2 === 0) {
            reject("Dont Divide By Zero"); 
            return ; 
        }
        
        resolve(num1/num2);
    })
}


console.log("Start ");
let num1 = 100; 
let num2 = 66; 
// version 1 
    // divide(num1, num2)
    //     .then(res => console.log("Result : " + res))
    //     .catch(err => console.log("Error : " + err))

    // version 2
// let result = divide(num1, num2); 
// result.then(res => console.log("Result : " + res))
// result.catch(err => console.log("Error : " + err))

// version 3 
// try{
//     let result = divide(num1, num2);
//     result.then(res => console.log("Result : " + res))
// }catch(err) {
//     console.log("Err : "+ err);
// }


// es7 compliant code 



setTimeout(async () => {
    try {
        let result = await divide(num1, num2);
        console.log(result);
    }catch(err) {
        console.log("err : " + err);
    }
}, 0);

console.log("End ");


