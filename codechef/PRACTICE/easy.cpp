#include <stdio.h>

int
main ()
{
    int num = 0;
    while(1)
    {
        scanf("%d", &num);
        if (num == 42)
            break;
        printf("%d\n", num);
    }
    return 0;
}
