/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico1leonardo;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float haciendatotal = 0, montototal;
        String Cursos = JOptionPane.showInputDialog("Digite la cantidad de cursos");
        
        for (int x = 0; x < Integer.parseInt(Cursos); x++) {

            String curso = JOptionPane.showInputDialog("Ingrese el nombre del curso #" + (x + 1));
            
            montototal = Float.parseFloat(JOptionPane.showInputDialog("Monto del curso " + curso));
            
            haciendatotal += (montototal*0.02);
        }
        
        JOptionPane.showMessageDialog(null, "El profesor deberá pagar a hacienda el monto de " + haciendatotal + " colones");
    }
}