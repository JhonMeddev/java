package Ex1;

public class Main {

	public static void main(String[] args) {
		
		LivroDigital ld = new LivroDigital("Senhor dos aneis","Ficção",
				3,
				new Autor("Tolkien","Tolkien@SA.com","Britanico"),
				5,
				10);
		
		ld.info();
	}

}
