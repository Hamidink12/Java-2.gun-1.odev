
public class CourseManager {
		public void enrollInTheCourse(Course course) {
			System.out.println(course.name + "'a ba�ar�yla kaydolundu, Tebrikler!");
		}
		
		public void deleteEnrollmentFromCourse(Course course) {
			System.out.println(course.name + " kayd� iptal edildi.");
		}
		
		public void listOfCourses(Course[] courses) {
			for (Course course : courses) {
				System.out.println(course.name);
			}
		}
}
