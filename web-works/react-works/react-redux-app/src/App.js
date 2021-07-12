import './App.css';
import 'bootstrap/dist/css/bootstrap.css';

import ContactList from './components/contact-list';
import ContactForm from './components/contact-form';
import ContactDetails from './components/contact-details';

import { applyMiddleware, createStore } from 'redux';
import rootReducer from './reducers/root-reducer';
import { Provider } from 'react-redux';
import { composeWithDevTools } from 'redux-devtools-extension';
import thunk from 'redux-thunk';

import { BrowserRouter as Router, Link, Route } from 'react-router-dom'


// in the product dont use devtools-extension 
let store = createStore(rootReducer, composeWithDevTools(applyMiddleware(thunk)));

const HomeComponent = () => {
  return (
    <div>
      <h1>Home Component</h1> <hr />
    </div>
  )
}




function App() {
  return (
    <Provider store={store}>
      <Router>
        <div className="container">
          <div className="alert alert-info">React Redux Application</div>
          <div className="row">
            <div className="col-md-5">
              <ul className="list-group">
                <li className="list-group-item">
                  <Link to="/">Home</Link>
                </li>
                <li className="list-group-item">
                  <Link to="/add-contact">Add Contact</Link>
                </li>
                <li className="list-group-item">
                  <Link to="/show-contacts">Show Contacts</Link>
                </li>
              </ul>
            </div>
            <div className="col-md-7">

              <Route path="/" component={HomeComponent} exact={true} />
              <Route path="/add-contact" component={ContactForm} exact={true} />
              <Route path="/show-contacts" component={ContactList} exact={true} />
              <Route path="/contact-details/:id" component={ContactDetails} exact={true} />
            </div>
          </div>
        </div>
      </Router>
    </Provider>
  );
}

export default App;
