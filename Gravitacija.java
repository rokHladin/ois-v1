public class Gravitacija {

	private static final double M = 5.972e24; //masa Zemlje
	private static final double G = 6.674e-11; //gravitacijska konstanta
	private static final double r = 6.371e6; //radij Zemlje

	public static void main(String[] args) {
		System.out.println("OIS je zakon!");
	}

	//
	// funkcija vrača gravitacijski pospešek (g) na podani nadmorski višini (nv)
	//
	public static double g(double nv) {
		return (G*M)/(Math.pow(r+nv, 2));
	}


}