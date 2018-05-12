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
public class Aliado extends Personajes {

    private int suerte;
    private String color;
    private String pelo;
    private String raza;

    public Aliado() {
    }

    public Aliado(int suerte, String color, String pelo, String raza, int edad, String nombre, double estatura, double peso, int hp, int ad, int eficacia, int probalidad, int velocidad) {
        super(edad, nombre, estatura, peso, hp, ad, eficacia, probalidad, velocidad);
        this.suerte = suerte;
        this.color = color;
        this.pelo = pelo;
        this.raza = raza;
    }

 

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString()+"Aliado{" + "suerte=" + suerte + ", color=" + color + ", pelo=" + pelo + ", raza=" + raza + '}';
    }
    
    

}
