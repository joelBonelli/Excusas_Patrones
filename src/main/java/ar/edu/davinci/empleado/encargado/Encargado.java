package ar.edu.davinci.empleado.encargado;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.modoDeResolver.ModoDeResolver;
import ar.edu.davinci.empleado.encargado.modoDeResolver.tipos.Normal;
import ar.edu.davinci.empleado.encargado.modoDeResolver.tipos.Productivo;
import ar.edu.davinci.empleado.encargado.modoDeResolver.tipos.Vago;
import ar.edu.davinci.empleado.encargado.tiposDeEncargado.*;
import ar.edu.davinci.excusa.Excusa;

import java.util.Random;

public abstract class Encargado extends Empleado implements ManejadorExcusas {

    private ModoDeResolver modoDeResolver;
    private Encargado siguiente;


    public Encargado(String nombre, String email, int legajo, ModoDeResolver modoDeResolver) {
        super(nombre, email, legajo);
        this.modoDeResolver = modoDeResolver;
        this.siguiente = null;

    }

    @Override
    public void manejarExcusa(Excusa excusa){
        modoDeResolver.resolver(this, excusa);
    }

    @Override
    public void setSiguiente(Encargado encargado){
        this.siguiente = encargado;
    }

    @Override
    public Encargado getSiguiente(){
        return siguiente;
    }

    @Override
    public void procesarExcusa(Excusa excusa){
        if (this.puedeManejar(excusa)) {
            this.ejecutarAccion(excusa);
        } else if (siguiente != null){
            siguiente.manejarExcusa(excusa);
        }
    }

    protected abstract boolean puedeManejar(Excusa excusa);
    protected abstract void ejecutarAccion(Excusa excusa);

    @Override
    public boolean sosRecepcionista() {
        return false;
    }

    @Override
    public boolean sosSupervisor() {
        return false;
    }

    @Override
    public boolean sosGerente() {
        return false;
    }

    @Override
    public boolean sosCEO() {
        return false;
    }


    public static Encargado crearCadenaEncargados() {
        Encargado recepcionista = new Recepcionista("Ana", "ana@mail.com", 1, modoRandom());
        Encargado supervisor = new SupervisorDeArea("Luis", "luis@mail.com", 2, modoRandom());
        Encargado gerente = new GerenteRRHH("Carlos", "carlos@mail.com", 3, modoRandom());
        Encargado ceo = new CEO("Laura", "laura@mail.com", 4, modoRandom());
        Encargado rechazador = new Rechazador("Hugo", "hugo@mail.com", 5, new Normal());

//        Encargado recepcionista = new Recepcionista("Ana", "ana@mail.com", 1, new Normal());
//        Encargado supervisor = new SupervisorDeArea("Luis", "luis@mail.com", 2, new Normal());
//        Encargado gerente = new GerenteRRHH("Carlos", "carlos@mail.com", 3, new Normal());
//        Encargado ceo = new CEO("Laura", "laura@mail.com", 4, new Productivo());
//        Encargado rechazador = new Rechazador("Hugo", "hugo@mail.com", 5, new Normal());

        recepcionista.setSiguiente(supervisor);
        supervisor.setSiguiente(gerente);
        gerente.setSiguiente(ceo);
        ceo.setSiguiente(rechazador);

        return recepcionista;
    }


    private static ModoDeResolver modoRandom(){
        Random random = new Random();
        int opcion = random.nextInt(3);

        return switch (opcion){
            case 0 -> new Normal();
            case 1 -> new Vago();
            case 2 -> new Productivo();
            default -> new Normal();
        };
    }


}
