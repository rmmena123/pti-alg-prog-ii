import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int numero_elementos;
            System.out.println("Quantos números deseja inserir?");
            numero_elementos = ler.nextInt();

            int[] vetor_numeros = new int[numero_elementos];
            int i;
            System.out.printf("Informe %d valores: \n", numero_elementos);
            for(i = 0; i < numero_elementos; i++) {
                vetor_numeros[i] = ler.nextInt();
                System.out.printf("-------\n");
            }
            
            int menor = vetor_numeros[0];
            int maior = 0;
            int resultado = 0;
            Boolean crescente = false;          

            for(i = 0; i < vetor_numeros.length; i++) {
                if(vetor_numeros[i] < menor) {
                    menor = vetor_numeros[i];
                    System.out.printf("Menor %d \n", menor);
                }

                if(vetor_numeros[i] > maior) {
                    maior = vetor_numeros[i];
                    System.out.printf("Maior %d \n", maior);
                }
            }

            resultado = maior - menor;
            System.out.printf("Maior diferença: %d \n", resultado);

            for(i = 0; i < vetor_numeros.length - 1; i++) {
                if(vetor_numeros[i] > vetor_numeros[i+1]) {
                    crescente = false;
                    System.out.println("Vetor não está em ordem crescente! \n");
                    break;
                }

                else {
                    crescente = true;
                    continue;
                }
            }

            if(crescente == true) {
                System.out.println("Vetor está em ordem crescente! \n");
            }
        }
    }
}