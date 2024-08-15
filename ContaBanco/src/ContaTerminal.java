import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a Agência:");
        String agencia = leitor.nextLine();
        System.out.println("Informe o número da conta:");
        int numero = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Informe o seu nome:");
        String nomeCliente = leitor.nextLine();
        System.out.println("Informe o saldo:");
        double saldo = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível");

leitor.close();

    }

}

