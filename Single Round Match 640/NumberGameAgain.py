#-*- coding: utf-8 -*-

from collections import defaultdict

class NumberGameAgain:
    def solve(self, k, table):
        return 0

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
        
def do_test(k, table, __expected, caseNo):
    sys.stdout.write("  Testcase #%d ... " % caseNo)

    startTime = time.time()
    instance = NumberGameAgain()
    exception = None
    try:
        __result = instance.solve(k, table);
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
        k = 3
        table = ( 2, 4, 6 ,)
        __expected = 2
        # run the code
        return do_test (k, table, __expected, __no)

    if __no == 1:
        k = 5
        table = ( 2, 3 ,)
        __expected = 0
        # run the code
        return do_test (k, table, __expected, __no)

    if __no == 2:
        k = 5
        table = ( ,)
        __expected = 30
        # run the code
        return do_test (k, table, __expected, __no)

    if __no == 3:
        k = 40
        table = ( 2, 4, 8, 16, 32141531, 2324577, 1099511627775, 2222222222, 33333333333, 4444444444, 2135 ,)
        __expected = 549755748288
        # run the code
        return do_test (k, table, __expected, __no)

    if __no == 4:
        k = 40
        table = ( ,)
        __expected = 1099511627774
        # run the code
        return do_test (k, table, __expected, __no)

    # Your custom testcase goes here
    if __no == 5:
        return -1

def run_tests():
    sys.stdout.write("NumberGameAgain (600 Points)\n\n")

    nPassed = nAll = 0
    if len(sys.argv) <= 1:
        for i in range(5 + 100):
            nRetcode = run_testcase (i)
            if (nRetcode == -1): break
            nAll += 1
            nPassed += nRetcode;
    else:
        for arg in sys.argv[1:]:
            nAll += 1
            nPassed += run_testcase(int(arg))

    sys.stdout.write("\nPassed : %d / %d cases\n" % (nPassed, nAll))

    T = time.time() - 1418149312
    PT, TT = (T / 60.0, 75.0)
    points = 600 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))
    sys.stdout.write("Time   : %d minutes %d secs\n" % (int(T/60), T%60))
    sys.stdout.write("Score  : %.2f points\n" % points)

if __name__ == '__main__':
    run_tests()

# }}}
# CUT end
