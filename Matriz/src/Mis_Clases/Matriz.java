/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mis_Clases;

import java.util.Random;

/**
 *
 * @author Mario Salazar
 */
public class Matriz {
    
    private int rows;
    private int columns;
    private int[][] matriz;

    public Matriz(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matriz = new int[rows][columns];
    }

    public void LlenarMatrizAleatorio() {
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = r.nextInt(100);
            }
        }
    }

    public void LlenarMatrizAsc() {
        int number = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = number++;
            }
        }
    }

    public void LlenarMatrizDesc() {
        int number = rows * columns;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = number--;
            }
        }
    }

    public void LlenarMatrizZicZac() {
        int number = 1;
        for (int i = 0; i < matriz.length; i++) {
            int j;
            if (i % 2 != 0) {
                j = columns - 1;
                while (j >= 0) {
                    matriz[i][j] = number++;
                    j--;
                }
            } else {
                j = 0;
                while (j < columns) {
                    matriz[i][j] = number++;
                    j++;
                }
            }
        }
    }

    public void LlenarMatrizZicZacDesc() {
        int number = rows * columns;
        for (int i = 0; i < matriz.length; i++) {
            int j;
            if (i % 2 != 0) {
                j = columns - 1;
                while (j >= 0) {
                    matriz[i][j] = number--;
                    j--;
                }
            } else {
                j = 0;
                while (j < columns) {
                    matriz[i][j] = number--;
                    j++;
                }
            }
        }
    }

    public void LlenarMatrizZicZacNew() {
        int number = 1;
        for (int col = 0; col < columns; col++) {
            int fil;
            if (col % 2 != 0) {
                fil = rows - 1;
                while (fil >= 0) {
                    matriz[fil][col] = number++;
                    fil--;
                }
            } else {
                fil = 0;
                while (fil < rows) {
                    matriz[fil][col] = number++;
                    fil++;
                }
            }
        }
    }

    public boolean NumberPrimo(int number) {
        boolean resp = true;
        if (number < 2) {
            resp = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    resp = false;
                }
            }
        }
        return resp;
    }

    public String ShowMatriz() {
        String resp = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resp = resp + "" + matriz[i][j] + "\t";
            }
            resp = resp + "\n";
        }
        return resp;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    
}
