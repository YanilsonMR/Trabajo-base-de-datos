import java.util.LinkedList;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos a = new Metodos();
        int opt = 0;
        System.out.println("============================================================================================");
        System.out.println("== Hola estas aqui para agregar nuevos estudiantes a las listas de ingenieria o de diseño ==");
        System.out.println("== Para ir con los estudiantes de ingenieria oprime 1 ==");
        System.out.println("== Para ir con los estudiantes de diseño oprime 2 ======");
        opt = sc.nextInt();
        if (opt == 1) {
            LinkedList<EstudianteIngenieria> Lista = new LinkedList<>();
            System.out.println("¿Quieres ingresar y mirar la lista de los estudiantes de ingenieria?");
            System.out.println("Ingresa a la lista escribiendo: 1");
            opt = sc.nextInt();
            
                if (opt == 1) {

                    Lista = a.LLenarListaEstudianteING();
                                      
                }
                System.out.println("¿quieres ver la lista de los estudiantes de ingenieria?");
                System.out.println("SI: 1 NO: 2");
                opt = sc.nextInt();
                if (opt == 1) {

                    a.MostrarlistaING(Lista);
                       
                }                          
        }
        
        if (opt == 2) {

            LinkedList<EstudianteDiseño> Lista = new LinkedList<>();
            Lista = a.LLenarListaEstudianteDIS();
            System.out.println("¿quieres ver la lista de los estudiante?");
            System.out.println("SI: 1 NO: 2");
            opt = sc.nextInt();
                if (opt == 1) {
                    a.MostrarlistaDIS(Lista);
            }   
        }        
    }
}