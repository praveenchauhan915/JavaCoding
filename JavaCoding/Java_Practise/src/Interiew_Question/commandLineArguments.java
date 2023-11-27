package Interiew_Question;

public class commandLineArguments {

	public static void main(String[] args) {
		if(args.length >0) {
			System.out.println("The command Line" + "arguments are:- ");
		
		for(String val :args) 
			System.out.println(val);
		}
		else {
			System.out.println("No command Line "+ "arguments found.");
		}
	}

}
