
public class MainStackString {

	public static void main(String[] args) {
		StackString kur = new StackString();
		kur.cetak();
		
		kur.push("Alfandhy"); kur.cetak();
		kur.push("Fandhy");kur.cetak();
		kur.push("Andhy"); kur.cetak();
		kur.push("Alva");kur.cetak();
		
		String d0 = kur.pop();
		System.out.println(d0);
		kur.cetak();
		
		String d1 = kur.pop();
		System.out.println(d1);
		kur.cetak();
		
		String d2 = kur.pop();
		System.out.println(d2);
		kur.cetak();
		
		String d3 = kur.pop();
		System.out.println(d3);
		kur.cetak();
		
		String d9 = kur.pop();
		System.out.println(d9);
		kur.cetak();
		
		String d100 = kur.pop();
		System.out.println(d100);
		kur.cetak();

	}

}
