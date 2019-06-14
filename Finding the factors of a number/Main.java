#include <stdio.h>
int main() {
	int n,fact;
  scanf("%d",&n);
  for(fact=1;fact<=n;fact++)
  {
    if(n%fact==0)
    {
      printf("%d\n",fact);
    }
  }
      //Type your code
	return 0;
}