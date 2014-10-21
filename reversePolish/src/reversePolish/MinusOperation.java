package reversePolish;

public class MinusOperation implements Operation {
	private int[] arguments;
	int result;

	public MinusOperation(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arguments = arr;
	}

	@Override
	public int execute() {
		
		for(int index=0;index<arguments.length;index++){
			if (index == 0) {
				result = arguments[index];
			}else {
				result -= arguments[index];
			}
		}
		System.out.println("The result is"+result);
		return result;
	}

}
