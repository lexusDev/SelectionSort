
package selectionsort;

import java.util.Scanner;


public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=6;
        int np;
        int vetor[] = new int[n];
        int menor, eleito, idMenor;
        
        try (Scanner entrada = new Scanner(System.in)){
            for (int i = 0; i < n; i++) {
                System.out.println("Digite o "+ (i+1) +"° número:");
                vetor[i] = entrada.nextInt();
            }
        }
        
        eleito = vetor[0];
        menor = vetor[1];
        idMenor =1;
        
        for (int i = idMenor; i < vetor.length; i++) {
            if(vetor[i] < menor)
                menor = vetor[i];            
        }
        
        if(eleito < menor)
            menor = eleito;
        
        System.out.println("Menor: " + menor);
    }
    
}
