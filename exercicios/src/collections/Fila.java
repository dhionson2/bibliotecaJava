package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		//add e offer os dois adicionam elementos
		fila.add("Ana");//aqui ele gera um erro caso nao tenha espaço na fila
		fila.offer("Bia");//caso ele nao consiga adicionar ele retorne falso
		fila.offer("Pedro");
		fila.add("Rafael");
		fila.offer("Rafinha");
		
		System.out.println(fila.peek());//mostra o primeiro e se a fila estiver null ele nao da problema
		System.out.println(fila.element());//retorna o primeiro so que se a fila estiver vazia ele da erro
		
		
		System.out.println(fila.isEmpty());//vejo se está vazia
		System.out.println(fila.size());//tamanho da fila
		
		System.out.println(fila.poll());//remove o primeiro da lista
		System.out.println(fila.remove());//também remove so que se a lsita estiver vazia ele da erro
		
	}
}
