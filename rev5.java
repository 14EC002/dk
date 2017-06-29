import java.io.*;

import java.util.*;

class rev5{
public static void main(String[] args){
int a=0,n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
while(n>0)
{
a=a*10;
a=a+(n%10);
n=n/10;
}
System.out.println(a);
}
}
