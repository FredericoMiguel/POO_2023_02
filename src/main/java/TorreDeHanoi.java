import java.util.Scanner;

public class TorreDeHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de discos: ");
        int numDiscos = scanner.nextInt();

        int movimentos = resolverTorreDeHanoi(numDiscos, 'A', 'C', 'B');

        System.out.println("Número de movimentos necessários: " + movimentos);
    }

    // Função recursiva para resolver a Torre de Hanói
    public static int resolverTorreDeHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return 1;
        }

        int movimentos = 0;

        movimentos += resolverTorreDeHanoi(n - 1, origem, auxiliar, destino);

        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);

        movimentos++;

        movimentos += resolverTorreDeHanoi(n - 1, auxiliar, destino, origem);

        return movimentos;
    }
}