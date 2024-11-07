import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Importaciones {
    public LinkedList<EstudianteIngenieria> ImportarING(){
        String rutaArchivo = "LIstadeING.txt";
        
        LinkedList<EstudianteIngenieria> lista = new LinkedList<>();
        try(BufferedReader b = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            EstudianteIngenieria ei = null;
            while ((linea = b.readLine()) != null) {
                if (linea.startsWith("Nombre:")) {
                    if (ei != null) {
                        lista.add(ei);
                    }
                    ei = new EstudianteIngenieria(linea, linea, linea, rutaArchivo, 0, 0, linea);
                    ei.setNombre(linea.substring(7 + 1));
                } else if (linea.startsWith("Cedula:")){
                    if (ei != null) {
                        ei.setCedula(linea.substring(7 + 1));
                    }
                } else if (linea.startsWith("Apellido:")){
                    if (ei != null) {
                        ei.setApellido(linea.substring(9 + 1));
                    }
                } else if (linea.startsWith("Telefono:")){
                    if (ei != null) {
                        ei.setTelefono(linea.substring(9 + 1));
                    }
                } else if (linea.startsWith("Semestre:")){
                    if (ei != null) {
                        ei.setNumerosemestre(Integer.parseInt(linea.substring(9 + 1)));
                    }
                } else if (linea.startsWith("Promedio:")){
                    if (ei != null) {
                        ei.setPromedio(Float.parseFloat(linea.substring(9 + 1)));
                    }
                } else if (linea.startsWith("Serial:")){
                    if (ei != null) {
                        ei.setSerial(linea.substring(7 + 1));
                        lista.add(ei);
                        ei = null;
                    }
                }
                
            }

            System.out.println("Archivo importado");


        } catch (Exception e) {
            // TODO: handle exception
        }

        return lista;
    }

    public LinkedList<EstudianteDiseño> ImportarDIS(){
        String rutaArchivo = "LIstadeDIS.txt";
        
        LinkedList<EstudianteDiseño> lista = new LinkedList<>();
        try(BufferedReader b = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            EstudianteDiseño ei = null;
            while ((linea = b.readLine()) != null) {
                if (linea.startsWith("Nombre:")) {
                    if (ei != null) {
                        lista.add(ei);
                    }
                    ei = new EstudianteDiseño(linea, linea, linea, rutaArchivo, linea, 0, 0);
                    ei.setNombre(linea.substring(7 + 1));
                } else if (linea.startsWith("Apellido:")){
                    if (ei != null) {
                        ei.setCedula(linea.substring(9 + 1));
                    }
                } else if (linea.startsWith("Telefono:")){
                    if (ei != null) {
                        ei.setApellido(linea.substring(9 + 1));
                    }
                } else if (linea.startsWith("Modalidad de estudio:")){
                    if (ei != null) {
                        ei.setTelefono(linea.substring(21 + 1));
                    }
                } else if (linea.startsWith("Cantidad de materias:")){
                    if (ei != null) {
                        ei.setCantasignatura(Integer.parseInt(linea.substring(21 + 1)));
                    }
                } else if (linea.startsWith("Serial:")){
                    if (ei != null) {
                        ei.setSerial(Integer.parseInt(linea.substring(7 + 1)));
                        lista.add(ei);
                        ei = null;
                    }
                }                
            }

            System.out.println("Archivo importado");


        } catch (Exception e) {
            // TODO: handle exception
        }

        return lista;
    }

    public LinkedList<ComputadorPortatil> ImportarPC(){
        String rutaArchivo = "ListaPortatiles.txt";
        
        LinkedList<ComputadorPortatil> lista = new LinkedList<>();
        try(BufferedReader b = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            ComputadorPortatil ei = null;
            while ((linea = b.readLine()) != null) {
                if (linea.startsWith("Serial:")) {
                    if (ei != null) {
                        lista.add(ei);
                    }
                    ei = new ComputadorPortatil(linea, rutaArchivo, null, 0, rutaArchivo, linea);
                    ei.setSerial(linea.substring(6 + 1));
                } else if (linea.startsWith("Marca:")){
                    if (ei != null) {
                        ei.setMarca(linea.substring(6 + 1));
                    }
                } else if (linea.startsWith("Tamaño:")){
                    if (ei != null) {
                        ei.setTamaño(Float.parseFloat(linea.substring(7 + 1)));
                    }
                } else if (linea.startsWith("Precio:")){
                    if (ei != null) {
                        ei.setPrecio(Float.parseFloat(linea.substring(7+1)));
                    }
                } else if (linea.startsWith("Sistema operativo:")){
                    if (ei != null) {
                        ei.setSo(linea.substring(18 + 1));
                    }
                } else if (linea.startsWith("Procesador:")){
                    if (ei != null) {
                        ei.setProcesador(linea.substring(11 + 1));
                        lista.add(ei);
                        ei = null;
                    }
                }                
            }

            System.out.println("Archivo importado");


        } catch (Exception e) {
            
        }

        return lista;
    }


    public LinkedList<TabletaGrafica> ImportarTABLETA(){
        String rutaArchivo = "ListaTabletas.txt";
        
        LinkedList<TabletaGrafica> lista = new LinkedList<>();
        try(BufferedReader b = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            TabletaGrafica ei = null;
            while ((linea = b.readLine()) != null) {
                if (linea.startsWith("Serial:")) {
                    if (ei != null) {
                        lista.add(ei);
                    }
                    ei = new TabletaGrafica(linea, rutaArchivo, 0, 0, 0, 0);
                    ei.setSerial(linea.substring(6 + 1));
                } else if (linea.startsWith("Marca:")){
                    if (ei != null) {
                        ei.setMarca(linea.substring(6 + 1));
                    }
                } else if (linea.startsWith("Tamaño:")){
                    if (ei != null) {
                        ei.setTamaño(Float.parseFloat(linea.substring(7 + 1)));
                    }
                } else if (linea.startsWith("Precio:")){
                    if (ei != null) {
                        ei.setPrecio(Float.parseFloat(linea.substring(7 + 1)));
                    }
                } else if (linea.startsWith("Almacenamiento:")){
                    if (ei != null) {
                        ei.setAlmacenamiento(Integer.parseInt(linea.substring(15 + 1)));
                    }
                } else if (linea.startsWith("Peso:")){
                    if (ei != null) {
                        ei.setPeso(Float.parseFloat(linea.substring(5 + 1)));
                        lista.add(ei);
                        ei = null;
                    }
                }                
            }

            System.out.println("Archivo importado");


        } catch (Exception e) {
            
        }

        return lista;
    }
}
