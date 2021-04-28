
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "Programlamaya Giri� i�in Temel Kurs";
		course1.teacher = "Engin Demiro�";
		course1.price = 0;
		
		Course course2 = new Course(2,"Nitelikli Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�",0);
		
		Course course3 = new Course(3,"Nitelikli Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + REACT)","Engin Demiro�",0);
		
		Course[] courses = {course1,course2,course3};
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.listOfCourses(courses);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Python";
		
		Category category2 = new Category(2,"C#");
		
		Category category3 = new Category(3,"Java");
		
		Category category4 = new Category();
		System.out.println(category4.name);
		
		Category[] categories = {category1,category2,category3,category4};
		
		CategoryManager categoryManager = new CategoryManager();
		
		categoryManager.listOfCategories(categories);
	}

}