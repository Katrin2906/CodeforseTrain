import java.util.ArrayList;
import java.util.List;

public class Words {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        list.add(0, "word");
        list.add(1, "localization");
        list.add(2, "internationalization");
        list.add(3, "pneumonoultramicroscopicsilicovolcanoconiosis");

        for (String element : list) {
            if (element.length() > 10) {
                StringBuilder newElement = new StringBuilder(element);
                newElement.replace(1, element.length()-1, String.valueOf((element.length()-2)));
                System.out.println(newElement);
            } else {
                System.out.println(element);
            }
        }
    }
}