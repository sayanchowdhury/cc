t = int(raw_input())
for i in xrange(t):
    n = int(raw_input())
    if n < 10:
        print n
        continue
    else:
        while True:
            dsum = sum([int(j) for j in str(n)])
            if n%dsum == 0:
                print n
                break
            else:
                n += 1
        continue
