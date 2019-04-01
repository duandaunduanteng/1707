package pojo;

import java.sql.Date;
import java.util.List;

public class Provider {
	private Integer id;//����id
	private String proCode;//��Ӧ�̱���
	private String proName;//��Ӧ������
	private String proDesc;//����
	private String proContact;//��ϵ��
	private String proPhone;//�绰
	private String proAddress;//��Ӧ�̵�ַ
	private String proFax;//����
	private Integer createdBy;//������
	private Date creationDate;//����ʱ��
	private Date modifyDate;//����ʱ��
	private Integer modifyBy;//������
	private List<Bill> billlist;//������Ϣ�б�
	
	public List<Bill> getBilllist() {
		return billlist;
	}
	public void setBilllist(List<Bill> billlist) {
		this.billlist = billlist;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public String getProContact() {
		return proContact;
	}
	public void setProContact(String proContact) {
		this.proContact = proContact;
	}
	public String getProPhone() {
		return proPhone;
	}
	public void setProPhone(String proPhone) {
		this.proPhone = proPhone;
	}
	public String getProAddress() {
		return proAddress;
	}
	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}
	public String getProFax() {
		return proFax;
	}
	public void setProFax(String proFax) {
		this.proFax = proFax;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
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
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	@Override
	public String toString() {
		return "Provider [id=" + id + ", proCode=" + proCode + ", proName=" + proName + ", proDesc=" + proDesc
				+ ", proContact=" + proContact + ", proPhone=" + proPhone + ", proAddress=" + proAddress + ", proFax="
				+ proFax + ", createdBy=" + createdBy + ", creationDate=" + creationDate + ", modifyDate=" + modifyDate
				+ ", modifyBy=" + modifyBy + ", billlist=" + billlist + "]";
	}
	
	
	
}
