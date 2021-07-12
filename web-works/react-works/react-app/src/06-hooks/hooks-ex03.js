import React, { useState, useEffect } from 'react'


function App() {
    const [name, setName] = useState("Suhas");
    const [admin, setAdmin] = useState(false);

    useEffect(() => {
        // somw side effect work 
        console.log(`Page Belongs To ${name}`);
        document.title = `Page Belongs To ${name}`
    }, [name]);

    useEffect(() => {
        console.log(`The value of admin ${admin}`);
    }, [admin])


    return (
        <div>
            <p>Name is {name}</p>
            <p>You are an admin {admin ? "Admin" : "User"}</p>

            <button
                className="btn btn-primary"
                onClick={() => {
                    setName("Suhas Gopinath")
                }}>Full Name</button>

            <button className="btn btn-danger" onClick={() => {
                setAdmin(true)
            }}>Make Admin</button>

        </div>
    )
}


export default App;