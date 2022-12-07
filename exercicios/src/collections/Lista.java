package collections;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
	
	
	ArrayList<Usuario> lista = new ArrayList<>();
	
	lista.add(new Usuario("Carlos"));
	lista.add(new Usuario("Fabinho"));
	lista.add(new Usuario("Lucas"));
	lista.add(new Usuario("GabiGol"));
	
	
	for(Usuario u:lista) {
		System.out.println(u);
	}
	
	}
}
