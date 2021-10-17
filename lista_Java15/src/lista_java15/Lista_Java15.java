/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_java15;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int op = 0; int nPoltrona=0;        
        int resp; 
        String resposta = " "; String disp = " ";  String nomeClasse = " ";
        int[] nAssentos = new int[10];        
        
        do {        
            op=menuPrincipal();        
            if (op == 1){
               classe1(nAssentos, disp, nPoltrona);                
            } else if(op == 2){
               classe2(nAssentos, disp, nPoltrona);
            }  else {
               System.exit(0); 
            }         
            imprimirCartaoEmbarque(op, nPoltrona);   
        
            System.out.print("\nDigite:\n0: finalizar\n1: comprar outra passagem\n> ");
            resp = entrada.nextInt();
            System.out.print("- - \n\n");
        } while (resp!=0);               
    }
            
    public static int menuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        int op;
        System.out.print("Boas vindas a XXXXX! \n\n");        
        System.out.print("Digite:\n1: Primeira Classe\n2: Classe Executiva\n0: Sair\n> ");
        op = entrada.nextInt();
        System.out.print("\n");
        return op;
    }
    
    public static void imprimirCartaoEmbarque(int op, int nPoltrona){        
        System.out.print("\n - - - - - - - - - - - \n");
        System.out.print("\nCartão de embarque\n");
        System.out.print(definirClasse(op) + "\n");  
        System.out.print("Poltrona nº " + nPoltrona + "\n" );
        System.out.print("\n - - - - - - - - - - - \n");
    }
    
    public static void classe1(int nAssentos[], String disp, int nPoltrona){
        Scanner entrada = new Scanner(System.in);              
        for (int i=1; i<6; i++){
            nAssentos[i]=i;
            System.out.print("|" + nAssentos[i] + "|\t" + disp);
        }
        System.out.print("\nEscolha o número da poltrona:\n> ");
        nPoltrona = entrada.nextInt();
        
     /* System.out.print("A Primeira Classe está lotada deseja ficar na Classe Executiva?(S ou N)\n> ");
        resposta = entrada.next();
            if(resposta == "N" || resposta == "n"){
                System.out.println("Aguarde o próximo vôo!!!");
                System.exit(0);
        }*/  
    }
    
    public static void classe2(int nAssentos[], String disp, int nPoltrona){
        Scanner entrada = new Scanner(System.in);        
        for (int i=6; i<10; i++){
           nAssentos[i]=i;
           System.out.print("|" + nAssentos[i] + "|\t" + disp);
        }
        System.out.print("\nEscolha o número da poltrona:\n> ");
        nPoltrona = entrada.nextInt();
        
      /*System.out.print("A Classe Executiva está lotada deseja ficar na Primeira Classe?(S ou N)\n> ");
        resposta = entrada.next();
            if(resposta == "N" || resposta == "n"){
                System.out.println("Aguarde o próximo vôo!!!");
                System.exit(0);
        }*/        
    }
    
    public static String definirClasse(int op) {
        if (op == 1) {
            return "Primeira Classe";
        } else {
            return "Classe Executiva";
        }
    }            
        
}
    

