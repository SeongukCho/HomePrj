#include <stdio.h>

void main()
{
	int aa[4];
	int hap;

	for (int i = 0; i<4; i++){
		printf("%d��° ���� �Է��ϼ���. : ",i+1);
		scanf("%d", &aa[i]);
	}

	for (int i = 0; i<4; i++){
		hap += aa[i];
	}

	printf("�հ� : %d ", hap);
}
