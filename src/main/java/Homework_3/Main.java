package Homework_3;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Stas", 15000, LocalDate.of(2003,5,23)));
        list.add(new Employee("Fedor", 15000, LocalDate.of(1994,2,12)));
        list.add(new Guide("Ivan", 20000, LocalDate.of(2000,4,12)));
        Guide.upSalary(list, 200);
        Collections.sort(list);
        for (var item : list) {
            System.out.println(item);
        }

    }
}
