package model;

import javax.swing.JOptionPane;

public class Gato extends Animal{
    private String genero;

    public Gato(String nombre,String identificacion,int numeroBigotes,String genero){
        super(nombre, identificacion, numeroBigotes);
        this.genero=genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public void hacerSonidos() {
        JOptionPane.showMessageDialog(null, "El gato maúlla: ¡Miauu!");
    }

}
