package Decorator;

import java.util.ArrayList;
import java.util.List;

public class FirstString implements StringSource {
    private final List<String> stringList;
    private final int index;

    public FirstString(int index) {
        this.index = index;
        stringList = new ArrayList<>();
        stringList.add("I walk through the valley of shadow and death");
        stringList.add("I fear no evil because I'm blind to it all");
        stringList.add("In my deepest depression I have no self worth");
        stringList.add("In my darkest hours I'm prone to self-hurt");
        stringList.add("Look at me, I'm loco, mentally damaged");
        stringList.add("I can't control my thoughts, my thoughts are plagued");
        stringList.add("With images of my death and gone in a blaze");
        stringList.add("And my mind is full of holes, I'm losing control");
        stringList.add("I'm losing my soul, my heart is stone cold");
        stringList.add("And I'm at my all-time low, I need guidance");
        stringList.add("I'm a product of a broken home, there's no hiding");
        stringList.add("I'm lost, I need help, there's no one here");
        stringList.add("I scream for your help but you don't hear");
        stringList.add("I'm alone in this world, I'm a lost soul");
        stringList.add("I'm a lost soul, I'm a lost soul");
    }

    @Override
    public String next() {
        return stringList.get(index);
    }
}
