package lab2p2_rigobertobarahona;
import java.util.ArrayList;
public class Empleados {
    
    private String IDE;
    private int status;
    private String nombreE;
    private ArrayList listEmpleados = new ArrayList();
        
    public Empleados(){
    }           
    public Empleados(String IDE, String nombreE, int status) {
        this.IDE = IDE;
        this.nombreE = nombreE;
        this.status = status;
    }

    public String getIDE() {
        return IDE;
    }

    public int getStatus() {
        return status;
    }

    public String getNombreE() {
        return nombreE;
    }

    public ArrayList getlistEmpleadosList() {
        return listEmpleados;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public void setlistEmpleados(ArrayList listEmpleados) {
        this.listEmpleados = listEmpleados;
    }
    public void setlistEmpleados(String nombreE, String IDE, int status){
        this.nombreE = nombreE;
        this.IDE = IDE;
        this.status = status;
    }

    @Override
    public String toString() {
        String temp = "";
        if (status % 2 != 0){
            temp = "Inactivo";
        } else{
            temp = "Activo";
        }
        return "Nombre: " + nombreE + "\n"
        + "ID: " + IDE + "\n"
        + "Status: " + temp;       
    }
    
}
