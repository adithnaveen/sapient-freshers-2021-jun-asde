import { ADD_CONTACT, DELETE_CONTACT, FETCH_CONTACTS } from "../types/contants";

const URL ="http://localhost:4000/contacts";

// 1. hit to the end point get the data 
// 2. on ce you get the data update the store (async)

export const  fetchContacts = () =>  async (dispatch) => {
    let resp = await fetch(URL); 
    let contacts = await resp.json();
    let action = {type:FETCH_CONTACTS, data:contacts};
    dispatch(action);
  }


export  const addContact = (contact) => async (dispatch)=> {
    let resp = await fetch(URL, {
        method:"POST", 
        body: JSON.stringify(contact), 
        headers: {
            'Content-Type':'application/json'
        }
    }); 

    let newConact = await resp.json(); 
    dispatch({type:ADD_CONTACT, data:newConact});
}

export const deleteContact =(id ) => async (dispatch)=> {
    await fetch(URL + id , {method:'DELETE'});
    dispatch({type:DELETE_CONTACT, data:id});
}

