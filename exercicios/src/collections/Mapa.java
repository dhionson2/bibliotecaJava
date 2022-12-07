package collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Robert");//ele adiciona e subistitui caso seja o mesmo codigo
		usuarios.put(2, "Jorge");
		usuarios.put(3, "João");
		System.out.println(usuarios);
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("João"));
		
		System.out.println(usuarios.get(2));
		
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(java.util.Map.Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
	}
}
