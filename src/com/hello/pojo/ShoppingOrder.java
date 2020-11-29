package com.hello.pojo;

public class ShoppingOrder {
	private Integer id;
	private Integer customer_id;
	private String address;
	private String telephone;
	private Integer product_id;
	private Integer status;

	public ShoppingOrder() {
		super();
	}

	public ShoppingOrder(Integer id, Integer customer_id, String address, String telephone, Integer product_id,
			Integer status, float money_id) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.address = address;
		this.telephone = telephone;
		this.product_id = product_id;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ShoppingOrder [id=" + id + ", customer_id=" + customer_id + ", address=" + address + ", telephone="
				+ telephone + ", product_id=" + product_id + ", status=" + status + "]";
	}

}
