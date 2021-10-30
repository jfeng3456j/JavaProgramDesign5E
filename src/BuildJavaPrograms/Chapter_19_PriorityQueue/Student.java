package BuildJavaPrograms.Chapter_19_PriorityQueue;

public class Student implements Comparable<Student> {
    private int rank;
    private String name;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student o) {
        if (rank < o.rank) {
            return -1;
        } else if (rank > o.rank) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        String result = "student name: " + name + " rank: " + rank;
        return result;
    }
}
