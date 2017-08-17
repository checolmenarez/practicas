package com.practicas.basico;

import java.io.*;
import java.util.*;

public class Matrices {
	
    public int DiferenciaDiagonal(int n, ArrayList lista) {
    	int dif=0;
    	try {
			
		} catch (Exception e) {
			
		}
    	return dif;
    			
    }
    public static <E> void main(String[] args) {
        ArrayList<int[]> lista = new ArrayList<int[]>();
    	int[] arr=null;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el orden de la matriz");
        int numfilas = in.nextInt();
        
        for(int y=0;y<numfilas;y++) {
        	
        	System.out.println("Ingrese los elementos de la fila Nro :"+y);
        	arr = new int[3];
            for(int i=0;i<numfilas;i++) {
            	arr[i] = in.nextInt();
            }        	
            lista.add(y,arr);
        }
        
        System.out.println("Matriz: \n");
        
        for(int x=0;x<numfilas;x++) {
        	for(int y=0;y<numfilas;y++) {
        		System.out.println(lista.get(x)[y]);
        	}
        }
        
    }
}