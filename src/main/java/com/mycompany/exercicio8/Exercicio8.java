

package com.mycompany.exercicio8;

/**
 *
 * @author rafae
 */
import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        int numero1;
              numero1 = Integer.parseInt (JOptionPane.showInputDialog("Digite um primeiro número: "));
        int numero2;
              numero2 = Integer.parseInt (JOptionPane.showInputDialog("Digite um segundo número: "));
        int soma;
         soma =  numero1 + numero2;
         JOptionPane.showMessageDialog(null, "Sua soma dá: " + soma);
    }
}
