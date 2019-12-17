#include<stdio.h>
float divisao (int x,int y){
	while (y==0){
		printf ("nao e possivel fazer divisao por zero , digite um novo valor: \n");
		scanf ("%i",&y);
	}
return (x/y);	
}
int mais (int a,int b){
	return (a+b);
}
int menos (int a,int b){
	return (a-b);
}
int  vezes (int a,int b){
	return (a+b);
}
int main(){
	int a,b,soma,div,mult,sub;
	printf ("digite um numero qualquer:");
	scanf ("%i",&a);
	printf ("digite o segundo numero:");
	scanf ("%i",&b);
	
	soma=mais (a,b);
	sub=menos (a,b);
	mult=vezes (a,b);
	div=divisao (a,b);
		
	printf ("a soma dos valores foi: %i\n",soma);
	printf ("a subtrasao dos valores foi: %i\n",sub);
	printf ("a multiplicação dos valores foi: %i\n",mult);
	printf ("a divisao dos valores foi :%i\n",div);
}
