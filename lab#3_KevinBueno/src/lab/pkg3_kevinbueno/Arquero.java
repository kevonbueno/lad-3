/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_kevinbueno;

/**
 *
 * @author Kevin
 */
public class Arquero extends Aliado{
     private int hp = 150;
    private int ad = 55;
    private int eficacia = 85;
    private int probabilidad = 60;
    private int suerte = 20;
    private int velocidad = 15;

    public Arquero(int suerte, String color, String pelo, String raza, int edad, String nombre, double estatura, double peso, int hp, int ad, int eficacia, int probalidad, int velocidad) {
        super(suerte, color, pelo, raza, edad, nombre, estatura, peso, hp, ad, eficacia, probalidad, velocidad);
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
        return "Arquero{" + "hp=" + hp + ", ad=" + ad + ", eficacia=" + eficacia + ", probabilidad=" + probabilidad + ", suerte=" + suerte + ", velocidad=" + velocidad + '}';
    }
    
    
}
