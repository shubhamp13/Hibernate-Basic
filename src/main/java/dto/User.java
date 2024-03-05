package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User 
{
	private String name;
	@Id
	private int id;
	private String address;
	private long phNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() 
	{
		return "Name:"+name+"\nId:"+id+"\nAddress:"+address+"\nPhone No:"+phNo;
 	}
	
}
