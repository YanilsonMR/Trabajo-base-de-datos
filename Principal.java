import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        LinkedList<ComputadorPortatil> listaComputador = new LinkedList<>();
        LinkedList<EstudianteDiseño> listaDIS = new LinkedList<>();
        LinkedList<EstudianteIngenieria> listaING = new LinkedList<>();
        LinkedList<TabletaGrafica> listatableta = new LinkedList<>();
        Metodos m = new Metodos();
        boolean bandera = true;
        int opt;
        Scanner sc = new Scanner(System.in);
        while (bandera) {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1.  LLENAR LAS LISTAS");
            System.out.println("2.  VER LAS LISTAS");
            System.out.println("3.  EXPORTAR LAS LISTAS");
            System.out.println("4.  IMPORTAR LAS LISTAS");
            System.out.print("Seleccione una opción: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("AQUI PUEDES LLENAR DIFERENTES LISTAS DE: ");
                    System.out.println("1. LLENAR LISTA DE ESTUDIANTES DE INGENIERIA");
                    System.out.println("2. LLENAR LISTA DE ESTUDIANTES DE DISEÑO");
                    System.out.println("3. LLENAR LSITA DE COMPUTADORES");
                    System.out.println("4. LLENAR LISTA DE TABLETAS");
                    System.out.println("");
                    opt = sc.nextInt();
                    switch (opt) {
                        case 1:
                            listaING = m.LLenarListaEstudianteING();
                            break;
                        case 2:
                            listaDIS = m.LLenarListaEstudianteDIS();
                            break;
                        case 3:
                            listaComputador = m.LLenarListaComputadores();
                            break;
                        case 4:
                            listatableta = m.LLenarListaTableta();
                            break;

                        default:
                            System.out.println("Opción no válida, intente de nuevo.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("AQUI PUEDES VER DIFERENTES LISTAS: ");
                    System.out.println("1. VER LISTA DE ESTUDIANTES DE INGENIERIA");
                    System.out.println("2. VER LISTA DE ESTUDIANTES DE DISEÑO");
                    System.out.println("3. VER LSITA DE COMPUTADORES");
                    System.out.println("4. VER LISTA DE TABLETAS");
                    System.out.println("5. SALIR DEL PROGRAMA");
                    System.out.println("");
                    opt = sc.nextInt();
                    switch (opt) {
                        case 1:
                            m.MostrarlistaING(listaING);
                            break;
                        case 2:
                            m.MostrarlistaDIS(listaDIS);
                            break;
                        case 3:
                            m.MostrarlistaCOMPUTADORES(listaComputador);
                            break;
                        case 4:
                            m.MostrarlistaTABLET(listatableta);
                            break;

                        default:
                            System.out.println("Opción no válida, intente de nuevo.");
                            break;
                    }

                    break;
                case 3:
                    System.out.println("aqui podras exportar las diferentes listas");
                    System.out.println("1. EXPORTAR LA LISTA DE ESTUDIANTES DE INGENIERIA");
                    System.out.println("2. EXPORTAR LISTA DE ESTUDIANTES DE DISEÑO");
                    System.out.println("3. EXPORTAR LISTA DE COMPUTADORES");
                    System.out.println("4. EXPORTAR LISTA DE TABLETAS");
                    System.out.println("5. EXPORTAR TODAS LAS LISTAS");
                    opt = sc.nextInt();
                    switch (opt) {
                        case 1:
                            m.exportarING(listaING);
                            break;
                        case 2:
                            m.exportarDIS(listaDIS);
                            break;
                        case 3:
                            m.exportarPC(listaComputador);
                            break;
                        case 4:
                            m.exportarTABLETA(listatableta);
                            break;
                        case 5:
                            m.exportarING(listaING);
                            m.exportarDIS(listaDIS);
                            m.exportarPC(listaComputador);
                            m.exportarTABLETA(listatableta);
                        break;

                        default:
                            System.out.println("Opcion no validad. Intenta de nuevo. ");
                            break;
                    }
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    bandera = false;
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
        sc.close();
    }

}