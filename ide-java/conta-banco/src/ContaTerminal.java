import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String Agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String Nome = scanner.next();

        System.out.println("Digite o valor de depósito: ");
        float Saldo = scanner.nextFloat();

        System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de R$ " + Saldo + " já está disponível para saque.");
        scanner.close();
    }

}
