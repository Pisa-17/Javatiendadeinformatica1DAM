import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Comparator;
public class Cliente implements Comparable<Cliente>{
    String dni;
    String nombre;
    String telefono;
    String email;

    private static HashMap<String, Cliente> clientes = new HashMap<>();
    // private static ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente(String dni, String nombre, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Cliente() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static void Menucliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("*        Menu de clientes         *");
        System.out.println("***********************************");
        System.out.println("");
        System.out.println("1-Alta de cliente");
        System.out.println("2-Baja de cliente");
        System.out.println("3-Listar clientes");
        System.out.println("9-Salir del menu");

        int input = sc.nextInt();
        do {
            switch (input){
                case 1:
                    altacliente();
                    break;
                case 2:
                    bajacliente();
                    break;
                case 3:
                    listacliente();
                    break;
            }
        } while(input !=9);


    };
    public static void altacliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su dni: ");
        String dniT = sc.nextLine();
        if (!Cliente.validarDni(dniT)) {
            System.out.println("El formato del DNI es inválido");
            return; // Salir del método si el DNI es inválido
        }
        System.out.println("Indique su nombre: ");
        String nombreT = sc.nextLine();
        System.out.println("Indique su numero de telefono: ");
        String telefonoT = sc.nextLine();
        System.out.println("Indique su email");
        String emailT = sc.nextLine();
        Cliente cliente = new Cliente(dniT,nombreT,telefonoT,emailT);
        clientes.put(cliente.getDni(), cliente);
        // clientes.add(new Cliente(dniT, nombreT, telefonoT, emailT)); //solo funciona esta linea con arraylist
    };
    public static void bajacliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el dni del usuario a eliminar");
        String dniR = sc.nextLine();
        if(clientes.containsKey(dniR)){
            clientes.remove(dniR);
            System.out.println("Cliente eliminado con exito");
        }else{
            System.out.println("El DNI no existe en el sistema");
        }
    }
    public static void listacliente(){
        for(Cliente cliente: clientes.values() ){
            System.out.println("Dni: " + cliente.getDni()) ;
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Telefono de contacto: " + cliente.getTelefono());
            System.out.println("E-mail: " + cliente.getEmail());
        }
    }
    public int compareTo(Cliente otroCliente){
        return this.nombre.compareTo(otroCliente.getNombre());
    }
    private static boolean validarDni(String dni){
        String patronDNI = "\\d{8}[A-HJ-NP-TV-Z]";
        return dni.matches(patronDNI);
    }

}
