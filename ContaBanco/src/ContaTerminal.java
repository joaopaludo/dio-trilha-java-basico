import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, informe a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, informe o nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, informe o saldo:");
        double saldo = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                nome, agencia, conta, saldo);
    }
}
