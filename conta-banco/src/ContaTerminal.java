/**
 * Classe que simula uma conta bancária para o desafio da DIO.
 * Você pode inserir seus dados que irá ser lançada uma mensagem no Terminal com todos eles.
 * 
 * @author Matheus Keher
 */

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta bancária:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o saldo da sua conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
