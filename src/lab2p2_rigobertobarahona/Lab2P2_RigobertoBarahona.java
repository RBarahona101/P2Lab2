package lab2p2_rigobertobarahona;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_RigobertoBarahona {

    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean flag1 = false;
        System.out.println("1) Iniciar Sesion como Administrador");
        System.out.println("2) Void");
        System.out.print("Eliga su opcion: ");
        int opcion = lea.nextInt();
        if (opcion == 1){
            System.out.print("Username: ");
            String username = lea.next();
            System.out.print("Password: ");
            String pass = lea.next();
            if (username.equals("admin") && pass.equals("admin1234")){
                flag1 = true;
            }
        } else{
            System.out.println(":)");
        }
        while (flag1 == true){
            System.out.println("1) Clientes");
            System.out.println("2) Empleados");
            System.out.println("3) Carros");
            System.out.println("4) Salir");
            System.out.print("Eligir opcion: ");
            opcion = lea.nextInt();
            switch(opcion){
                case 1: {
                    boolean flag2 = true;
                    while (flag2 == true){
                        
                    }
                }
                case 2: {
                    
                }
                case 3:{
                    
                }
                case 4: {
                    flag1 = false;
                    break;
                }
                default: {
                    flag1 = false;
                    break;
                }
            }
        }
        
    }
    
}
