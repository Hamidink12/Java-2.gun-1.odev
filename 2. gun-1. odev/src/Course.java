
public class Course {
	public Course() {
		System.out.println("Course'un ilk constructoru �al��t�");
	}
	
	public Course(int id, String name, String teacher, double price) {
		System.out.println("Course'un ikinci constructoru �al��t�");
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.price = price;
	}
	
	int id;
	String name;
	String teacher;
	double price;
}
