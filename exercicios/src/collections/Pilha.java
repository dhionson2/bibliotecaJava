package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Biblia");
		livros.add("O Pequeno Principe");
		livros.push("Hobbit");
		
		System.out.println(livros.peek());// ele mostra o ultimo adicionado para o primeiro
		System.out.println(livros);
	}
	
}
