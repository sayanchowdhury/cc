import java.io.*;
import java.util.*;

public class ChocolateDividingEasy {
	public int findBest(String[] chocolate) {
		return 0;
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(chocolate, expected, __case);
				break;

			case 0: {
				String chocolate[] = new String[] {
					"9768",
					"6767",
					"5313"
				};
				int __excepted = 3;
				doTest(chocolate, __excepted, __case);
				break;
			}
			case 1: {
				String chocolate[] = new String[] {
					"36753562",
					"91270936",
					"06261879",
					"20237592",
					"28973612",
					"93194784"
				};
				int __excepted = 15;
				doTest(chocolate, __excepted, __case);
				break;
			}
			case 2: {
				String chocolate[] = new String[] {
					"012",
					"345",
					"678"
				};
				int __excepted = 0;
				doTest(chocolate, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(String[] chocolate, int __expected, int caseNo) {
		for (int i = 0; i < chocolate.length; i++) {
			chocolate[i] = new String(chocolate[i]);
		}
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		ChocolateDividingEasy instance = new ChocolateDividingEasy();
		int __result = 0;
		try {
			__result = instance.findBest(chocolate);
		}
		catch (Throwable e) { exception = e; }
		double elapsed = (System.currentTimeMillis() - startTime) / 1000.0;

		nAll++;
		System.err.print(String.format("  Testcase #%d ... ", caseNo));

		if (exception != null) {
			System.err.println("RUNTIME ERROR!");
			exception.printStackTrace();
		}
		else if (__result == __expected) {
			System.err.println("PASSED! " + String.format("(%.2f seconds)", elapsed));
			nPassed++;
		}
		else {
			System.err.println("FAILED! " + String.format("(%.2f seconds)", elapsed));
			System.err.println("           Expected: " + __expected);
			System.err.println("           Received: " + __result);
		}
	}

	static int nExample = 3;
	static int nAll = 0, nPassed = 0;

	public static void main(String[] args){
		System.err.println("ChocolateDividingEasy (250 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1415535705;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
