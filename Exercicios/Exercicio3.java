import java.util.Scanner;


/*
 * Exercício 3
Dado um vetor de entrada A de tamanho N.
Implemente um algoritmo que verifica se o vetor está
ordenado na forma crescente.
 */

public class Exercicio3 {
	
	public static boolean analise_vetor(int[] vetor) {
		if(vetor.length>1) {
			for(int i = 1; i<vetor.length; i++) {
				if(vetor[i]<vetor[i-1]) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args){
		Scanner tam = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor:");
		int tamanho = tam.nextInt();
		int[] vetor = new int[tamanho];
		
		for(int i = 0; i<tamanho;i++) {
			vetor[i] += i;
		}
		
		
		System.out.println(analise_vetor(vetor));
		
		
		tam.close();
		
	}

}
