package br.dell.model;

public class Quarto {
    private int numero;
    private Hospede hospede;

    public Quarto(int numero) {
        this.numero = numero;
        this.hospede = hospede;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
}
