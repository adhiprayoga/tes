/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkppl.uas.uasrkppl;

/**
 *
 * @author Adhi
 */
public class Soal {

    public int pangkat(int bil, int pangkat) {
        int hasil = 0;
        int n = 1;
        while (n <= pangkat) {
            n++;
        }
        return hasil;
    }

    public int faktorial(int bil) {
        int hasil = 1;
        for (int i = 1; 1 <= bil; i++) {
            hasil *= i;
        }

        return hasil;
    }

    public int perkalian(int bilA, int bilB) {
        return bilA * bilB;
    }
    
    public static void main(String[] args) {
        System.out.println("Test");
    }

}
