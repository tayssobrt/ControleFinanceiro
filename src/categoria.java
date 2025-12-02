import java.util.Scanner;

public class categoria {
    private String Alimentacao;
    private String Despesas;
    private String Transporte;
    private String Entretenimento;
    private String Outros;

    public categoria(String alimentacao, String despesas, String transporte, String entretenimento, String outros) {
        Alimentacao = alimentacao;
        Despesas = despesas;
        Transporte = transporte;
        Entretenimento = entretenimento;
        Outros = outros;
    }

    public String getAlimentacao() {
        return Alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        Alimentacao = alimentacao;
    }

    public String getDespesas() {
        return Despesas;
    }

    public void setDespesas(String despesas) {
        Despesas = despesas;
    }

    public String getTransporte() {
        return Transporte;
    }

    public void setTransporte(String transporte) {
        Transporte = transporte;
    }

    public String getEntretenimento() {
        return Entretenimento;
    }

    public void setEntretenimento(String entretenimento) {
        Entretenimento = entretenimento;
    }

    public String getOutros() {
        return Outros;
    }

    public void setOutros(String outros) {
        Outros = outros;
    }

    public int adicionarGastos(Scanner sc, double valor) {
        String categoria = sc.nextLine();
        switch (categoria) {
            case "1":
                setAlimentacao(valor + getAlimentacao());
                return 1;
            case "2":
                setDespesas(valor + getDespesas());
                return 2;
            case "3":
                setTransporte(valor + getTransporte());
                return 3;
            case "4":
                setTransporte(valor + getTransporte());
                return 4;
            case "5":
                setOutros(valor + getOutros());
                return 5;
            default:
                return 0;
        }

    }

}
