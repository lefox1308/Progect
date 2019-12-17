#include<stdio.h>
float funcao (float salario,float Pc){
float almento=salario+Pc;
	return (almento);
}
int main (){
float almento,salario,por,Pc;
printf ("digite o valor do salario: \n");
scanf ("%f",&salario);
printf ("digite o valor da porcentagem do almento (ex:20% = 0.2):\n");
scanf ("%f",&por);
Pc=salario*por;
printf ("o valor do seu salario com o almento foi: %f",funcao(salario,Pc));	
}
