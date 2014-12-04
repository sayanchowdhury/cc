import java.io.*;
import java.util.*;

public class GreaterGame {
	public double calc(int[] hand, int[] sothe) {
		return 0.0;
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(hand, sothe, expected, __case);
				break;

			case 0: {
				int hand[] = new int[] {
					4,
					2
				};
				int sothe[] = new int[] {
					-1,
					-1
				};
				double __excepted = 1.5;
				doTest(hand, sothe, __excepted, __case);
				break;
			}
			case 1: {
				int hand[] = new int[] {
					4,
					2
				};
				int sothe[] = new int[] {
					1,
					3
				};
				double __excepted = 2.0;
				doTest(hand, sothe, __excepted, __case);
				break;
			}
			case 2: {
				int hand[] = new int[] {
					2
				};
				int sothe[] = new int[] {
					-1
				};
				double __excepted = 1.0;
				doTest(hand, sothe, __excepted, __case);
				break;
			}
			case 3: {
				int hand[] = new int[] {
					1,
					3,
					5,
					7
				};
				int sothe[] = new int[] {
					8,
					-1,
					4,
					-1
				};
				double __excepted = 2.5;
				doTest(hand, sothe, __excepted, __case);
				break;
			}
			case 4: {
				int hand[] = new int[] {
					6,
					12,
					17,
					14,
					20,
					8,
					16,
					7,
					2,
					15
				};
				int sothe[] = new int[] {
					-1,
					-1,
					4,
					-1,
					11,
					3,
					13,
					-1,
					-1,
					18
				};
				double __excepted = 8.0;
				doTest(hand, sothe, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(int[] hand, int[] sothe, double __expected, int caseNo) {
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		GreaterGame instance = new GreaterGame();
		double __result = 0.0;
		try {
			__result = instance.calc(hand, sothe);
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

	static int nExample = 5;
	static int nAll = 0, nPassed = 0;

	static boolean doubleEquals(double a, double b) {
	    return !Double.isNaN(a) && !Double.isNaN(b) && Math.abs(b - a) <= 1e-9 * Math.max(1.0, Math.abs(a) );
	}

	public static void main(String[] args){
		System.err.println("GreaterGame (250 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1414439785;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
