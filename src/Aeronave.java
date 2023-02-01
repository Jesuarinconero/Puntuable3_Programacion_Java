import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class Aeronave {
    private String codigo;
    private String fechaentrega;
    private String L2GA;
    private int horastrabajo;
    private int horastrabajoempleada;
    private int capacidadpasajeros;
    private double coste;
    private double precioventa;

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

    public String getCodigo() {
        return codigo;
    }

    public abstract void propul();

    public int getCapacidadpasajeros() {
        return capacidadpasajeros;
    }

    public int gethorasbenf() {
        return horastrabajo - horastrabajoempleada;
    }

    public double getfacturacion() {
        return coste - precioventa;
    }

    public int gettotalHoras() {
        return horastrabajoempleada + horastrabajo;
    }


    public static void main(String[] args) {
        ArrayList<Aeronave> tablaAeronave = new ArrayList<>();

        AvComGran avComGran1 = new AvComGran("AG001", "12-31-2008", "L2GA", 289455, 150, 2300000, 3000000, 50000);
        AvComMed avComMed1 = new AvComMed("AM001", "12-26-2006", "L2GA", 22785, 120, 175000, 2500000.25, 22085);
        avioneta avioneta1 = new avioneta("AV001", "09-21-2008", "L2GA", 289455, 8, 75000, 125000, 5000);
        cohete cohete1 = new cohete("CH001", "08-18-2022", "L2GA", 22785, 0, 1700000, 2500000, 20785);
        dron dron1 = new dron("DR001", "07-14-2008", "L2GA", 205, 0, 500, 2700, 185);
        jettprivado jet1 = new jettprivado("JT001", "06-13-2008", "L2GA", 10550, 6, 400000, 750000, 9550);
        AvComGran avComGran2 = new AvComGran("AG002", "05-06-2012", "L2GA", 289455, 150, 2300000, 3200000, 259455);
        AvComMed avComMed2 = new AvComMed("AM002", "04-02-2018", "L2GA", 22785, 120, 175000, 2400000.40, 22085);
        avioneta avioneta2 = new avioneta("AV002", "03-28-2005", "L2GA", 289455, 8, 75000, 135000, 289455);
        cohete cohete2 = new cohete("CH002", "02-22-2017", "L2GA", 22785, 0, 1700000, 2560000, 20785);
        dron dron2 = new dron("DR002", "01-18-2012", "L2GA", 205, 0, 500, 2900, 185);
        jettprivado jet2 = new jettprivado("JT002", "12-13-2015", "L2GA", 10550, 6, 400000, 780000, 9550);
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
        for (int i = 0; i < tablaAeronave.size(); i++) {
            Aeronave aeronave = tablaAeronave.get(i);
            String nombreAeronave = aeronave.getClass().getName();
            String fechaAeronave = aeronave.getFechaentrega();
            int capacidadpasajero = aeronave.getCapacidadpasajeros();
            int horastrabajo = aeronave.gettotalHoras();
            int horasbenefic = aeronave.gethorasbenf();

   

            }

        }
    }
}
