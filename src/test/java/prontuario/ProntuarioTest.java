package prontuario;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaInverosimil;
import ar.edu.davinci.empleado.prontuario.Prontuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProntuarioTest {

    @DisplayName("El prontuario se construye y retorna los datos correctamente")
    @Test
    public void prontuarioSeCreaCorrectamente() {
        Empleado empleado = new Empleado("Juan", "juan@mail.com", 123);
        Excusa excusa = empleado.generarExcusa(new ExcusaInverosimil());
        Prontuario prontuario = new Prontuario(empleado, empleado.getLegajo(), excusa);

        Assertions.assertEquals(excusa.obtenerNombreEmpleado(), prontuario.getNombreEmpleado());
        Assertions.assertEquals(excusa.getTipoDeExcusa(), prontuario.getExcusa());
    }
}
