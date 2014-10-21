package reversePolish;

public class SwitchOp {

	
public Operation switchOperation(int[]arr,char operator){
		
		switch(operator){
			case'+':return new PlusOperation(arr);
			case'-':return new MinusOperation(arr);
			case'*':return new Multiply(arr);
			case'/':return new Divide(arr);
			
		}
		return null;
			
	}
	
}
