#include<stdio.h>
float conversor (float reais){
return (reais/4.38);
}
int main (){
	float reais;
	int cov;
	printf ("digite o valor em reais: \n");
	scanf ("%f\n",&reais);
	cov=conversor (reais);
	printf ("seu valor em reais e extamente : \n",cov);
}
