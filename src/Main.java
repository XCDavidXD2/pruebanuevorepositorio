import java.util.Random;

public class Main {
    public static void main(String[] args) {
        tirarDados();
    }

    public static void tirarDados() {
        Random random = new Random();
        // Genera dos números aleatorios entre 1 y 6 simulando el lanzamiento de dos dados
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        // Imprime el resultado de los dados
        System.out.println("Has sacado un " + dado1 + " y un " + dado2);
    }
}
