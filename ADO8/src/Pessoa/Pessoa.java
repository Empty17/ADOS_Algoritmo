package Pessoa;

public class Pessoa {
    private String nomeCompleto;
    private int anoNasc;

    private int idade;
    private String primeiroNome;
    private String ultimoNome;

    public int getIdade() {
        return idade;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

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

    public Pessoa(String nomeCompleto, int anoNasc) {
        this.nomeCompleto = nomeCompleto;
        this.anoNasc = anoNasc;
        idade();
        primeiroNome();
        ultimoNome();
    }

    private void ultimoNome() {
        String nome = this.nomeCompleto;
        String[] resul = nome.split(" ");
        ultimoNome = resul[1];
    }

    private void primeiroNome() {
        String nome = this.nomeCompleto;
        String[] resul = nome.split(" ");
        primeiroNome = resul[0];
    }

    private void idade() {
        idade = 2023 - this.anoNasc;
    }
}
