import java.util.ArrayList;
public class StackString {
	ArrayList<String> container = new ArrayList<String>();
	int top = -1;
	public void push(String value) {
		top = top + 1 ;
		//top++;
		container.add(top, value);
	}
	public String pop() {
		String value = "KOSONG NERT";
		if(top>-1) {
			value = container.get(top);
			container.remove(top);
			top--; 
			//top = top-1;
		}
		return value ;
	}
	
	public void cetak() {
		System.out.println("TOP: "+top+" # CONTAINER: "+container.toString());
	}
}
