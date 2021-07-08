import React, { Component } from 'react'

import './event-handler.css';



const MyBtn = props => {
    return (
        <button className="btn btn-warning" onClick={props.handler}> {props.caption}</button>
    )
}

const MyBtn1 = ({ caption, handler }) => {
    return (
        <button className="btn btn-warning" onClick={handler}> {caption}</button>
    )
}




class EventHandler extends Component {

    constructor() {
        super();
        this.buttonHandler = this.buttonHandler.bind(this);
    }

    buttonHandler() {
        console.log("Clicked Button 1 ", this);
    }

    buttonHandler2 = () => {
        console.log("Clicked Button 2 ", this);
    }

    increment = () => {
        this.setState({ count: this.state.count + 1 })
    }
    decrement = () => {
        this.setState({ count: this.state.count - 1 })
    }

    incrOrDecr = (val) => {
        this.setState({ count: this.state.count + val })
    }

    state = {
        count: 0
    }
    render() {
        let num = 0;
        // dont call set state inside render function 
        // this.setState({ count: this.state.count + 1 })
        return (
            <div className="container">
                <div className="container">
                    <h2>This is component area</h2>
                    <button className="btn btn-primary"
                        onClick={this.buttonHandler}
                    >Button1 </button>

                    <button className="btn btn-danger"
                        onClick={this.buttonHandler2}
                    >Button2 </button>

                </div>
                <hr />
                <div className="container">
                    <button className="btn btn-warning"
                        onClick={() => { num++ }}
                    >Increment </button>
                    <button className="btn btn-secondary"
                        onClick={() => { num-- }}
                    >Decrement </button>
                    <br />
                    <h3>Value of Number {num}</h3>
                </div>
                <hr />
                <div className="container">
                    <button className="btn btn-warning"
                        onClick={this.increment}
                    >Increment </button>
                    <button className="btn btn-secondary"
                        onClick={this.decrement}
                    >Decrement </button>


                    <button className="btn btn-warning" onClick={() => { this.incrOrDecr(1) }}  >INCREMENT </button>
                    <button className="btn btn-secondary" onClick={() => { this.incrOrDecr(-1) }} >DECREMENT </button>

                    <br />

                    <button className="btn btn-warning" onClick={() => { this.setState({ count: this.state.count + 1 }) }}  >INCREMENT1 </button>
                    <button className="btn btn-secondary" onClick={() => { this.setState({ count: this.state.count - 1 }) }} >DECREMENT1 </button>

                    <br />
                    <h3>With MyBtn</h3>
                    <MyBtn caption="INCR" handler={() => { this.incrOrDecr(1) }} />
                    <MyBtn caption="DECR" handler={() => { this.incrOrDecr(-1) }} />
                    <br />
                    <h3>With MyBtn1</h3>
                    <MyBtn caption="INCR" handler={() => { this.incrOrDecr(1) }} />
                    <MyBtn caption="DECR" handler={() => { this.incrOrDecr(-1) }} />
                    <br />
                    <h3>Value of Counter:  {this.state.count}</h3>
                </div>
            </div>
        );
    }
}

export default EventHandler;