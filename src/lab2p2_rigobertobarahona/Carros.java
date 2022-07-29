package lab2p2_rigobertobarahona;
import java.util.ArrayList;

public class Carros {
    private String marca;
    private String modelo;
    private int status;
    private ArrayList listCarros = new ArrayList();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getStatus() {
        return status;
    }
    
    public ArrayList<String> getlistCarros() {
        return listCarros;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setStatus(int status) {
        this.status = status;
    }
        
    
    public void setlistCarros(ArrayList listCarros) {
        this.listCarros = listCarros;
    }
    
    public Carros(){    
    }

    public Carros(String marca, String modelo, int Status) {
        this.marca = marca;
        this.modelo = modelo;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n"
        + "Modelo: " + modelo;        
    }
    
}
