package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.selfedu4.umljava;

import java.util.Date;
public  class IdCard{
	private Date dateExpire;
	private int number;
	public IdCard(int n){
		number = n;
	}
	public void setNumber(int newNumber){
		number = newNumber;
	}
	public int getNumber(){
		return number;
	}
	public void setDateExpire(Date newDateExpire){
		dateExpire = newDateExpire;
	}
	public Date getDateExpire(){
		return dateExpire;
	}
}