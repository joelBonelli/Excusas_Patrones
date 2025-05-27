package ar.edu.davinci;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.excepcion.RechazarExcusaException;
import ar.edu.davinci.excusa.Excusa;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaCompleja;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaTrivial;
import ar.edu.davinci.excusa.tipoDeExcusa.moderada.CuideAUnFamiliar;
import ar.edu.davinci.excusa.tipoDeExcusa.ExcusaInverosimil;
import ar.edu.davinci.excusa.tipoDeExcusa.moderada.SeCortoLaLuz;
import ar.edu.davinci.excusa.tipoDeExcusa.TipoDeExcusa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instanciar la cadena de responsabilidades
        Encargado cadena = Encargado.crearCadenaEncargados();

        // Instaciar un empleado que tiene una excusa
        Empleado empleado = new Empleado("Pepe", "pepe@mail.com", 146);

        // Excusa Trivial
        TipoDeExcusa noCargueLaSube = new ExcusaTrivial();

        // Excusas Moderadas
        TipoDeExcusa seCortoLaLuz = new SeCortoLaLuz();
        TipoDeExcusa tuveQueCuidarUnFamiliar = new CuideAUnFamiliar();

        // Excusa Compleja
        TipoDeExcusa palomaLadrona = new ExcusaCompleja();

        // Excusa Inverosimil
        TipoDeExcusa inverosimil = new ExcusaInverosimil("Tuve un asado en Jupiter");

        // Crear la excusa completa
        Excusa excusa1 = new Excusa(empleado, noCargueLaSube);
        Excusa excusa2 = new Excusa(empleado, seCortoLaLuz);
        Excusa excusa3 = new Excusa(empleado, tuveQueCuidarUnFamiliar);
        Excusa excusa4 = new Excusa(empleado, palomaLadrona);
        Excusa excusa5 = new Excusa(empleado, inverosimil);



        // ejecutar la cadena, con la excusa
        try {
            cadena.manejarExcusa(excusa4);
        } catch (RechazarExcusaException e) {
            System.out.println(e.getMessage());
        }

    }
}