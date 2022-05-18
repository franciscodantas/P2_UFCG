package Navio;

public class Navio {
    private int vida;
    private int dano;
    private int vidaprimaria;

    public Navio(int vidaInical, int danoInicial){
        this.vida = vidaInical;
        this.dano = danoInicial;
        this.vidaprimaria = vidaInical;
    }

    public void atacar(Navio n2 ) {
        n2.setVida(n2.getVida() - this.getDano());
    }

    public int getVida() {
        return this.vida;
    }

    public int getDano() {
        return this.dano;
    }

    public void setVida(int novaVida){
        this.vida = novaVida;
        this.vidaprimaria = this.vida;
    }

    public void setDano(int novoDano){
        this.dano = novoDano;
    }

    public void curar(){
        this.vida = this.vidaprimaria;
    }
}