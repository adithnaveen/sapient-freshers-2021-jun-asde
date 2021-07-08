import React from 'react'
import ContactCard from './contact-card'


const ContactList = ({ contacts }) => (
    <div>
        {
            contacts.map(c => <ContactCard contact={c} key={c.id} />)
        }
    </div>
)

export default ContactList;