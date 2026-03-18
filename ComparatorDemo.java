import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    int id;
    String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class SortByName implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo
{
    public static void main(String[] args)
    {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Ram"));
        list.add(new Student(2, "Hari"));
        list.add(new Student(3, "Sita"));

        Collections.sort(list, new SortByName());

        for(Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}

