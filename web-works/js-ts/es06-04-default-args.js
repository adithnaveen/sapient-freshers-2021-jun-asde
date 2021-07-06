// to show working of default args 
// function calculateTax(salary, tax, incentives) {
//     if(tax===undefined) {
//         tax = 0;
//     }
//     if(incentives === undefined) {
//         incentives = 0; 
//     }
//     return salary - tax + incentives; 
// }

// function calculateTax(salary, tax, incentives) {
//     tax = tax || 0;    // tax==undefined?0:tax 
//     incentives = incentives || 0; 
//     return salary - tax + incentives; 
// }

function calculateTax(salary, tax=0, incentives=0) {
    return salary - tax + incentives; 
}

let netSalary = calculateTax(1000, undefined,  120); 
console.log(netSalary);


// ===, !==, ==, != 
// console.log(10==="10");
// console.log(100/"20");