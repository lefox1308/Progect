#include<stdio.h>

int main(){
	int vetor[10],i=0;
	for (i=0;i<10;i++){
		printf ("digite o valor do vetor (apenas numeros inpares)\n");
		scanf ("%i",&vetor[i]);
		while (vetor[i]%2==0){
			i--;
		}
	}
	for (i=0;i<10;i++){
		if ((vetor[i]>8)&&(vetor[i]<20)){
			printf ("este valor esta entre 8 e 20: %i\n",vetor[i]);
		}
		}
	}

