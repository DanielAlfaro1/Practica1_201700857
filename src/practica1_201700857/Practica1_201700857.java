package practica1_201700857;

import java.util.Scanner;

public class Practica1_201700857 {
public static int numeros;
public static int dificultad;
public static int casillas_bajadas[];
public static int casillas_subidas[];
public static int toboganes=0;
public static int escaleras=0;
public static Scanner entrada = new Scanner(System.in);
public static String jugadores[];

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
                break;
            case "2":
                parametros();
                break;
            case "3":
                juego();
            case "4":
                
            case "5":
                prueba_variables();
                break;
            default:
                System.out.println("Debe introducir un valor aceptable");
        }
        
    }
    public static void prueba_variables(){
//        for (int j=0;j<jugadores.length;j++){
//                    System.out.println("El jugador número "+(j+1)+" es "+jugadores[j]);
//                }
        System.out.println("El numero de escaleras es "+casillas_subidas.length);
        System.out.println("El númeor de toboganes es "+casillas_bajadas.length);
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
                dificultad = a;
                break;
            case 2:
                System.out.println("Usted ha elegido la dificultad Dificil");
                dificultad = a;
                break;
            case 3:
                menuprincipal();
             break;  
        }
        }while(a!=3);
        }
    public static void parametros(){
        int b;
        String mparametros [] = {"1. Jugadores","2. Subidas y bajadas","3. Regresar"};
        System.out.println("******************************");
        do{for (String mpara:mparametros)
            System.out.println(mpara);
        System.out.println("******************************");
        System.out.println("Escriba el número de la opción que desee entrar");
        b = entrada.nextInt();
        switch (b){
            case 1:
                System.out.println("Ingrese la cantidad de jugadores de 2 a 3");
                numeros = entrada.nextInt();
                jugadores=new String[numeros];
                System.out.println("Número de jugadores: "+jugadores.length);
                for (int i=0;i<jugadores.length;i++){
                    System.out.println("Ingrese el símbolo que identificará al jugador "+(i+1));
                jugadores[i]=entrada.next();
                }
                for (int j=0;j<jugadores.length;j++){
                    System.out.println("El jugador número "+(j+1)+" es "+jugadores[j]);
                }
                break;
            case 2:
                if (dificultad==1){
                    System.out.println("Escaleras");
                    do{
                    System.out.println("Ingrese una cantidad entre 5 a 10");
                    escaleras = entrada.nextInt();
                    }while((escaleras>10)||(escaleras<5));
                    System.out.println("El númeor de escaleras será "+escaleras);
                    System.out.println("Toboganes");
                    do{
                    System.out.println("Ingrese una cantidad entre 5 a 10");
                    toboganes = entrada.nextInt();
                    }while((toboganes>10)||(toboganes<5));
                    casillas_subidas= new int[escaleras];
                    casillas_bajadas= new int[toboganes];
                }else if(dificultad==2){
                    System.out.println("Escaleras");
                    do{
                    System.out.println("Ingrese una cantidad entre 20 a 40");
                    escaleras = entrada.nextInt();
                    }while((escaleras>40)||(escaleras<20));
                    System.out.println("El númeor de escaleras será "+escaleras);
                    System.out.println("Toboganes");
                    do{
                    System.out.println("Ingrese una cantidad entre 20 a 40");
                    toboganes = entrada.nextInt();
                    }while((toboganes>40)||(toboganes<20));
                    casillas_subidas= new int[escaleras];
                    casillas_bajadas= new int[toboganes];
                }
               
                break;
            case 3:
                menuprincipal();
                break;
                }
        }while (b!=3);
        
    }
    
    
    
    public static int numerorandom(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1)+(maximo+1)));
    }
    public static int dado(int minimo, int maximo){
        return(int)Math.floor(Math.random()*(minimo-(maximo+1)+(maximo+1)));
    }

    public static void juego(){
        String matriz [] [] = new String [10][10];
       int i=1;
    for (String[] matriz1 : matriz) {
        for (int columna = 0; columna < matriz1.length; columna++) {
            matriz1[columna] = ""+i;
            i++;
        }
    }
    int z=0;
    casillas_bajadas[z]=(int)(Math.random()*99);
    for(z=1;z<casillas_bajadas.length;z++){
        casillas_bajadas[z]=(int)(Math.random()*99);
        casillas_subidas[z]=(int)(Math.random()*99);
        for(int k=0;k<z;k++){
            if(casillas_bajadas[z]==(casillas_bajadas[k]-1)||casillas_bajadas[k]==(casillas_subidas[k]-1)||casillas_bajadas[k]==(casillas_bajadas[z]-1)||casillas_bajadas[k]==(casillas_subidas[z]-1)||casillas_subidas[k]==(casillas_bajadas[z]-1)||casillas_bajadas[z]==(casillas_subidas[z]-1)||casillas_bajadas[z]==casillas_bajadas[k]||casillas_bajadas[z]==casillas_subidas[z]||casillas_subidas[z]==casillas_bajadas[k]||casillas_subidas[z]==casillas_subidas[k]||casillas_subidas[k]==casillas_bajadas[k]){
                z--;
            }
        }
    }
//    int o=0;
//    casillas_subidas[o]=(int)(Math.random()*99);
//    for(o=1;o<casillas_subidas.length;o++){
//        casillas_subidas[o]=(int)(Math.random()*99);
//        for(int p=0;p<o;p++){
//            if(casillas_subidas[o]==casillas_subidas[p])
//        }
//    }
    
    for(int g=0;g<casillas_bajadas.length;g++){
        System.out.print((g+1)+".- "+casillas_bajadas[g]+"\n");
    }
    
    int row,tower,test;
    for(row=0;row<matriz.length;row++){
        for(tower=0;tower<matriz[row].length;tower++){
            for(test=0;test<casillas_bajadas.length;test++){
                if (matriz[row][tower].equals(""+casillas_bajadas[test])){
                    matriz[row][tower]=matriz[row][tower]+"-";
                }
                if (matriz[row][tower].equals(""+casillas_subidas[test])){
                    matriz[row][tower]=matriz[row][tower]+"+";
                }
            }
        }
    }
    
        for(int u=9;u>-1;u--){
            switch (u%2){
                case 0:
            for (String item : matriz[u]) {
                System.out.print("\t"+"|" + item + "|" + "\t");
            }
                    System.out.println("");
                    break;
                default:
                    for(int j=(matriz[u].length-1);j>=0;j--){
                        System.out.print("\t"+"|"+matriz[u][j]+"|"+"\t");
                    }
                    System.out.println("");
                    break;
            }
            }
            
        }
    }
    
