package igualdade;

public class Main {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(111, "Mario", "902385904");
		Usuario u2 = new Usuario(111, "Mario", "902385904");
		Usuario u3 = u1;
		
		System.out.println(u1 == u2);
		System.out.println(u1 == u3);
		
		System.out.println();
		
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
		
		
		/*String s1 = new String("MSG");//0x1001
		String s2 = new String("MSG");//0x1002
		
		String s3 = s1;//0x1001
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		*/
	}

}
