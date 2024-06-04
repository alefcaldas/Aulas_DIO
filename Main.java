import java.util.Locale;
import java.util.InputMismatchException;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            double salarioBase;
            String cpf, numerodeContato;

            System.out.printf("Bem vindo a inscrição do nosso programa");
            System.out.println();

            System.out.println("para começar digite aqui seu CPF");
            cpf = sc.nextLine();

            System.out.println("otimo agora para prosseguir digite seu Salario Base");
            salarioBase = sc.nextDouble();

            if (salarioBase >= 1.412)
                System.out.println("ok aguarde ser chamado");

                else if (salarioBase > 1.412)
                    System.out.println("Desculpe não passou na bolsa pois " +
                            "esta bolsa é apra pessoas de baixa renda");

                    else System.out.println("Parabens você foi Selecionado para uma de nossas bolsas" +
                            "por favor deixe um numero de contato para que possamos entrar em contato");


            System.out.println("deixe aqui seu numero de contato");
            sc.nextLine();
            numerodeContato = sc.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("o CPF e Salario precisam ser em valores numericos");
        }


    }
}