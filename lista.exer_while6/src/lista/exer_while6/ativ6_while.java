package lista.exer_while6;

import javax.swing.JOptionPane;

public class ativ6_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sl=0;
		int n1; 
		int ex=0; 
		int contador=0; 
		int salfin=0;
		int er=0;
		String res;
		
		do {
			n1=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de horas que você trabalhou "));
			sl=n1*10;
			contador++;
			
			if (n1>50) {
				ex = n1-50;
				er = ex*20;
				sl = 500;
				salfin=sl+er;
			}
			
			res=(JOptionPane.showInputDialog("Quer encerrar o programa? Digite S se quiser, e N se não quiser"));
		}	
			while(!res.equalsIgnoreCase("S")); {
				JOptionPane.showMessageDialog(null, "O seu salário é: " +sl);
				JOptionPane.showMessageDialog(null, "O seu salário final é: " +salfin);
				JOptionPane.showMessageDialog(null, "O valor excedente no seu salário é: " +er);
				
				
				
			}
		

	}

}
