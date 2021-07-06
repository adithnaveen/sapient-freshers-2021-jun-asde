// interface **** interface does not generate any .js code 
var TodoState;
(function (TodoState) {
    TodoState[TodoState["NEW"] = 0] = "NEW";
    TodoState[TodoState["ACTIVE"] = 1] = "ACTIVE";
    TodoState[TodoState["ALL"] = 2] = "ALL";
    TodoState[TodoState["COMPLETED"] = 3] = "COMPLETED";
})(TodoState || (TodoState = {}));
class TodoService {
    add(todo) {
        throw new Error("Method not implemented.");
    }
    delete(todo) {
        throw new Error("Method not implemented.");
    }
    getAll() {
        throw new Error("Method not implemented.");
    }
    getById(index) {
        throw new Error("Method not implemented.");
    }
}
