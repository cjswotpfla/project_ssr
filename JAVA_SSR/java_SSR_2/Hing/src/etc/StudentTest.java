package etc;
public class StudentTest {
	public static void main(String[] args) {
		Student std = new Student(1,1,1,"홍길동");
		std.print();
	}
}
class Student{
	private int grade;
	private int class1;
	private int stuNum;
	private String name;
	public void print() {
		System.out.println(grade + "학년 " + class1 + "반 " + stuNum + "번 " + name);
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClass1() {
		return class1;
	}
	public void setClass1(int class1) {
		this.class1 = class1;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int grade, int class1, int stuNum, String name) {
		this.grade = grade;
		this.class1 = class1;
		this.stuNum = stuNum;
		this.name = name;
	}
}