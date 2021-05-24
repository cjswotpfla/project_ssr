package day16;

public class ObjectToStringTest {

	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,1);
		System.out.println(s);
		System.out.println(s.toString());
	}
}
class Student{
	private String name;
	private int grada;
	private int classNum;
	private int num;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrada() {
		return grada;
	}
	public void setGrada(int grada) {
		this.grada = grada;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grada=" + grada + ", classNum=" + classNum + ", num=" + num + "]";
	}
	public Student(String name, int grada, int classNum, int num) {
		super();
		this.name = name;
		this.grada = grada;
		this.classNum = classNum;
		this.num = num;
	}
	
}