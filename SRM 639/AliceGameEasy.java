import java.io.*;
import java.util.*;

public class AliceGameEasy {
	public long findMinimumValue(long x, long y) {
		return 0;
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(x, y, expected, __case);
				break;

			case 0: {
				long x = 7L;
				long y = 14L;
				long __excepted = 2L;
				doTest(x, y, __excepted, __case);
				break;
			}
			case 1: {
				long x = 10L;
				long y = 0L;
				long __excepted = 4L;
				doTest(x, y, __excepted, __case);
				break;
			}
			case 2: {
				long x = 932599670050L;
				long y = 67400241741L;
				long __excepted = 1047062L;
				doTest(x, y, __excepted, __case);
				break;
			}
			case 3: {
				long x = 7L;
				long y = 13L;
				long __excepted = -1L;
				doTest(x, y, __excepted, __case);
				break;
			}
			case 4: {
				long x = 0L;
				long y = 0L;
				long __excepted = 0L;
				doTest(x, y, __excepted, __case);
				break;
			}
			case 5: {
				long x = 100000L;
				long y = 400500L;
				long __excepted = 106L;
				doTest(x, y, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(long x, long y, long __expected, int caseNo) {
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		AliceGameEasy instance = new AliceGameEasy();
		long __result = 0;
		try {
			__result = instance.findMinimumValue(x, y);
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

	static int nExample = 6;
	static int nAll = 0, nPassed = 0;

	public static void main(String[] args){
		System.err.println("AliceGameEasy (500 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1417582681;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 500 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
