package homework4;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> numberList = new MyList<>();
        numberList.add(1);
        numberList.add(32);
        numberList.add(-5);
        numberList.add(0);
        System.out.println(numberList.getList());
        System.out.println("Smallest number: " + numberList.lowest());
        System.out.println("Largest number: " + numberList.highest());
        MyList<String> stringList = new MyList<>(new String[]{"wall", "1", "string", "55"});
        System.out.println(stringList.getList());
        System.out.println("Smallest string: " + stringList.lowest());
        System.out.println("Largest string: " + stringList.highest());
    }
}
