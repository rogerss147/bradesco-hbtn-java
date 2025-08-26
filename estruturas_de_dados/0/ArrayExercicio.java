import java.util.Scanner;


public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }


        // Exibindo os resultados
        System.out.println("\n\nConteúdo do array: ");
        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3] + " " +
                           numeros[4] + " " + numeros[5] + " " + numeros[6] + " " + numeros[7] + " " +
                           numeros[8] + " " + numeros[9]);

        System.err.printf("Soma de todos os números: %d\n", soma);
        System.err.printf("Maior número no array: %d\n", maiorNumero);
        // Fechando o scanner
        scanner.close();
    }
}