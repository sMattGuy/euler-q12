import java.math.*;
public class TriangleNumbers{
	public static void main(String[] args){
		int current = 0;
		try{
			current = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid Number entered:"+args[0]);
			return;
		}
		while(true){
			int workingNum = 0;
			for(int x=0;x<current;x++){
				workingNum+=x;
			}
			
			int factorCount = 0;
			for(int i=1;i<=Math.sqrt(workingNum);i++){
				if(workingNum%i==0)
					factorCount+=2;
			}
			
			if(factorCount>=500){
				System.out.println("\nDone!\nThe Answer is:"+workingNum);
				return;
			}
			current++;
			System.out.print("Progress:"+current+"\r");
		}
	}
}