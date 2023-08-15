package view;
import controller.funcMDC;

class Principal {

	public static void main(String[] args) {
		int n1 = 21;
		int n2 = 15;
		funcMDC fmdc = new funcMDC();
		
		int funcMDC = fmdc.MaxDiv(n1, n2);
		System.out.println(funcMDC);

	}

}
