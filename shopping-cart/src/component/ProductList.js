// ProductList.js
import React from 'react';
import products from './Data';
import './App.css'
const ProductList = ({ addToCart }) => { 
  return (
    <div id="product-list">
      {products.map(product => (
        <div key={product.id} id='card'>
          <h2>{product.title}</h2>
          <img src={product.image} alt={product.title} />
          <p>${product.price}</p>
          <button id='btn' onClick={() => addToCart(product)}>Add to Cart</button>
          </div>
      ))}
    </div>
  );
};

export default ProductList;