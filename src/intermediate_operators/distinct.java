package intermediate_operators;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class distinct {
    public static void main(String[] args) {
        List<String> nameList = new LinkedList<>();
        nameList.add("John");
        nameList.add("Jane");
        nameList.add("Jack");
        nameList.add("Bob");
        nameList.add("John");
        nameList.add("Jane");

        List<String> distinctList = nameList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);
    }
}
