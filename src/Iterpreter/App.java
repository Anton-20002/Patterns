package Iterpreter;

class App {
  public static void main(String[] args) {
    Expression isFriends = Rule.check();
    System.out.println("Kolya and Petya is friends? - "+isFriends.iterpret("John  Mark"));
  }
}
