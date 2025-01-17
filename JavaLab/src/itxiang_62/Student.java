package itxiang_62;

public class Student {
	private String sid;
	private String name;
	private int age;
	private String address;

	public Student() {
		super();
	}

	public Student(String sid, String name, int age, String address) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
