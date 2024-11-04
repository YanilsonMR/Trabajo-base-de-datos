import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        LinkedList<ComputadorPortatil> listaComputador = new LinkedList<>();
        LinkedList<EstudianteDiseño> listaDIS = new LinkedList<>();
        LinkedList<EstudianteIngenieria> listaING = new LinkedList<>();
        LinkedList<TabletaGrafica> listatableta = new LinkedList<>();
        Metodos m = new Metodos();
        Exportaciones e = new Exportaciones();
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
                    System.out.println("5. SALIR DEL PROGRAMA");
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
                        case 5:
                            System.out.println("Saliendo del programa ...");
                            bandera = false;

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
                        case 5:
                            System.out.println("Saliendo del programa ...");
                            bandera = false;
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
                            e.exportarING(listaING);
                            break;
                        case 2:
                            e.exportarDIS(listaDIS);
                            break;
                        case 3:
                            e.exportarPC(listaComputador);
                            break;
                        case 4:
                            e.exportarTABLETA(listatableta);
                            break;
                        case 5:
                            e.exportarING(listaING);
                            e.exportarDIS(listaDIS);
                            e.exportarPC(listaComputador);
                            e.exportarTABLETA(listatableta);
                            break;

                        default:
                            System.out.println("Opcion no validad. Intenta de nuevo. ");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("aqui podras importar las diferentes listas");
                    System.out.println("1. IMPORTAR LA LISTA DE ESTUDIANTES DE INGENIERIA");
                    System.out.println("2. IMPORTAR LISTA DE ESTUDIANTES DE DISEÑO");
                    System.out.println("3. IMPORTAR LISTA DE COMPUTADORES");
                    System.out.println("4. IMPORTAR LISTA DE TABLETAS");
                    System.out.println("5. IMPORTAR TODAS LAS LISTAS");
                    System.out.println("6. SALIR DEL PROGRAMA");
                    opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                listaING = m.importarING();
                                break;
                            case 2:
                                listaDIS = m.importarDIS();
                                break;
                            case 3:
                                listaComputador = m.importarPC();
                                break;  
                            case 4:
                                listatableta = m.importarTG();
                                break;
                            case 5:
                                listaING = m.importarING();
                                listaDIS = m.importarDIS();
                                listaComputador = m.importarPC();
                                listatableta = m.importarTG();
                                break;     
                            case 6:
                            System.out.println("Saliendo del programa...");
                            bandera = false;
                                break;               
                            default:
                                System.out.println("Opcion no validad. Intenta de nuevo. ");
                                break;
                        }
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
