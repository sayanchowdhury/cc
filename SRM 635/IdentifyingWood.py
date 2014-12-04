#-*- coding: utf-8 -*-

from collections import defaultdict

class IdentifyingWood:
    def check(self, s, t):
        def arrange(x):
            return ''.join(list(x).sort())
        if arrange(t) in arrange(s):
            return "Yep, it's wood."
        else:
            return "Nope."

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
        
def do_test(s, t, __expected, caseNo):
    sys.stdout.write("  Testcase #%d ... " % caseNo)

    startTime = time.time()
    instance = IdentifyingWood()
    exception = None
    try:
        __result = instance.check(s, t);
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
        s = "absdefgh"
        t = "asdf"
        __expected = "Yep, it's wood."
        # run the code
        return do_test (s, t, __expected, __no)

    if __no == 1:
        s = "oxoxoxox"
        t = "ooxxoo"
        __expected = "Nope."
        # run the code
        return do_test (s, t, __expected, __no)

    if __no == 2:
        s = "oxoxoxox"
        t = "xxx"
        __expected = "Yep, it's wood."
        # run the code
        return do_test (s, t, __expected, __no)

    if __no == 3:
        s = "qwerty"
        t = "qwerty"
        __expected = "Yep, it's wood."
        # run the code
        return do_test (s, t, __expected, __no)

    if __no == 4:
        s = "string"
        t = "longstring"
        __expected = "Nope."
        # run the code
        return do_test (s, t, __expected, __no)

    # Your custom testcase goes here
    if __no == 5:
        return -1

def run_tests():
    sys.stdout.write("IdentifyingWood (250 Points)\n\n")

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

    T = time.time() - 1417203361
    PT, TT = (T / 60.0, 75.0)
    points = 250 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))
    sys.stdout.write("Time   : %d minutes %d secs\n" % (int(T/60), T%60))
    sys.stdout.write("Score  : %.2f points\n" % points)

if __name__ == '__main__':
    run_tests()

# }}}
# CUT end
