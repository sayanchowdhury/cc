import java.io.*;
import java.util.*;

public class SRMCards {
	public int maxTurns(int[] cards) {
		return 0;
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(cards, expected, __case);
				break;

			case 0: {
				int cards[] = new int[] {
					498,
					499
				};
				int __excepted = 1;
				doTest(cards, __excepted, __case);
				break;
			}
			case 1: {
				int cards[] = new int[] {
					491,
					492,
					495,
					497,
					498,
					499
				};
				int __excepted = 4;
				doTest(cards, __excepted, __case);
				break;
			}
			case 2: {
				int cards[] = new int[] {
					100,
					200,
					300,
					400
				};
				int __excepted = 4;
				doTest(cards, __excepted, __case);
				break;
			}
			case 3: {
				int cards[] = new int[] {
					11,
					12,
					102,
					13,
					100,
					101,
					99,
					9,
					8,
					1
				};
				int __excepted = 6;
				doTest(cards, __excepted, __case);
				break;
			}
			case 4: {
				int cards[] = new int[] {
					118,
					321,
					322,
					119,
					120,
					320
				};
				int __excepted = 4;
				doTest(cards, __excepted, __case);
				break;
			}
			case 5: {
				int cards[] = new int[] {
					10,
					11,
					12,
					13,
					14,
					1,
					2,
					3,
					4,
					5,
					6,
					7,
					8,
					9
				};
				int __excepted = 7;
				doTest(cards, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(int[] cards, int __expected, int caseNo) {
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		SRMCards instance = new SRMCards();
		int __result = 0;
		try {
			__result = instance.maxTurns(cards);
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
		System.err.println("SRMCards (250 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1411495231;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
