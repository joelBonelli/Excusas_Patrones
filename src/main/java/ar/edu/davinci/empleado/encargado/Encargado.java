package ar.edu.davinci.empleado.encargado;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.modoDeResolver.IModoDeResolver;
import ar.edu.davinci.empleado.encargado.modoDeResolver.tipos.Normal;
import ar.edu.davinci.empleado.encargado.modoDeResolver.tipos.Vago;
import ar.edu.davinci.excusa.Excusa;


public abstract class Encargado extends Empleado implements ManejadorExcusas {
    private IModoDeResolver modoDeResolver;
    private ManejadorExcusas siguiente;

    public Encargado(String nombre, String email, int legajo, ManejadorExcusas siguiente) {
        super(nombre, email, legajo);
        this.siguiente = siguiente;
        this.modoDeResolver = new Vago();
    }

    @Override
    public ManejadorExcusas getSiguiente(){
        return siguiente;
    }

    @Override
    public void manejarExcusa(Excusa excusa){
        modoDeResolver.resolver(this, excusa);
    }

    @Override
    public void procesarExcusa(Excusa excusa){
        if (this.puedeManejar(excusa)) {
            this.ejecutarAccion(excusa);
        } else if (this.siguiente != null){
            this.siguiente.manejarExcusa(excusa);
        }
    }

    @Override
    public boolean puedeManejar(Excusa excusa) {
        return excusa.puedeSerManejaPor(this);
    }

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



}
