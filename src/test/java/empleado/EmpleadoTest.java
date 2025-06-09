package empleado;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaTrivial;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    @DisplayName("Un empleado no puede generar una excusa, sin definir el Tipo de Excusa")
    @Test
    public void empleadoSinTipoDeExcusa() {
        Empleado empleado = new Empleado("Pepito", "pepito@mail.com", 1);
        Assertions.assertThrows(NullPointerException.class, () -> empleado.generarExcusa(null));
    }

    @DisplayName("El mensaje generarExcusa retorna una excusa correctamente construida")
    @Test
    public void empleadoGeneraExcusaCorrectamente() {
        Empleado empleado = new Empleado("Pepito", "pepito@mail.com", 1);
        TipoDeExcusa excusaTrivial = new ExcusaTrivial();
        Excusa excusa = empleado.generarExcusa(excusaTrivial);

        Assertions.assertNotNull(excusa);
        Assertions.assertEquals(empleado.getNombre(), excusa.obtenerNombreEmpleado(), "Pepito");
        Assertions.assertEquals(excusaTrivial.toString(), excusa.getTipoDeExcusa(),"Excusa Trivial");
    }
}
