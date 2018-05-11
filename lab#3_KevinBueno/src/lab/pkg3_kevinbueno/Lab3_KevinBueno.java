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
        Scanner input = new Scanner(System.in);
        char resp = 's';
        int opcc = 0;
        while (resp == 's' || resp == 'S') {
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
                            System.out.println("**Aliados**");
                            System.out.println("1:Mago\n"
                                    + "2: Arquero\n"
                                    + "3: Berzerk\n"
                                    + "4: Picaro\n"
                                    + "Ingrese el numero del personaje que desea agregar ");
                            break;
                        case 2:
                            
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
