#include <cstdio>
#include <algorithm>
using namespace std;

int a[1000009];

int
main ()
{
    int t;
    scanf("%d", &t);

    int lim = t;
    while(t--)
    {
        scanf("%d", &a[lim-(t+1)]);
    }
    sort(a, a+lim);

    for(int i=0; i<lim; i++)
        printf("%d\n", a[i]);

    return 0;
}

