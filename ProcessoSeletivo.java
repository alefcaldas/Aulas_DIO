import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
        public static void main(String[] args) {
            try {
                Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                double salarioBase, numerodeContato;
                String cpf;

                System.out.printf("Bem vindo a inscrição do nosso programa");
                System.out.println();

                System.out.println("para começar digite aqui seu CPF");
                cpf = sc.next();

                System.out.println("otimo agora para prosseguir digite seu Salario Base");
                salarioBase = sc.nextDouble();

                if (salarioBase == 1.412 || salarioBase == 1412) {
                    System.out.println("ok aguarde ser chamado " +
                            "deixe seu numero para entrarmos em contato");
                    numerodeContato = sc.nextDouble();
                }
                if (salarioBase < 1.412 || salarioBase < 1412) {
                    System.out.println("Parabens você foi Selecionado para uma de nossas bolsas " +
                            "por favor deixe um numero de contato para que possamos entrar em contato");
                    numerodeContato = sc.nextDouble();
                }
                if (salarioBase > 1412) {
                    System.out.println("Desculpe não passou na bolsa pois " +
                            "esta bolsa é para pessoas de baixa renda");
                }
            }
            catch(InputMismatchException e){
                System.out.println("o CPF e Salario precisam ser em valores numericos");
            }


        }
    }
