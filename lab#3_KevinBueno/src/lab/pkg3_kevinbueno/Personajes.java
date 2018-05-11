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
public class Personajes {
    private int edad;
    private String nombre;
    private  double estatura;
    private double peso;
    private int hp;
    private int ad;
    private int probalidad;
    private int velocidad;

    public Personajes() {
    }

    public Personajes(int edad, String nombre, double estatura, double peso, int hp, int ad, int probalidad, int velocidad) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.hp = hp;
        this.ad = ad;
        this.probalidad = probalidad;
        this.velocidad = velocidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    public int getProbalidad() {
        return probalidad;
    }

    public void setProbalidad(int probalidad) {
        this.probalidad = probalidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
