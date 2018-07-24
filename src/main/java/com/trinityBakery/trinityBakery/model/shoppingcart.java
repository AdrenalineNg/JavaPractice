package com.trinityBakery.trinityBakery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shoppingcart")
public class shoppingcart {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="c_id")
    private String c_id;
	@Column(name="c_name")
    private String c_name;
    @Column(name="c_price")
    private String c_price;
    @Column(name="c_img")
    private String c_img;
    public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_price() {
		return c_price;
	}
	public void setC_price(String c_price) {
		this.c_price = c_price;
	}
	public String getC_img() {
		return c_img;
	}
	public void setC_img(String c_img) {
		this.c_img = c_img;
	}
	public String getC_weight() {
		return c_weight;
	}
	public void setC_weight(String c_weight) {
		this.c_weight = c_weight;
	}
	@Column(name="c_weight")
    private String c_weight;
}
