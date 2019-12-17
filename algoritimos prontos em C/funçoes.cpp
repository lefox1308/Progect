#include<stdio.h>
int main(){
	int a,b,soma,div,mult,sub;
	
	printf ("digite um numero qualquer:");
	scanf ("%i",&a);
	printf ("digite o segundo numero:");
	scanf ("%i",&b);
	soma=a+b;
	sub=a-b;
	mult=a*b;
	div=soma/2;
	
	printf ("a soma dos valores foi: %i/n",soma);
	printf ("a subtrasao dos valores foi: %i/n",sub);
	printf ("a multiplicação dos valores foi: %i/n",mult);
	printf ("a divisao dos valores foi :%i/n",div);
}
