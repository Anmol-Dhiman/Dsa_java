#include <stdio.h>
struct jai
{
    int a : 5;
    int b : 4;
    int c;
};

int main()
{
    struct jai d;
    printf("%d", sizeof(d));
    return 0;
}