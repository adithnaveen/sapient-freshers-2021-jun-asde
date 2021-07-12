// working with redux 

import './index.css';
import 'bootstrap/dist/css/bootstrap.css';

import {createStore} from 'redux';


const initialState = ['Rizwan', 'Suhas']; 

// from end user 
// action = {type:"ACTION_TYPE", data:"payload"}
const reducer = (state = initialState, action) => {

    switch (action.type) {
        case "ADD_NAME":
            return [...state, action.data]; 
    
        case "DELETE_NAME":
           let names = [...state]; 
           names.splice(action.data, 1); 
           return names; 
         
        default:
            return state; 
    }

}

const store = createStore(reducer); 
window['store'] =store;

// data is stored in store 
const submitHandler = (evt) => {
    evt.preventDefault();
    let nameField = document.getElementById("name"); 
    let name = nameField.value; 
    const action ={type:"ADD_NAME", data:name}; 
    store.dispatch(action); 

    nameField.value=""; 
    nameField.focus();
}

document.getElementById("formName").onsubmit = submitHandler; 


const updateList = () => {
    let names = store.getState(); // returns an array of names 
    let list = names.map((name, index) => 
        '<li class="list-group-item" value='
            +index+'>'
            +name+'<button onclick="deleteName('
            +index+')" class="btn btn-danger">X</button></li>'); 


    let listItem = list.join();
    document.getElementById("namesList").innerHTML = listItem;
}

// to show when you load the application
updateList();
store.subscribe(updateList); 


window['deleteName'] = (index) => {
    const action = {type:'DELETE_NAME', data: index}; 
    store.dispatch(action); 
  }
  


