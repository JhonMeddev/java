package collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		//ArrayList<String> pessoas = new ArrayList();
		LinkedList<String> pessoas = new LinkedList();
		
		
		pessoas.add("Mario");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		
		System.out.println(pessoas.get(0));
		//pessoas.remove(1);
		System.out.println("Ordem Original: ");
		System.out.println(pessoas);
		
		Collections.sort(pessoas);
		System.out.println("Ordem Alfabetica: ");
		System.out.println(pessoas);
		
		Collections.shuffle(pessoas);
		System.out.println("Ordem Misturada: ");
		System.out.println(pessoas);
		
		Collections.reverse(pessoas);
		System.out.println("Ordem Inversa: ");
		System.out.println(pessoas);
		
		System.out.println(Collections.min(pessoas));
		System.out.println(Collections.max(pessoas));
				

	}

}
