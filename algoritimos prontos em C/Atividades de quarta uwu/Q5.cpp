#include<stdio.h>
float almento (float salario,float porcento,float nov){
	nov=salario*porcento;
	return(nov);
}
int main(){
float salario,nov,porcento,saln;
int por;
printf ("digite o valor do seu salario:\n");
scanf ("%f",&salario);
printf ("digite o valor em porcento do seu almento (nao presisa por o sinal de porcentagem)\n");
scanf ("%i",&por);
porcento=por/100;
saln=salario+nov;
printf ("seu almento foi: %f\n",nov);	
}
