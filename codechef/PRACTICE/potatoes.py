t = int(raw_input())
import numpy
def primesfrom3to(n):
    """ Returns a array of primes, 3 <= p < n """
    sieve = numpy.ones(n/2, dtype=numpy.bool)
    for i in xrange(3,int(n**0.5)+1,2):
        if sieve[i/2]:
            sieve[i*i/2::i] = False
    return 2*numpy.nonzero(sieve)[0][1::]+1

for i in xrange(t):
    x,y = [int(j) for j in raw_input().split()]
    z = x + y + 1
    while True:
        if z in primesfrom3to(z+1):
            diff = z - (x + y)
            break
        else:
            z = z + 1
    print diff
