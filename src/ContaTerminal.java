import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int accountnumber;
        String agency;
        String clientName;
        double balance;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a Agência: ");
        agency = scanner.nextLine();

        System.out.println("Digite o nome do titular: ");
        clientName = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        balance = scanner.nextDouble();

        System.out.println("Por favor, digite o número da Conta: ");
        accountnumber = scanner.nextInt();

        scanner.close();
        
        System.out.println("Olá " + clientName + " obrigado por criar uma conta em nosso banco, sua agência é " + agency + " conta " + accountnumber + " e seu saldo "+ balance + " já está disponível para saque");

    }   
}
