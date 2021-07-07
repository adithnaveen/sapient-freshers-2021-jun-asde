import React from 'react'
import './footer.css';
// stateless / function based component 
let Footer = ({ props }) => {
    return (
        <div className="app-footer">
            <h5 className="alert alert-danger">Hi I'm From Footer </h5>
            <p><em>This is footer, {props.website}, &copy; {props.company}</em></p>
        </div>
    );
}

export default Footer;