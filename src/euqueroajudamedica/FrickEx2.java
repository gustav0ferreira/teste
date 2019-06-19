package euqueroajudamedica;

import javax.swing.JOptionPane;

public class FrickEx2 {
	public static void main( String[] args ) {
		double A = Double.parseDouble(JOptionPane.showInputDialog("Coloque um numero"));
		float killlakill = (float) A;
		if(killlakill > 1.99 && killlakill < 5.99) {
			JOptionPane.showMessageDialog(null, "seu número está entre 1.99 e 5.99");
		}
		else {
			JOptionPane.showMessageDialog(null, "nao");
		}
		
	}
	

}
