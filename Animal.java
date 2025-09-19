package model;


public abstract class Animal {

    private String nombre;
    private String identificacion;
    private int numeroBigotes;

    public Animal(String nombre,String identificacion,int numeroBigotes){

        this.nombre=nombre;
        this.identificacion=identificacion;
        this.numeroBigotes=numeroBigotes;
    }

    public int getNumeroBigotes() {
        return numeroBigotes;
    }

    public void setNumeroBigotes(int numeroBigotes) {
        this.numeroBigotes = numeroBigotes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public abstract void hacerSonidos();
}



