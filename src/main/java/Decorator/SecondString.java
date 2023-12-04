package Decorator;

import java.util.ArrayList;
import java.util.List;

public class SecondString implements StringSource {
    private final List<String> stringList;
    private final int index;

    public SecondString(int index) {
        this.index = index;
        stringList = new ArrayList<>();
        stringList.add("Wutang Clan");
        stringList.add("Nas");
        stringList.add("Biggie");
        stringList.add("Tupac");
        stringList.add("Jay-Z");
        stringList.add("Kendrick Lamar");
        stringList.add("J. Cole");
        stringList.add("Eminem");
        stringList.add("Drake");
        stringList.add("Lil Wayne");
    }

    @Override
    public String next() {
        return stringList.get(index);
    }
}
