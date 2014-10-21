package reversePolish;

public class PlusOperation implements Operation {
	private int[] arguments;
	int sum = 0;

	public PlusOperation(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arguments = arr;
	}

	@Override
	public int execute() {

		for(int index=0;index<arguments.length;index++){
			if (index == 0) {
				sum= arguments[index];
			}else {
				sum-= arguments[index];
			}
		}
		
		System.out.println("The result is"+sum);
		return sum;
	}

}
