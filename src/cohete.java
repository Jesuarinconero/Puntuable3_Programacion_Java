public class cohete extends Aeronave implements Propulsor{

    public cohete(String codigo, String fechaentrega, String LG2A, int horastrabajo, int horastrabajoempleada, int capacidadpasajeros, double coste, double precioventa){
        super(codigo,fechaentrega,LG2A,horastrabajo,horastrabajoempleada,capacidadpasajeros,coste,precioventa);


    }
    public void propul() {
        System.out.println(" Esta aeronave utiliza propergol sólido.\n ");
    }
}


