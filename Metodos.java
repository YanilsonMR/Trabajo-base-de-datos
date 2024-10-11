import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public LinkedList<EstudianteIngenieria> LLenarListaEstudianteING() {

        boolean continuar = true;
        int opt = 0;
        LinkedList<EstudianteIngenieria> Lista = new LinkedList<>();
        String Nombre;
        String Cedula;
        String Apellido;
        String Telefono;
        int Numerosemestre;
        float Promedio;
        String Serial;
        
        while (continuar) {
            System.out.println("=================================================================================");
            System.out.println("========== Hola, aqui ingresaras los datos del estudiante de ingenieria =========");
            System.out.println("Ingrese el nombre del estudiante");
            Nombre = sc.next();
            System.out.println("Ingrese la cedula");
            Cedula = sc.next();
            System.out.println("ingrese el Apellido");
            Apellido = sc.next();
            System.out.println("Ingrese el telefono del estudiante");
            Telefono = sc.next();
            System.out.println("Ingrese el semestre del estudiante");
            Numerosemestre = sc.nextInt();
            System.out.println("Ingrese el promedio acumulado del estudiante");
            Promedio = sc.nextFloat();
            System.out.println("Ingrese el Serial del estudiante");
            Serial = sc.next();
            System.out.println();
            EstudianteIngenieria e = new EstudianteIngenieria(Nombre, Cedula, Apellido, Telefono, Numerosemestre, Promedio, Serial);
            Lista.add(e);
            System.out.println("¿desea agregar mas estudiantes a la lista? 1: SI, 2: NO ");
            opt = sc.nextInt();
            if (opt == 2) {
                continuar = false;
            }
        }
        return Lista;
    }

    public void MostrarlistaING(LinkedList<EstudianteIngenieria> Lista){

        for(EstudianteIngenieria estudianteing : Lista ){

            System.out.println("===============================================");
            System.out.println("Nombre: " + estudianteing.getNombre());
            System.out.println("Apellido: " + estudianteing.getApellido());
            System.out.println("Cedula: " + estudianteing.getCedula());
            System.out.println("Serial " + estudianteing.getSerial());
            System.out.println("Telefono: " + estudianteing.getTelefono());
            System.out.println("Semestre: " + estudianteing.getNumerosemestre());
            System.out.println("Promedio acumulado " + estudianteing.getPromedio());

        }

    }

    public LinkedList<EstudianteDiseño> LLenarListaEstudianteDIS(){

        boolean continuar = true;
        int opt = 0;
        LinkedList<EstudianteDiseño> Lista = new LinkedList<>();
        String Cedula;
        String Nombre;
        String Apellido;
        String Telefono;
        String Modalidadestudio;
        int Cantasignatura;
        int Serial;

            while (continuar) {
            System.out.println("=============================================================================");
            System.out.println("========== Hola, aqui ingresaras los datos del estudiante de Diseño =========");
            System.out.println("Ingrese el nombre del estudiante");
            Nombre = sc.next();
            System.out.println("Ingrese la cedula");
            Cedula = sc.next();
            System.out.println("ingrese el Apellido");
            Apellido = sc.next();
            System.out.println("Ingrese el telefono del estudiante");
            Telefono = sc.next();
            System.out.println("Ingrese la modalidad de estudio del estudiante");
            Modalidadestudio = sc.next();
            System.out.println("¿Cuantas asignaturas esta cursando el estudiante?");
            Cantasignatura = sc.nextInt();
            System.out.println("Ingrese el serial del estudiante");
            Serial = sc.nextInt();
            System.out.println();
            EstudianteDiseño e = new EstudianteDiseño(Cedula, Nombre, Apellido, Telefono, Modalidadestudio, Cantasignatura, Serial);
            Lista.add(e);
            System.out.println("¿desea agregar mas estudiantes a la lista? 1: SI, 2: NO ");
            opt = sc.nextInt();
            if (opt == 2) {
                continuar = false;
            }
        }
        
        return Lista;

    }

    public void MostrarlistaDIS(LinkedList<EstudianteDiseño> Lista){

        for(EstudianteDiseño estudiantedis : Lista){
            System.out.println("========================================");
            System.out.println("Nombre: " + estudiantedis.getNombre());
            System.out.println("Apellido: " + estudiantedis.getApellido());
            System.out.println("Telefono " + estudiantedis.getTelefono());
            System.out.println("Modalidad del estudiante: " + estudiantedis.getModalidadestudio());
            System.out.println("Asignaturas cursando: " + estudiantedis.getCantasignatura());
            System.out.println("Serial: " + estudiantedis.getSerial());
        }

    }

}