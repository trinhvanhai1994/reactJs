import React, {Component} from 'react';
import Product from './Product';
import {connect} from 'react-redux';

class Products extends Component {
    render() {

        var {products} = this.props ;

        console.log({products})


        return(
            <section className="section">
                <h1 className="section-heading">Danh Sách Sản Phẩm</h1>
                <div className="row">
                    {products}
                    <Product/>
                </div>
            </section>            
        );
    }
}

const mapStateToProps = state => {
    return {
        products : state.products
    }
}

export default connect(mapStateToProps, null)(Products);
