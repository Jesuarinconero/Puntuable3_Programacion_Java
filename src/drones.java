public class drones extends Aeronave implements Propulsor {
    public drones(String codigo, String fechaentrega, String LG2A, int horastrabajo, int horastrabajoempleada,int capacidadpasajeros, double coste, double precioventa){
        super(codigo,fechaentrega,LG2A,horastrabajo,horastrabajoempleada,capacidadpasajeros,coste,precioventa);


    }



    public void propul() {
        System.out.println("Los drones son electricos ");
    }
}



