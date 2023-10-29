package Homework_3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Employee implements Comparable<Employee> {
    private String name;
    private float salary;
    private LocalDate date;

    public void upSalary(float amount){
        salary += amount;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, salary: %.2f, data: %s", name, salary, date);
    }
    /*Сортировка по дате рождения*/
    @Override
    public int compareTo(Employee o) {
        if (this.getDate().isBefore(o.getDate())) return -1;
        else if (this.getDate().isAfter(o.getDate())) return 1;
        else return 0;

    }
}
