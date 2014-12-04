#include <iostream>
#include <vector>
#include <cstdio>
#include <algorithm>

using namespace std;

#define MAX 101

int x[2000000];
int y[2000000];

int main()
{
    int a[MAX], n, i, j, k, val, p=0;
    int cnt=0;
    scanf("%d", &n);
    for(i=0; i<n; i++)
        scanf("%d", &a[i]);

    for(i=0; i<n; i++)
        for(j=0; j<n; j++)
            for(k=0; k<n; k++)
                x[p++] = a[i] * a[j] + a[k];
    sort(x, x+p);

    p=0;
    for(i=0;i<n;i++)
        for(j=0; j<n; j++)
            for(k=0; k<n; k++)
                y[p++] = a[i] * (a[j] + a[k]);
    sort(y, y+p);

    for(i=0; i<p; i++)
        printf("%d %d \n", x[i], y[i]);

    for(i=0; i<p; i++)
        if (binary_search(y, y+p, x[i]))
            cnt++;

    printf("%d", cnt);
    return 0;
}
