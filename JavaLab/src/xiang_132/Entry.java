package xiang_132;

public class Entry implements Priority {
	String value;
	int priority;

	public Entry(String value, int priority) {
		super();
		this.value = value;
		this.priority = priority;
	}

	@Override
	public int priority() {
		// TODO Auto-generated method stub
		return priority;
	}

	@Override
	public String toString() {
		return "(" + value + "priority=" + priority + ")";
	}

}
