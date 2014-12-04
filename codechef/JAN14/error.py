t = int(raw_input())
for i in range(t):
    s = raw_input()
    if '101' in s or '010' in s:
        print 'Good'
    else:
        print 'Bad'
