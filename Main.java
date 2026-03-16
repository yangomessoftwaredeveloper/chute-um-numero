import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min;
        int max;
        int chute;
        int totalChutes = 0;

        System.out.print("Chute um número - The Game\n");
        System.out.println("----------------------------\n");
        System.out.print("Digite o menor numero que quer adivinhar: ");
        min = scanner.nextInt();
        System.out.print("Digite o maior numero que que adivinhar: ");
        max = scanner.nextInt();
        int numeroAleatorio = random.nextInt(min, max + 1);


        System.out.printf("Adivinhe um número entre %d e %d\n", min, max);

        do{
            System.out.print("Chute um número: ");
            chute = scanner.nextInt();
            totalChutes++;

            if (chute < numeroAleatorio){
                System.out.println("O chute foi muito abaixo, chute novamente.");
            }
            else if (chute > numeroAleatorio){
                System.out.println("O chute foi muito acima, chute novamente.");
            }
            else{
                System.out.println("Boa! O número correto é: " + numeroAleatorio);
                System.out.print("O total de chutes foi de: " + totalChutes);
            }

        }while(chute != numeroAleatorio);

        scanner.close();
    }
}
