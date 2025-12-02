import java.util.Scanner;

public class categoria {
    private double Alimentacao;
    private double Despesas;
    private double Transporte;
    private double Entretenimento;
    private double Outros;

    public categoria(double alimentacao, double despesas, double transporte, double entretenimento, double outros) {
        this.Alimentacao = 0;
        this.Despesas = 0;
        this.Transporte = 0;
        this.Entretenimento = 0;
        this.Outros = 0;
    }

    public categoria() {

    }

    public double getAlimentacao() {
        return Alimentacao;
    }

    public void setAlimentacao(double alimentacao) {
        Alimentacao = alimentacao;
    }

    public double getDespesas() {
        return Despesas;
    }

    public void setDespesas(double despesas) {
        Despesas = despesas;
    }

    public double getTransporte() {
        return Transporte;
    }

    public void setTransporte(double transporte) {
        Transporte = transporte;
    }

    public double getEntretenimento() {
        return Entretenimento;
    }

    public void setEntretenimento(double entretenimento) {
        Entretenimento = entretenimento;
    }

    public double getOutros() {
        return Outros;
    }

    public void setOutros(double outros) {
        Outros = outros;
    }

    public void adicionarGastos(Scanner sc, double valor) {
        String categoria = sc.nextLine();
        switch (categoria) {
            case "1":
                setAlimentacao(valor + getAlimentacao());
                System.out.printf("O valor %.2f foi adicionado a categoria Alimentação", valor);
                System.out.println("");
                System.out.printf("O gasto foi atualizado para %.2f", getAlimentacao());
                break;
            case "2":
                setDespesas(valor + getDespesas());
                System.out.printf("O valor %.2f foi adicionado a categoria Despesas", valor);
                System.out.println("");
                System.out.printf("O gasto foi atualizado para %.2f", getDespesas());
                break;
            case "3":
                setTransporte(valor + getTransporte());
                System.out.printf("O valor %.2f foi adicionado a categoria Transporte", valor);
                System.out.println("");
                System.out.printf("O gasto foi atualizado para %.2f", getTransporte());
                break;
            case "4":
                setEntretenimento(valor + getEntretenimento());
                System.out.println("");
                System.out.printf("O valor %.2f foi adicionado a categoria Entreterimento", valor);
                System.out.printf("O gasto foi atualizado para %.2f", getEntretenimento());
                break;
            case "5":
                setOutros(valor + getOutros());
                System.out.printf("O valor %.2f foi adicionado a categoria Outros", valor);
                System.out.println("");
                System.out.printf("O gasto foi atualizado para %.2f", getOutros());
                break;
            default:

        }

    }

}
