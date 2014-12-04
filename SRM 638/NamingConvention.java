import java.io.*;
import java.util.*;

public class NamingConvention {
	public String toCamelCase(String variableName) {
		return "";
	}

// CUT begin
	static void runTestcase(int __case) {
		switch (__case) {
			// Your custom testcase goes here
			case -1:
				//doTest(variableName, expected, __case);
				break;

			case 0: {
				String variableName = "sum_of_two_numbers";
				String __excepted = "sumOfTwoNumbers";
				doTest(variableName, __excepted, __case);
				break;
			}
			case 1: {
				String variableName = "variable";
				String __excepted = "variable";
				doTest(variableName, __excepted, __case);
				break;
			}
			case 2: {
				String variableName = "t_o_p_c_o_d_e_r";
				String __excepted = "tOPCODER";
				doTest(variableName, __excepted, __case);
				break;
			}
			case 3: {
				String variableName = "the_variable_name_can_be_very_long_like_this";
				String __excepted = "theVariableNameCanBeVeryLongLikeThis";
				doTest(variableName, __excepted, __case);
				break;
			}
			default: break;
		}
	}

	static void doTest(String variableName, String __expected, int caseNo) {
        variableName = new String(variableName);
		long startTime = System.currentTimeMillis();
		Throwable exception = null;
		NamingConvention instance = new NamingConvention();
		String __result = "";
		try {
			__result = instance.toCamelCase(variableName);
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
		System.err.println("NamingConvention (250 Points)");
		System.err.println();
		if (args.length == 0)
			for (int i = 0; i < nExample; ++i) runTestcase(i);
		else
			for (int i = 0; i < args.length; ++i) runTestcase(Integer.parseInt(args[i]));
		System.err.println(String.format("%nPassed : %d/%d cases", nPassed, nAll));

		int T = (int)(System.currentTimeMillis() / 1000) - 1417584106;
		double PT = T / 60.0, TT = 75.0;
		System.err.println(String.format("Time   : %d minutes %d secs%nScore  : %.2f points", T / 60, T % 60, 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))));
	}
// CUT end
}
