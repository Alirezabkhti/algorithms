package chapter_1.section_03.stackUsingResizableArray;

public class AL_03_StackUsingResizableArray {
    public static void main(String[] args) {
        StackUsingResizableArray stackUsingResizableArray = new StackUsingResizableArray();

        System.out.println(stackUsingResizableArray.isEmpty());

        stackUsingResizableArray.push("Alireza");
        stackUsingResizableArray.push("Jack");
        stackUsingResizableArray.push("Jane");

        System.out.println(stackUsingResizableArray.isEmpty());

        System.out.println(stackUsingResizableArray.pop());
        System.out.println(stackUsingResizableArray.pop());
        System.out.println(stackUsingResizableArray.pop());

        System.out.println(stackUsingResizableArray.isEmpty());
    }
}
