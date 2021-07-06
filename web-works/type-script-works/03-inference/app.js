function calculateAge(birthYear) {
    let noOfYears = Date.now() - birthYear;
    return noOfYears.toString();
}
function namesLength(firstName, lastName) {
    return firstName.length + lastName.length;
}
console.log(namesLength("Aarsh", "verdhen"));
function totalLength(arr, str) {
    let total = arr.length + str.length;
    return total;
}
let retVal = totalLength([12, 23, 34, 55], "Kanav");
console.log(retVal);
//// data union 
function totalLength1(param1, param2) {
    if (param1 instanceof Array) {
        param1.push("new value");
    }
    if (param1 instanceof String) {
        param1.substr(1, 4);
    }
    let total = param1.length + param2.length;
    return total;
}
function display(param1) {
    if (param1 instanceof Number) {
        return param1.valueOf() + 100;
    }
    if (param1 instanceof String) {
        return "Hello " + param1;
    }
}
