import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Gastos G = new Gastos();
        categoria C = new categoria("Alimentação", "Despesas", "Transporte", "Entretenimento", "Outros");

        System.out.println("Controle de Gastos");
        System.out.println("Adicionar gastos :1: ");
        System.out.println("Ver metricas :2: ");
        System.out.print("Selecione: ");
        String op = sc.nextLine();
        if (op.equals("1")) {
            System.out.print("Digite o valor do gasto: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite a categoria do gasto: ");
            System.out.print("Alimentação (1)");
            System.out.println("Despesas (2)");
            System.out.println("Transporte (3)");
            System.out.println("Entretenimento (4)");
            System.out.println("Outros (5)");
            C.adicionarGastos(sc, valor);
        } else if (op.equals("2")) {
        }


    }
}