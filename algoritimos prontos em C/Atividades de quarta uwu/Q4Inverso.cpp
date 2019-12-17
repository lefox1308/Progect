#include<stdio.h>

int main (){
int vetor[20],i;
for (i=0;i<20;i++){
printf ("digite o numero do vetor: \n");
scanf ("%i",&vetor[i]);
}
printf ("contagem regreciva\n");
for (i=20;i>=0;i--){
	printf ("%i\n",vetor[i]);
}
}
