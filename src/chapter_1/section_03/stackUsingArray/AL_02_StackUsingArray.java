package chapter_1.section_03.stackUsingArray;

public class AL_02_StackUsingArray {
    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray(3);

        System.out.println(stackUsingArray.isEmpty());

        stackUsingArray.push("Alireza");
        stackUsingArray.push("Jack");
        stackUsingArray.push("Jane");

        System.out.println(stackUsingArray.isEmpty());

        System.out.println(stackUsingArray.pop());
        System.out.println(stackUsingArray.pop());
        System.out.println(stackUsingArray.pop());

        System.out.println(stackUsingArray.isEmpty());
    }
}
