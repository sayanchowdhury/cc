__author__ = 'dshgna'

import sys


if __name__ == "__main__":
    n = int(sys.stdin.readline())
    t = map(int, sys.stdin.readlines())
    t.sort()
    for x in t:
        print x
