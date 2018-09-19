#include <bits/stdc++.h>
    using namespace std;
int main() {
    long int n,m,r,f;
    int f = 0;
    scanf("%ld\n%ld",&n,&m);
    for(long int i=n;i<=m;i++){
        long int sum;
        long int a = 0;
        long int k = i;
        while(k>0){
            k/=10 ; 
            ++a;
        }
       long int p = i * i;
        long int g = pow(10,a);
        sum = p%g + p/g;
        if(sum == i){
            printf("%ld ",sum);
            f++;
        }
    }
    if(f == 0)
        printf("INVALID RANGE");       
    return 0;
}