package lab2p2_rigobertobarahona;
import java.util.ArrayList;
public class Empleados {
    
    public Empleados(){
        private int age;
        private String IDE;
        private int status;
        private String nombreE;
        private ArrayList listEmpleados = new ArrayList();

    public Empleados(String IDE, int status, String nombreE) {
        this.IDE = IDE;
        this.status = status;
        this.nombreE = nombreE;
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
        
        
        
    }
}
