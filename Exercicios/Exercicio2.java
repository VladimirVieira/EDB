import java.util.Scanner;

/*
 * Exercício 2
Dado um vetor A de tamanho N, ordenado de forma crescente:
Implemente o algoritmo de busca binária na forma iterativa.
 * */

class BuscaBinaria{
	private int[] vetor;
	
	BuscaBinaria(int[] vetor){
		this.vetor = vetor;
	}
	
	public String busca(int valor) {
		int inicio = 0;
		int fim = this.vetor.length-1;
		int meio = (inicio+fim)/2;
		
		while(true) {
			if(this.vetor[meio]==valor) {
				return "Valor encontrado na posicao:"+meio;
			}else {
				if(this.vetor[meio]<valor) {
					inicio = meio + 1;
				}else {
					fim = meio - 1;
				}
			}
			meio = (inicio+fim)/2;
			if(inicio>fim) {
				return "Valor não encontrado";
			}
		}
	}
}
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner tam = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor:");
		int tamanho = tam.nextInt();
		int[] vetor = new int[tamanho];
		
		for(int i = 0; i<tamanho;i++) {
			vetor[i] += i;
		}
		BuscaBinaria v1 = new BuscaBinaria(vetor);
		System.out.println(v1.busca(101));
		
		tam.close();
	}

}
