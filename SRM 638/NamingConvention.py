#-*- coding: utf-8 -*-

from collections import defaultdict

class NamingConvention:
    def toCamelCase(self, variableName):
        variableName = variableName.split('_')
        if len(variableName) == 1:
            return variableName[0]
        camelCase = [i.capitalize() for i in variableName[1:]]
        camelCase.insert(0, variableName[0])
        return ''.join(camelCase)

# CUT begin
# TEST CODE FOR PYTHON {{{
import sys, time, math

def tc_equal(expected, received):
    try:
        _t = type(expected)
        received = _t(received)
        if _t == list or _t == tuple:
            if len(expected) != len(received): return False
            return all(tc_equal(e, r) for (e, r) in zip(expected, received))
        elif _t == float:
            eps = 1e-9
            d = abs(received - expected)
            return not math.isnan(received) and not math.isnan(expected) and d <= eps * max(1.0, abs(expected))
        else:
            return expected == received
    except:
        return False

def pretty_str(x):
    if type(x) == str:
        return '"%s"' % x
    elif type(x) == tuple:
        return '(%s)' % (','.join( (pretty_str(y) for y in x) ) )
    else:
        return str(x)
        
def do_test(variableName, __expected, caseNo):
    sys.stdout.write("  Testcase #%d ... " % caseNo)

    startTime = time.time()
    instance = NamingConvention()
    exception = None
    try:
        __result = instance.toCamelCase(variableName);
    except:
        import traceback
        exception = traceback.format_exc()
    elapsed = time.time() - startTime   # in sec

    if exception is not None:
        sys.stdout.write("RUNTIME ERROR: \n")
        sys.stdout.write(exception + "\n")
        return 0

    if tc_equal(__expected, __result):
        sys.stdout.write("PASSED! " + ("(%.3f seconds)" % elapsed) + "\n")
        return 1
    else:
        sys.stdout.write("FAILED! " + ("(%.3f seconds)" % elapsed) + "\n")
        sys.stdout.write("           Expected: " + pretty_str(__expected) + "\n")
        sys.stdout.write("           Received: " + pretty_str(__result) + "\n")
        return 0

def run_testcase(__no):
    if __no == 0:
        variableName = "sum_of_two_numbers"
        __expected = "sumOfTwoNumbers"
        # run the code
        return do_test (variableName, __expected, __no)

    if __no == 1:
        variableName = "variable"
        __expected = "variable"
        # run the code
        return do_test (variableName, __expected, __no)

    if __no == 2:
        variableName = "t_o_p_c_o_d_e_r"
        __expected = "tOPCODER"
        # run the code
        return do_test (variableName, __expected, __no)

    if __no == 3:
        variableName = "the_variable_name_can_be_very_long_like_this"
        __expected = "theVariableNameCanBeVeryLongLikeThis"
        # run the code
        return do_test (variableName, __expected, __no)

    # Your custom testcase goes here
    if __no == 4:
        return -1

def run_tests():
    sys.stdout.write("NamingConvention (250 Points)\n\n")

    nPassed = nAll = 0
    if len(sys.argv) <= 1:
        for i in range(4 + 100):
            nRetcode = run_testcase (i)
            if (nRetcode == -1): break
            nAll += 1
            nPassed += nRetcode;
    else:
        for arg in sys.argv[1:]:
            nAll += 1
            nPassed += run_testcase(int(arg))

    sys.stdout.write("\nPassed : %d / %d cases\n" % (nPassed, nAll))

    T = time.time() - 1417584113
    PT, TT = (T / 60.0, 75.0)
    points = 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))
    sys.stdout.write("Time   : %d minutes %d secs\n" % (int(T/60), T%60))
    sys.stdout.write("Score  : %.2f points\n" % points)

if __name__ == '__main__':
    run_tests()

# }}}
# CUT end
