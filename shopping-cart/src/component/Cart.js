// Cart.js
import React from 'react';

const Cart = ({ cartItems, removeItem, increment, decrement }) => {
  const calculateTotalPrice = () => {
    return cartItems.reduce((total, item) => total + item.price * item.quantity, 0);
  };

  return (
    <div id="cart">
      <h2>Shopping Cart</h2>
      <ul>
        {cartItems.map(item => (
          <li key={item.id}>
            {item.title} - ${item.price * item.quantity}
              <button onClick={() => increment(item.id)}>+</button>
              <span>{item.quantity}</span>
              <button onClick={() => decrement(item.id)} disabled={item.quantity <= 1}>-</button>
            <button onClick={() => removeItem(item.id)}>Remove</button>
            <hr />
          </li>
        ))}
      </ul>
      <p>Total Price: ${calculateTotalPrice()}</p>
    </div>
  );
};

export default Cart;