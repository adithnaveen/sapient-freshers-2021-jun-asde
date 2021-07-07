import React, { Component } from 'react';


class App extends Component {
   
  render() {
    const name ="Naveen Kumar"
    const city ="Bengaluru"
    return (
      <div>
          <div>
          <h1 className="alert alert-info">Welcome To ReactJS</h1>
          <h2 className="alert alert-success">From {name}</h2>
          <h3>In City {city}</h3>
        </div>
       </div>
    );
  }
}

export default App;