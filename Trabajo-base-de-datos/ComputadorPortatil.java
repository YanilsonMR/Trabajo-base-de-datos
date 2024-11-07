//import java.util.Scanner;
public class ComputadorPortatil {
    
    String Serial;
    String Marca;
    Float Tamaño;
    float Precio;
    String So;
    String Procesador;
    
    public ComputadorPortatil(String serial, String marca, Float tamaño, float precio, String so, String procesador ) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
        So = so;
        Procesador = procesador;
        
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public Float getTamaño() {
        return Tamaño;
    }
    public void setTamaño(Float tamaño) {
        Tamaño = tamaño;
    }
    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float precio) {
        Precio = precio;
    }
    public String getSo() {
        return So;
    }
    public void setSo(String so) {
        So = so;
    }
    public String getProcesador() {
        return Procesador;
    }
    public void setProcesador(String procesador) {
        Procesador = procesador;
    }
   
}