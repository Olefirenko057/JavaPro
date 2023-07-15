package Homework_10_07;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Описание задания.
//
//        1 уровень сложности: 1. Создать лист.
        List<Integer> list = new ArrayList<>();

//        В цикле наполнить лист 10 миллионами значений (от 1 до 10_000_000)
        int maxValue = 10_000_000;
        for (int i = 0; i < maxValue; i++) {
            list.add(i + 1);
        }

//        Перебрать лист с помощью for-each, в теле цикла каждое значение листа записать в переменную temp.
        for (Integer currentNumber : list) {
            Integer temp = currentNumber;
        }
//
//                Сделать то же самое с помощью классического for.
        for (int i = 0; i < list.size(); i++) {
            Integer temp = list.get(i);
        }
//
//        Сделать то же самое с помощью классического for, но сначала вынести размер листа в отдельную переменную, а потом эту переменную использовать внутри условия цикла.
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            Integer temp = list.get(i);
        }

//                Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.
        for (int i = listSize - 1; i >= 0; i--) {
            Integer temp = list.get(i);
        }
//
//        Сделать то же самое, но используя Iterator.
        ListIterator<Integer> integerIterator = list.listIterator();
        while (integerIterator.hasNext()) {
            Integer temp = integerIterator.next();
            if(temp >= 3 && temp <= 8) {
                System.out.println(temp);
            }
        }


//        Сделать то же самое, но используя ListIterator.
        long start = System.currentTimeMillis();
        while (integerIterator.hasPrevious()) {
            Integer temp = integerIterator.previous();
            if(temp >= 3 && temp <= 8) {
                System.out.println(temp);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

//        Для всех случаев 3-8 замерить время, в течение которого отрабатывает цикл:


//
//        Замеряете текущее время до цикла с помощью метода System.currentTimeMillis();
//
//        Замеряете текущее время после цикла с помощью метода System.currentTimeMillis();
//
//        Выводите разницу во времени после и до в консоль.
//
//
//                Кроме затраченного времени выводить в консоль больше ничего не нужно, т.к. это существенно замедлит работу, смысл эксперимента будет потерян.
//                Если отрабатывает очень быстро, и разница не особо понятна, попробовать на 100 миллионах значений.
    }

}
