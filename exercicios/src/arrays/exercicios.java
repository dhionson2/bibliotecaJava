package arrays;

import java.util.Arrays;

public class exercicios {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 10.0;
		notasAlunoA[1] = 7.5;
		notasAlunoA[2] = 3.9;
		notasAlunoA[3] = 5.9;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		//somando as notas
		double total = 0;		
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		//tirando a media das notas
		double mediaNotas = total/notasAlunoA.length;
		System.out.println("A média das notas é : "+mediaNotas);
		
	}
	
}
