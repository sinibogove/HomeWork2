package qa.testautomation;

public class HomeWork2 {
    public static void main(String[] args) {
        //Заместете даден под-string в даден string с друг текст:
        String str = "Java exercises!";
        System.out.println("Original string=" +str);

        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("The character at position 0 is " + (char)index1);
        System.out.println("The character at position 10 is" + (char)index2);
    }
}
