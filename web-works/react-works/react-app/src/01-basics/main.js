import React, {Component}from 'react'
import './main.css';
// stateless / function based component 

class Main extends Component {
    render() {
        console.log(this)
        return (
            <div className="app-content">
                    <h1>this is from Main</h1>
            </div>
        );
    }
}
 
export default Main;