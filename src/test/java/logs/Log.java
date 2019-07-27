package logs;
import org.apache.log4j.Logger;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName()); 
	
	public static void startTestCase(String sTestCaseName){
		Log.info("Starting the Test case");
	}


	public static void endTestCase(String sTestCaseName){
		Log.info("Ending the Test Case");
	}

	public static void info(String message)
	{
		Log.info(message);
	}

}