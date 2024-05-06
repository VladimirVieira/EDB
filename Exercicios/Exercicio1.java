import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/*
 * Exercício 1- Implemente um algoritmo de busca sequencial recursivo que
retorna o indice do vetor caso X seja encontrado e -1 caso contrário.
 * */

public class Exercicio1 {
	public static int pesquisa_recursiva(ArrayList<Integer>vetor, int X, int tam) {
		if(tam == -1) {
			return -1;
		}else {
			if(X==vetor.get(tam)) {
				return tam;
			}
			
			
			return pesquisa_recursiva(vetor, X, tam-1);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> vetor = new ArrayList<>();
		Scanner tam = new Scanner(System.in);
		System.out.println("Digite a quantidade de elementos do vetor:");
		int tamanho = tam.nextInt();
		for(int i = 0; i<tamanho;i++) {
			vetor.add(i);
		}
		
		Collections.shuffle(vetor);
		System.out.println(vetor);
		
		System.out.println(pesquisa_recursiva(vetor, 5, vetor.size()-1));
		
		
		tam.close();
	}

}
