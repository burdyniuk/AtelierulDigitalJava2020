package lab6.ch7;

public class Main {
    public static void main(String[] args) {
        MyString string1 = new MyString("one");
        MyString string2 = new MyString("two");
        MyString string3= new MyString("three");
        MyString string4 = new MyString("four");
        MyHashMap<Integer, MyString> myHashMap = new MyHashMap<>(4);
        myHashMap.put(0, string1);
        myHashMap.put(1, string2);
        myHashMap.put(2, string3);
        myHashMap.put(3, string4);

        // prints the elements
        System.out.println(myHashMap);
        // prints the entry which has the 3 key
        System.out.println(myHashMap.get(3));
    }
}
