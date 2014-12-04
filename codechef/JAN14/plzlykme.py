t = int(raw_input())
for i in xrange(t):
    l,d,s,c = map(int, raw_input().split())
    r = s*((1+c)**(d-1))
    if r >=l :
        print 'ALIVE AND KICKING'
    else:
        print 'DEAD AND ROTTING'
