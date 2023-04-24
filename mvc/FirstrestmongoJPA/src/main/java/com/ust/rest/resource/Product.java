package com.ust.rest.resource;
//select next_val as id_val from hibernate_sequence for update
//update hibernate_sequence set next_val= ? where next_val=?
//insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
//generationType.IDENTITY  FOR THIS STRATERGY to work first we have to create a table in bisequeal database and explicitly specify the auto increment(AI)column as checked for the primary key column.In application.property file "spring.jpa.hibernate.ddl-auto = none" this should not be set if it set it should have value as update
import lombok.Data;
import lombok.NoArgsConstructor;


//no need of getters and setters in mongodb
@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private String _id;
	private String name;
	private String description;
	private int qty;
	private BigDecimal price;
	
	
	
//	public int getQty() {
//		return qty;
//			}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	public long getProductId() {
//		return productId;
//	}
//	public void setProductId(long productId) {
//		this.productId = productId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}

}
