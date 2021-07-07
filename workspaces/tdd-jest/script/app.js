const {createElement, generateText, validateInput} = require("./util")

const initApp =() => {
    document.querySelector("#btnAddUser").addEventListener("click", addUser); 
}

const addUser =() => {
    const newUserName = document.querySelector("input#name").value
    const newUserAge = document.querySelector("input#age").value

    // validation goes here 
    if(
        !validateInput(newUserName, true, false) && 
        !validateInput(newUserAge, false, true)) {
            return; 
        }
        
    const userList = document.querySelector(".user-list")
    const outputText = generateText(newUserName, newUserAge)

    const element = createElement("li", outputText, "user-item")
    
    userList.appendChild(element)

    document.querySelector("input#name").value =''
    document.querySelector("input#age").value =''
    document.querySelector("input#name").focus() 
}

initApp()