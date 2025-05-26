package ar.edu.davinci;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Encargado cadena = Encargado.crearCadenaEncargados();


        Empleado empleado = new Empleado("PEPE", "pepe@mail.com", 146);

        TipoDeExcusa meQuedeDormido = new MeQuedeDormido();
        TipoDeExcusa perdiUnColectivo = new PerdiElColectivo();

        TipoDeExcusa seCortoLaLuz = new SeCortoLaLuz();
        TipoDeExcusa tuveQueCuidarUnFamiliar = new CuideAUnFamiliar();

        TipoDeExcusa abducidoPorAlien = new FuiAbducidoPorAlien();
        TipoDeExcusa palomaLadrona = new PalomaLadrona();

        TipoDeExcusa inverosimil = new ExcusaInverosimil("Tuve un asado en Jupiter");

        Excusa excusa1 = new Excusa(empleado, abducidoPorAlien);

        try {
            cadena.manejarExcusa(excusa1);
        } catch (RechazarExcusaException e) {
            System.out.println(e.getMessage());
        }


    }
}