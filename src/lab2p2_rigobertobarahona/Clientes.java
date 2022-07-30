package lab2p2_rigobertobarahona;
import java.util.ArrayList;

public class Clientes {
    
    private String nombreC;
    private String IDC;
    private String edadC;
    private double monto;
    private ArrayList listClientes = new ArrayList();

    public String getNombreC() {
        return nombreC;
    }

    public String getIDC() {
        return IDC;
    }

    public String getEdadC() {
        return edadC;
    }

    public double getMonto() {
        return monto;
        }

    public ArrayList getlistClientes() {
        return listClientes;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setIDC(String IDC) {
        this.IDC = IDC;
    }

    public void setEdadC(String edadC) {
        this.edadC = edadC;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setlistClientes(ArrayList listClientes) {
        this.listClientes = listClientes;
    }
    public void setlistClientes(String nombreC, String IDC, String edadC,double monto){
        this.nombreC = nombreC;
        this.IDC = IDC;
        this.edadC = edadC; 
        this.monto = monto;
    }
        
    public Clientes(){  
    }

    public Clientes(String nombreC, String IDC, String edadC) {
        this.nombreC = nombreC;
        this.IDC = IDC;
        this.edadC = edadC;
    }

    public Clientes(String nombreC, String IDC, double monto, String edadC) {
        this.nombreC = nombreC;
        this.IDC = IDC;
        this.monto = monto;
        this.edadC = edadC;
    }
    public String toString() {
        return "Nombre: " + nombreC + "\n"
        + " ID: " + IDC + "\n"
        + " Monto a pagar: " + monto;
    }
    
    
}
