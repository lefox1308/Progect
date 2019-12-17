#include<stdio.h>
int funcao (int n1,int n2){
	if (n1>n2){
		return (n1-n2);
	}else{
		return (n1+n2);
	}
}
int main(){
	int n1,n2,res;
	printf ("digite um numero:");
	scanf ("%i",&n1);
	printf ("digite o segundo numero:");
	scanf ("%i",&n2);
	res=funcao (n1,n2);
	printf ("o seu resultado foi: %i",res);
} 
