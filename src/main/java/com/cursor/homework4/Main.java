package com.cursor.homework4;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> numberList = new MyList<>() {{
            add(1);
            add(32);
            add(-5);
            add(0);
        }};
        System.out.println(numberList);
        System.out.println("Lowest number: " + numberList.lowest());
        System.out.println("Highest number: " + numberList.highest());
        MyList<String> stringList = new MyList<>(new String[]{"wall", "1", "string", "55"});
        System.out.println(stringList);
        System.out.println("Lowest string: " + stringList.lowest());
        System.out.println("Highest string: " + stringList.highest());
    }
}
