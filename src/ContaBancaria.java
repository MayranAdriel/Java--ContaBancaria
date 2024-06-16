import java.util.Scanner;
import java.util.Locale;

public class ContaBancaria {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        //atributos
        System.out.println("Informe o numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Informe o numero da agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Informe o valor: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " +  saldo + " já está disponível para saque.");

        scanner.close();
    }
}
