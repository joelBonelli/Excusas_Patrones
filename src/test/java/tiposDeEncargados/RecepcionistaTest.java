package tiposDeEncargados;

import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.tiposDeEncargado.Recepcionista;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaCompleja;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaInverosimil;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaTrivial;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;
import ar.edu.davinci.excusa.tipoDeExcusa.moderada.SeCortoLaLuz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecepcionistaTest {

    @DisplayName("Un recepcionista puede manejar una excusa de tipo ExcusaTrivial")
    @Test
    public void testUnRecepcionistaPuedeManejarExcusaTrivial() {
        Encargado recepcionista = new Recepcionista("Ana", "ana@mail.com", 1, null);
        TipoDeExcusa excusaTrivial = new ExcusaTrivial();
        Excusa excusa = new Excusa(recepcionista, excusaTrivial);
        Assertions.assertTrue(recepcionista.puedeManejar(excusa));
    }


    @DisplayName("Un recepcionista no puede manejar una excusa de tipo Compleja")
    @Test
    public void testUnRecepcionistaNoPuedeManejarExcusaCompleja() {
        Encargado recepcionista = new Recepcionista("Ana", "ana@mail.com", 1, null);
        TipoDeExcusa excusaCompleja = new ExcusaCompleja();
        Excusa excusa = new Excusa(recepcionista, excusaCompleja);
        Assertions.assertFalse(recepcionista.puedeManejar(excusa));
    }

    @DisplayName("Un recepcionista no puede manejar una excusa de tipo Moderada.SeCortoLaLuz ")
    @Test
    public void testUnRecepcionistaNoPuedeManejarExcusaSeCortoLaLuz() {
        Encargado recepcionista = new Recepcionista("Ana", "ana@mail.com", 1, null);
        TipoDeExcusa excusaModerada = new SeCortoLaLuz();
        Excusa excusa = new Excusa(recepcionista, excusaModerada);
        Assertions.assertFalse(recepcionista.puedeManejar(excusa));
    }

    @DisplayName("Un recepcionista no puede manejar una excusa de tipo Inverosimil ")
    @Test
    public void testUnRecepcionistaNoPuedeManejarExcusaInverosimil() {
        Encargado recepcionista = new Recepcionista("Ana", "ana@mail.com", 1, null);
        TipoDeExcusa excusaInverosimil = new ExcusaInverosimil();
        Excusa excusa = new Excusa(recepcionista, excusaInverosimil);
        Assertions.assertFalse(recepcionista.puedeManejar(excusa));
    }
}
