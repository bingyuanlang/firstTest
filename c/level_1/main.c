#include <stdio.h>
#include <stdlib.h>

int plus(int a, int b) {
    return a + b;
}

int main (int argc, char* argv[]) {
    int a = 'a';
    int b = 'b';
    if (argc >= 3) {
        a = atoi(argv[1]);
        b = atoi(argv[2]);
    }
    int ret = plus(a, b);
    printf("%d + %d = %d\n", a, b, ret);
    
    return 0;
}
