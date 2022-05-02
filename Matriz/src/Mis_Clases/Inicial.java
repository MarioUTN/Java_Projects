/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mis_Clases;

/**
 *
 * @author Mario Salazar
 */
public class Inicial {
    public static void main(String[] args) {
         System.out.println("Hello World!");
        Matriz matriz=new Matriz(5, 4);
        matriz.LlenarMatrizAleatorio();
        System.out.println(""+matriz.ShowMatriz());
        matriz.LlenarMatrizAsc();
        System.out.println(""+matriz.ShowMatriz());
        matriz.LlenarMatrizDesc();
        System.out.println(""+matriz.ShowMatriz());
        matriz.LlenarMatrizZicZac();
        System.out.println(""+matriz.ShowMatriz());
        matriz.LlenarMatrizZicZacDesc();
        System.out.println(""+matriz.ShowMatriz());
        matriz.LlenarMatrizZicZacNew();
        System.out.println(""+matriz.ShowMatriz());
        System.out.println(""+matriz.NumberPrimo(8));
    }
}
