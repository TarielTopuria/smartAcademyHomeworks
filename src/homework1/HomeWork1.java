package homework1;

public class HomeWork1 {
//  static მოდიფიკატორით ცვლადების გამოცხადება;
    static byte byteVariable;
    static short shortVariable;
    static int intVariable;
    static long longVariable;

     public static void homeWork1(){

/*   ცვლადებისთვის მნიშვნელობის მინიჭება;
     მთელ რიცხვთა გამომსახველი ცვლადები;
 */
        byteVariable = 125;
        shortVariable = -32745;
        intVariable = -2000000000;
        longVariable = 9_000_000_000_000L;

//   ათწილადების გამომსახველი ცვლადების გამოცხადება და მნიშვნელობის მინიჭება მეთოდში;
        float floatVariable = -55.6f;
        double doubelVariable = 99.999;

//   boolean ტიპის ცვლადების გამოცხადება და მნიშვნელობის მინიჭება;
        boolean isBool1 = true;
        boolean isBool2 = false;

//   char ტიპის სიმბოლოთა შემნახველი ცვლადების გამოცხადება და მნიშვნელობების მინიჭება;
        char charVariable = 'T', charVarieble2 = 't';

//   String ტიპის არაპრიმიტიული (Reference) ცვლადის გამოცხადება;
        String birthMessage = "ჩემი დაბადების წელია ";
        String ageMessage = ", ჩემი ასაკია ";

//   მათემატიკური ოპერაციების მაგალითები
        int currentYear = 2000 + 22;
        int dateofBirth = 1997;
        int myAge = currentYear - dateofBirth;
        int someNumber = 200 / 10;
        int someNumber2 = 10 * 20;

//   ლოგიკური ოპერატორის გამოყენების მაგალითები

        int age = 25;
        boolean testBoolean = myAge == age; //მუდამ true დაბრუნდება ვინაიდან ჰარდად გაწერილი ცვლადები გვაქვს, რომლებიც ერთმანეთის ტოლია
        boolean testBoolean2 = myAge < age; //მუდამ false დაბრუნდება ვინაიდან ჰარდად გაწერილი ცვლადები გვაქვს, რომლებიც ერთმანეთის ტოლია

//   println() მეთოდის გამოყენება კონსოლში ჩანაწერის გამოსატანად
        System.out.println(birthMessage + dateofBirth + ageMessage + myAge + ".");
    }
}