package com.practicas.basico;

import java.io.*;
import java.util.*;

public class Matrices {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int[] arr;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese le orden de la matriz");
        int numfilas = in.nextInt();
        
        for(int y=0;y<numfilas;y++) {
        	
        	arr = new int[numfilas];        
            System.out.println("Ingrese los elementos de la fila Nro :"+y);
            for(int i=0;i<numfilas;i++) {
            	arr[i] = in.nextInt();
            }
        	
        }
        
        
    }
}