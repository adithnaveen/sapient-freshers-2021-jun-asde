// fetching the end point with hooks 
import React, { useState, useEffect } from 'react'


function App() {
    const [data, setData] = useState([]); 

    useEffect(() => {
        fetch("https://api.github.com/users")
            .then(resp => resp.json())
            .then(setData); 
    }, []); 


    if(data) {
        return(
            <div>
                <ul>
                    {
                        data.map((user, key) => (
                            <li value={user.id}>{user.login}</li>
                        ))
                    }
                </ul>

                <button
                    className="btn btn-danger"
                onClick={()=>{setData([])}}>Clear</button>

            </div>
            )
    }

    return <p>No Users Found</p>;


}

export default  App; 