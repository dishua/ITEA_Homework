/*Создайте класс, описывающий человека (создайте метод выводящий информацию о человеке).
На его основе создайте класс студент с полями (айди, имя, фамилия, факультет, рейтинг(средний бал), год поступления) (переопределите метод вывода информации).Создайте класс “группа” который содержит массив из 10 объектов класса студент.
Реализуйте методы добавления/удаления студента и метод поиска студента по фамилии.
Определите метод toString() для класса студент чтобы он выводил имя і фамилию и средний бал в формате ( Студент Петренко Алексей, рейтинг - 4,4 )
Дополнительно, можно сделать ( Определите метод toString() для группы так, чтобы он выводил список студентов в алфавитном порядке.)*/

package com.itea.dshymanskyi.Lesson4_14122021;

import java.util.Comparator;
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework4_1_Group {
    ArrayList<Homework4_1_Student> group = new ArrayList<>(
            Arrays.asList(
                    new Homework4_1_Student("Vasya", "Pupkin", 1, "History", 4.5, new Date(2004, 9, 1)),
                    new Homework4_1_Student("Petka", "Pyatochkin", 2, "Art", 4, new Date(2004, 9, 1)),
                    new Homework4_1_Student("Vovka", "Vovchik", 3, "Social", 2.4, new Date(2004, 9, 1)),
                    new Homework4_1_Student("Dima", "Dimkin", 4, "Math", 3.9, new Date(2004, 9, 1)),
                    new Homework4_1_Student("Kolya", "Dyadya", 5, "Physic", 2.9, new Date(2004, 9, 1)),
                    new Homework4_1_Student("Dasha", "Pashkina", 6, "Art", 4.7, new Date(2004, 9, 1)),
                    new Homework4_1_Student("Masha", "Mashkina", 7, "Language", 3, new Date(2004, 9, 1)),
                    new Homework4_1_Student("Sasha", "Kostylev", 8, "Biology", 4.2, new Date(2004, 9, 1)),
                    new Homework4_1_Student("Ira", "Irkina", 9, "Chemistry", 3.3, new Date(2004, 9, 1)),
                    new Homework4_1_Student("Anna", "Sedakova", 10, "Language", 4.1, new Date(2004, 9, 1))));


    void addStudent(Homework4_1_Student student) {
        group.add(student);
    }

    void deleteStudent(Homework4_1_Student student) {
        group.remove(student);
    }

    Homework4_1_Student search(String secondName) {
        for (Homework4_1_Student student : group) {
            if (student.getSecondName().equals(secondName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder groupToString = new StringBuilder();
        group.sort(Comparator.comparing(Homework4_1_Human::getSecondName));
//      Arrays.sort(group.toArray());
        for (Homework4_1_Student student:group){
            groupToString.append(student.toString()).append("\n");
        }
        return groupToString.toString();
    }
}
