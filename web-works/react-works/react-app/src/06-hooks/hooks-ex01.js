import React, { useState } from 'react'


const App = () => {

    const [count, setCount] = useState(0);
    const [name, setName] = useState("Siddharth");
    const [admin, setAdmin] = useState(false);
    return (
        <div>
            <h1>Working with Hooks</h1>
            <h2>Count Value {count} </h2>
            <h3>Name is {name}</h3>
            <h4>The User is Admin : {admin ? "Admin" : "User"}</h4>
            <button className="btn btn-primary" onClick={() => { setCount(count + 1) }
            }>Increment</button>
            <button className="btn btn-primary" onClick={() => { setCount(count - 1) }
            }>Decrement</button>
            <br />
            <button className="btn btn-danger" onClick={() => {
                setName("Siddharth Varshney")
            }}>Change Name </button>

            <br />
            <input type="checkbox" onChange={() => {
                setAdmin((admin) => !admin)
            }} /> Check To Toggle
        </div>
    )
}

export default App;