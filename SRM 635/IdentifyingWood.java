import java.io.*;
import java.util.*;

public class IdentifyingWood {
	public String check(String s, String t) {
		return "";
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(s, t, expected, __case);
				break;

			case 0: {
				String s = "absdefgh";
				String t = "asdf";
				String __excepted = "Yep, it's wood.";
				doTest(s, t, __excepted, __case);
				break;
			}
			case 1: {
				String s = "oxoxoxox";
				String t = "ooxxoo";
				String __excepted = "Nope.";
				doTest(s, t, __excepted, __case);
				break;
			}
			case 2: {
				String s = "oxoxoxox";
				String t = "xxx";
				String __excepted = "Yep, it's wood.";
				doTest(s, t, __excepted, __case);
				break;
			}
			case 3: {
				String s = "qwerty";
				String t = "qwerty";
				String __excepted = "Yep, it's wood.";
				doTest(s, t, __excepted, __case);
				break;
			}
			case 4: {
				String s = "string";
				String t = "longstring";
				String __excepted = "Nope.";
				doTest(s, t, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(String s, String t, String __expected, int caseNo) {
        s = new String(s);
        t = new String(t);
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		IdentifyingWood instance = new IdentifyingWood();
		String __result = "";
		try {
			__result = instance.check(s, t);
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

	static int nExample = 5;
	static int nAll = 0, nPassed = 0;

	public static void main(String[] args){
		System.err.println("IdentifyingWood (250 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1417202967;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
