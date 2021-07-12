import React, { Component } from 'react'

// connect the application to redux store 

class ContactDetails extends Component {
    render() {

            console.log(this.props.match.params.id);
        return (
            <div>
                <h1>This is Contact Details of : {this.props.match.params.id}</h1>
            </div>
        );
    }
}
 

export default  ContactDetails; 