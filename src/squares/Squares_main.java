package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8 };
		double y[] = { 0.8, 1.7, 2.9, 3.4, 4.2, 5.5, 6.2, 7.8, 8.0 };
		double theta[] = new double[2];
		Squares_lib slib = new Squares_lib(x,y);

		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getRx());
		}
		System.out.println("—˜_’l:theta[0] = 9.3214, theta[1] = 0.7679");
	}

}
