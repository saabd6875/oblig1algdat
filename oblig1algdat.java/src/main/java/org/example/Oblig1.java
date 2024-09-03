package org.example;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    public static int gruppeMedlemmer (){
        return 3;
    }
    public static void main (String[]args){
        int[] tabell = {2, 1, 3, 4, 8, 5, 4, 1};
        bubbleSort(tabell);
        int maks = tabell[tabell.length-1];
        System.out.println(maks);
    }
    // oppgave 1 sorterer ved å bruke bubble sort
    public static void bytt(int[] tabell, int i, int j){
        int tmp= tabell[i];
        tabell[i]= tabell[j];
        tabell[j]= tmp;
    }

    public static void bubbleSort(int[] tabell){
        if (tabell.length == 0){
            throw new NoSuchElementException("The array is empty");
        }
        for (int i= tabell.length-1; i > 0; i--){
            for (int j=0;j < i; j++){
                if (tabell[j]> tabell[j+1]) bytt (tabell, j, j+1);
            }
        }
    }

}