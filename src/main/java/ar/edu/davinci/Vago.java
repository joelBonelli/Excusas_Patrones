package ar.edu.davinci;

public class Vago extends ModoDeResolver {

    @Override
    public void resolver(Encargado encargado, Excusa excusa) {

        if(encargado.getSiguiente() !=null){
            encargado.getSiguiente().manejarExcusa(excusa);
        }
    }
}
