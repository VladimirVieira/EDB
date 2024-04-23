import java.util.Scanner;
/*
 * Dado um valor inteiro positivo N.
Implemente o algoritmo iterativo de fibonacci. De modo a
retornar o valor inteiro X na posição N da sequência de
fibonacci.
 */
public class Exercicio4 {
	
	public static int fibonacci(int N) {
		if (N == 1) {
			return 0;
        }else{
            int p1 = 0;
            int p2 = 1;
            for (int i = 0; i < N; i++) {
            	if (i==0 || i==1) {
            		continue;
            	}else {
            		int aux = p2;
                    p2 = p1 + p2;
                    p1 = aux;
            	}
                
            }
            return p2;
        }
    }
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um valor que compreende o tamanho da sequencia: ");
			int pos = scanner.nextInt();
			System.out.println(fibonacci(pos));
		}
	}
}
