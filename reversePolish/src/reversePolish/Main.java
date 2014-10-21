package reversePolish;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> input = new Stack<String>();
		Stack<String> calcNums = new Stack<String>();
		String stackElemnt;
		for (int i = args.length - 1; i >= 0; i--) {
			input.push(args[i]);
		}

		while (input.size() != 0) {
			stackElemnt = input.pop();
			if (stackElemnt.equals("+") || stackElemnt.equals("-")
					|| stackElemnt.equals("*") || stackElemnt.equals("/")) {

				int[] nums = new int[2];
				nums[0] = Integer.parseInt(calcNums.pop());
				nums[1] = Integer.parseInt(calcNums.pop());
				SwitchOp sw = new SwitchOp();
				sw.switchOperation(nums, stackElemnt.charAt(0)).execute();

			} else {
				calcNums.push(stackElemnt);

			}

		}

	}
}
