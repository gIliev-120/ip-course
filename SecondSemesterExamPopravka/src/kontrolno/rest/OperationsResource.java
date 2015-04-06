package kontrolno.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import kontrolno.model.Operation;



@Path("operations")
public class OperationsResource {
	int res =0;
	String expr="";
		@GET
		@Path("{operation}/{firstNumber}/{secondNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Operation ope(@PathParam(value = "operation") String operation,@PathParam(value = "firstNumber") String firstNumber,@PathParam(value = "secondNumber") String secondNumber){
				
				switch(operation){
				case "add":
				res=Integer.parseInt(firstNumber)+Integer.parseInt(secondNumber);
				expr=firstNumber.toString()+"+"+secondNumber.toString();
				break;
				case "mul":
				res=Integer.parseInt(firstNumber)*Integer.parseInt(secondNumber);
				expr=firstNumber.toString()+"*"+secondNumber.toString();
				break;
				case "sub":
				res=Integer.parseInt(firstNumber)-Integer.parseInt(secondNumber);
				expr=firstNumber.toString()+"-"+secondNumber.toString();
				break;
				}
				Operation ope = new Operation();
				System.out.println(res);
				ope.setResult(res);
				ope.setExpr(expr);
			return ope;
		}
}
