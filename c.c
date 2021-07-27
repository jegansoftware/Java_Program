int main()
{
char a[90]="i/am/jegan";
char temp[90];
int c=0;
char *p;
p=a;

while(*p)
{


	if(*p=='a')
	{
		temp[c++]='k';
	}
	else
	{
		temp[c++]=*p;
	}
	
	p++;
}

temp[c]='\0';


printf("\n%s",temp);

}

