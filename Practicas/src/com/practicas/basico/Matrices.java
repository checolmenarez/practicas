package com.practicas.basico;

import java.io.*;
import java.util.*;
import java.math.*;

public class Matrices {
	
	 public int DiferenciaDiagonal(int n, ArrayList<int[]> lista) {
    	int dif=0;
    	try {
    		int sumDiagonal1 = 0;
    		int sumDiagonal2 = 0;
    		int nAux = n;
    		
    		for(int x=0;x<n;x++) {
    			nAux--;
    			sumDiagonal1 += lista.get(x)[x];	
    			sumDiagonal2 += lista.get(x)[nAux];
    		}
    		    		
    		System.out.println("Diagonal Primaria: "+sumDiagonal1+" Diagonal Secundaria: "+sumDiagonal2);
    		
    		dif = Math.abs(sumDiagonal1 - sumDiagonal2);
			
		} catch (Exception e) {
			System.out.println("Error:"+e);
		}
    	return dif;
    			
    }
	 
    public static <E> void main(String[] args) {
        ArrayList<int[]> lista = new ArrayList<int[]>();
    	int[] arr=null;
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el orden de la matriz");
        int numfilas = in.nextInt();
        
        for(int y=0;y<numfilas;y++) {
        	
        	System.out.println("Ingrese los elementos de la fila Nro :"+y);
        	arr = new int[numfilas];
            for(int i=0;i<numfilas;i++) {
            	arr[i] = in.nextInt();
            }        	
            lista.add(y,arr);
        }
        
        Matrices obj = new Matrices();
        int dif = obj.DiferenciaDiagonal(numfilas, lista);
        
        System.out.println("Diferencia: "+dif);
               
    }
}