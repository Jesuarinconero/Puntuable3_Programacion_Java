import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public  class Aeronave implements Propulsor {
    //Variables
    private final String codigo;
     private final String fechaentrega;
    private final String L2GA;
    private final int horastrabajoprevista;
    private final int horastrabajoempleada;
    private final  int capacidadpasajeros;
    private final double coste;
    private final double precioventa;

    //Constructor
    public Aeronave(String codigo, String fechaentrega, String LG2A, int horastrabajoprev, int horastrabajoempleada, int capacidadpasajeros,double coste, double precioventa) {
        this.codigo = codigo;
        this.fechaentrega = fechaentrega;
        this.L2GA = LG2A;
        this.horastrabajoprevista = horastrabajoprev;
        this.horastrabajoempleada = horastrabajoempleada;
        this.capacidadpasajeros = capacidadpasajeros;
        this.coste = coste;
        this.precioventa = precioventa;


    }
//Objeto para el formato euro utilizamos el decimal y el de horas par reducir las horas
    DecimalFormat formatoeuro = new DecimalFormat("###,###.##€ ");
    DecimalFormat formatohoras = new DecimalFormat("###,###");
//Interfaz
    public void propul() {
    }
//Obtener la capacidad de pasajeros
    public int getCapacidadpasajeros() {
        return capacidadpasajeros;
    }
//Metodo para obtener la facturacion total de la empresa
public void getfacturaciontotal(ArrayList<Aeronave> tablaAeronave) {
    double facturacionTotal = 0;

    for (Aeronave aeronave : tablaAeronave) {
        facturacionTotal += aeronave.facturacion();



    }
    System.out.println("La facturación total de la compañía a día de hoy: " +formatoeuro.format(facturacionTotal).replace(",","."));
}
//Obtener la facturacion
    public double facturacion() {
        return precioventa-coste;

    }
    //Metodo para obtener la facturacion en formato €
public String factuarionImp(){
        return  formatoeuro.format(facturacion());
}
//Metodo para calcular el total de avionetas
    public void gettotalHoras(ArrayList<Aeronave> tablaAeronave) {
        int sumaTotal = 0;
        for (Aeronave aeronave : tablaAeronave) {
            if (aeronave instanceof avioneta) {
                sumaTotal += aeronave.horastrabajoempleada;

            }
        }
        System.out.println("El total de horas de trabajo empleadas en el tipo Avioneta fueron: "+formatohoras.format(sumaTotal));
    }
//Cambiar el formato en fecha
    public String getformdate() {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter targetFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(fechaentrega, originalFormat);

        return date.format(targetFormat);
    }


    public static void main(String[] args) {
        //Creamos la tabla con ArrayList
        ArrayList<Aeronave> tablaAeronave = new ArrayList<>();
         //Creamos los objetos de avioneta cohete dron etc
        AvComGran avComGran1 = new AvComGran("AG001", "12-31-2008", "L2GA", 289, 380, 2300, 3000, 50000);
        AvComMed avComMed1 = new AvComMed("AM001", "12-26-2009", "L2GA", 22785, 3982, 1750, 3250, 800241);
        avioneta avioneta1 = new avioneta("AV001", "09-21-2008", "L2GA", 0, 14472, 75256, 3250, 250412);
        cohete cohete1 = new cohete("CH001", "08-18-2022", "L2GA", 22785, 14521, 0, 2078, 25000.25);
        dron dron1 = new dron("DR001", "02-02-2008", "L2GA", 205, 456212, 0, 1450, 28500);
        jettprivado jet1 = new jettprivado("JT001", "06-13-2008", "L2GA", 10550, 4562, 400, 25000, 126052);
        AvComGran avComGran2 = new AvComGran("AG002", "05-06-2012", "L2GA", 2894, 45621, 23000, 2000, 45123);
        AvComMed avComMed2 = new AvComMed("AM002", "04-02-2018", "L2GA", 22785, 453215, 1750, 845, 6581);
        avioneta avioneta2 = new avioneta("AV002", "03-28-2014", "L2GA", 1, 144727, 7500, 458, 2894);
        cohete cohete2 = new cohete("CH002", "02-22-2017", "L2GA", 22785, 12514, 0, 2560, 20512);
        dron dron2 = new dron("DR002", "01-18-2012", "L2GA", 205, 32121, 0, 23000, 695652);
        jettprivado jet2 = new jettprivado("JT002", "12-13-2015", "L2GA", 10550, 61456, 400, 300, 952);
        //Los insertamos en la tabla aeronave
        tablaAeronave.add(avComGran1);
        tablaAeronave.add(avComGran2);
        tablaAeronave.add(avComMed1);
        tablaAeronave.add(avComMed2);
        tablaAeronave.add(avioneta1);
        tablaAeronave.add(avioneta2);
        tablaAeronave.add(cohete1);
        tablaAeronave.add(cohete2);
        tablaAeronave.add(dron1);
        tablaAeronave.add(dron2);
        tablaAeronave.add(jet1);
        tablaAeronave.add(jet2);
        //Comparador de fecha
        tablaAeronave.sort(Comparator.comparing(Aeronave -> LocalDate.parse(Aeronave.fechaentrega, DateTimeFormatter.ofPattern("MM-dd-yyyy"))));
        //Titulo del programa
        System.out.println("\n\t\033[4mPROGRAMA AERONAVES\033[0m\t");
        System.out.println();

        //For para recorrer la tabla
        for (int i = 0; i < tablaAeronave.size(); i++) {
            //Llamamos a los metodos
            Aeronave aeronave = tablaAeronave.get(i);
            aeronave.Fechaentrega(aeronave,i);
            aeronave.Horasbenif(i);
            aeronave.propul();
            //En la posicion final realiza esos metodos
            if (i==11){
                aeronave.gettotalHoras(tablaAeronave);
                aeronave.getfacturaciontotal(tablaAeronave);
            }





        }



    }
//Metodos horas beneficios
public void Horasbenif( int i){
    if (i == 0) {
        System.out.println("Esto supuso " + formatohoras.format(horastrabajoempleada) + " horas tiene una generando un beneficio de " +factuarionImp());

    }
    else {

        System.out.println("Esto supuso " +formatohoras.format(horastrabajoempleada) + " horas tiene una generando un beneficio de "+factuarionImp()+ "" );

    }
}
//Metodo fecha entrega
    public void Fechaentrega(Aeronave aeronave, int i) {
        //Posicion 0 imprime esta frase con su respectivo nombre y posicion
            if (i==0){
                System.out.println("Esta fábrica construyó su primera aeronave, un " +aeronave.getClass().getName() + ", el " +aeronave.getformdate()+(aeronave.getCapacidadpasajeros() == 0 ? "." : ""+"Con una capacidad de " + aeronave.getCapacidadpasajeros() + " pasajeros."));
            }  //Si la aeronave es una avioneta  imprime esta frase con su respectivo nombre y posicion
            else if (aeronave instanceof avioneta){
                System.out.println("Después construyó una "+aeronave.getClass().getName()+ " el "+aeronave.getformdate()+(aeronave.getCapacidadpasajeros() == 0 ? "." : ""+" para " + aeronave.getCapacidadpasajeros() + " pasajeros."));
            } //Si no es ninguno de los casos imprime eso
            else  {
                System.out.println( "Después construyó un "+aeronave.getClass().getName()+ " el "+aeronave.getformdate()+(aeronave.getCapacidadpasajeros() == 0 ? "." : ""+" para " + aeronave.getCapacidadpasajeros() + " pasajeros."));
            }


    }


    public int getHorastrabajoprevista() {
        return horastrabajoprevista;
    }

    public String getL2GA() {
        return L2GA;
    }

    public String getCodigo() {
        return codigo;
    }
}
