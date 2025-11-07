class Person {
  public static void main(String[] args) {
    System.out.println(speak());
    System.out.println(work());
    System.out.println(sleep());
  }

  public static String speak() {
    return "This person is speaking";
  }

  public static String work() {
    return "This person is working";
  }

  public static String sleep() {
    return "This person is sleeping";
  }
}
