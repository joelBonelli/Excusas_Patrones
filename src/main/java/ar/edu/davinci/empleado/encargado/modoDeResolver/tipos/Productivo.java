package ar.edu.davinci.empleado.encargado.modoDeResolver.tipos;

import ar.edu.davinci.CTO;
import ar.edu.davinci.email.EmailSender;
import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.Encargado;
import ar.edu.davinci.empleado.encargado.ManejadorExcusas;
import ar.edu.davinci.empleado.encargado.modoDeResolver.IModoDeResolver;
import ar.edu.davinci.excusa.Excusa;

public class Productivo implements IModoDeResolver {
    private String asunto = "Mi querido CTO";
    private String cuerpo = "Mire que bien trabajo";

    @Override
    public void resolver(ManejadorExcusas manejadorExcusas, Excusa excusa) {
        EmailSender emailSender = new EmailSender();
        Empleado CTO = new CTO();
        emailSender.enviarEmail(CTO.getEmail(), excusa.obtenerEmailEmpleado(), asunto, cuerpo);
        manejadorExcusas.procesarExcusa(excusa);
    }
}
