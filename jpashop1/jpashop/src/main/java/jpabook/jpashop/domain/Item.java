package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id @GeneratedValue
    @Column(name="ITEM_ID")
    private Long Id;

    private String name;
    private int price;
    private int StockQunatity;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQunatity() {
        return StockQunatity;
    }

    public void setStockQunatity(int stockQunatity) {
        StockQunatity = stockQunatity;
    }
}
