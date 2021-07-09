import React, { Component } from 'react'

import ContactCard from './ContactCard'

class ContactsList extends Component {

    render() {
        let list = this.props.contacts.map(
            c => <ContactCard key={c.id} contact={c} deleteContact ={this.props.deleteContact} />)
        // console.log(list);
        console.log(this)

        return ( 
            <div className="container">
                <h3>Contact List</h3>
                {list}
            </div>
        );
    }
}

export default ContactsList;