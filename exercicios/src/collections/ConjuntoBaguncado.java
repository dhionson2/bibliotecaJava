package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		
		
		System.out.println("Antes de remover : "+conjunto.size());
		if(conjunto.remove('x')!= false) {
			System.out.println("Tem variavel para remover!!");
		}

		conjunto.remove('x');
		
		System.out.println("Depois de remover sobraram :  " +conjunto.size()+"  variaveis..");
		
		System.out.println("Verificando se removi a variavel :");
		if(conjunto.contains('x') == false) {
			System.out.println("A variavel foi removida com sucesso !!");
		}
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //união entre dois conjuntos
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}
