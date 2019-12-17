#include<stdio.h>

int main(){
	int nota[15],i=0,maior=0,ma,ima;
	for (i=0;i<15;i++){
		printf ("digite aqui sua nota: \n");
		scanf ("%i",&nota[i]);
		while ((nota[i]<0)||(nota[i]>10)){
			printf ("seu valor foi invalido digite uma nota entre zero e dez\n");
			i--;
		}
	}
	for (i=0;i<15;i++){
		if (nota[i]>maior){
 		maior=nota[i];
 		ma++;
 		ima=i;
 	printf ("o valor %i\n",nota[i],"\n");
	printf (" esta presente no vetor: %i\n",ima,"\n");	
	}
}
	printf ("\n a nota mais alta foi: %i",maior,"\n");
}

