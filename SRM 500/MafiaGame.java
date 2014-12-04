import java.io.*;
import java.util.*;

public class MafiaGame {
	public double probabilityToLose(int N, int[] decisions) {
		return 0.0;
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(N, decisions, expected, __case);
				break;

			case 0: {
				int N = 3;
				int decisions[] = new int[] {
					1,
					1,
					1
				};
				double __excepted = 1.0;
				doTest(N, decisions, __excepted, __case);
				break;
			}
			case 1: {
				int N = 5;
				int decisions[] = new int[] {
					1,
					2,
					3
				};
				double __excepted = 0.0;
				doTest(N, decisions, __excepted, __case);
				break;
			}
			case 2: {
				int N = 20;
				int decisions[] = new int[] {
					1,
					2,
					3,
					4,
					5,
					6,
					7,
					1,
					2,
					3,
					4,
					5,
					6,
					7,
					18,
					19,
					0
				};
				double __excepted = 0.0;
				doTest(N, decisions, __excepted, __case);
				break;
			}
			case 3: {
				int N = 23;
				int decisions[] = new int[] {
					17,
					10,
					3,
					14,
					22,
					5,
					11,
					10,
					22,
					3,
					14,
					5,
					11,
					17
				};
				double __excepted = 0.14285714285714285;
				doTest(N, decisions, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(int N, int[] decisions, double __expected, int caseNo) {
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		MafiaGame instance = new MafiaGame();
		double __result = 0.0;
		try {
			__result = instance.probabilityToLose(N, decisions);
		}
		catch (Throwable e) { exception = e; }
		double elapsed = (System.currentTimeMillis() - startTime) / 1000.0;

		nAll++;
		System.err.print(String.format("  Testcase #%d ... ", caseNo));

		if (exception != null) {
			System.err.println("RUNTIME ERROR!");
			exception.printStackTrace();
		}
		else if (doubleEquals(__expected, __result)) {
			System.err.println("PASSED! " + String.format("(%.2f seconds)", elapsed));
			nPassed++;
		}
		else {
			System.err.println("FAILED! " + String.format("(%.2f seconds)", elapsed));
			System.err.println("           Expected: " + __expected);
			System.err.println("           Received: " + __result);
		}
	}

	static int nExample = 4;
	static int nAll = 0, nPassed = 0;

	static boolean doubleEquals(double a, double b) {
	    return !Double.isNaN(a) && !Double.isNaN(b) && Math.abs(b - a) <= 1e-9 * Math.max(1.0, Math.abs(a) );
	}

	public static void main(String[] args){
		System.err.println("MafiaGame (250 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1412653981;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
