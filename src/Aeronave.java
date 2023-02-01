import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class Aeronave {
    //Variables
    private String codigo;
    private String fechaentrega;
    private String L2GA;
    private int horastrabajo;
    private int horastrabajoempleada;
    private int capacidadpasajeros;
    private double coste;
    private double precioventa;
//Constructor
    public Aeronave(String codigo, String fechaentrega, String LG2A, int horastrabajo, int horastrabajoempleada, int capacidadpasajeros, double coste, double precioventa) {
        this.codigo = codigo;
        this.fechaentrega = fechaentrega;
        this.L2GA = LG2A;
        this.horastrabajo = horastrabajo;
        this.horastrabajoempleada = horastrabajoempleada;
        this.capacidadpasajeros = capacidadpasajeros;
        this.coste = coste;
        this.precioventa = precioventa;

    }
    public String getFechaentrega() {
        return fechaentrega;

    }

    public abstract void propul();

    public int getCapacidadpasajeros() {
        return capacidadpasajeros;
    }


    public double getfacturacion() {

       return precioventa-coste;
    }

    public int gettotalHoras() {
        return horastrabajoempleada + horastrabajo;
    }

    public String getformdate() {
        return fechaentrega;
    }



    public static void main(String[] args) {
        ArrayList<Aeronave> tablaAeronave = new ArrayList<>();

        AvComGran avComGran1 = new AvComGran("AG001", "12-31-2008", "L2GA", 289455, 150, 2300000, 300, 50000);
        AvComMed avComMed1 = new AvComMed("AM001", "12-26-2006", "L2GA", 22785, 120, 175000, 3258.63,800241.25);
        avioneta avioneta1 = new avioneta("AV001", "09-21-2008", "L2GA", 289455, 8, 75000, 3250, 25041);
        cohete cohete1 = new cohete("CH001", "08-18-2022", "L2GA", 22785, 0, 1700000,20785 ,2500000  );
        dron dron1 = new dron("DR001", "07-14-2008", "L2GA", 205, 0, 500, 1450, 28500);
        jettprivado jet1 = new jettprivado("JT001", "06-13-2008", "L2GA", 10550, 6, 400000, 25000, 126052);
        AvComGran avComGran2 = new AvComGran("AG002", "05-06-2012", "L2GA", 289455, 150, 2300000, 2000, 45123);
        AvComMed avComMed2 = new AvComMed("AM002", "04-02-2018", "L2GA", 22785, 120, 175000, 84520, 6581623);
        avioneta avioneta2 = new avioneta("AV002", "03-28-2005", "L2GA", 289455, 8, 75000, 458223, 28945452);
        cohete cohete2 = new cohete("CH002", "02-22-2017", "L2GA", 22785, 0, 1700000, 2560, 20512);
        dron dron2 = new dron("DR002", "01-18-2012", "L2GA", 205, 0, 500, 23000, 695652);
        jettprivado jet2 = new jettprivado("JT002", "12-13-2015", "L2GA", 10550, 6, 400000, 300, 952);
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
        tablaAeronave.sort(Comparator.comparing(Aeronave -> LocalDate.parse(Aeronave.getFechaentrega(), DateTimeFormatter.ofPattern("MM-dd-yyyy"))));
        for (int i= 0; i< tablaAeronave.size(); i++ ){
            Aeronave aeronave = tablaAeronave.get(i);
             String nombreAeronave = aeronave.getClass().getName();
             String fechaAeronave = aeronave.getFechaentrega();
             Integer horastrabajo = aeronave.gettotalHoras();
             Integer capacidaddepasajeros = aeronave.getCapacidadpasajeros();
             double beneficios = aeronave.getfacturacion();
             System.out.println();
             if(i==0){
                 System.out.println("Esta fábrica construyó su primera aeronave, una "+nombreAeronave+ ", el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de " +beneficios);
             }
             else if(i==1){
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==2) {
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==3) {
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==4) {
                 System.out.println(" Después construyó una " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==5) {
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==6) {
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==7) {
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==8) {
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==9) {
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==10) {
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             } else if (i==11) {
                 System.out.println(" Después construyó un " +nombreAeronave+  " el "+fechaAeronave+ ".\n" +
                         "Esto supuso "+horastrabajo+ " horas de trabajo tiene una generando un beneficio de "+beneficios);
             }


        }
    }
}
