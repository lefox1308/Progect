#include <stdio.h>

int main(){
	int vetor[10],par[5],impar[5],x=0,ip=0,Ii=0;
	
	for (x=0;x<10;x++){
		printf ("digite um valor para o vetor:\n");
		scanf ("%i",&vetor[x]);
		while ((vetor[x]<20)&&(vetor[x]<1)){
			x--;
		}
	}
	for(x=0;x<10;x++){
		if (x%2==0){
			par[x]=vetor[x];
			printf ("os valores que estao em vetores pares sao: %i\n",par[x]);
	}else{
		impar[x]=vetor[x];
		printf ("os numeros que estao em vetores inpares sao: %i\n",impar[x]);
	}
	}
}

