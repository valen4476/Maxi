package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
public class ClinicaTest {
    private static final Logger LOG = Logger.getLogger(ClinicaTest.class.getName());

    /**
     * Prueba para verificar que el nombre del clinica este correcto
     */
    @Test
    public void datosCompletosClinica(){
        LOG.info("Inicio test datosCompletosClinica");
        Clinica clinica = new Clinica("Amigos peludos");
        assertEquals("Amigos peludos", clinica.getNombre());
        LOG.info("Fin test datosCompletosClinica");
    }

    /**
     * Prueba para verificar que los datos del clinica no esten nulos
     */
    @Test
    public void datosNulosClinica(){
        LOG.info("Inicio test datosCompletosClinica");
        assertThrows(Throwable.class, ()-> new Clinica(null));
        LOG.info("Fin test datosCompletosClinica");
    }

    /**
     * Prueba para registrar mascotas
     */
    @Test
    public void registrarMascota(){
        LOG.info("Inicio test registrarMascota");
        Clinica clinica = new Clinica("Amigos peludos");
        Mascota mascota = new  Mascota("1095208304","Zeus",(byte)5, "labrador", "dog", 'M', "Blanco", (byte) 30);

        clinica.agregarMascota(mascota);
        assertTrue(clinica.getMascotas().contains(mascota));
        assertEquals(1, clinica.getMascotas().size());

        LOG.info("Fin test registrarMascotas");
    }

    /**
     * 
     */
    @Test
    public void verificarIdMascotas(){
        LOG.info("Inicio test verificarIdMascota");
        Clinica clinica = new Clinica("Amigos peludos");

        Mascota mascota1 = new  Mascota("1095208304","Zeus",(byte)5, "labrador", "dog", 'M', "Blanco", (byte) 30);

        Mascota mascota2 = new  Mascota("1095208304","Max",(byte)11, "Chihuahua", "dog", 'M', "Negro", (byte) 17);

        clinica.agregarMascota(mascota1);

        assertThrows(Throwable.class, ()-> clinica.agregarMascota(mascota2));


        LOG.info("Fin test verificarIdMascota");
    }

    
}
