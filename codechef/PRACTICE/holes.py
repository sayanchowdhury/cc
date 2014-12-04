CAPITALS = {'A':1, 'B':2, 'D':1,'O':1, 'P':1, 'Q':1, 'R':1}
n = int(raw_input())
for i in xrange(n):
    count = 0
    word = raw_input()
    for j in word:
        if CAPITALS.has_key(j):
            count += CAPITALS[j]
    print count
