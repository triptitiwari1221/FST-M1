package activities;

class CustomException extends Exception
{
	private String message = null;
	CustomException(String message){
		this.message = message;
	}

	@Override
	public String getMessage()
	{
		return message;
	}
	
}

public class Activity8 {
	
	static void exceptionTest(String message) throws CustomException {
		if(message==null)
		{
			throw new CustomException("String is null");
		}
		else
		{
			System.out.println(message);
		}
		
	}

	public static void main(String[] args) {
		
		try {
			Activity8.exceptionTest("Hello!");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("Won't execute");
		}
		catch(CustomException mae){
			 System.out.println("Inside catch block: " + mae.getMessage());
		}
	}

}
