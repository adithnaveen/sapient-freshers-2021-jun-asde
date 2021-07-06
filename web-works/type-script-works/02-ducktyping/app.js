let duck = {
    color: "white",
    apprearence: "feathers",
    quack: function duck_quacks(how) {
        console.log("Duck Quacks Like QUAK QUAK ", how);
    }
};
let human = {
    color: "brown",
    appreance: "hands & legs",
    quack: function human_quacking(how) {
        console.log("Human quaks like ........... ", how);
    }
};
// check who can quack 
function check(who) {
    if (who.apprearence === 'feathers' && (typeof who.quack === 'function')) {
        who.quack("i can quack like DUCK");
        return true;
    }
    return false;
}
check(duck);
check(human);
