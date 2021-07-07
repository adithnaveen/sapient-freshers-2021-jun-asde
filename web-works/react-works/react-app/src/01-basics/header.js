import React from 'react'

// stateless / function based component 
let Header = ({company}) => {
    return(
        <>
            <h1 className="alert alert-danger">Hi I'm From Header - {company} </h1>
        </>
    ); 
}

export default  Header; 