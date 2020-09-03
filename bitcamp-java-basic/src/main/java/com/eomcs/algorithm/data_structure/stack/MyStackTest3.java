package com.eomcs.algorithm.data_structure.stack;

public class MyStackTest3 {
  public static void main(String[] args) throws Exception{
    MyStack<String> stack = new MyStack<>();
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");
    System.out.println("==> " + stack.peek());
    stack.push("ddd");
    stack.push("eee");
    print(stack);
    //stack.push(100);

    MyStack<String> stack2 = stack.clone();
    print(stack2);


    System.out.println(stack2.pop());
    System.out.println(stack2.pop());
    System.out.println(stack2.pop());

    System.out.println("-----------------------");
    print(stack);
  }

  static void print(MyStack<?> stack) {
    for (int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i) + ",");
    }
    System.out.println();
  }
}
