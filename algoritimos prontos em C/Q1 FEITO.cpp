#include<stdio.h>

int main(){
float temp[31],media=28.0;
	int i=0,c=0,ima=0,ma=0;
	for (i=0;i<10;i++){
		printf ("digite o valor da temperatura:  \n");
		scanf ("%f",&temp[i]);
	}
	for (i=0;i<31;i++){
		if (temp[i]>media){
		c=c+1;
		ma=ma+1;
		ima=i;
		printf ("presentes nos vetores : %i",ima,"\n");
		}
	}
	printf ("a quantidade de temperaturas que ultrapacao a media de 28.0 graus celcios e de exatamente: %i",c,"\n");
}
