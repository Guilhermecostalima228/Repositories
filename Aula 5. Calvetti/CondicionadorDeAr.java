public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr() {
        this.termostato = new Termostato();
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Condicionador de Ar ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Condicionador de Ar desligado.");
    }

    public void aumentarTemperatura() {
        if (ligado) {
            int novaTemperatura = termostato.getTemperatura() + 1;
            termostato.setTemperatura(novaTemperatura);
            System.out.println("Temperatura aumentada para " + termostato.getTemperatura() + " graus.");
        } else {
            System.out.println("O condicionador de ar está desligado.");
        }
    }

    public void reduzirTemperatura() {
        if (ligado) {
            int novaTemperatura = termostato.getTemperatura() - 1;
            termostato.setTemperatura(novaTemperatura);
            System.out.println("Temperatura reduzida para " + termostato.getTemperatura() + " graus.");
        } else {
            System.out.println("O condicionador de ar está desligado.");
        }
    }

    public void imprimirTemperatura() {
        if (ligado) {
            System.out.println("Temperatura atual: " + termostato.getTemperatura() + " graus.");
        } else {
            System.out.println("O condicionador de ar está desligado.");
        }
    }
}
