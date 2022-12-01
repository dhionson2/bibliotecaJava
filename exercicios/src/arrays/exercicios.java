package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class exercicios {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 10.0;
		notasAlunoA[1] = 7.5;
		notasAlunoA[2] = 3.9;
		notasAlunoA[3] = 5.9;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		//somando as notas
		double totalAlunoA = 0;		
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		//tirando a media das notas
		double mediaAlunoA = totalAlunoA/notasAlunoA.length;
		System.out.println("A média das notas do aluno A : "+mediaAlunoA);
		
		//outra forma de criar um array
		double[] notasAlunoB = {6.7, 8.8, 3.1, 9.5};
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		double mediaAlunoB = totalAlunoB/notasAlunoB.length;
		
		System.out.println("A média das notas do aluno B : "+mediaAlunoB);
		
		if(mediaAlunoA >= 7.0) {
			System.out.println("O aluno A passou por média, sua média foi"+mediaAlunoA +"!");
		}else {
			System.out.println("O aluno A nao passou tirou média inferior a 7.0, sua média foi : "+mediaAlunoA);
		}
		if(mediaAlunoB >= 7.0) {
			System.out.println("O aluno B passou por média, sua média foi : "+mediaAlunoB +"!");
		}else {
			System.out.println("O aluno B nao passou tirou média inferior a 7.0, sua média foi : "+mediaAlunoB);
		}
	}
	
}
