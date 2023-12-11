// App.js
import React, { useState } from 'react';
import ProductList from '../src/component/ProductList';
import Cart from '../src/component/Cart';

const App = () => {
  const [cartItems, setCartItems] = useState([]);


  const addToCart = (product) => {
    const existingItem = cartItems.find(item => item.id === product.id);

    if (existingItem) {
alert("this item is already exist in your cart")
    } else {
      setCartItems([...cartItems, { ...product, quantity: 1 }]);
alert("this item is added to your cart")
    }
  };

  const removeItem = (itemId) => {
    setCartItems(prevCartItems =>
      prevCartItems.filter(item => item.id !== itemId)
    );
  };

  return (
    <div>
      <ProductList addToCart={addToCart} />

        <Cart
          cartItems={cartItems}
          removeItem={removeItem}
          increment={(itemId) => {
            setCartItems(prevCartItems =>
              prevCartItems.map(item =>
                item.id === itemId
                  ? { ...item, quantity: item.quantity + 1 }
                  : item
              )
            );
          }}
          decrement={(itemId) => {
            setCartItems(prevCartItems =>
              prevCartItems.map(item =>
                item.id === itemId && item.quantity > 1
                  ? { ...item, quantity: item.quantity - 1 }
                  : item
              )
            );
          }}
        />
    </div>
  );
};
export default App;