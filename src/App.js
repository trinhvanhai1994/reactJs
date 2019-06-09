import React, {Component} from 'react';
import Header from './compoments/Header';
import Products from './compoments/Products';
import Message from './compoments/Message';
import Cart from './compoments/Cart';
import Footer from './compoments/Footer';

class App extends Component {
    render() {
        return(
            <div>
                <Header/>
                <main id="mainContainer">
                    <div className="container">
                        <Products/>
                        <Message/>
                        <Cart/>
                    </div>
                </main>
                <Footer/>
            </div>
        );
    }
}

export default App;
