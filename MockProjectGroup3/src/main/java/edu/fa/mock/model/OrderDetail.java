package edu.fa.mock.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 *
 * @author baphu
 */
@Entity
@Table(name = "OrderDetail")
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "price")
    private Double price;
    @Column(name = "qty")
    private Integer qty;
    @Column(name = "amount")
    private Double amount;
    
    @Id
    @JoinColumn(name = "orderID", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Orders orders;
    
    @Id
    @JoinColumn(name = "productID", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Products products;

    public OrderDetail() {
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    
}
