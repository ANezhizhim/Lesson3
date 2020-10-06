package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone []arrPhone = new Phone[4];

        arrPhone[0] = new Phone("9155476161", "Honor", 120.1f);
        arrPhone[1] = new Phone("9155476162", "Samsung", 125.2f);
        arrPhone[2] = new Phone("9155476163", "HTC", 127.3f);
        arrPhone[3] = new Phone("9155476165", "Nokia");

        arrPhone[0].receiveCall("Вася");

        for (Phone phone :
                arrPhone) {
            System.out.println("Номер телефона: " + phone.getNumber() + " модель: " + phone.getModel() + " Вес: " + phone.getWeight());
        }

        for (Phone phone :
                arrPhone) {
            System.out.println("Номер телефона:" + phone.getNumber());
        }

        arrPhone[0].receiveCall("Давид Маркович", "Городской");
        arrPhone[0].sendMessage1("9155476161", "9155476162", "9155476163");
    }
}



/*Замечание 2:
Задание 1: Phone – почему поля protected, если наследников нет у этого класса? В Main пробелма с код стайлом,
 Phone phon – почему нельзя пременную phone назвать?

 */

/*
Замечание:
•	Задание 1: Phone: String ph_number, String ph_model, float ph_weight наименование переменных в camelCase.
 this("8-800","Стационарный"); - лучше пеернести в конструктор без аргументов. Почему поля  без модификаторов
  доступа?
 Продумать модификаторы. В методе main предлагаю где можно использовать циклы

Домашнее
задание
Класс Phone
∎ Создайте класс Phone, который содержит переменные number,
model и weight.

∎ Создайте три экземпляра этого класса.

∎ Выведите на консоль значения их переменных.

∎
Добавить в класс Phone методы: receiveCall, имеет один
параметр – имя звонящего. Выводит на консоль сообщение “Звонит
{name}”. getNumber – возвращает номер телефона. Вызвать эти
методы для каждого из объектов.

∎ Добавить конструктор в класс Phone, который принимает на вход
три параметра для инициализации переменных класса - number,
model и weight.

∎ Добавить конструктор, который принимает на вход два параметра
для инициализации переменных класса - number, model.

∎
Добавить конструктор без параметров.

∎ Вызвать из конструктора с тремя параметрами конструктор с
двумя.

∎ Добавьте перегруженный метод receiveCall, который принимает
два параметра - имя звонящего и номер телефона звонящего.
Вызвать этот метод.

∎ Создать метод sendMessage с аргументами переменной длины.
Данный метод принимает на вход номера телефонов, которым
будет отправлено сообщение. Метод выводит на консоль номера
этих телефонов.


 */