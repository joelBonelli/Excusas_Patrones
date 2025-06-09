package prontuario;

import ar.edu.davinci.empleado.prontuario.AdministradorDeProntuarios;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdministradorProntuarioTest {

    @DisplayName("AdministradorDeProntuarios es un singleton y devuelve la misma instancia")
    @Test
    public void adicionarProntuarioUnaSolaInstancia() {
        AdministradorDeProntuarios instancia1 = AdministradorDeProntuarios.getInstance();
        AdministradorDeProntuarios instancia2 = AdministradorDeProntuarios.getInstance();

        Assertions.assertSame(instancia1, instancia2);
    }
}
