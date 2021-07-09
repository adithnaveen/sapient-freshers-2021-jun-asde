// accumulator 
import React, { Component } from 'react'
import ContactList from './contact-list';


class App extends Component {
    state = {
        contacts: []
    }

    // where you hit to end point 
    componentDidMount() {
        // fetch, axios, jQuery 

        fetch("http://localhost:4000/contacts")
            .then(resp => resp.json())
            .then(data => this.setState({ contacts: data }))
    }

    render() {
        return (
            <div className="container">
                <div className="row">
                    <div className="col">
                        Contact Form
                    </div>
                    <div className="col">
                        <ContactList contacts={this.state.contacts} />
                    </div>
                </div>
            </div>
        );
    }
}

export default App;