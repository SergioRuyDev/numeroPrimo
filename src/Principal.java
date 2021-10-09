import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tecle um numero para saber se é primo: ");
        int numeroEscolhido = entrada.nextInt();

        if (primo(numeroEscolhido)) {
            System.out.println(numeroEscolhido + " é um numero primo.");
        } else {
            System.out.println(numeroEscolhido + " não é um numero primo.");
        }


        entrada.close();
    }

    private static boolean primo(int numeroEscolhido) {
        for (int i = 2; i < numeroEscolhido; i++) {
            if (numeroEscolhido % i == 0)
                return false;
        }
        return true;
    }
}
