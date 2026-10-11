
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Objetos persona
        Persona persona1 = new Persona("Raquel Bueno");
        Persona persona2 = new Persona("Alexander Bueno");
        Persona persona3 = new Persona("Henry Sandoval Ramirez");
        Persona persona4 = new Persona("Samantha Solano Bueno");

        // Sacar pasaportes
        persona1.sacarPasaporte("111111111", "Estadounidense", "2024-01-15", (byte) 10);
        persona2.sacarPasaporte("222222222", "Costarricense", "2023-06-20", (byte) 10);
        persona3.sacarPasaporte("333333333", "Costarricense", "2015-03-10", (byte) 10);
        persona4.sacarPasaporte("444444444", "Costarricense", "2011-08-05", (byte) 10);

        // Tomar vuelos
        persona1.tomarVuelo("Costa Rica");
        persona2.tomarVuelo("Estados Unidos");
        persona3.tomarVuelo("Panamá");
        persona4.tomarVuelo("Nicaragua");

        // Objetos mascota
        Mascota mascota1 = new Mascota("Roxy", "Perro", (byte) 14);
        Mascota mascota2 = new Mascota("Ely", "Gato", (byte) 1);

        // Adoptar mascotas
        persona1.adoptarMascota(mascota1);
        persona2.adoptarMascota(mascota2);
        persona4.adoptarMascota(mascota1);

        // Jugar
        persona1.jugar();
        persona2.jugar();
        persona4.jugar();

        // Objeto máquina de soldar
        MaquinaSoldar maquina1 = new MaquinaSoldar("Miller Electric", "ME123X", 2000, 2);

        // Definir metales
        maquina1.definirMetales();

        // Soldar
        persona1.soldar(maquina1, "hierro");
        persona1.soldar(maquina1, "titanio");
    }
}
