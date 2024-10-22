import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import * as serviceWorker from './serviceWorker';
import {createStore} from 'redux';
import AppReducers from './reducers/index' 
import {Provider} from 'react-redux';

const store = createStore(
    AppReducers
);

ReactDOM.render(
    <Provider store={store}>
         <App />
    </Provider>,
    document.getElementById('root1'));

serviceWorker.unregister();
