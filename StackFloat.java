import java.util.ArrayList;
public class StackFloat {
	ArrayList<Float> container = new ArrayList<Float>();
	int top = -1;
	public void push(Float value) {
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
	public void push(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}




