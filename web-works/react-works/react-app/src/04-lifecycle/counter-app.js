import React, { Component } from 'react'


class CounterApp extends Component {

    constructor() {
        super();
        console.log("in CounterApp.constructor()");
    }

    state = {
        count: 1
    }
    num = 1
    render() {
        return (
            <div>
                <h1>Cunter App </h1>
                <h2>Count Value : {this.state.count}</h2>
                <h2>Num Value : {this.num}</h2>

                <hr />
                <button onClick={() => {
                    this.setState({ count: this.state.count + 1 })
                }} className="btn btn-primary">IncrementCount</button>
                <button onClick={() => {
                    this.setState({ count: this.state.count - 1 })
                }} className="btn btn-primary">DecrementCount</button>

                <hr />
                <button className="btn btn-danger"
                    onClick={() => {
                        this.num++;
                        console.log("Num Value " + this.num);
                        this.forceUpdate()
                    }}
                >IncrementNum</button>

                <button className="btn btn-danger"
                    onClick={() => {
                        this.num--;
                        console.log("Num Value " + this.num);
                        this.forceUpdate()
                    }}
                >DecrementNum</button>

            </div>
        );
    }


    componentDidMount() {
        console.log("In - CounterApp.componentDidMount()");
    }

    componentWillUnmount() {
        console.log("In - CounterApp.componentWillUnmount()");
    }

}

export default CounterApp;