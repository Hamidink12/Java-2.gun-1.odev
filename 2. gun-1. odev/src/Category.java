
public class Category {
	public Category() {
		System.out.println("Category'nin ilk constructoru �al��t�");
		name = "T�m�";
	}
	
	public Category(int id, String name) {
		System.out.println("Category'nin ikinci constructoru �al��t�");
		this.id = id;
		this.name = name;
	}
	
	int id;
	String name;
}
