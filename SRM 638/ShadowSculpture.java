import java.io.*;
import java.util.*;

public class ShadowSculpture {
	public String possible(String[] XY, String[] YZ, String[] ZX) {
		return "";
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(XY, YZ, ZX, expected, __case);
				break;

			case 0: {
				String XY[] = new String[] {
					"YN",
					"NN"
				};
				String YZ[] = new String[] {
					"YN",
					"NN"
				};
				String ZX[] = new String[] {
					"YN",
					"NN"
				};
				String __excepted = "Possible";
				doTest(XY, YZ, ZX, __excepted, __case);
				break;
			}
			case 1: {
				String XY[] = new String[] {
					"YN",
					"NY"
				};
				String YZ[] = new String[] {
					"YN",
					"NY"
				};
				String ZX[] = new String[] {
					"YN",
					"NY"
				};
				String __excepted = "Impossible";
				doTest(XY, YZ, ZX, __excepted, __case);
				break;
			}
			case 2: {
				String XY[] = new String[] {
					"YYY",
					"YNY",
					"YYY"
				};
				String YZ[] = new String[] {
					"YYY",
					"YNY",
					"YYY"
				};
				String ZX[] = new String[] {
					"YYY",
					"YNY",
					"YYY"
				};
				String __excepted = "Possible";
				doTest(XY, YZ, ZX, __excepted, __case);
				break;
			}
			case 3: {
				String XY[] = new String[] {
					"YYY",
					"YNY",
					"YYY"
				};
				String YZ[] = new String[] {
					"NYY",
					"YNY",
					"YYY"
				};
				String ZX[] = new String[] {
					"YYY",
					"YNY",
					"YYN"
				};
				String __excepted = "Impossible";
				doTest(XY, YZ, ZX, __excepted, __case);
				break;
			}
			case 4: {
				String XY[] = new String[] {
					"N"
				};
				String YZ[] = new String[] {
					"N"
				};
				String ZX[] = new String[] {
					"N"
				};
				String __excepted = "Possible";
				doTest(XY, YZ, ZX, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(String[] XY, String[] YZ, String[] ZX, String __expected, int caseNo) {
		for (int i = 0; i < XY.length; i++) {
			XY[i] = new String(XY[i]);
		}
		for (int i = 0; i < YZ.length; i++) {
			YZ[i] = new String(YZ[i]);
		}
		for (int i = 0; i < ZX.length; i++) {
			ZX[i] = new String(ZX[i]);
		}
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		ShadowSculpture instance = new ShadowSculpture();
		String __result = "";
		try {
			__result = instance.possible(XY, YZ, ZX);
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
		System.err.println("ShadowSculpture (300 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1415772811;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 300 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
