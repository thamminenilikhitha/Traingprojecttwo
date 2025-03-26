package PracticeProgram;

public class math {

    public static void main(String[] args) {
//arithmetic operators
       final int a=30;
        int c=40;
        float b=6.88f;
        System.out.println(a+c);
        System.out.println(a-c);
        System.out.println(a/c);
        System.out.println(a*c);
       System.out.println(a/b);
        System.out.println(c+b);

        //unnary operator

        int a1=+15;
        int ab=-15;
        int result=a+ab;
        System.out.println(a1);
        System.out.println(ab);
        System.out.println(result);

//module operators
        int likki=50;
        int harshu=30;
        System.out.println(likki%harshu);
        //Relational operator


int likhitha=26;
int harshitha=18;
System.out.println(likhitha>=harshitha);

byte v=2;
byte v2=3;
boolean v3=2>3;
System.out.println(v3);
//boolean
        boolean s=!true;
        System.out.println(!s);
        boolean sse=!!false;
        System.out.println(!!sse);

        boolean ses=true || false;
        System.out.println(ses);

String s1="hello";
String s2="Likhitha";
int age=23;
int height=20;
System.out.println(age+height+s1+s2);
        System.out.println(s1+s2+age+height);



        System.out.println(15==35);
        System.out.println(!(15>=35));




        char j='a'; //Ascii ->97
        char i='b'; //98
        System.out.println(j+i);
        System.out.println('D'==68);

        short k=65;
        char l='a'; //65+97=162
        System.out.println(l+k);






    }
}
