
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
            while (!sc.hasNext()) {
                System.out.println("Los nombre no deben de tener numero o caracteres especiales");
                sc.nextLine();
            }
            Nombre = sc.next();

            System.out.println("Ingrese la cedula");
            Cedula = sc.next();
            System.out.println("ingrese el Apellido");
            while (!sc.hasNext()) {
                System.out.println("Los apellidos no deben de tener numeros o caracteres especiales");
                sc.nextLine();
            }
            Apellido = sc.next();
            System.out.println("Ingrese el telefono del estudiante");
            while (!sc.hasNextInt()) {
                System.out.println("el semestre debe de ser un numero entero");
                sc.nextLine();
            }
            Telefono = sc.next();
            System.out.println("Ingrese el semestre del estudiante");
            while (!sc.hasNextInt()) {
                System.out.println("el semestre debe de ser un numero entero");
                sc.nextLine();
            }
            Numerosemestre = sc.nextInt();

            System.out.println("Ingrese el promedio acumulado del estudiante");
            while (!sc.hasNextFloat()) {
                System.out.println("El promedio debe de ser un float y usar ¨,¨ ");
                sc.hasNextLine();
            }
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

    public void MostrarlistaING(LinkedList<EstudianteIngenieria> Lista) {

        for (EstudianteIngenieria estudianteing : Lista) {

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

    public LinkedList<EstudianteDiseño> LLenarListaEstudianteDIS() {

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
            Metodos a = new Metodos();
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
            String palabra = Modalidad(opt);
            Modalidadestudio = sc.next();

            System.out.println("¿Cuantas asignaturas esta cursando el estudiante?");
            while (!sc.hasNextInt()) {
                System.out.println("la cantidad de asignatuas debe de ser un numero entero");
                sc.nextLine();
            }
            Cantasignatura = sc.nextInt();

            System.out.println("Ingrese el serial del estudiante");
            while (!sc.hasNextInt()) {
                System.out.println("el serial debe de ser un numero entero");
                sc.nextLine();
            }
            Serial = sc.nextInt();

            System.out.println();
            EstudianteDiseño e = new EstudianteDiseño(Cedula, Nombre, Apellido, Telefono, Modalidadestudio,
                    Cantasignatura, Serial);
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

    public void MostrarlistaDIS(LinkedList<EstudianteDiseño> Lista) {

        for (EstudianteDiseño estudiantedis : Lista) {
            System.out.println("========================================");
            System.out.println("Nombre: " + estudiantedis.getNombre());
            System.out.println("Apellido: " + estudiantedis.getApellido());
            System.out.println("Telefono: " + estudiantedis.getTelefono());
            System.out.println("Modalidad del estudiante: " + estudiantedis.getModalidadestudio());
            System.out.println("Asignaturas cursando: " + estudiantedis.getCantasignatura());
            System.out.println("Serial: " + estudiantedis.getSerial());
        }

    }

    public LinkedList<TabletaGrafica> LLenarListaTableta() {
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
            System.out.println("Serial de la tableta");
            Serial = sc.next();
            System.out.println("Marca de la tableta");
            Marca = sc.next();
            System.out.println("Tamaño de la tablet ");
            while (!sc.hasNextFloat()) {
                System.out.println("el tamaño debe de ser un numero flotante");
                sc.nextLine();
            }
            Tamaño = sc.nextFloat();
            System.out.println("Dame el precio de la tableta");
            while (!sc.hasNextFloat()) {
                System.out.println("el precio debe de ser un numero");
                sc.nextLine();
            }
            Precio = sc.nextFloat();
            System.out.println("Almacenamiento de la tableta");
            while (!sc.hasNextInt()) {
                System.out.println("el almacenamiento debe de ser un numero entero");
                sc.nextLine();
            }
            Almacenamiento = sc.nextInt();
            System.out.println("Cuanto pesa la tableta?");
            while (!sc.hasNextFloat()) {
                System.out.println("el peso debe de ser un numero float");
                sc.nextLine();
            }
            Peso = sc.nextFloat();
            System.out.println();
            TabletaGrafica e = new TabletaGrafica(Serial, Marca, Tamaño, Precio, Almacenamiento, Peso);
            Lista.add(e);
            System.out.println(" Quieres agregar mas tabletas a la lista ? 1: SI, 2:NO ");
            opt = sc.nextInt();
            while (opt <= 0 || opt > 2) {
                System.out.println("opcion incorrecta");
                System.out.println("¿desea agregar mas tabletas a la lista? 1: SI, 2: NO ");
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

    public void MostrarlistaTABLET(LinkedList<TabletaGrafica> Lista) {

        for (TabletaGrafica TabletaGrafica : Lista) {
            System.out.println("========================================");
            System.out.println("Serial: " + TabletaGrafica.getSerial());
            System.out.println("Marca: " + TabletaGrafica.getMarca());
            System.out.println("Tamaño: " + TabletaGrafica.getTamaño() + "pulgadas");
            System.out.println("Precio: " + TabletaGrafica.getPrecio() + "$");
            System.out.println("Alamacenamiento: " + TabletaGrafica.getAlmacenamiento() + "gb");
            System.out.println("Peso: " + TabletaGrafica.getPeso() + "Kg");
        }

    }

    public LinkedList<ComputadorPortatil> LLenarListaComputadores() {
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
            System.out.println(" Quieres agregar mas computadores a la lista ? 1: SI, 2: NO ");
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

    public void MostrarlistaCOMPUTADORES(LinkedList<ComputadorPortatil> Lista) {

        for (ComputadorPortatil Computador : Lista) {
            System.out.println("====================");
            System.out.println("Serial " + Computador.getSerial());
            System.out.println("Marca " + Computador.getMarca());
            System.out.println("Tamaño " + Computador.getTamaño() + "pulgadas");
            System.out.println("Precio " + Computador.getPrecio() + "$");
            System.out.println("Sistema OPerativo " + Computador.getSo());
            System.out.println("Procesador " + Computador.getProcesador());
        }
    }

    public String Modalidad(int numero) {
        {
            String palabra;
            System.out.print("Selecciona la modalidad del estudiante");
            System.out.println("1.PRESENCIAL");
            System.out.println("2.VIRTUAL");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    palabra = "Presencial";
                    break;
                case 2:
                    palabra = "Virtual";
                    break;
                default:
                    palabra = "Número no definido";
                    break;
            }
            return palabra;
        }
    }


    // INVOCANDO IMPORTACIONES
    Importaciones i = new Importaciones();

    public LinkedList<EstudianteIngenieria> importarING() {
        LinkedList<EstudianteIngenieria> lista;
        lista = i.ImportarING();
        return lista;
    }

    public LinkedList<EstudianteDiseño> importarDIS(){
        LinkedList<EstudianteDiseño> lista;
        lista = i.ImportarDIS();
        return lista;
    }

    public LinkedList<ComputadorPortatil> importarPC(){
        LinkedList<ComputadorPortatil> lista;
        lista = i.ImportarPC();
        return lista;
    }

    public LinkedList<TabletaGrafica> importarTG(){
        LinkedList<TabletaGrafica> lista;
        lista = i.ImportarTABLETA();
        return lista;
    }

}
