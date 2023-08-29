#include <stdio.h>

void main()
{
	int aa[4];
	int hap;

	for (int i = 0; i<4; i++){
		printf("%d번째 수를 입력하세요. : ",i+1);
		scanf("%d", &aa[i]);
	}

	for (int i = 0; i<4; i++){
		hap += aa[i];
	}

	printf("합계 : %d ", hap);
}
