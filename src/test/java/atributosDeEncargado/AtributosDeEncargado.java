package atributosDeEncargado;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.tiposDeEncargado.SupervisorDeArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AtributosDeEncargado {

    @DisplayName("Verificar los datos del encargado")
    @Test
    public void testVerificarLosDatosDelEncargado() {
        Encargado encargado = new SupervisorDeArea("Juancito", "juancito@mail", 50, null);
        Assertions.assertEquals("Juancito", encargado.getNombre());
        Assertions.assertEquals("juancito@mail", encargado.getEmail());
        Assertions.assertEquals(50, encargado.getLegajo());
    }

}
