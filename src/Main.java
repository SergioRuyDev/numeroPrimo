import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para saber se é primo: ");
        int numeroEscolhido = scanner.nextInt();

        if (primo(numeroEscolhido)) {
            System.out.println(numeroEscolhido + " é um numero primo.");
        } else {
            System.out.println(numeroEscolhido + " não é um numero primo.");
        }


        scanner.close();
    }

    private static boolean primo(int numeroEscolhido) {
        for (int i = 2; i < numeroEscolhido; i++) {
            if (numeroEscolhido % i == 0)
                return false;
        }
        return true;
    }
}
