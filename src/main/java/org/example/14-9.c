#include <stdio.h>

void main(int argc, char *argv[])
{
	char str[200];
	FILE *rfp;
	FILE *wfp;

	rfp = fopen(argv[1], "r");
	wfp = fopen(argv[2], "w");

	for (;;)
	{
		fgets(str, 200, rfp);

		if(feof(rfp))
			break;

		fputs(str, wfp);
	}

	fclose(rfp);
	fclose(wfp);
}
