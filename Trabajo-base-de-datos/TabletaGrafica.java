public class TabletaGrafica {
    
    String Serial;
    String Marca;
    float Tamaño;
    float Precio;
    int Almacenamiento;
    float Peso;
    public TabletaGrafica(String serial, String marca, float tamaño, float precio, int aLmacenamiento, float peso) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
        Almacenamiento = aLmacenamiento;
        Peso = peso;
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
    public float getTamaño() {
        return Tamaño;
    }
    public void setTamaño(float tamaño) {
        Tamaño = tamaño;
    }
    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float precio) {
        Precio = precio;
    }
    public int getAlmacenamiento() {
        return Almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento) {
        Almacenamiento = almacenamiento;
    }
    public float getPeso() {
        return Peso;
    }
    public void setPeso(float peso) {
        Peso = peso;
    }

}
