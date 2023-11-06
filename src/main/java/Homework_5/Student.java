package Homework_5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private List<Double> grades;
    private String specialty;
//    Найдите первых 5 студентов специальности
//    "Информатика" со средним баллом выше 4.5, отсортированных по убыванию среднего балла.
    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public static List<Student> getAverageGrade(List<Student> studentList) {
        return studentList.stream()
                .filter(n -> n.grades.stream().mapToDouble(a -> a).sum()/n.grades.size() >= 4.5)
                .filter(n -> n.specialty.equals("Информатика"))
                .sorted((a, b) -> (int) (((b.grades.stream().mapToDouble(s -> s).sum()/b.grades.size()) * 10) -
                        (a.grades.stream().mapToDouble(e -> e).sum() / a.grades.size()) * 10))
                .limit(5)
                .toList();
    }

    @Override
    public String toString() {
        return name + " " + grades + " " + specialty;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("bob", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0), "Информатика"));
        studentList.add(new Student("sob", Arrays.asList(2.0, 5.0, 4.5, 2.5, 4.0), "Информатика"));
        studentList.add(new Student("dob", Arrays.asList(5.0, 5.0, 4.5, 4.5, 4.0), "Информатика"));
        studentList.add(new Student("fob", Arrays.asList(5.0, 5.0, 5.5, 4.5, 5.0), "Физика"));
        studentList.add(new Student("vob", Arrays.asList(5.0, 5.0, 4.5, 5.0, 5.0), "Информатика"));


        List<Student> newList = getAverageGrade(studentList);
        for (var item  : newList){
            System.out.println(item);
        }
    }
}
