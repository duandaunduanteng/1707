package pojo;

import java.math.BigDecimal;
import java.sql.Date;

public class Electronic {
	public Integer id;//���
	public String model;//�ͺ�
	public BigDecimal price;//�۸�
	public Date date;//��������
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "electronic [id=" + id + ", model=" + model + ", price=" + price + ", date=" + date + "]";
	}
	
}
