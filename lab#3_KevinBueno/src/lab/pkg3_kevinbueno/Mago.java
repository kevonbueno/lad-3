package lab.pkg3_kevinbueno;

public class Mago extends Aliado {

    private int ap = 50;
    private int hp = 120;
    private int ad = 20;
    private int eficacia = 70;
    private int probabilidad = 2;
    private int suerte = 20;
    private int velocidad = 10;

    public Mago() {
    }

    public Mago(int ap, int suerte, String color, String pelo, String raza, int edad, String nombre, double estatura, double peso, int hp, int ad, int eficacia, int probalidad, int velocidad) {
        super(suerte, color, pelo, raza, edad, nombre, estatura, peso, hp, ad, eficacia, probalidad, velocidad);
        this.ap = ap;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Mago{" + "ap=" + ap + ", hp=" + hp + ", ad=" + ad + ", eficacia=" + eficacia + ", probabilidad=" + probabilidad + ", suerte=" + suerte + ", velocidad=" + velocidad + '}';
    }

}
