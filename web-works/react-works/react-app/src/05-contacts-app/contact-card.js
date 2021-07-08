import React from 'react'

const ContactCard = ({ contact }) => (
    <div className="card" style={{ width: "400px", height: "150px", padding: "10px", margin: "10px" }}>
        <div className="row">
            <div className="col-md-4">
                <img src={contact.picture} alt={contact.name} className="card-img"

                    style={{ width: "120px", height: "130px", }}
                />
            </div>
            <div className="col-md-8">
                <div className="card-body">
                    <h4 className="card-title">{contact.name}</h4>
                    <div className="card-text">{contact.email}</div>
                    <div className="card-text">{contact.phone}</div>
                </div>
            </div>
        </div>
    </div >
)

export default ContactCard;