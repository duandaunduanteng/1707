package pojo;
import pojo.Provider;
import java.util.Date;

public class Bill {
	private Integer id;//id
	private String billCode;//�˵�����
	private String productName;//��Ʒ����
	private String productDesc;//��Ʒ����
	private String productUnit;//��Ʒ��λ
	private String productCount;//��Ʒ����
	private Integer totalPrice;//��Ʒ�ܶ�
	private Integer isPayment;//ɹ��֧��
	private String createdBy;//������
	private Date creationDate;//����ʱ��
	private Date modifyDate;//����ʱ��
	private String modifyBy;//������
	private Provider proName;//��Ӧ������
	private Provider proContact;//��Ӧ����ϵ��
	private Provider proPhone;//��Ӧ����ϵ�绰
	
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
