
public class Persona {

    // Atributos
    private String nombreCompleto;
    private Pasaporte pasaporte;
    private Mascota mascota;

    // Métodos
    // Constructor
    public Persona(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        pasaporte = null;
        mascota = null;
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public Mascota getMascota() {
        return mascota;
    }

    // Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // equals()
    public boolean equals(Persona persona) {
        return this.nombreCompleto.equals(persona.nombreCompleto);
    }

    // toString()
    @Override
    public String toString() {
        return "Nombre completo: " + nombreCompleto + "\n";
    }

    public void sacarPasaporte(String numero, String nacionalidad, String fechaEmision, byte anhos) {
        this.pasaporte = new Pasaporte(numero, nacionalidad, fechaEmision, anhos);
    }

    public void tomarVuelo(String destino) {
        if (pasaporte == null || !pasaporte.estaVigente()) System.out.println(nombreCompleto + " no puede tomar el vuelo, ya que su pasaporte no está vigente.\n");
        else System.out.println(nombreCompleto + " toma un vuelo a " + destino + ".\n");
    }

    public void adoptarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void jugar() {
        if (mascota == null) System.out.println(nombreCompleto + " no tiene mascota con la cual jugar.\n");
        else System.out.println(nombreCompleto + " juega con su " + mascota.getEspecie() + " " + mascota.getNombre() + ".\n");
    }

    public void soldar(MaquinaSoldar maquinaSoldar, String metal) {
        if (maquinaSoldar == null) System.out.println("No se puede soldar sin máquina.\n");
        else {
            System.out.println(nombreCompleto + " hace una soldadura.");
            maquinaSoldar.soldar(metal);
        }
    }
}
