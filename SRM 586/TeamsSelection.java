import java.io.*;
import java.util.*;

public class TeamsSelection {
	public String simulate(int[] preference1, int[] preference2) {
		return "";
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(preference1, preference2, expected, __case);
				break;

			case 0: {
				int preference1[] = new int[] {
					1,
					2,
					3,
					4
				};
				int preference2[] = new int[] {
					1,
					2,
					3,
					4
				};
				String __excepted = "1212";
				doTest(preference1, preference2, __excepted, __case);
				break;
			}
			case 1: {
				int preference1[] = new int[] {
					3,
					2,
					1
				};
				int preference2[] = new int[] {
					1,
					3,
					2
				};
				String __excepted = "211";
				doTest(preference1, preference2, __excepted, __case);
				break;
			}
			case 2: {
				int preference1[] = new int[] {
					6,
					1,
					5,
					2,
					3,
					4
				};
				int preference2[] = new int[] {
					1,
					6,
					3,
					4,
					5,
					2
				};
				String __excepted = "212211";
				doTest(preference1, preference2, __excepted, __case);
				break;
			}
			case 3: {
				int preference1[] = new int[] {
					8,
					7,
					1,
					2,
					4,
					5,
					6,
					3,
					9
				};
				int preference2[] = new int[] {
					7,
					2,
					4,
					8,
					1,
					5,
					9,
					6,
					3
				};
				String __excepted = "121121212";
				doTest(preference1, preference2, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(int[] preference1, int[] preference2, String __expected, int caseNo) {
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		TeamsSelection instance = new TeamsSelection();
		String __result = "";
		try {
			__result = instance.simulate(preference1, preference2);
		}
		catch (Throwable e) { exception = e; }
		double elapsed = (System.currentTimeMillis() - startTime) / 1000.0;

		nAll++;
		System.err.print(String.format("  Testcase #%d ... ", caseNo));

		if (exception != null) {
			System.err.println("RUNTIME ERROR!");
			exception.printStackTrace();
		}
		else if (__expected.equals(__result)) {
			System.err.println("PASSED! " + String.format("(%.2f seconds)", elapsed));
			nPassed++;
		}
		else {
			System.err.println("FAILED! " + String.format("(%.2f seconds)", elapsed));
			System.err.println("           Expected: " + "\"" + __expected + "\"");
			System.err.println("           Received: " + "\"" + __result + "\"");
		}
	}

	static int nExample = 4;
	static int nAll = 0, nPassed = 0;

	public static void main(String[] args){
		System.err.println("TeamsSelection (250 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1414525215;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
