public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaAlSol;
    private boolean esObservable;

    
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

   
    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Distancia al Sol: " + distanciaAlSol);
        System.out.println("Es observable: " + esObservable);
        System.out.println("Densidad: " + calcularDensidad());
    }
}
