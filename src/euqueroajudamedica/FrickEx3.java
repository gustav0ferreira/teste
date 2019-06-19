package euqueroajudamedica;

import javax.swing.JOptionPane;

public class FrickEx3 {
	public static void main( String[] args ) {
		int MCRX = Integer.parseInt(JOptionPane.showInputDialog("que dia é hj?"));
		switch (MCRX) {
		case 0:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Segundo-feira");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Terça-feira");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Quarta-feira");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quinta-feira");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Sexta-feira");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sabado");
			break;
		default:
			JOptionPane.showMessageDialog(null, "nao pode");
		}
		
	}

}
