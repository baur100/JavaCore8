package homework10;

import java.util.Arrays;

public class Friend {
    private String name;
    private String lastName;
    private int grade;
    private Books[] books;

    public Friend(String name, String lastName, int grade, Books[] books) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", books=" + Arrays.toString(books) +
                '}';
    }

    public void printBooks() {
        for (Books v : this.books) {
            System.out.println(v);
        }






    }
    public void printInfo(){
        System.out.println(this.name + " " + this.lastName + " " + "is in " + this.grade + "" + " grade" +
                        " " + "and she loves " + Books.FAIRYTALES + " ");

    }

    }