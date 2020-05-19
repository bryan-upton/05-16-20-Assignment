package AssignmentPackage;

public class AsteriskLogger implements Logger {


	@Override
	public void log(String log) {
		// 4)
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		// 5)
		System.out.println("\n*****************" + "\n***" + "ERROR:" + error + "***" + "\n*****************");
	}

}
