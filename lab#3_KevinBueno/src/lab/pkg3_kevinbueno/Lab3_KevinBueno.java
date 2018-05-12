/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_kevinbueno;

import java.util.*;

/**
 *
 * @author Kevin
 */
public class Lab3_KevinBueno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Personajes> personajes = new ArrayList();
        Scanner input = new Scanner(System.in);
        char resp = 's';
        int opcc = 0;
        while (resp == 's' || resp == 'S') {
            int edad;
            String nombre;
            double estatura;
            double peso;
            String color="";
            String colorp="";
            String raza="";
            
            System.out.print("**Menu**\n"
                    + "1:iniciar\n"
                    + "2:Nivel de dificualtad\n"
                    + "3:Salir \n"
                    + "Ingrese el numero de la opcion que desea utilizar: ");
            opcc = input.nextInt();
            switch (opcc) {
                case 1:
                    int opcc2;
                    System.out.print("1: Personaje aliado\n"
                            + "2:Personaje Enemigo\n"
                            + "ingrese el numero del personaje que desea agregar: ");
                    opcc2=input.nextInt();
                    switch(opcc2){
                        case 1:
                            int opcc3;
                            System.out.println("**Aliados**");
                            System.out.println("1:Mago\n"
                                    + "2: Arquero\n"
                                    + "3: Berzerk\n"
                                    + "4: Picaro\n"
                                    + "Ingrese el numero del personaje que desea agregar ");
                            opcc3=input.nextInt();
                            switch(opcc3){
                                case 1:
                                    int abc;
                                    System.out.print("Ingrese nombre: ");
                                    nombre=input.next();
                                    System.out.print("Ingrese edad:");
                                    edad=input.nextInt();
                                    System.out.print("Ingrese estatura: ");
                                    estatura=input.nextDouble();
                                    System.out.print("Ingrese peso: ");
                                    peso=input.nextDouble();
                                    System.out.print("Ingrese color ");
                                    color=input.next();
                                    System.out.print("Color de pelo\n"
                                            + "1- negro\n"
                                            + "2- cafe\n"
                                            + "3- rubio\n"
                                            + "Ingrese el numero del color de pelo:");
                                    abc=input.nextInt();
                                    if (abc==1) {
                                        colorp="negro";
                                    }if (abc==2) {
                                        colorp ="cafe";
                                    }if (abc==3) {
                                        colorp="rubio";
                                    }
                                    System.out.print("RAZA\n"
                                            + "1- Hubbit\n"
                                            + "2- Elfos\n"
                                            + "3- Humanos\n"
                                            + "4- Enanos"
                                            + "Ingrese el numero del color de pelo:");
                                    abc=input.nextInt();
                                     if (abc==1) {
                                       raza="negro";
                                    }if (abc==2) {
                                        raza ="cafe";
                                    }if (abc==3) {
                                        raza="rubio";
                                    }if (abc==4) {
                                        raza="rubio";
                                    }
                                    Aliado mago = new Mago(50,20, color, colorp,  raza,  edad,  nombre, estatura,  peso,  120,  20,  70, 2, 10);
                                    personajes.add(mago);
                                    break;
                                case 2:
                                    abc=0;
                                    System.out.print("Ingrese nombre: ");
                                    nombre=input.next();
                                    System.out.print("Ingrese edad:");
                                    edad=input.nextInt();
                                    System.out.print("Ingrese estatura: ");
                                    estatura=input.nextDouble();
                                    System.out.print("Ingrese peso: ");
                                    peso=input.nextDouble();
                                    System.out.print("Ingrese color ");
                                    color=input.next();
                                    System.out.print("Color de pelo\n"
                                            + "1- negro\n"
                                            + "2- cafe\n"
                                            + "3- rubio\n"
                                            + "Ingrese el numero del color de pelo:");
                                    abc=input.nextInt();
                                    if (abc==1) {
                                        colorp="negro";
                                    }if (abc==2) {
                                        colorp ="cafe";
                                    }if (abc==3) {
                                        colorp="rubio";
                                    }
                                    System.out.print("RAZA\n"
                                            + "1- Hubbit\n"
                                            + "2- Elfos\n"
                                            + "3- Humanos\n"
                                            + "4- Enanos"
                                            + "Ingrese el numero del color de pelo:");
                                    abc=input.nextInt();
                                     if (abc==1) {
                                       raza="negro";
                                    }if (abc==2) {
                                        raza ="cafe";
                                    }if (abc==3) {
                                        raza="rubio";
                                    }if (abc==4) {
                                        raza="rubio";
                                    }
                                    Aliado berzerk = new Berzerk(15,  color, colorp,  raza,  edad,  nombre, estatura,  peso,  190,  80,  80, 30, 20);
                                    personajes.add(berzerk);
                                    break;
                                case 3:
                                    
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("**Enemigos**");
                            System.out.println("1:Buruja\n"
                                    + "2: Troll\n"
                                    + "3: Orco\n"
                                    + "4:Elfo oscuro ");
                            break;
                    }
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;

            }

            System.out.println("Presione s para continar");
            resp = input.next().charAt(0);
        }
    }

}
