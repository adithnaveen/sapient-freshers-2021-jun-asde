exports.generateText =(name, age) => {
    return `${name} is ${age} years old`
}

// notEmpty isString 
exports.validateInput =(text, notEmpty, isNumber) => {
    console.log(typeof text);
    if(!text) {return false;}
    // check only for spaces & Text 
    if(notEmpty && text.trim().length ===0) {return false;}

    // parseInt(text) or +text and number 
    if(isNumber && +text ===NaN){return false;}

    return true; 
}

exports.checkAndGenerateText =(name, age) => {
    if(!this.validateInput(name, true,false) || 
        !(this.validateInput(age, false, true))){
            return false;
        }

        return this.generateText(name, age)
}


exports.createElement = (type, text, className) => {
    // should create an element and return 
    const element = document.createElement(type); 
    element.classList.add(className)
    element.textContent = text; 
    return element;
}
