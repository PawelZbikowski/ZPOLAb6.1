package Wyklad5;

public class RunnableExample implements Runnable{ //interfejs funkcjonalny - zawiera jedną metodę abstrakcyjną
    @Override
    public void run() {
        while (true) //powoduje wykonywanie sie programu w nieskonczonosc
        System.out.println("Happily running 1");
    }
}
