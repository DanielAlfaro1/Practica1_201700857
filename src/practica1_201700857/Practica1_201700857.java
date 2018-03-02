package practica1_201700857;

import java.util.Scanner;

public class Practica1_201700857 {
public static String casillas_bajadas;
public static String casillas_subidas;
public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
       menuprincipal();
    }
    public static void menuprincipal(){
        String menu1 [] = {"1. Dificultad del Juego","2. Parámetros del Juego","3. Iniciar Juego","4. Salir"};
//        Scanner entrada = new Scanner(System.in);
        String a;
        System.out.println("*****************************");
        for (String mprin:menu1)
            System.out.println(mprin);
        System.out.println("*****************************");
        System.out.println("Introduzca el número del menú que usted desee acceder");
        a = entrada.next();
        switch (a){
            case "1":
                dificultad();
            case "2":
                
            case "3":
                juego();
            case "4":
                
            default:
                System.out.println("Debe introducir un valor aceptable");
        }
        
    }
    public static void dificultad(){
//        Scanner entrada = new Scanner(System.in);
        String menudif [] = {"1. Fácil","2. Difícil","3. Regresar"};
        int a;
        System.out.println("*****************************");
        do {for (String mdif:menudif)
            System.out.println(mdif);
        System.out.println("*****************************");
        System.out.println("Introduzca un número para elegir la dificultad");
        a = entrada.nextInt();
        switch (a){
            case 1:
                System.out.println("Usted ha elegido la dificultad Fácil.");
                break;
            case 2:
                System.out.println("Usted ha elegido la dificultad Dificil");
                break;
            case 3:
                menuprincipal();
             break;  
        }
        }while(a!=3);
        }
    public static void parametros(){
        String mparametros [] = {"1. Jugadores","2. Subidas y bajadas","3. Regresar"};
        System.out.println("******************************");
        for (String mpara:mparametros)
            System.out.println(mpara);
        System.out.println("******************************");
    
        String b = entrada.next();
    }
    
    
    public static int numerorandom(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1)+(maximo+1)));
    }

    public static void juego(){
        String matriz [] [] = new String [10][10];
       int i=1;
        for(int fila = 0; fila<matriz.length; fila++){
             
            for(int columna = 0; columna<matriz[fila].length; columna++){
                
                    matriz[fila][columna]=""+i;
                    i++;
                    
            }
//             System.out.println("");
        }
        for(int u=9;u>-1;u--){
            for(int j=0;j<matriz[u].length;j++){
                                               
                switch(matriz[0][j]){
                    case "1":
                    
                    System.out.print("\t "+"|_"+matriz[u][j]+"_|"+"\t ");
                    break;
                    case "2":
                    System.out.print("\t "+"|_"+matriz[u][j]+"_|"+"\t ");
                    break;
                    case "3":
                        System.out.print("\t "+"|_"+matriz[u][j]+"_|"+"\t ");
                        break;
                    case "4":
                        System.out.print("\t "+"|_"+matriz[u][j]+"_|"+"\t ");
                        break;
                    case "5":
                        System.out.print("\t "+"|_"+matriz[u][j]+"_|"+"\t ");
                        break;
                    case "6":
                        System.out.print("\t "+"|_"+matriz[u][j]+"_|"+"\t ");
                        break;
                    case "7":
                        System.out.print("\t "+"|_"+matriz[u][j]+"_|"+"\t ");
                        break;
                    case "8":
                        System.out.print("\t "+"|_"+matriz[u][j]+"_|"+"\t ");
                        break;
                    case "9":
                        System.out.print("\t "+"|_"+matriz[u][j]+"_|"+"\t ");
                        break;
                        
                        default:
                System.out.print("\t "+"|_"+matriz[u][j]+"_|"+" ");
                break;
            }
            }
            System.out.println("");
        }
    }
    }
