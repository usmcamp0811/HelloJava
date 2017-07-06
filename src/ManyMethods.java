public class ManyMethods {
	private String girlName;
	
	public ManyMethods(String name){
		girlName=name;
	}
	public void setName(String name){
		girlName=name;
	}
	public String getName(){
		return girlName;
		
	}
	public void saying(){
		System.out.printf("Your fist girlfriend was %s:", getName());
			
	}
}
