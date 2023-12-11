import React from 'react'
export default function Product(props) {
    const{product,onAdd}=props;
  return (
    <div>
      <div><img className="small" src={product.image} alt={product.name}></img></div>
      <div><h3>{product.name}</h3></div>
      <div>${product.price}</div>
      <div>
        <button onClick={() => onAdd(product)}>Add to Cart</button>
      </div>
    </div>
  )
}
