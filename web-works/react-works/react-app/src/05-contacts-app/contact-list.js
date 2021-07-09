import React from 'react'
import ContactCard from './contact-card'
import loading from './loading';

const ContactList = ({ contacts }) => (
    <div>
        {
            contacts.map(c => <ContactCard contact={c} key={c.id} />)
        }
    </div>
)

export default loading('contacts')(ContactList);
// export default loading(ProductList);
// export default loading(UserList);


// carrier functions 
// export default loading('product')(ProductsList)
// export default loading('contact')(ContactList)