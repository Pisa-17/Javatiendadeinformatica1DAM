import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Articulo {

    String idArticulos;
    String descripcion;
    int existencias;
    double pvp;

    public Articulo(String idArticulos, String descripcion, int existencias, double pvp) {
        this.idArticulos = idArticulos;
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.pvp = pvp;
    }
    private static HashMap<String, Articulo> articulos = new HashMap<>();

    public Articulo() {
    }

    public String getIdArticulos() {
        return idArticulos;
    }

    public void setIdArticulos(String idArticulos) {
        this.idArticulos = idArticulos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }
    public static void reponer(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el id del articulo a reponer: ");
        String input = sc.nextLine();
        Articulo articulo = articulos.get(input);

            if(articulo != null){
                System.out.println("Ingresa la cantidad nueva de stock que tendra el producto: ");
                int stockN = sc.nextInt();
                articulo.existencias += stockN;
                System.out.println("Stock actualizado !!!");
            }else{
                System.out.println("Has indicado un ID erroneo o inexistente");
            }

    }
    public static void listadodearticulossinexistencias(){
        System.out.println("Listado de articulos sin stock o carentes de existencias: ");
        for(Articulo articulo : articulos.values()){
            if(articulo.existencias == 0){
                System.out.println("ID: " + articulo.idArticulos);
                System.out.println("Existencias: " + articulo.existencias);
                System.out.println("Precio: " + articulo.pvp);
            }
        }
    }
    public static void listaarticulos(){
        for(Articulo articulo: articulos.values()){
            System.out.println("ID: " + articulo.idArticulos);
            System.out.println("Existencias: " + articulo.existencias);
            System.out.println("Precio: " + articulo.pvp);
        }
    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Menú -----");
        System.out.println("1. Listar todos los artículos");
        System.out.println("2. Listar articulos gaming");
        System.out.println("3. Listar perifericos");
        System.out.println("4. Listar torres");
        System.out.println("5. Listar el resto");
        System.out.println("Listar articulos sin stock");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
        int input = sc.nextInt();
        do {
            switch(input){
                case 1:
                    listaarticulos();
                    break;
                case 2:
                   // listarArticulos(articulos, 1);
                    break;
            }
        }while(input !=9);
    }

}
