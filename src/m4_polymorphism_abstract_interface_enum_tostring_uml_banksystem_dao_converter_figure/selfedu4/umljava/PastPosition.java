package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.selfedu4.umljava;

public class PastPosition{
	private String name;
	private Department department;
	public PastPosition(String position, Department dep){
		name = position;
		department = dep;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void setDepartment(Department d){
		department = d;
	}
	public Department getDepartment(){
		return department;
	}
}
