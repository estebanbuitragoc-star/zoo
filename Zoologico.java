package model;
import java.util.ArrayList;
import java.util.Optional;
public class Zoologico {
    private String nombre;
    private ArrayList<Animal> listaAnimales;
    private ArrayList<Perro> listaPerros;
    private ArrayList<Vaca> listaVacas;

public Zoologico(String nombre){
    this.nombre=nombre;
    this.listaAnimales=new ArrayList<>();
    this.listaPerros=new ArrayList<>();
    this.listaVacas=new ArrayList<>();
}
public ArrayList<Vaca> getListaVacas() {
    return listaVacas;
}

public void setListaVacas(ArrayList<Vaca> listaVacas) {
    this.listaVacas = listaVacas;
}


public ArrayList<Animal> getListaAnimales() {
    return listaAnimales;
}

public void setListaAnimales(ArrayList<Animal> listaAnimales) {
    this.listaAnimales = listaAnimales;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public ArrayList<Perro> getListaPerros() {
    return listaPerros;
}

public void setListaPerros(ArrayList<Perro> listaPerros) {
    this.listaPerros = listaPerros;
}


public String registrarAnimal(Animal nuevoAnimal){
    String resultado="";
    if(buscarAnimal(nuevoAnimal.getIdentificacion()) ==null){
        listaAnimales.add(nuevoAnimal);
        resultado="El animal ha sido registrado correctamente";
    }else{
        resultado= "El Animal ya se encontraba registrado";
    }
    return resultado;
}

public Optional buscarAnimal(String identificacion){
    listaAnimales.stream().filter( animal -> animal.getIdentificacion().equals(identificacion)).
            findFirst();
    return Optional.empty();
}
    public void hacerSonidos(){

    }

}
