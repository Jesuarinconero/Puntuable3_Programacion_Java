public class avioneta extends Aeronave implements Propulsor {
    public avioneta(String codigo, String fechaentrega, String LG2A, int horastrabajoprev, int horastrabajoempleada, int capacidadpasajeros, double coste, double precioventa){
        super(codigo,fechaentrega,LG2A,horastrabajoprev,horastrabajoempleada,capacidadpasajeros,coste,precioventa);

    }


    public void propul() {
        System.out.println("Esta aeronave utiliza diesel.\n ");

    }
}
