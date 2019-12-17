#include <stdio.h>

int main(){
	int vetor[5],vet2[5],i=0;
	for (i=0;i<5;i++){
		printf ("digite o valor do vetor:\n");
		scanf ("%i",&vetor[i]);
		vet2[i]=vetor[i];
	}
	for (i=0;i<5;i++){
		printf("os valores copiados do primeior vetor foram: %i\n",vet2[i]);
	}
}
