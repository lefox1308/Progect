#include<stdio.h>

int main(){
	int vetor[39],i=0,x=0,y=0;
	for(i=0;i<39;i++){
		printf ("digite o numero de horas que vc fica na internet:\n");
		scanf ("%i",&vetor[i]);
		while ((vetor[i]<0)&&(vetor[i]>310)){
			i--;
		}
	}
	for (i=0;i<39;i++){
		if(vetor[i]>100){
			x++;
		}
		if (vetor[i]<10){
			y++;
		}
	}
	printf ("o numero de alunos que acesaram a internet por mais de 100 horas no mes e de: %i\n",x);
	printf("a quantidade de alunos que acesaram a internet por menos que 10 horas por mes e de: %i\n",y);
}
