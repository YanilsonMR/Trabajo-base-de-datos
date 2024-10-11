public class EstudianteDiseño {
    
    String Cedula;
    String Nombre;
    String Apellido;
    String Telefono;
    String Modalidadestudio;
    int Cantasignatura;
    int Serial;
    public EstudianteDiseño(String cedula, String nombre, String apellido, String telefono, String modalidadestudio,
            int cantasignatura, int serial) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Modalidadestudio = modalidadestudio;
        Cantasignatura = cantasignatura;
        Serial = serial;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
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
    public String getModalidadestudio() {
        return Modalidadestudio;
    }
    public void setModalidadestudio(String modalidadestudio) {
        Modalidadestudio = modalidadestudio;
    }
    public int getCantasignatura() {
        return Cantasignatura;
    }
    public void setCantasignatura(int cantasignatura) {
        Cantasignatura = cantasignatura;
    }
    public int getSerial() {
        return Serial;
    }
    public void setSerial(int serial) {
        Serial = serial;
    }

}
