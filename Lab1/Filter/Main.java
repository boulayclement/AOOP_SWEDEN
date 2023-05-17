package Lab1.Filter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String[] filter(String[] a, Filter f) {
        List<String> filteredList = new ArrayList<>();
        for (String s : a) {
            if (f.accept(s)) {
                filteredList.add(s);
            }
        }
        return filteredList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] strings = {"Java", "Python", "C", "JavaScript", "Ruby"};
        Filter filter = x -> x.length() <= 3;
        String[] filteredStrings = filter(strings, filter);

        for (String s : filteredStrings) {
            System.out.println(s);
        }
    }
}