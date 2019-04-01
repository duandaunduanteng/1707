package pojo;
import pojo.Provider;
import java.util.Date;

public class Bill {
	private Integer id;//id
	private String billCode;//账单编码
	private String productName;//商品名称
	private String productDesc;//商品描述
	private String productUnit;//商品单位
	private String productCount;//商品数量
	private Integer totalPrice;//商品总额
	private Integer isPayment;//晒否支付
	private String createdBy;//创建者
	private Date creationDate;//创建时间
	private Date modifyDate;//更新时间
	private String modifyBy;//更新人
	private Provider proName;//供应商名称
	private Provider proContact;//供应商联系人
	private Provider proPhone;//供应商联系电话
	
	public Provider getProContact() {
		return proContact;
	}
	public void setProContact(Provider proContact) {
		this.proContact = proContact;
	}
	public Provider getProPhone() {
		return proPhone;
	}
	public void setProPhone(Provider proPhone) {
		this.proPhone = proPhone;
	}
	public Provider getProName() {
		return proName;
	}
	public void setProName(Provider proName) {
		this.proName = proName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	public String getProductCount() {
		return productCount;
	}
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getIsPayment() {
		return isPayment;
	}
	public void setIsPayment(Integer isPayment) {
		this.isPayment = isPayment;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", billCode=" + billCode + ", productName=" + productName + ", productDesc="
				+ productDesc + ", productUnit=" + productUnit + ", productCount=" + productCount + ", totalPrice="
				+ totalPrice + ", isPayment=" + isPayment + ", createdBy=" + createdBy + ", creationDate="
				+ creationDate + ", modifyDate=" + modifyDate + ", modifyBy=" + modifyBy + ", proName=" + proName
				+ ", proContact=" + proContact + ", proPhone=" + proPhone + "]";
	}
	
	
	
	
}
