/*
Класс Lion не должен зависеть от класса Feline. Используй принцип инъекции зависимостей.
- Инъекция зависимости означает, что класс получает объект, который создан за его пределами.
- Внедрить инъекцию зависимостей можно при помощи конструктора. Нужно объявить переменную внутри
одного класса, а присвоить значение — в другом. Значение ты передашь в конструкторе как параметр.
 */

package com.example;

import java.util.List;

public class Lion {

    Feline feline ;
    boolean hasMane;

    public Lion(String sex,Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

      public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
