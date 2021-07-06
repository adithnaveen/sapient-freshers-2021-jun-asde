// interface **** interface does not generate any .js code 

interface Todo {
    name: string, 
    complete? : boolean, 
    state:TodoState
}

enum TodoState {NEW, ACTIVE, ALL, COMPLETED}


interface ITodoService {
    add(todo:Todo ) : Todo; 
    delete(todo:Todo) : void; 
    getAll() : Todo []; 
    getById(index: number) : Todo; 
}

class TodoService implements ITodoService {
    add(todo: Todo): Todo {
        throw new Error("Method not implemented.");
    }
    delete(todo: Todo): void {
        throw new Error("Method not implemented.");
    }
    getAll(): Todo[] {
        throw new Error("Method not implemented.");
    }
    getById(index: number): Todo {
        throw new Error("Method not implemented.");
    }
    
}



abstract class Shape {
    abstract area() : void; 
    hi(): void {
        console.log("i'm hi in shape, concrete method... ");
        
    }
}

class Rectangle extends Shape {
    area(): void {
        console.log("len x bre");
        
    }
    
}