package Wyklad5;

public class Main {

    public static void main(String[] args) {
        RunnableExample runnable1 = new RunnableExample();


        //Thread - wątek
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        //tworzymy wątek za pomocą klasy anonimowej
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() { //ciało klasy anonimowej
                while (true)
                    System.out.println("Happily running 2");

            }
        });

        thread2.start(); //efekt powstawania bloków "Happily running 1" i "Happily running 2"

        //wyrażenie lambda - wstawianie fragmentu kodu do metody np.

        Thread thread3 = new Thread( () -> //*
        {while (true){System.out.println("Happily running 3"); }}); //metoda run nie potrzebuje żadnych argumentow, dlatego pusty nawias

        thread3.start();
        //* wyrażenie lambda - metoda nie potrzebuje żadnego argumentu i wywołuje while(true){...}
    }
}
