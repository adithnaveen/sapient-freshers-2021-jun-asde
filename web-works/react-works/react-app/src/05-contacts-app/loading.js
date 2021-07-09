import React from 'react'


// version 1.0 
// function loading (OldComponent) {
//     return class NewComponent extends Component {
//         render() {
//             let output = <OldComponent {...this.props} /> 

//             if(this.props.contacts.length===0){
//                 output = <p className="text-center">Loading, Please wait...</p>
//             }

//             return output; 
//         }
//     }
// }


// version 2.0 

function isEmpty(data) {
    if(data && data instanceof Array) {
        return data.length===0; 
    }
    // if the data is not array 
    if(data) {
        return Object.keys(data).length ===0; 
    }
    return false; 
}


let  loading = (property) => (OldComponent)  =>  (props) =>  {
    let output = <OldComponent {...props} />

    if(isEmpty(props[property])){
        output = <p className="text-center">Loading, Please wait...</p>
    }
    return output; 

}


export default loading; 