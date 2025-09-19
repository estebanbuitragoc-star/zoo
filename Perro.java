package model;
import javax.swing.JOptionPane;


public class Perro extends Animal{
    private String raza;

    public Perro(String nombre,String identificacion,int numeroBigotes,String raza){
        super(nombre, identificacion, numeroBigotes);
        this.raza=raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    @Override
    public void hacerSonidos() {
        JOptionPane.showMessageDialog(null, "El perro ladra: ¡Guau!");
    }
}
