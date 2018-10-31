
public class MainStackFloat {
	public static void main(Float[] args) {
		StackFloat ku = new StackFloat();
		ku.cetak();
		
		ku.push(2.5F); ku.cetak();
		ku.push(2.3F);ku.cetak();
		ku.push(8.9F); ku.cetak();
		ku.push(1.5F);ku.cetak();
		
		float d0 = (float) ku.pop();
		System.out.println(d0);
		ku.cetak();
		
		float d1 = (float) ku.pop();
		System.out.println(d1);
		ku.cetak();
		
		float d2 = (float) ku.pop();
		System.out.println(d2);
		ku.cetak();
		
		float d3 = (float) ku.pop();
		System.out.println(d3);
		ku.cetak();
		
		float d9 = (float) ku.pop();
		System.out.println(d9);
		ku.cetak();
		
		float d100 = (float) ku.pop();
		System.out.println(d100);
		ku.cetak();

	}

}
