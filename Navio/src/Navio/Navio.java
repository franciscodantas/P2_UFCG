package Navio;

public class Navio {
    private int vida;
    private int dano;
    private int vidaprimaria;
    private int gold;

    public Navio(int vidaInical, int danoInicial, int goldinicial){
        this.vida = vidaInical;
        this.dano = danoInicial;
        this.vidaprimaria = vidaInical;
        this.gold = goldinicial;
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
    }

    public void setDano(int novoDano){
        this.dano = novoDano;
    }

    public void curar(){
        if (this.gold - 10 > 0) {
            this.vida += (int) ((this.vidaprimaria - this.getVida() ) * 0.3);
            System.out.println();
            System.out.println("Vida curada para " + this.vida);
            System.out.println();
            this.gold -= 10;
        }
    }

    public void aprimorarVida(int novaVida){
        if (this.gold - 0.5 * (novaVida - this.vidaprimaria) > 0 && novaVida > this.vidaprimaria) {
            this.vida = novaVida;
            this.vidaprimaria = novaVida;
            this.gold -= 0.5 * (novaVida - this.vidaprimaria);
        }
        
    }

    public int getVidaInicial(){
        return vidaprimaria;
    }
}