#include <stdio.h>
#include <stdlib.h>

void main()
{
	struct student{
		char name[20];
		int age;
	};
	int cnt;

	printf("�Է��� �л� �� : ");
	scanf("%d",&cnt);


	struct student* sp = malloc(sizeof(struct student)*cnt);

	for (int i = 0; i<cnt; i++){
		printf("�̸��� ���� �Է� : ");
		scanf("%s %d",(sp+i)->name,&(sp+i)->age);
	}

	for (int i = 0; i<cnt; i++){
		printf("�̸� : %s , ���� : %d\n",(sp+i)->name,(sp+i)->age);
	}
}
