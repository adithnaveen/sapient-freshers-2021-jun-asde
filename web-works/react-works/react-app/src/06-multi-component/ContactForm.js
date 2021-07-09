import React, { Component } from 'react';

class ContactForm extends Component {

    state = {
        name: '',
        email: '',
        phone: '',
        picture: '',
        formErrors: {
            name: 'Name is required',
            email: 'Email is required',
            phone: 'Phone is required'
        },
        errorMessages: ''
    };

    tfHandler = ({ target }) => {
        let { name, value } = target;
        let { formErrors } = this.state;

        switch (name) {
            case 'name':
                if (!value || value.length === 0) {
                    formErrors.name = 'Name is required';
                }
                else if (value.length < 3) {
                    formErrors.name = 'Name must be at least 3 letters';
                }
                else {
                    formErrors.name = '';
                }
                break;
            case 'email':
                if (!value || value.length === 0) {
                    formErrors.email = 'Email is required';
                }
                else if (!value.match(/^([\w.%+-]+)@([\w-]+\.)+([\w]{2,})$/i)) {
                    formErrors.email = 'Not a valid email id';
                }
                else {
                    formErrors.email = '';
                }
                break;
            case 'phone':
                if (!value || value.length === 0) {
                    formErrors.phone = 'Email is required';
                }
                else if (!value.match(/^\d{10,12}$/)) {
                    formErrors.phone = 'Not a valid phone';
                }
                else {
                    formErrors.phone = '';
                }
                break;
            default:
                break;
        }
        this.setState({ [name]: value, formErrors });
    }

    validateForm = formErrors => {
        let valid = true;
        Object.values(formErrors).forEach(val => valid = valid && val.length === 0);
        return valid;
    }

    submitHandler = (evt) => {
        evt.preventDefault();

        let { formErrors } = this.state;
        let errorMessages = Object.values(formErrors).map(
            (err, index) => err.length === 0 ? null : <li key={index}>{err}</li>);
        this.setState({ errorMessages })

        if (this.validateForm(this.state.formErrors)) {
            let {name, email, phone, picture} = this.state;
            let contact = {name, email, phone, picture};

            // invoke the function to add contact 
            // this function is declared in App.js and will be accessed as props 
            this.props.addContact(contact);

            this.setState({
                name: '',
                email: '',
                phone: '',
                picture: '',
                formErrors: {
                    name: 'Name is required',
                    email: 'Email is required',
                    phone: 'Phone is required'
                },
                errorMessages: ''
            });
        }
    }

    render() {
        return (
            <div>
                <h3>Add a new contact</h3>
                <form className="form" onSubmit={this.submitHandler}>
                    <div className="form-group row">
                        <label htmlFor="" className="control-label col-md-4">Name</label>
                        <div className="col-md-8">
                            <input value={this.state.name} onChange={this.tfHandler} type="text" className="form-control" name="name" />
                        </div>
                    </div>
                    <div className="form-group row">
                        <label htmlFor="" className="control-label col-md-4">Email address</label>
                        <div className="col-md-8">
                            <input value={this.state.email} onChange={this.tfHandler} type="text" className="form-control" name="email" />
                        </div>
                    </div>
                    <div className="form-group row">
                        <label htmlFor="" className="control-label col-md-4">Phone number</label>
                        <div className="col-md-8">
                            <input value={this.state.phone} onChange={this.tfHandler} type="text" className="form-control" name="phone" />
                        </div>
                    </div>
                    <div className="form-group row">
                        <label htmlFor="" className="control-label col-md-4">URL to picture/avatar</label>
                        <div className="col-md-8">
                            <input value={this.state.picture} onChange={this.tfHandler} type="text" className="form-control" name="picture" />
                        </div>
                    </div>
                    <button className="btn btn-primary">Add to list</button>
                </form>

                <ul>
                    {this.state.errorMessages}
                </ul>
            </div>
        );
    }
}

export default ContactForm;