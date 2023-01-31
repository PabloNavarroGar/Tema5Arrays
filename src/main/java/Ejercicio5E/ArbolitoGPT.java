/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5E;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ArbolitoGPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura de la copa del árbol (entre 2 y 10): ");
        int height = sc.nextInt();
        while (height < 2 || height > 10) {
            System.out.print("Altura inválida. Ingrese la altura de la copa del árbol (entre 2 y 10): ");
            height = sc.nextInt();
        }
        sc.close();

        char[][] tree = generateTree(height);
        displayTree(tree);
    }

    private static char[][] generateTree(int height) {
        int trunkHeight = 2;
        int trunkWidth = 3;
        int crownHeight = height;
        int crownWidth = 1 + 2 * (height - 1);
        char[][] tree = new char[crownHeight + trunkHeight][crownWidth];
        for (int i = 0; i < crownHeight; i++) {
            int spaces = crownHeight - 1 - i;
            for (int j = 0; j < spaces; j++) {
                tree[i][j] = ' ';
            }
            for (int j = spaces; j < spaces + 2 * i + 1; j++) {
                tree[i][j] = '*';
            }
            for (int j = spaces + 2 * i + 1; j < crownWidth; j++) {
                tree[i][j] = ' ';
            }
        }
        for (int i = crownHeight; i < crownHeight + trunkHeight; i++) {
            int spaces = (crownWidth - trunkWidth) / 2;
            for (int j = 0; j < spaces; j++) {
                tree[i][j] = ' ';
            }
            for (int j = spaces; j < spaces + trunkWidth; j++) {
                tree[i][j] = '#';
            }
            for (int j = spaces + trunkWidth; j < crownWidth; j++) {
                tree[i][j] = ' ';
            }
        }
        return tree;
    }

    private static void displayTree(char[][] tree) {
        for (int i = 0; i < tree.length; i++) {
            for (int j = 0; j < tree[i].length; j++) {
                System.out.print(tree[i][j]);
            }
            System.out.println();
        }
    }
}
