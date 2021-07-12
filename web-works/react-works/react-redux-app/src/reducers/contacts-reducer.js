import {ADD_CONTACT, DELETE_CONTACT, FETCH_CONTACTS, GET_CONTACT} from '../types/contants';

export default  (state = {contacts:[]}, action) => {

    switch (action.type) {
        case ADD_CONTACT:
            // {type:"ADD_CONTACT", data:{contact object}}
            {
                let contacts = [...state.contacts]; 
                contacts.push(action.data);
                return {...state, contacts};
            }
        case DELETE_CONTACT:
            // {type:"DELETE_CONTACT", data:1}
            {
                let contacts = [...state.contacts]; 
                let index = contacts.findIndex(c => c.id ===action.data)
                if(index !== -1) {
                    contacts.splice(index, 1); 
                }
                return {...state, contacts};
            }
        
            case GET_CONTACT : 
            
                return ; 
            

        case FETCH_CONTACTS:
            // {type:"FETCH_CONTACTS"}
            return {...state, contacts:action.data};
        default:
            return state; 
    }

}