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


    Empleado pepe = new Empleado("Pepe", "pepe@mail.com", 1500);
    pepe.generarExcusa(new ExcusaInverosimil("blabla"));


    }
}