
/**
 *
 * @author Rifki Maulana
 */

import javax.swing.*;

public class Segitiga {
    public static void main (String args []) {
        
        // Inisialisasi Variable
        double alas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan Nilai Alas Segitiga!"));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog(null," Masukan Nilai Tinggi Segitiga"));
        
        // Rumus Untuk Luas Segitiga
        double Luas = (1*(alas*tinggi))/2;
        
        //Output
        JOptionPane.showMessageDialog(null, "Nilai Luas Segitiga Adalah " + Luas);
        
    }
}
