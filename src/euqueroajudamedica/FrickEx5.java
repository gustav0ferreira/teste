package euqueroajudamedica;

import javax.swing.JOptionPane;

public class FrickEx5 {
	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Coloque um número"));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Coloque outro número"));
		int C = Integer.parseInt(JOptionPane.showInputDialog("Coloque outro número"));
		if (A > B && A > C && B > C) {
			JOptionPane.showMessageDialog(null, A + " é o maior número");
			JOptionPane.showMessageDialog(null, C + " é o menor número");
		}
		else if (A > B && A > C && B < C) {
			JOptionPane.showMessageDialog(null, A + " é o maior número");
			JOptionPane.showMessageDialog(null, B + " é o menor número");
		}
		else if (B > A && B > C && A > C) {
			JOptionPane.showMessageDialog(null, B + " é o maior número");
			JOptionPane.showMessageDialog(null, C + " é o menor número");
		}
		else if (B > A && B > C && A < C) {
			JOptionPane.showMessageDialog(null, B + " é o maior número");
			JOptionPane.showMessageDialog(null, A + " é o menor número");
		}
		else if (C > A && C > B && A > B) {
				JOptionPane.showMessageDialog(null, C + " é o maior número");
				JOptionPane.showMessageDialog(null, B + " é o menor número");
			}
		else if (C > A && C > B && A < B) {
				JOptionPane.showMessageDialog(null, C + " é o maior número");
				JOptionPane.showMessageDialog(null, A + " é o menor número");
		}
	}

}
