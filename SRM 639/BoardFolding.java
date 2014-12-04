import java.io.*;
import java.util.*;

public class BoardFolding {
	public int howMany(int N, int M, String[] compressedPaper) {
		return 0;
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(N, M, compressedPaper, expected, __case);
				break;

			case 0: {
				int N = 2;
				int M = 2;
				String compressedPaper[] = new String[] {
					"1",
					"3"
				};
				int __excepted = 1;
				doTest(N, M, compressedPaper, __excepted, __case);
				break;
			}
			case 1: {
				int N = 2;
				int M = 7;
				String compressedPaper[] = new String[] {
					"@@",
					"@@"
				};
				int __excepted = 84;
				doTest(N, M, compressedPaper, __excepted, __case);
				break;
			}
			case 2: {
				int N = 4;
				int M = 4;
				String compressedPaper[] = new String[] {
					"6",
					"9",
					"9",
					"6"
				};
				int __excepted = 9;
				doTest(N, M, compressedPaper, __excepted, __case);
				break;
			}
			case 3: {
				int N = 6;
				int M = 1;
				String compressedPaper[] = new String[] {
					"0",
					"2",
					"6",
					"@",
					"4",
					"A"
				};
				int __excepted = 6;
				doTest(N, M, compressedPaper, __excepted, __case);
				break;
			}
			case 4: {
				int N = 3;
				int M = 3;
				String compressedPaper[] = new String[] {
					"0",
					"2",
					"0"
				};
				int __excepted = 1;
				doTest(N, M, compressedPaper, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(int N, int M, String[] compressedPaper, int __expected, int caseNo) {
		for (int i = 0; i < compressedPaper.length; i++) {
			compressedPaper[i] = new String(compressedPaper[i]);
		}
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		BoardFolding instance = new BoardFolding();
		int __result = 0;
		try {
			__result = instance.howMany(N, M, compressedPaper);
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

	static int nExample = 5;
	static int nAll = 0, nPassed = 0;

	public static void main(String[] args){
		System.err.println("BoardFolding (500 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1417582650;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 500 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
