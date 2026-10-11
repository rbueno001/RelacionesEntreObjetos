
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaquinaSoldar {

    private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    // Atributos
    private String marca;
    private String modelo;
    private double potencia;
    private String[] metales;

    // Métodos
    // Constructor
    public MaquinaSoldar(String marca, String modelo, double potencia, int cantidadMetales) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        metales = new String[cantidadMetales];
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public String[] getMetales() {
        return metales;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    // equals()
    public boolean equals(MaquinaSoldar maquinaSoldar) {
        return this.marca.equals(maquinaSoldar.marca) && this.modelo.equals(maquinaSoldar.modelo);
    }

    // toString()
    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPotencia: " + potencia + "\nMetales: " +
                metales.toString();
    }

    public void definirMetales() throws IOException {
        for (int i = 0; i < metales.length; i++) {
            System.out.print("Ingrese el metal " + (i + 1) + ": ");
            metales[i] = entrada.readLine();
        }
    }

    public void soldar(String metal) {
        for (int i = 0; i < metales.length; i++) {
            if (metales[i].equals(metal)) {
                System.out.println("La " + marca + " " + modelo + " solda el " + metal + ".\n");
                return;
            }
        }
        System.out.println("La " + marca + " " + modelo + " no puede soldar " + metal + ".\n");
    }
}
