
public class Category {
	public Category() {
		System.out.println("Category'nin ilk constructoru çalýþtý");
		name = "Tümü";
	}
	
	public Category(int id, String name) {
		System.out.println("Category'nin ikinci constructoru çalýþtý");
		this.id = id;
		this.name = name;
	}
	
	int id;
	String name;
}
