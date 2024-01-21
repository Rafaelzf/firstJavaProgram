import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String name = "Bruce Wane";
        String typeBankAccount = "Conta corrente";
        double saldo = 159999.99;
        int option = 0;
        Scanner reading = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("Tipo de conta: " + typeBankAccount);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n***********************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar valor
                2 - Transferir valor
                3 - Receber Valor
                4 - Sair
                """;


        while (option != 4){
            System.out.println(menu);
            option = reading.nextInt();



            if (option == 1){
                System.out.println("Seu saldo atual é de:" + saldo);
            } else  if(option == 2) {
                System.out.println("Qual valor deseja transferir?");
                double transferValue = reading.nextInt();
                if(transferValue > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= transferValue;
                    System.out.println("Seu saldo atual é de:" + saldo);
                }
            } else if(option == 3) {
                double receivedValue = reading.nextInt();
                saldo += receivedValue;
                System.out.println("Seu saldo atual é de:" + saldo);
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
