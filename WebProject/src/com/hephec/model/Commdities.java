package com.hephec.model;


//��Ʒ��
public class Commdities {
	
	private Integer Commidties_ID;//��ƷID
	private String Commidties_Name;//��Ʒ��
	private String Commidties_Type;//��Ʒ���
	private double Commidties_Price;//��Ʒ�۸�
	private Discount Commidties_Discount;//��Ʒ�ۿ�
	
	public Integer getCommidties_ID() {
		return Commidties_ID;
	}
	public void setCommidties_ID(Integer commidties_ID) {
		Commidties_ID = commidties_ID;
	}
	public String getCommidties_Name() {
		return Commidties_Name;
	}
	public void setCommidties_Name(String commidties_Name) {
		Commidties_Name = commidties_Name;
	}
	public String getCommidties_Type() {
		return Commidties_Type;
	}
	public void setCommidties_Type(String commidties_Type) {
		Commidties_Type = commidties_Type;
	}
	public double getCommidties_Price() {
		return Commidties_Price;
	}
	public void setCommidties_Price(double commidties_Price) {
		Commidties_Price = commidties_Price;
	}
	public Discount getCommidties_Discount() {
		return Commidties_Discount;
	}
	public void setCommidties_Discount(Discount commidties_Discount) {
		Commidties_Discount = commidties_Discount;
	}
	@Override
	public String toString() {
		return "Commdities [Commidties_ID=" + Commidties_ID
				+ ", Commidties_Name=" + Commidties_Name + ", Commidties_Type="
				+ Commidties_Type + ", Commidties_Price=" + Commidties_Price
				+ ", Commidties_Discount=" + Commidties_Discount + "]";
	}
	
}
