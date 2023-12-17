package reports;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.Reporter;

public class Loggers {
	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void logTheTest(String msg) {
		logger.log(Level.INFO, msg); // it helps to print in console
		Reporter.log(msg + "<br>"); // from extent report

	}
}
