#include <stdio.h>

void main(int argc, char* argc[])
{
	char str[200];
	FILE *rfp;

	if(argc != 2)
	{
		printf("\n -- �Ű������� 1�� ����ϼ��� --\n");
		return;
	}

	rfp = fopen(argc[1], "r");

	for(;;)
	{
		fgets(str, 199, rfp);
		if(feof(rfp))
			break;
		printf("%s",str);
	}

	fclose(rfp);
}

