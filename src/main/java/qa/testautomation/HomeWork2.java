package qa.testautomation;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        //Заместете даден под-string в даден string с друг текст:
        Scanner scanner = new Scanner(System.in);
        String myName = "My name is ";
        String name = "Vladimir";
        String myNameIs = (myName + name);
        System.out.println(myNameIs);

        System.out.println("Please enter surname!");
        String newName = scanner.next();

        String myNewNameIs = name.replace(name, newName);
        System.out.println(myName+myNewNameIs);

        //Сравнете 2 стринга дали са еднакви - подадени от конзолата и изпишете резултата в нея.
        String str1 = ("This is exercise 1");
        String str2 = ("This is exercise 2");
        System.out.println(str1.equals(str2));

        //Пребройте колко думи има в един стринг (разделете текста по space) - изпишете резултата в нея.

        String str  = ("Where were you yesterday?");
        String split [] = str.split(" ");

        System.out.println(split.length);

        //Обединете 2 и повече стринга в един и го изпишете в конзолата.
        String str3 = ("Combine ");
        String str4 = ("two ");
        String str5 = ("or ");
        String str6= ("more ");
        String str7 = ("strings!");

        System.out.println(str3+str4+str5+str6+str7);
    }
}
