package tiposDeEncargados;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.ManejadorExcusas;
import ar.edu.davinci.empleado.encargado.Rechazador;
import ar.edu.davinci.empleado.encargado.tiposDeEncargado.Recepcionista;
import ar.edu.davinci.excepcion.RechazarExcusaException;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaTrivial;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RechazadorTest {

    @DisplayName("Un rechazador no puede manejar una excusa de tipo Trivial")
    @Test
    public void rechazadorNoManejaExcusaTipoTrivial() {
        Encargado recepcionista = new Recepcionista("Ana", "ana@mail.com", 1, null);
        TipoDeExcusa excusaTrivial = new ExcusaTrivial();

        Excusa excusa = new Excusa(recepcionista, excusaTrivial);
        ManejadorExcusas rechazador = new Rechazador();

        Assertions.assertThrows(RechazarExcusaException.class,
                () -> rechazador.manejarExcusa(excusa));
    }

}
