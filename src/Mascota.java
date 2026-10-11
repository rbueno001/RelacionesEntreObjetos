
public class Mascota {

    // Atributos
    private String nombre;
    private String especie;
    private byte edad;

    // Métodos
    // Constructor
    public Mascota(String nombre, String especie, byte edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Getters
    public String getNombre() { return nombre; }


    public String getEspecie() { return especie; }


    public byte getEdad() { return edad; }


    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }


    public void setEspecie(String especie) { this.especie = especie; }


    public void setEdad(byte edad) { this.edad = edad; }


    // equals()
    public boolean equals(Mascota mascota) {
        return this.nombre.equals(mascota.nombre) && this.especie.equals(mascota.especie) &&
                this.edad == mascota.edad;
    }

    // toString()
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad + "\n";
    }
}
