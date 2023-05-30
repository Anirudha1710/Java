package Printing_Format_and_String;

public class Example1 {
    public static void main(String[] args) {
        String str="skush7041@gmail.com";
        int i = str.indexOf('@');

        String username = str.substring(0,i);
        String domainname= str.substring(i+1,str.length());

        System.out.println("User Name: "+username);
        System.out.println("Domain Name: "+domainname);

        System.out.println(domainname.startsWith("Gmail"));
    }
}
