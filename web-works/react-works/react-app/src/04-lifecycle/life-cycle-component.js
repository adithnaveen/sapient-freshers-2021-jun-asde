import React, { Component } from 'react'
import CounterApp from './counter-app';


class LifeCycleComponent extends Component {
    state = {
        showCounterApp: false
    }
    render() {
        let output = null;
        if (this.state.showCounterApp === true) {
            output = <CounterApp />
        }
        return (
            <div>
                <h2>Life cycle work</h2>
                <button className="btn btn-primary"
                    onClick={() => {
                        this.setState({
                            showCounterApp: !this.state.showCounterApp
                        })
                    }}
                > Show/Hide Component</button>
                <hr />
                {output}
            </div>
        );
    }
}

export default LifeCycleComponent;