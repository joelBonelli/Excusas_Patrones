package ar.edu.davinci.empleado.encargado;

import ar.edu.davinci.empleado.encargado.tiposDeEncargado.*;
import ar.edu.davinci.excepcion.RechazarExcusaException;
import ar.edu.davinci.excusa.Excusa;

public class LineaDeEncargados {
    private Encargado recepcionista;

    public LineaDeEncargados(){
        this.recepcionista = new Recepcionista("Ana", "ana@mail.com", 1,
                new SupervisorDeArea("Luis", "luis@mail.com", 2,
                new GerenteRRHH("Carlos", "carlos@mail.com", 3,
                new CEO("Laura", "laura@mail.com", 4, new Rechazador()))));
    }

    public void empezarLinea(Excusa excusa){
        try {
            recepcionista.manejarExcusa(excusa);
        } catch (RechazarExcusaException e) {
            System.out.println("La excusa fue rechazada: " + e.getMessage());
        }
    }
}
