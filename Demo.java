class Demo{
   public static void main(String args[]){
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.addFirst(2);
      list.addFirst(4);
      list.addFirst(1);
      list.addFirst(5);
      System.out.println(list);

      list.addLast(29);
      list.addLast(12);
      System.out.println(list);

      Stack<Integer> stack = new Stack<Integer>();
      stack.push(3);
      stack.push(13);
      stack.push(5);
      System.out.println(stack);
      stack.pop();
      System.out.println(stack);
   }
}