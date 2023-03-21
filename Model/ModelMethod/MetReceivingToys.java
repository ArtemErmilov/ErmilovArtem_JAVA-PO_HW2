package Homework.JAVA_PO.ToyStore.Model.ModelMethod;

import java.util.*;

import Homework.JAVA_PO.ToyStore.Console.View;
import Homework.JAVA_PO.ToyStore.Model.fileHandling.FileHandling;

public class MetReceivingToys {

    View m = new View();

    FileHandling fh = new FileHandling();

    
    public void ReceivingToys(Queue<String> listRaffledToys){
        /*
         * Метод получения игрушки
         */

        String receivedToys = listRaffledToys.remove();

        System.out.printf("Полученная игрушка: %s \n",receivedToys);

        fh.setReceivedToys(receivedToys);

        String s = m.getValueStr("Для выхода нажмите Enter");

        
    }
}
