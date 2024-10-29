import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportaciones {
    public void exportarING(LinkedList<EstudianteIngenieria> lista) {

        LinkedList<EstudianteIngenieria> listaING = new LinkedList<>();

        if (listaING.isEmpty()) {
            Metodos m = new Metodos();
            listaING = m.LLenarListaEstudianteING();
        } else {
            try (FileWriter escriba = new FileWriter("LIstadeING.txt")) {
                for (EstudianteIngenieria estudiante : lista) {
                    escriba.write("Nombre: " + estudiante.getNombre() + "\n");
                    escriba.write("Cedula: " + estudiante.getCedula() + "\n");
                    escriba.write("Apellido: " + estudiante.getApellido() + "\n");
                    escriba.write("Telefono: " + estudiante.getTelefono() + "\n");
                    escriba.write("Semestre: " + estudiante.getNumerosemestre() + "\n");
                    escriba.write("Promedio: " + estudiante.getPromedio() + "\n");
                    escriba.write("Serial: " + estudiante.getSerial() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("LIsta de estudiantes de ingenieria exportado correctamente ...");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void exportarDIS(LinkedList<EstudianteDiseño> lista) {

        LinkedList<EstudianteDiseño> listaDIS = new LinkedList<>();

        if (listaDIS.isEmpty()) {
            Metodos m = new Metodos();
            listaDIS = m.LLenarListaEstudianteDIS();
        } else {
            try (FileWriter escriba = new FileWriter("LIstadeDIS.txt")) {
                for (EstudianteDiseño estudianted : lista) {
                    escriba.write("Nombre: " + estudianted.getNombre() + "\n");
                    escriba.write("Apellido: " + estudianted.getApellido() + "\n");
                    escriba.write("Telefono: " + estudianted.getTelefono() + "\n");
                    escriba.write("Modalidad de estudio: " + estudianted.getModalidadestudio() + "\n");
                    escriba.write("Cantidad de materias: " + estudianted.getCantasignatura() + "\n");
                    escriba.write("Serial: " + estudianted.getSerial() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("LIsta de estudiantes de diseño ha sido exportada correctamente ...");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void exportarPC(LinkedList<ComputadorPortatil> lista) {

        LinkedList<ComputadorPortatil> listaComputador = new LinkedList<>();

        if (listaComputador.isEmpty()) {
            Metodos m = new Metodos();
            System.out.println("las lista de computadores esta vacia");
            System.out.println("porfavor llenar la lista con los computadores disponibles");

            listaComputador = m.LLenarListaComputadores();
        } else {
            try (FileWriter escriba = new FileWriter("ListaPortatiles.txt")) {
                for (ComputadorPortatil computador : lista) {
                    escriba.write("serial: " + computador.getSerial() + "\n");
                    escriba.write("Marca: " + computador.getMarca() + "\n");
                    escriba.write("Tamaño: " + computador.getTamaño() + "\n");
                    escriba.write("Precio: " + computador.getPrecio() + "\n");
                    escriba.write("Sistema operativo: " + computador.getSo() + "\n");
                    escriba.write("Procesador: " + computador.getProcesador() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("LIsta de computadores ha sido exportado correctamente ...");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void exportarTABLETA(LinkedList<TabletaGrafica> lista) {

        LinkedList<TabletaGrafica> listaTABLETA = new LinkedList<>();

        if (listaTABLETA.isEmpty()) {
            Metodos m = new Metodos();
            listaTABLETA = m.LLenarListaTableta();
        } else {
            try (FileWriter escriba = new FileWriter("ListaTabletas.txt")) {
                for (TabletaGrafica tableta : lista) {
                    escriba.write("Serial: " + tableta.getSerial() + "\n");
                    escriba.write("Marca: " + tableta.getMarca() + "\n");
                    escriba.write("Tamaño: " + tableta.getTamaño() + "\n");
                    escriba.write("Precio: " + tableta.getPrecio() + "\n");
                    escriba.write("Almacenamiento: " + tableta.getAlmacenamiento() + "\n");
                    escriba.write("Peso: " + tableta.getPeso() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("Lista de tabletas ha sido exportado correctamente ...");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
