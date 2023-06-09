package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    

        static <T> void swap(T[] array, int firstIndex, int secondIndex) {
            T oneVal = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = oneVal;
        }
    
        // поэтому, более правильный вариант такой
        static void swapObj(Object[] array, int firstIndex, int secondIndex) {
            Object oneVal = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = oneVal;
        }
    
        /**
         * 2. Написать метод, который преобразует массив в ArrayList;
         */
        static <T> ArrayList<T> convertToList(T[] array) {
            return new ArrayList<>(Arrays.asList(array));
        

    }

}

