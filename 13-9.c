#include <stdio.h>
#include <malloc.h>

void main()
{
	int cnt;
	
	struct student{
		char name[10];
		int age;
	};

	printf("�Է��� �л� �� : ");
	scanf("%d", &cnt);

	struct student* s = malloc(sizeof(struct student) * cnt);

	for(int i = 0; i<cnt; i++)
	{
		printf("�̸��� ���� �Է� : ");
		scanf("%s %d", s[i].name, &s[i].age);
	}

	printf("\n\n-- �л� ��� --\n");
	for(int i = 0; i<cnt; i++)
	{
		printf("�̸�:%s , ����:%d\n", s[i].name , s[i].age);
	}

	free(s);
}
