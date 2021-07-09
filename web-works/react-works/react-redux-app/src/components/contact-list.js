import React, { Component } from 'react'
import { connect } from 'react-redux'
import { fetchContacts } from '../actions/contacts-action';
import ContactCard from './contact-card';

class ContactList extends Component {  // <- as prop 

    // side effect work 
    componentDidMount() {
        this.props.getAllContacts();
    }

    render() {

        let list = null;
        let { contacts } = this.props;
        if (contacts instanceof Array && contacts.length > 0) {
            list = contacts.map(c => <ContactCard key={c.id} contact={c} />)
        }

        return (
            <div className="container">
                <h3>Contacts List</h3>
                {list}
            </div>
        );
    }
}

let stateAsProps = (reducer) => {
    return {
        contacts: reducer.contactsReducer.contacts
    }
}
let actionAsProps = {
    getAllContacts: fetchContacts
};

export default connect(stateAsProps, actionAsProps)(ContactList);