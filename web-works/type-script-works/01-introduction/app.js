console.log("i'm from TS file");
let mystring = "Hello World";
console.log("String value ", mystring);
let mynumber = 100;
let flag = true;
let anytypevar = "hello";
let mynumbers = [12, 23, 345, 6];
console.log(mynumbers);
var COLOR;
(function (COLOR) {
    COLOR[COLOR["BLACK"] = 0] = "BLACK";
    COLOR[COLOR["BLUE"] = 1] = "BLUE";
    COLOR[COLOR["RED"] = 2] = "RED";
})(COLOR || (COLOR = {}));
console.log(COLOR.BLACK);
let myfavcolor = COLOR.BLUE;
class Hello {
}
