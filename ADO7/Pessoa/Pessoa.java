package Pessoa;

public class Pessoa {
    private String nomeCompleto;
    private int anoNasc;

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int idade(){
        return 2023 - this.anoNasc;
    }

    public String primeiroNome(){
        String nome = this.nomeCompleto;
        String[] resul = nome.split(" ");
        return resul[0];
    }

    public String ultimoNome(){
        String nome = this.nomeCompleto;
        String[] resul = nome.split(" ");
        return resul[1];
    }
}
