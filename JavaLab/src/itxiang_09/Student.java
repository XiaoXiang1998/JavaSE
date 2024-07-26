package itxiang_09;

public class Student {
	//學號
	private String sid;
	//姓名
	private String name;
	//年齡
	private String age;
	//居住地
	private String address;
	
	public Student() {
		super();
	}
	public Student(String sid, String name, String age, String address) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
