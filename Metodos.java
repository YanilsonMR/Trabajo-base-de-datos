import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);
    int opt = 0;

    public LinkedList<EstudianteIngenieria> LLenarListaEstudianteING() {

        boolean continuar = true;        
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
            while (opt <= 0 || opt > 2) {
                System.out.println("opcion incorrecta");
                System.out.println("¿desea agregar mas estudiantes a la lista? 1: SI, 2: NO ");
                while (!sc.hasNextInt()) {
                    System.out.println("ingrese una opcion valida");
                }
                opt = sc.nextInt();
            }
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
            while (opt <= 0 || opt > 2) {
                System.out.println("opcion incorrecta");
                System.out.println("¿desea agregar mas estudiantes a la lista? 1: SI, 2: NO ");
                while (!sc.hasNextInt()) {
                    System.out.println("ingrese una opcion valida");
                }
                opt = sc.nextInt();
            }
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

    public LinkedList<TabletaGrafica> LLenarListaTableta(){
        LinkedList<TabletaGrafica> Lista = new LinkedList<>();
        boolean continuar = true;
        String Serial;
        String Marca;
        float Tamaño;
        float Precio;
        int Almacenamiento;
        float Peso;

            while (continuar) {
                System.out.println("==================================");
                System.out.println("=== Llenando lista de tabletas ===");
                System.out.println(" Serial de la tableta");
                Serial = sc.next();
                System.out.println("Marca de la tableta");
                Marca = sc.next();
                System.out.println(" Tamaño de la tablet ");
                Tamaño = sc.nextFloat();
                System.out.println("Dame el precio de la tableta");
                Precio = sc.nextFloat();
                System.out.println("Almacenamiento de la tableta");
                Almacenamiento = sc.nextInt();
                System.out.println(" Cuanto pesa la tableta?");
                Peso = sc.nextFloat();
                System.out.println();
                TabletaGrafica e = new TabletaGrafica(Serial, Marca, Tamaño, Precio, Almacenamiento, Peso);
                Lista.add(e);
                System.out.println(" Quieres agregar mas tabletas a la lista ?");
                opt = sc.nextInt();
                while (opt <= 0 || opt > 2) {
                    System.out.println("opcion incorrecta");
                    System.out.println("¿desea agregar mas computadores a la lista? 1: SI, 2: NO ");
                    while (!sc.hasNextInt()) {
                        System.out.println("ingrese una opcion valida");
                    }
                    opt = sc.nextInt();
                }
                if (opt == 2) {
                    continuar = false;
                }
            }
        return Lista;
    }

    public void MostrarlistaTABLET(LinkedList<TabletaGrafica> Lista){

        for(TabletaGrafica TabletaGrafica : Lista){
            System.out.println("========================================");
            System.out.println("Serial: " + TabletaGrafica.getSerial());
            System.out.println("Marca: " + TabletaGrafica.getMarca());
            System.out.println("Tamaño: " + TabletaGrafica.getTamaño());
            System.out.println("Precio: " + TabletaGrafica.getPrecio());
            System.out.println("Alamacenamiento: " + TabletaGrafica.getAlmacenamiento());
            System.out.println("Peso: " + TabletaGrafica.getPeso());
        }

    }

    public LinkedList<ComputadorPortatil> LLenarListaComputadores(){
        LinkedList<ComputadorPortatil> Lista = new LinkedList<>();
        boolean continuar = true;
        String Serial;
        String Marca;
        Float Tamaño;
        float Precio;
        String So;
        String Procesador;
            while (continuar) {
                System.out.println("======================================");
                System.out.println("=== Llenando lista de computadores === ");
                System.out.println("Dime el serial del computador");
                Serial = sc.next();
                System.out.println(" Dime la marca del computador");
                Marca = sc.next();
                System.out.println("Que tamaño tiene la pantalla del compurador (Recuerda que son pulgadas)");
                Tamaño = sc.nextFloat();
                System.out.println("DIme el precio del computador");
                Precio = sc.nextFloat();
                System.out.println("DImke el sistema operativo del computador");
                So = sc.next();
                System.out.println("DIme el procesador del computador");
                Procesador = sc.next();
                System.out.println();
                ComputadorPortatil e = new ComputadorPortatil(Serial, Marca, Tamaño, Precio, So, Procesador);
                Lista.add(e);
                System.out.println(" Quieres agregar mas computadores a la lista ?");
                opt = sc.nextInt();
                while (opt <= 0 || opt > 2) {
                    System.out.println("opcion incorrecta");
                    System.out.println("¿desea agregar mas computadores a la lista? 1: SI, 2: NO ");
                    while (!sc.hasNextInt()) {
                        System.out.println("ingrese una opcion valida");
                    }
                    opt = sc.nextInt();
                }
                if (opt == 2) {
                    continuar = false;
                }

        }
        return Lista;
    }

    public void MostrarlistaCOMPUTADORES(LinkedList<ComputadorPortatil> Lista){

        for(ComputadorPortatil Computador : Lista){
            System.out.println("====================");
            System.out.println("Serial " + Computador.getSerial());
            System.out.println("Marca " + Computador.getMarca());
            System.out.println("Tamaño " + Computador.getTamaño());
            System.out.println("Precio " + Computador.getPrecio());
            System.out.println("Sistema OPerativo " + Computador.getSo());
            System.out.println("Procesador " + Computador.getProcesador());
        }

    }

}