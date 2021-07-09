import './App.css';
import 'bootstrap/dist/css/bootstrap.css';

import ContactList from './components/contact-list'; 
import { applyMiddleware, createStore } from 'redux';
import rootReducer from './reducers/root-reducer';
import { Provider } from 'react-redux';
import { composeWithDevTools } from 'redux-devtools-extension';
import thunk from 'redux-thunk'; 
// in the product dont use devtools-extension 
let store = createStore(rootReducer, composeWithDevTools(applyMiddleware(thunk)))


function App() {
  return (
    <Provider store={store}>
      <div className="row">
        <div className="col">
          <h1>Contact Form Goes Here </h1>
        </div>
        <div className="col">
          <ContactList />
        </div>
      </div>
    </Provider>
  );
}

export default App;
