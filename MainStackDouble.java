
public class MainStackDouble {

	public static void main(double[] args) {
		StackDouble ku = new StackDouble();
		ku.cetak();
		
		ku.push(0.9); ku.cetak();
		ku.push(1.6);ku.cetak();
		ku.push(7.9); ku.cetak();
		ku.push(7.9);ku.cetak();
		
		double d0 = ku.pop();
		System.out.println(d0);
		ku.cetak();
		
		double d1 = ku.pop();
		System.out.println(d1);
		ku.cetak();
		
		double d2 = ku.pop();
		System.out.println(d2);
		ku.cetak();
		
		double d3 = ku.pop();
		System.out.println(d3);
		ku.cetak();
		
		double d9 = ku.pop();
		System.out.println(d9);
		ku.cetak();
		
		double d100 = ku.pop();
		System.out.println(d100);
		ku.cetak();

	}

}
