#include <stdio.h>
#include <stdlib.h>

void main()
{
	struct student{
		char name[20];
		int age;
	};
	int cnt;

	printf("입력할 학생 수 : ");
	scanf("%d",&cnt);


	struct student* sp = malloc(sizeof(struct student)*cnt);

	for (int i = 0; i<cnt; i++){
		printf("이름과 나이 입력 : ");
		scanf("%s %d",(sp+i)->name,&(sp+i)->age);
	}

	for (int i = 0; i<cnt; i++){
		printf("이름 : %s , 나이 : %d\n",(sp+i)->name,(sp+i)->age);
	}
}
