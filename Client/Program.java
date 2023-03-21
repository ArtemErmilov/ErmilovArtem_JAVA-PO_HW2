package Homework.JAVA_PO.ToyStore.Client;

import Homework.JAVA_PO.ToyStore.Console.View;
import Homework.JAVA_PO.ToyStore.Presenter.Presenter;

public class Program {

    public static void main(String[] args) {

        Presenter p = new Presenter(new View());
        

        p.buttonClick(); // Старт программы

    }


}
