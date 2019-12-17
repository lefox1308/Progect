#include<stdio.h>
int main (){
	int i,vetor[8],soma=0,maior=0;
	float media;
	for (i=0;i<8;i++){
		printf ("digite o valor do vetor:\n");
		scanf ("%i",&vetor[i]);
	}
	for (i=0;i<8;i++){
		soma=soma+vetor[i];
		if (vetor[i]%5==0){
			printf ("os valores multiplos de 5 sao: %i\n",vetor[i]);
		}
	}
	for (i=0;i<8;i++){
		if (maior<vetor[i]){
			maior=vetor[i];
		}
	}
	for (i=0;i<8;i++){
		if ((vetor[i]>10)&&(vetor[i]<30)){
			printf ("o valor que esta emtre 10 e 30: %i\n",vetor[i]);
		}
	}
	media=soma/8;
	printf ("a media dos valores digitados foi: %f\n",media);
	printf ("0 maior valor digitado foi: %i\n",maior);
}
