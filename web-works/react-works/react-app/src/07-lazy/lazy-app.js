import React, {Suspense} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';


//import Hello from './hello';
import Home from './home';
// import NotFound from './not-found';
// import Sample from './sample';


const Hello = React.lazy(() => import("./hello")); 
const Sample = React.lazy(() => import("./sample")); 
const NotFound = React.lazy(() => import("./not-found")); 



const App =() => {
    return(
        <div>
             <Router>
                 <Suspense fallback ={<div>Loding Please Wait... </div>}>
                 <Switch>
                     <Route path="/" exact={true}>
                         <Home /> 
                     </Route>
                     <Route path="/hello" exact={true}>
                         <Hello /> 
                     </Route>
                     <Route path="/sample" exact={true}>
                        <Sample /> 
                     </Route>
                     <Route component={NotFound} /> 
                 </Switch>
                 </Suspense>
             </Router>
        </div>
    )
}


export default App;