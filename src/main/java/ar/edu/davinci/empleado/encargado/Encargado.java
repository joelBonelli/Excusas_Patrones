package ar.edu.davinci.empleado.encargado;

import ar.edu.davinci.empleado.Empleado;
import ar.edu.davinci.empleado.encargado.modoDeResolver.ModoDeResolver;
import ar.edu.davinci.empleado.encargado.modoDeResolver.tipos.Normal;
import ar.edu.davinci.empleado.encargado.modoDeResolver.tipos.Productivo;
import ar.edu.davinci.empleado.encargado.modoDeResolver.tipos.Vago;
import ar.edu.davinci.excusa.Excusa;


public abstract class Encargado extends Empleado implements ManejadorExcusas {

    private ModoDeResolver modoDeResolver;
    private Encargado siguiente;

    // Primer constructor para los encargados que tiene un tipo ENCARGADO como siguiente
    public Encargado(String nombre, String email, int legajo, Encargado siguiente) {
        super(nombre, email, legajo);
        this.siguiente = siguiente;
        this.modoDeResolver = new Normal();
    }

    // Constructor para los encargados que NO TIENE siguiente, como CEO, que tiene un RECHAZADOR
    public Encargado(String nombre, String email, int legajo) {
        super(nombre, email, legajo);
        this.modoDeResolver = new Normal();
    }

    @Override
    public void manejarExcusa(Excusa excusa){
        modoDeResolver.resolver(this, excusa);
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






 //   public static Encargado crearCadenaEncargados() {
//        Encargado recepcionista = new Recepcionista("Ana", "ana@mail.com", 1);
//        Encargado supervisor = new SupervisorDeArea("Luis", "luis@mail.com", 2);
//        Encargado gerente = new GerenteRRHH("Carlos", "carlos@mail.com", 3);
//        Encargado ceo = new CEO("Laura", "laura@mail.com", 4);
//        Encargado rechazador = new Rechazador("Hugo", "hugo@mail.com", 5);

//        Encargado recepcionista = new Recepcionista("Ana", "ana@mail.com", 1, new Normal());
//        Encargado supervisor = new SupervisorDeArea("Luis", "luis@mail.com", 2, new Normal());
//        Encargado gerente = new GerenteRRHH("Carlos", "carlos@mail.com", 3, new Normal());
//        Encargado ceo = new CEO("Laura", "laura@mail.com", 4, new Productivo());
//        Encargado rechazador = new Rechazador("Hugo", "hugo@mail.com", 5, new Normal());

//        recepcionista.setSiguiente(supervisor);
//        supervisor.setSiguiente(gerente);
//        gerente.setSiguiente(ceo);
//        ceo.setSiguiente(rechazador);
//
//        return recepcionista;
//    }


//    private static ModoDeResolver modoRandom(){
//        Random random = new Random();
//        int opcion = random.nextInt(3);
//
//        return switch (opcion){
//            case 0 -> new Normal();
//            case 1 -> new Vago();
//            case 2 -> new Productivo();
//            default -> new Normal();
//        };


}
