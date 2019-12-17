#include <stdio.h>

int main(){
	int vetor[10],i=0,x=0,ima,ma;
	for (i=0;i<10;i++){
		printf ("digite aqui o valor da amostra:\n");
		scanf ("%i",&vetor[i]);
	while((vetor[i]<-20)||(vetor[i]>20)){
		i--;
	}
	}
	for (i=0;i<10;i++){
		if(vetor[i]<0){
 		ma++;
 		ima=i;
 		x++;
 		printf ("\no valor modificado por ser negativo foi o: %i\n",vetor[i]);
 		printf ("\npresente no vetor: %i",ima);
 		vetor[i]=999;
 		printf ("\ntendo o valor de: %i\n",vetor[i]);
	}else{
		ma++;
		ima++;
		printf ("\no valor da amostra coletada e: %i\n",vetor[i]);
		printf ("\npresente no vetor: %i",ima);
	}
}
printf ("\na quantidade de valores modificados foi: %i\n",x);
}
