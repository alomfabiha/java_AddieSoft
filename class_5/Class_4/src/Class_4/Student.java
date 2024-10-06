package Class_4;

public class Student {
private String name;
private String email;
private String mobile;
private String address;
private Double examFee;

public void setName(String name) {
	this.name=name;
}
public void setEmail(String email) {
	this.email=email;
}
public void setMobile(String mobile) {
	this.mobile=mobile;
}
public void setAddress(String address) {
	this.address=address;
}
public void setExamFee(Double examFee){
	this.examFee=examFee;
	}

public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public String getMobile() {
	return mobile;
}
public String getAddress() {
	return address;
}
public Double getExamFee() {
	return examFee;
}
}

