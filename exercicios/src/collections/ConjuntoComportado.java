package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<String>();//aqui eu crio uma lista e digo qual vai ser o tipo dela
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Pedro");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Joaquin");
		listaAprovados.add("Joao Pedro");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);				
		}
		
		
		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		nums.add(11);
		for(int n : nums) {
			System.out.println(n);
		}
				
	}
}
