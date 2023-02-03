public class dron extends Aeronave implements Propulsor {
    public dron(String codigo, String fechaentrega, String LG2A, int horastrabajoprev, int horastrabajoempleada, int capacidadpasajeros, float coste, float precioventa){
        super(codigo,fechaentrega,LG2A,horastrabajoprev,horastrabajoempleada,capacidadpasajeros,coste,precioventa);


    }



    public void propul() {
        System.out.println("Esta aeronave utiliza electricidad.\n");
    }
}



