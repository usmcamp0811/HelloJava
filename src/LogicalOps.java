
public class LogicalOps {
	public static void main(String args[]){
		int boy, girl;
		boy = 18;
		girl = 68;
		
		//if (boy > 10 && girl < 60){
		//	System.out.println("You can enter");
		//}else{
		//	System.out.println("You are too young");
		//}
		if (boy > 10 || girl < 60){
			System.out.println("You can enter");		
		}else{
			System.out.println("You are too young");
		}
	}
}
