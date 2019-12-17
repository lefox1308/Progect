#include<stdio.h>

float conv (float pol){
	return (pol*2.54);
}
int main(){
	float pol,cm;
	printf ("digite o valor em polegadas: \n");
	scanf ("%f",&pol);
	cm=conv(pol);
	printf ("o valor em cm das polegadas informadas e exatamente: %f",cm);
}
