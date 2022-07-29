package lab2p2_rigobertobarahona;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_RigobertoBarahona {

    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean flag1 = false;
        System.out.println("1) Iniciar Sesion como Administrador");
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
        
        ArrayList listClientes = new ArrayList();
        ArrayList listEmpleados = new ArrayList();
        ArrayList listCarros = new ArrayList();
        
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
                        System.out.println("1) Crear");
                        System.out.println("2) Modificar");
                        System.out.println("3) Eliminar");
                        System.out.println("4) Listar Clientes en Sistema");
                        System.out.println("5) Listar Carros por Clientes");
                        System.out.println("6) Salir");
                        System.out.print("Ingresar opcion: ");
                        int opcion2 = lea.nextInt();
                        switch (opcion2){
                            case 1: {
                                lea.nextLine();
                                System.out.print("Nombre de Cliente: ");
                                String nombreC = lea.nextLine();
                                lea.nextLine();
                                System.out.print("ID de Cliente: ");
                                String IDC = lea.nextLine();
                                System.out.print("Edad de Cliente: ");
                                String edadC = lea.next();
                                if (listCarros.size() == 0){
                                    System.out.println(":D");
                                    listClientes.add(new Clientes(IDC, edadC, nombreC));
                                }
                                else{
                                    System.out.println(": )");
                                    System.out.print("Monto a pagar: ");
                                    double monto = lea.nextDouble();
                                    listClientes.add(new Clientes(IDC,edadC,nombreC,monto));
                                }
                                break;
                            }
                            case 2: {
                                
                            }
                            case 3: {
                                
                            }
                            case 4: {
                                System.out.println(listClientes);
                                break;
                            }
                            case 5: {
                                
                            }
                            case 6: {
                               flag2 = false;
                               break;
                            }
                            default: {
                                
                            }
                        }
                    }
                break;    
                }
                case 2: {
                    boolean flag2 = true;
                    while (flag2 == true){
                        System.out.println("1) Crear");
                        System.out.println("2) Modificar");
                        System.out.println("3) Eliminar");
                        System.out.println("4) Listar");
                        System.out.println("5) Estatus");
                        System.out.println("6) Salir");
                        System.out.print("Seleccionar opcion: ");
                        int opcion2 = lea.nextInt();
                        switch(opcion2){
                            case 1: {
                                lea.nextLine();
                                System.out.print("Nombre de Empleado: ");
                                String nombreE = lea.nextLine();
                                System.out.print("ID de Empleado: ");
                                String IDE = lea.nextLine();
                                int status = 1;
                                
                            }
                        }
                    }
                break;    
                }
                case 3:{
                    boolean flag2 = true;
                    while (flag2 == true){
                        System.out.println("1) Crear");
                        System.out.println("2) Modificar Estado");
                        System.out.println("3) Listar");
                        System.out.println("4) Salir");
                        System.out.print("Ingresar opcion: ");
                        int opcion2 = lea.nextInt();
                        switch(opcion2){
                            case 1: {
                                System.out.print("Marca: ");
                                String marca = lea.next();
                                System.out.print("Modelo: ");
                                String modelo = lea.next();
                                listCarros.add(new Carros(marca,modelo));
                                System.out.println(listCarros);
                                break;
                            }
                            case 2: {
                                System.out.println("");
                                break;
                            }
                            case 3: {
                                
                                break;
                            }
                            case 4:{
                                flag2 = false;
                                break;
                            }
                            default: {
                                flag2 = false;
                                break;
                            }
                        }
                    }
                break;    
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
