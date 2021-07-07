// this file will be used as accumulator 
import React, { Component } from 'react'
import Header from './header';
import Main from './main';
import Footer from './footer';

class App extends Component {
     
    render() {
        let props = {
            company:"Publicis Sapient", 
            website:"https://ps.com"
        }
        return (
            <div>
                <Header company ="Publicis Sapient"/>
                <Main message="Some Message" />
                <Footer props={props}/> 
            </div>
        );
    }
}

export default App;