import javax.swing.*;

public class Ejercicio1While {
    public static void main(String[] args) {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

        while(numero>=0){ //Mientras el número sea 0 o positivo
            cuadrado = (int)Math.pow(numero,2);

            JOptionPane.showMessageDialog(null, "El número " + numero + "elevador al cuadrado es " +cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número: "));
        }
    }
}
