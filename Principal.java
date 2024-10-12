import java.util.LinkedList;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    LinkedList<ComputadorPortatil> listaComputador = new LinkedList<>();
    LinkedList<TabletaGrafica> listaTableta = new LinkedList<>();
    LinkedList<EstudianteDiseño> listaDIS = new LinkedList<>();
    LinkedList<EstudianteIngenieria> listaING = new LinkedList<>();
    Metodos m = new Metodos();
    boolean bandera = true;
    int opt;
    Scanner sc = new Scanner(System.in);
        while (bandera) {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. INGRESAR ESTUDIANTES DE INGENIERÍA A LA LISTA");
            System.out.println("2. VER LISTA DE ESTUDIANTES DE INGENIERIA");
            System.out.println("3. INGRESAR ESTUDIANTES DE DISEÑO A LA LISTA");
            System.out.println("4. VER LISTA DE ESTUDIANTES DE DISEÑO");
            System.out.println("5. INGRESAR NUEVOS COMPUTADORES");
            System.out.println("5. VER LSITA DE COMPUTADORES");
            System.out.println("7. INGRESAR NUEVAS TABLETAS");
            System.out.println("8. VER LISTA DE TABLETAS");
            System.out.println("9. SALIR");
            System.out.print("Seleccione una opción: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    listaING = m.LLenarListaEstudianteING();                    
                    break;
                case 2:
                    m.MostrarlistaING(listaING);
                    break;
                case 3:
                    listaDIS = m.LLenarListaEstudianteDIS();
                    break;
                case 4:
                    m.MostrarlistaDIS(listaDIS);
                    break;
                case 5:
                    listaComputador = m.LLenarListaComputadores();              
                    break;
                case 6:
                    m.MostrarlistaCOMPUTADORES(listaComputador);
                    break;
                case 7:
                    listaTableta = m.LLenarListaTableta();
                    break;
                case 8:
                    m.LLenarListaTableta();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
                   
    }

}