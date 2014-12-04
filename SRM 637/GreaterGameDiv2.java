import java.io.*;
import java.util.*;

public class GreaterGameDiv2 {
	public int calc(int[] snuke, int[] sothe) {
		return 0;
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(snuke, sothe, expected, __case);
				break;

			case 0: {
				int snuke[] = new int[] {
					1,
					3
				};
				int sothe[] = new int[] {
					4,
					2
				};
				int __excepted = 1;
				doTest(snuke, sothe, __excepted, __case);
				break;
			}
			case 1: {
				int snuke[] = new int[] {
					1,
					3,
					5,
					7,
					9
				};
				int sothe[] = new int[] {
					2,
					4,
					6,
					8,
					10
				};
				int __excepted = 0;
				doTest(snuke, sothe, __excepted, __case);
				break;
			}
			case 2: {
				int snuke[] = new int[] {
					2
				};
				int sothe[] = new int[] {
					1
				};
				int __excepted = 1;
				doTest(snuke, sothe, __excepted, __case);
				break;
			}
			case 3: {
				int snuke[] = new int[] {
					3,
					5,
					9,
					16,
					14,
					20,
					15,
					17,
					13,
					2
				};
				int sothe[] = new int[] {
					6,
					18,
					1,
					8,
					7,
					10,
					11,
					19,
					12,
					4
				};
				int __excepted = 6;
				doTest(snuke, sothe, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(int[] snuke, int[] sothe, int __expected, int caseNo) {
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		GreaterGameDiv2 instance = new GreaterGameDiv2();
		int __result = 0;
		try {
			__result = instance.calc(snuke, sothe);
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

	static int nExample = 4;
	static int nAll = 0, nPassed = 0;

	public static void main(String[] args){
		System.err.println("GreaterGameDiv2 (250 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1414525383;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
