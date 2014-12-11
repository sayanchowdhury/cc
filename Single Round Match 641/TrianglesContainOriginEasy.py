#-*- coding: utf-8 -*-

from collections import defaultdict
from itertools import combinations

class TrianglesContainOriginEasy:
    def area(self,  x1, y1, x2, y2, x3, y3):
        return abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0)
    def isInside(self, x1, y1, x2, y2, x3, y3, x, y):
        a = self.area (x1, y1, x2, y2, x3, y3)
        a1 = self.area (x, y, x2, y2, x3, y3)
        a2 = self.area (x1, y1, x, y, x3, y3)
        a3 = self.area (x1, y1, x2, y2, x, y)
        return a==(a1+a2+a3)
    def count(self, x, y):
        pp = zip(x,y)
        count=0
        l = combinations(pp, 3)
        for x,y,z in l:
            if (x[1] <0 and y[1]<0 and z[1] <0):
                continue
            if (x[0] >0 and y[0]>0 and z[0] >0):
                continue
            if self.isInside(x[0], x[1], y[0], y[1], z[0], z[1], 0, 0):
                count+=1
        return count

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
        
def do_test(x, y, __expected, caseNo):
    sys.stdout.write("  Testcase #%d ... " % caseNo)

    startTime = time.time()
    instance = TrianglesContainOriginEasy()
    exception = None
    try:
        __result = instance.count(x, y);
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
        x = ( -1, -1, 1 ,)
        y = ( 1, -1, 0 ,)
        __expected = 1
        # run the code
        return do_test (x, y, __expected, __no)

    if __no == 1:
        x = ( -1, -1, 1, 2 ,)
        y = ( 1, -1, 2, -1 ,)
        __expected = 2
        # run the code
        return do_test (x, y, __expected, __no)

    if __no == 2:
        x = ( -1, -2, 3, 3, 2, 1 ,)
        y = ( -2, -1, 1, 2, 3, 3 ,)
        __expected = 8
        # run the code
        return do_test (x, y, __expected, __no)

    if __no == 3:
        x = ( 1, 5, 10, 5, -5, 7, -9, -6, -3, 0, 8, 8, 1, -4, 7, -3, 10, 9, -6 ,)
        y = ( 5, -6, -3, 4, -2, -8, -7, 2, 7, 4, 2, 0, -4, -8, 7, 5, -5, -2, -9 ,)
        __expected = 256
        # run the code
        return do_test (x, y, __expected, __no)

    # Your custom testcase goes here
    if __no == 4:
        x = (-616,  508,  -917,  -121,  730,  122,  -702,  -270,  353,  969, 518,  -914,  -103,  -582,  916,  444,  671,  908,  -440,  249,
            -489,  866,  -228,  18,  586,  948,  635,  -38,  -937,  -372, 695,  -523,  19,  -412,  -824,  -761,  543,  478,  -645,  51,
                781,  -503,  -669,  434,  523,  -25,  239,  -860,  -310,  -506,
                -779,)
        y = (-329,  -500,  -372,  -868,  -825,  292,  456,  -127,  -95,  -724,
                -397,  -952,  -344,  -568,  -934,  -697,  -411,  495,  -805,
                -615,  -100,  -713,  787,  978,  -58,  -787,  -55,  779,  404,
                -367,  -119,  982,  -694,  -585,  729,  -417,  517,  92,  741,
                -400,  -873,  564,  -225,  -138,  -388,  776,  -168,  -850,
                -882,  -52,  264, )
        __expected = 340
        return do_test (x, y, __expected, __no)

def run_tests():
    sys.stdout.write("TrianglesContainOriginEasy (500 Points)\n\n")

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

    T = time.time() - 1418315244
    PT, TT = (T / 60.0, 75.0)
    points = 500 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT))
    sys.stdout.write("Time   : %d minutes %d secs\n" % (int(T/60), T%60))
    sys.stdout.write("Score  : %.2f points\n" % points)

if __name__ == '__main__':
    run_tests()

# }}}
# CUT end
