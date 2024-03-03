/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());
    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
        
        Mascota mascota = new Mascota("1095208304","Zeus",(byte)5, "labrador", "dog", 'M', "Blanco", (byte) 30);

        assertEquals("1095208304", mascota.identificacion());
        assertEquals("Zeus", mascota.nombre());
        assertEquals(5, mascota.edad());
        assertEquals("labrador", mascota.raza());
        assertEquals("dog", mascota.especie());
        assertEquals('M', mascota.genero());
        assertEquals("Blanco", mascota.color());
        assertEquals(30, mascota.peso());

        LOG.info("Finalizando test datosCompletos");
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosNulos(){
        LOG.info("Inicio prueba datosNulos");
        assertThrows(Throwable.class, ()-> new Mascota(null,null, (byte) 0, null, null, null, null, (byte) 0));
        LOG.info("Finalizando test datosNulos");
    }
/**
 * Prueba para verificar que los datos no estén vacíos
 */
    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios(){
        LOG.info("Inicio prueba datosVacios");
        assertThrows(Throwable.class, ()-> new Mascota(null,null, (byte) 0, null, null, null, null, (byte) 0));
        LOG.info("Finalizando datosVacios");
    }
/**
 * Prueba para verificar que la edad no sea negativa
 */

    @Test
    public void edadNegativa(){
        LOG.info("Inicio prueba edadNegativa");
        assertThrows(Throwable.class, ()-> new Mascota(null,null, (byte) 0, null, null, null, null, (byte) 0));
        LOG.info("Finalizando prueba edadNegativa");
    }

    @Test
    public void pesoNegativo(){
        LOG.info("Inicio prueba edadNegativa");
        assertThrows(Throwable.class, ()-> new Mascota(null,null, (byte) 0, null, null, null, null, (byte) 0));
        LOG.info("Finalizando prueba edadNegativa");
    }
/**
 * Prueba para verificar que el peso sea positivo y que no supere los 50k
 */

    @Test
    public void topePeso(){
        LOG.info("Inicio prueba topePeso");
        assertThrows(Throwable.class, ()-> new Mascota(null,null, (byte) 0, null, null, null, null, (byte) 0));
        LOG.info("Finalizando prueba topePeso");
    }

/**
 * Prueba para verificar el genero de una mascota este bueno
 */

    @Test
    public void generoInvalido(){
        LOG.info("Inicio prueba generoInvalido");
        assertThrows(Throwable.class, ()-> new Mascota(null,null, (byte) 0, null, null, null, null, (byte) 0));
        LOG.info("Finalizando prueba generoInvalido");
    }
}