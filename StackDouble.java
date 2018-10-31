import java.util.ArrayList;
public class StackDouble {
	ArrayList<Double> container = new ArrayList<Double>();
	int top = -1;
	public void push(double value) {
		top = top + 1 ;
		//top++;
		container.add(top, value);
	}
	public double pop() {
		double value = 0.97;
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


