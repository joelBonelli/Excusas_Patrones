package ar.edu.davinci;

public class Normal extends ModoDeResolver {


    @Override
    public void resolver(Encargado encargado, Excusa excusa) {
        encargado.procesarExcusa(excusa);
    }
}
