package org.example;
import java.util.Arrays;
public class Oblig1 {

    public static int gruppeMedlemmer (){
        return 3;
    }
    public static void main (String[]args){
        int[] tabell = {2, 1, 3, 4, 7, 5, 4, 1};
        bubbleSort(tabell);
        System.out.println(Arrays.toString(tabell));
    }
    // oppgave 1 sorterer ved å bruke bubble sort
    public static void bytt(int[] tabell, int i, int j){
        int tmp= tabell[i];
        tabell[i]= tabell[j];
        tabell[j]= tmp;
    }

    public static void bubbleSort(int[] tabell){
        for (int i= tabell.length-1; i > 0; i--){
            for (int j=0;j < i; j++){
                if (tabell[j]> tabell[j+1]) bytt (tabell, j, j+1);
            }
        }
    }

}