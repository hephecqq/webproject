package com.hephec.model;


//商品类
public class Commdities {
	
	private Integer Commidties_ID;//商品ID
	private String Commidties_Name;//商品名
	private String Commidties_Type;//商品类别
	private double Commidties_Price;//商品价格
	private Discount Commidties_Discount;//商品折扣
	
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
