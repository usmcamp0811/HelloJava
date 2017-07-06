import java.util.Scanner;


class MultipleClassesMain {
	public static void main(String[] args) {
		
		MultipleClasses multiClassObject = new MultipleClasses();
		multiClassObject.simpleMessage();
		
		ManyMethods manyMethodsObject = new ManyMethods("Tony");
		
		Scanner input = new Scanner(System.in);
		MethodsParameters methParam = new MethodsParameters ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		methParam.simpleMessage(name);
		
		System.out.println("Enter name of first gf here:");
		String temp = input.nextLine();

		if (temp.equals("Candace")){
			System.out.println("That's your wife!");
		}else{manyMethodsObject.setName(temp);
		}
		manyMethodsObject.saying();
		
	}
}
