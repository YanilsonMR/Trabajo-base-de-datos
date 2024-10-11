public class EstudianteIngenieria {
    
    String Nombre;
    String Cedula;
    String Apellido;
    String Telefono;
    int Numerosemestre;
    float Promedio;
    String Serial;
    public EstudianteIngenieria(String nombre, String cedula, String apellido, String telefono, int numerosemestre,
            float promedio, String serial) {
        Nombre = nombre;
        Cedula = cedula;
        Apellido = apellido;
        Telefono = telefono;
        Numerosemestre = numerosemestre;
        Promedio = promedio;
        Serial = serial;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public int getNumerosemestre() {
        return Numerosemestre;
    }
    public void setNumerosemestre(int numerosemestre) {
        Numerosemestre = numerosemestre;
    }
    public float getPromedio() {
        return Promedio;
    }
    public void setPromedio(float promedio) {
        Promedio = promedio;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }

}
