import java.util.Locale;
import java.util.Scanner;

public class CaixaCantina {
    static void mostrarMenu() {
        System.out.println("\n1 - Registrar venda");
        System.out.println("2 - Consultar total");
        System.out.println("0 - Encerrar");
        System.out.print("Opcao: ");
    }

    static double registrarVenda(double total, double valor) {
        if(valor <= 0){ System.out.println("Valor invalido. A venda nao foi registrada."); }
        else{ total += valor; }
        return total;
    }

    static void mostrarTotal(double total) {
        System.out.printf("Total: %.2f\n", total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double total = 0.0;
        int opcao;

        do {
            mostrarMenu();
            opcao = scanner.nextInt();

            // TODO: use switch para tratar as opcoes 1, 2, 0 e uma opcao invalida.
            switch(opcao) {
                case 1:
                    System.out.print("Digite o valor da venda: ");
                    double valor = scanner.nextDouble();
                    total = registrarVenda(total, valor);
                    break;
                case 2:
                    mostrarTotal(total);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
