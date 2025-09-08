/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author u07880060103
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
        }
    }
    public static void limpar(JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            //instanceof
            if (componentes[i] instanceof JTextField){
            ((JTextField) componentes[i]).setText("");
            }
            else if (componentes[i] instanceof JComboBox){
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            }
            else if (componentes[i] instanceof JFormattedTextField){
                ((JFormattedTextField) componentes[i]).setText("");
            }
            else if (componentes[i] instanceof JCheckBox){
                ((JCheckBox) componentes[i]).setSelected(false);
            }
            else if (componentes[i] instanceof JPasswordField){
                ((JPasswordField) componentes[i]).setText("");
            }
        }
    }
    
    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
    public static boolean perguntar(String cad) {
        JOptionPane.showConfirmDialog(null, cad);
        return true;
    }
    public static int strToInt(String num){
        return Integer.valueOf(num);
    }
    public static String intToStr(int num){
        return String.valueOf(num);
    }
    public static double strToDouble(double num){
        return 0;
    }
    public static String doubleToStr(String num){
        return "";
    }
    public static Date strToDate(Date data){
        return null;
    }
    public static String dateToStr(String data){
        return "";
    }
}
