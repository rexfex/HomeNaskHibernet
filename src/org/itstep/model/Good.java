package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "goods")
public class Good {

 @Id
 @Column(name = "asin", length = 20)
 private String asin;
 
 @Column(name = "name", length = 300)
 private String name;
 
 @Column(name = "shop_url", length = 500)
 private String shopUrl;
 
 @Column(name = "price")
 private Integer price;
 
 

 public  Good(String asin, String name, int price, String shopUrl) {
		
		this.asin = asin;
		this.price = price;
		this.name = name;
		this.shopUrl = shopUrl;
	}



public Good() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
}