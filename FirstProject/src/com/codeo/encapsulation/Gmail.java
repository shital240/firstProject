package com.codeo.encapsulation;

public class Gmail {
    //how to implement data encapsulation
	//make variables as private
	//sudarshan@gmail.com
	private String emailid;
	private String person_name;
	private long mobile_no;
	
	//make all methods public so that they can
//access the data but they can't change the data
	//setter and getter methods are used
	public String getEmailid() {
		return emailid;
	}
	//sudarshan@gmail.com
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	@Override
	public String toString() {
		return "Gmail [emailid=" + emailid + ", person_name=" + person_name + ", mobile_no=" + mobile_no + "]";
	}
	
	
	
	
}
