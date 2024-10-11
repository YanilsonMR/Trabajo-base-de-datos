import java.util.LinkedList;
import java.util.Scanner;
public class Principal {
    public LinkedList<ComputadorPortatil> vectorComputador = new LinkedList<>();
    public LinkedList<TabletaGrafica> vectorTableta = new LinkedList<>();
    public LinkedList<EstudianteDiseño> vectorDIS = new LinkedList<>();
    public LinkedList<EstudianteIngenieria> vectorING = new LinkedList<>();
    public static void main(String[] args) {
        int opt;
        Scanner sc = new Scanner(System.in);
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. INGRESAR ESTUDIANTES DE INGENIERÍA A LA LISTA");
            System.out.println("2. VER LISTA DE ESTUDIANTES DE INGENIERIA");
            System.out.println("3. INGRESAR ESTUDIANTES DE DISEÑO A LA LISTA");
            System.out.println("4. VER LISTA DE ESTUDIANTES DE DISEÑO");
            System.out.println("5. INGRESAR NUEVOS COMPUTADORES");
            System.out.println("5. VER LSITA DE COMPUTADORES");
            System.out.println("7. INGRESAR NUEVAS TABLETAS");
            System.out.println("8. VER LISTA DE TABLETAS");
            System.out.println("5. SALIR");
            System.out.print("Seleccione una opción: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    LLenarListaEstudianteING();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        
    }
    public static void LLenarListaEstudianteING() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'LLenarListaEstudianteING'");
    }

}