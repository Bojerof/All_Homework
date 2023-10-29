package Homework_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

public class Guide extends Employee {


    public Guide(String name, float salary, LocalDate data) {
        super(name, salary, data);
    }

    public static void upSalary(List<Employee> list, float amount) {
        for (Employee item : list) {
            if (!(item instanceof Guide)) {
                item.upSalary(amount);
            }
        }
    }
}
