import Map.IntegerString;
import Map.StringInteger;
import Map.StringList;

public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        PhonebookMap phoneBook = new PhonebookMap();

        phoneBook.addPhone("Пупкин Вася","+7921-322-22-333");
        phoneBook.addPhone("Пупкин Вася","+7921-322-22-334");
        phoneBook.addPhone("Вася Пупкин","+7921-322-22-335");
        phoneBook.addPhone("Пупкин Вася3","+7921-322-22-336");
        phoneBook.addPhone("Пупкин Вася4","+7921-322-22-337");
        phoneBook.addPhone("Пупкин Вася5","+7921-322-22-338");
        phoneBook.addPhone("Пупкин Вася6","+7921-322-22-339");
        phoneBook.addPhone("Пупкин Вася7","+7921-322-22-310");
        phoneBook.addPhone("Пупкин Вася8","+7921-322-22-333");
        phoneBook.addPhone("Пупкин Вася9","+7921-322-22-334");
        phoneBook.addPhone("Вася Пупкин10","+7921-322-22-335");
        phoneBook.addPhone("Пупкин Вася11","+7921-322-22-336");
        phoneBook.addPhone("Пупкин Вася12","+7921-322-22-337");
        phoneBook.addPhone("Пупкин Вася13","+7921-322-22-338");
        phoneBook.addPhone("Пупкин Вася14","+7921-322-22-339");
        phoneBook.addPhone("Пупкин Вася15","+7921-322-22-310");
        phoneBook.addPhone("Пупкин Вася16","+7921-322-22-337");
        phoneBook.addPhone("Пупкин Вася17","+7921-322-22-338");
        phoneBook.addPhone("Пупкин Вася18","+7921-322-22-339");
        phoneBook.addPhone("Пупкин Вася19","+7921-322-22-310");

        System.out.println(phoneBook);

        System.out.println("Задача 3");

        StringInteger stringinteger=new StringInteger();
        stringinteger.addMeaning("Строка 1",1);
        stringinteger.addMeaning("Строка 2",2);
        stringinteger.addMeaning("Строка 3",3);
        System.out.println(stringinteger);

        stringinteger.addMeaning("Строка 2",22);
        System.out.println(stringinteger);

        //stringinteger.addMeaning("Строка 2",22);
        //System.out.println(stringinteger);

        System.out.println("Задача 4");

        StringList stringList =new StringList();
        System.out.println(stringList);
        System.out.println(stringList.convert() );

        System.out.println("Задача 5");


        IntegerString integerString = new IntegerString();

        integerString.addLinked(5, "aaae");
        integerString.addLinked(6, "aaaf");
        integerString.addLinked(7, "aaag");
        integerString.addLinked(8, "aaah");
        integerString.addLinked(9, "aaai");
        integerString.addLinked(10, "aaaj");
        integerString.addLinked(1, "aaa");
        integerString.addLinked(2, "aaab");
        integerString.addLinked(3, "aaac");
        integerString.addLinked(4, "aaad");

        System.out.println(integerString);
    }
}