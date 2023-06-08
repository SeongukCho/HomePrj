#include <stdio.h>
#include <malloc.h>

void main()
{
	int cnt;
	
	struct student{
		char name[10];
		int age;
	};

	printf("입력할 학생 수 : ");
	scanf("%d", &cnt);

	struct student* s = malloc(sizeof(struct student) * cnt);

	for(int i = 0; i<cnt; i++)
	{
		printf("이름과 나이 입력 : ");
		scanf("%s %d", s[i].name, &s[i].age);
	}

	printf("\n\n-- 학생 명단 --\n");
	for(int i = 0; i<cnt; i++)
	{
		printf("이름:%s , 나이:%d\n", s[i].name , s[i].age);
	}

	free(s);
}
