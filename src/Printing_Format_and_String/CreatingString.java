package Printing_Format_and_String;

public class CreatingString {
    public static void main(String[] args) {
        // Creating in pool
        String str= "JAVA Programing";
        System.out.println(str);

        // Creating in HEAP using char array:
        char c[] = {'J','A','V','A'};
        String str1=new String(c);
        System.out.println(str1);

        //Creating in HEAP using byte(ASCII codes) array:
        byte b[]={65,66,67,68};
        String str2=new String(b);
        System.out.println(str2);

        //Creating in HEAP using String:
        String str3=new String("Anirudha");
        System.out.println(str3);

        //Two reference pointing at same object:
        String p="anirudha1710";
        String q="anirudha1710";
        System.out.println(p);
        System.out.println(q);

        //Creating Same object in HEAP:
        String o=new String("anirudha1710");
        System.out.println(o);
    }
}
