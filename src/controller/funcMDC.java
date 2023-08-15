package controller;

public class funcMDC {

	public funcMDC() {
		super();
	}
	public int MaxDiv(int a, int b) {
		if (b ==0) {
			return a;
		} else {
			return MaxDiv(b, a % b);
		}
	}
}
