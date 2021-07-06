// class based writing code 

class Person {
    constructor(name, city="Bengaluru") {
        this.name = name; 
        this.city  =city;

    }

    display() {
        console.log(`Name : ${this.name}`)
        console.log(`City : ${this.city}`)
    }
}

class Employee extends Person {
    constructor(empid, name, city) {
        super(name, city)
        this.empid = empid; 
    }
    display() {
        console.log(`Name : ${this.name}`)
        console.log(`City : ${this.city}`)
        console.log(`EmpId : ${this.empid}`)

    }
}

let  p = new Person("Hemanth"); 
console.log(p);
p.display();
console.log(typeof p);

// let val = "hello"
// console.log(typeof val);

let e = new Employee(101, "Aarsh", "Delhi"); 
e.display();
