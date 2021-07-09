
// let h1 = document.createElement("h1"); 
// h1.setAttribute("id", "heading1"); 
// h1.innerHTML = "Welcome to Reactjs"; 
// document.getElementById("root").append(h1);


// let count =1; 
// setInterval(() => {
//     let h1 = document.getElementById("heading1");
//     h1.innerHTML ="Welcome to Reactjs";
//     console.log("Updating ", count , "Times");
// }, 1000);



import React, { Component } from 'react'
import ReactDOM from 'react-dom'

class App extends Component {
    state = {
        title: "Welcome to React"
    }
    count = 1;
    componentDidMount() {
        setInterval(() => {

            let { title } = this.state;
            if (this.count % 5 === 0) {
                if (title === "Welcome to React") {
                    title = "Hello React"
                } else {
                    title = "Welcome to React";
                }
            }
            this.setState({ title }, () => {
                console.log("Updating ", this.count++, "number of times")
            })
        }, 1000);
    }
    render() {
        return (
            <div>
                <h1>{this.state.title}</h1>
            </div>
        )
    }

}

ReactDOM.render(<App />, document.querySelector("#root"));