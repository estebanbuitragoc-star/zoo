package model;

import javax.swing.*;

public class Vaca extends Animal{
    private String color;

    public Vaca(String nombre,String identificacion,int numeroBigotes,String color){
        super(nombre, identificacion, numeroBigotes);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void hacerSonidos() {
        JOptionPane.showMessageDialog(null, "La vaca hace ¡Muuu!");
    }
}
