import React, { Component } from 'react'

import './product-form.css';

class ProductForm extends Component {
    state = {
        name: "",
        price: "",
        description: "",
        phone: "",
        picture: "",
        formError: {
            name: "Product Name Required",
            price: "Product Price Required",
            description: "Product Description Required",
            phone: "Product Phone Required"
        },
        errorMessages: null
    }

    validateForm = (formError) => {
        let valid = true;
        Object.values(formError).forEach(err => valid = valid && err.length == 0);
        return valid;
    }



    // for submission (submit handler)
    addProduct = (evt) => {
        evt.preventDefault();
        console.log(this.state);
        let { formError } = this.state;
        if (this.validateForm(formError)) {
            alert("Form Submitted");
            this.setState({ errorMessages: "" });
            // you can clear other fields value 
        } else {
            let errorMessages = Object.values(formError).map((val, index) => {
                return val.length === 0 ? null : <li key={index}>{val}</li>
            });
            this.setState({ errorMessages });
        }
    }


    // for tfHandler 
    tfHandler = (evt) => {
        let { name, value } = evt.target;
        let { formError } = this.state;


        switch (name) {
            case "name":
                if (!value || value.length === 0) {
                    formError.name = "Product Name Required";
                } else if (value.length < 3 || value.length > 20) {
                    formError.name = "Product Name should be 3 to 20 chars";
                } else {
                    formError.name = "";
                }
                break;
            case "price":
                if (!value || value.length === 0) {
                    formError.price = "Product Price Required";
                } else if (!value.match(/^\d{2,4}$/)) {
                    formError.price = "Product Price Range Invalid";
                } else {
                    formError.price = "";
                }

                break;
            case "description":
                if (!value || value.length === 0) {
                    formError.description = "Product Description Required";
                } else if (value.length < 3 || value.length > 20) {
                    formError.description = "Product Description should be 3 to 20 chars";
                } else {
                    formError.description = "";
                }
                break;
            case "phone":
                if (!value || value.length === 0) {
                    formError.phone = "Product Phone Required";
                } else if (!value.match(/^\d{10,12}$/)) {
                    formError.phone = "Product Contact Is Wrong";
                } else {
                    formError.phone = "";
                }

                break;

            default:
                break;
        }


        // console.log(evt.target.name, ", ", evt.target.value);
        this.setState({ [name]: value, formError });


    }



    render() {
        return (
            <div className="container">
                <h3>Add Product Form</h3>
                <pre>{JSON.stringify(this.state, null, 3)}</pre>
                <form className="form" onSubmit={this.addProduct}>

                    <div className="form-group row">
                        <label htmlFor="name" className="control-label col-md-4">Product Name</label>
                        <div className="col-md-8">
                            <input type="text" name="name" className="form-control" id="name" onChange={this.tfHandler} />
                        </div>
                    </div>


                    <div className="form-group row">
                        <label htmlFor="price" className="control-label col-md-4">Product Price</label>
                        <div className="col-md-8">
                            <input type="text" name="price" className="form-control" id="price" onChange={this.tfHandler} />
                        </div>
                    </div>


                    <div className="form-group row">
                        <label htmlFor="description" className="control-label col-md-4">Product Description</label>
                        <div className="col-md-8">
                            <input type="text" name="description" className="form-control" id="description" onChange={this.tfHandler} />
                        </div>
                    </div>

                    <div className="form-group row">
                        <label htmlFor="phone" className="control-label col-md-4">Product Contact</label>
                        <div className="col-md-8">
                            <input type="text" name="phone" className="form-control" id="phone" onChange={this.tfHandler} />
                        </div>
                    </div>

                    <div className="form-group row">
                        <label htmlFor="picture" className="control-label col-md-4">Product Picture</label>
                        <div className="col-md-8">
                            <input type="text" name="picture" className="form-control" id="picture" onChange={this.tfHandler} />
                        </div>
                    </div>

                    <button className="btn btn-danger">Submit</button>

                </form>

                <hr />
                <ul>
                    {this.state.errorMessages}
                </ul>
            </div>
        );
    }
}

export default ProductForm;