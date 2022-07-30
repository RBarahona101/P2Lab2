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
            boolean flag2 = false;
            while (flag2 == false){
                System.out.print("Username: ");
                String username = lea.next();
                System.out.print("Password: ");
                String pass = lea.next();
                if (username.equals("admin") && pass.equals("admin1234")){
                    flag1 = true;
                    flag2 = true;
                }
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
                                System.out.print("ID de Cliente: ");
                                String IDC = lea.nextLine();
                                System.out.print("Edad de Cliente: ");
                                String edadC = lea.next();
                                double monto = 0;
                                if (listCarros.size() == 0){
                                    listClientes.add(new Clientes(nombreC,IDC,monto,edadC));
                                }
                                else{
                                    System.out.print("Monto a pagar: ");
                                    monto = lea.nextDouble();
                                    listClientes.add(new Clientes(nombreC,IDC,monto,edadC));
                                }
                                break;
                            }
                            case 2: {
                                lea.nextLine();
                                if (listClientes.size()> 0){
                                    System.out.print("Indice de cliente a modificar");
                                    int indice = lea.nextInt();
                                    if (listClientes.get(indice) instanceof Clientes){
                                        System.out.print("Nombre: ");
                                        String nombreC = lea.nextLine();
                                        System.out.print("ID: ");
                                        String IDC = lea.nextLine();
                                        System.out.print("Edad: ");
                                        String edadC = lea.nextLine();
                                        System.out.print("Monto a Pagar: ");
                                        double monto = lea.nextDouble();
                                        ( (Clientes)listClientes.get(indice) ).setlistClientes(nombreC,IDC,edadC,monto);
                                        System.out.println("Modificacion Exitosa");
                                    }else{
                                        System.out.println("Valores Requiridos Invalidos");
                                    }
                                }
                                break;
                            }
                            case 3: {
                                if (listClientes.size()> 0){
                                    System.out.println("Indice de cliente a eliminar");
                                    int indice = lea.nextInt();
                                    listClientes.remove(indice);
                                    System.out.println("Eliminacion Completa");
                                }
                                break;
                            }
                            case 4: {
                                String list = "";
                                for (Object temp : listClientes){
                                    if (temp instanceof Clientes){
                                        list += "" + temp;
                                    } 
                                }
                                System.out.println(list);
                                break;
                            }
                            case 5: {
                                String list = "";
                                for (Object temp : listClientes){
                                    if (temp instanceof Clientes){
                                        list += "" + listClientes.indexOf(temp) + " " + temp + "\n";
                                    }
                                }
                                System.out.println(list);
                                list = "";
                                for (Object temp : listCarros){
                                    if (temp instanceof Carros){
                                        list += "" + listCarros.indexOf(temp) + " " + temp + "\n";
                                    }
                                }
                                
                            }
                            case 6: {
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
                                listEmpleados.add(new Empleados(nombreE,IDE,status));
                                break;
                            }
                            case 2: {
                                if (listEmpleados.size() > 0){
                                    System.out.print("Indice a modificar: ");
                                    int indice = lea.nextInt();
                                    if (listEmpleados.get(indice) instanceof Empleados){
                                        lea.nextLine();
                                        System.out.print("Nombre de Empleado: ");
                                        String nombreE = lea.nextLine();
                                        System.out.print("ID de Empleado: ");
                                        String IDE = lea.nextLine();
                                        int status = 1;
                                        ( (Empleados)listEmpleados.get(indice) ).setlistEmpleados(nombreE,IDE,status);
                                        System.out.println("Modificacion Excitosa");
                                    }else{
                                        System.out.println("Prerequisitos no cumplidos");
                                    }
                                }
                                break;
                            }
                            case 3: {
                               if (listEmpleados.size() > 0){
                                   System.out.print("Indice a eliminar: ");
                                   int indice = lea.nextInt();
                                   listEmpleados.remove(indice);
                                   System.out.println("Eliminacion Exitosa");
                               }else{
                                   System.out.println("Prerequisitos no cumplidos");
                               }
                               break;
                            }
                            case 4: {
                                String list = "";
                                for (Object temp: listEmpleados){
                                    if (temp instanceof Empleados){
                                        list += "" + temp;
                                    }
                                }
                                System.out.println(list);
                                break;
                            }
                            case 5: {
                                if (listEmpleados.size() > 0){
                                    System.out.print("Estatus a modificar: ");
                                    int indice = lea.nextInt();
                                    if (listEmpleados.get(indice) instanceof Empleados){
                                        int status = ( (Empleados)listEmpleados.get(indice) ).getStatus();
                                        if (status % 2 != 0){
                                            System.out.println("El empleado esta inactivo. Desea cambiar [S/N]: ");
                                            char response = lea.next().charAt(0);
                                            if (response == 'S' || response == 's'){
                                                status++;
                                                ( (Empleados)listEmpleados.get(indice) ).setStatus(status);
                                            }
                                        }else{
                                            System.out.println("El empleado esta activo. Desea cambiar[S/N]: ");
                                            char response = lea.next().charAt(0);
                                            if (response == 'S' || response == 's'){
                                                status++;
                                                ( (Empleados)listEmpleados.get(indice) ).setStatus(status);
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            case 6: {
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
                                lea.nextLine();
                                System.out.print("Marca: ");
                                String marca = lea.nextLine();
                                System.out.print("Modelo: ");
                                String modelo = lea.nextLine();
                                int status = 0;
                                listCarros.add(new Carros(marca,modelo,status));
                                System.out.println(listCarros);
                                break;
                            }
                            case 2: {
                                if (listCarros.size() > 0){
                                    System.out.print("Indice a modificar: ");
                                    int indice = lea.nextInt();
                                    if (listCarros.get(indice) instanceof Carros){
                                        int status = ( (Carros)listCarros.get(indice) ).getStatus() + 1;
                                        ( (Carros)listCarros.get(indice) ).setStatus(status);
                                    }else{
                                        System.out.println("Prerequisitos invalidos");
                                    }
                                }
                                break;
                            }
                            case 3: {
                                String list = "";
                                for (Object temp: listCarros){
                                    if (temp instanceof Carros){
                                        list += "" + temp;
                                    }
                                }
                                System.out.println(list);
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
