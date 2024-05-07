package newPackege;

import example.Classroom;
import example.School2;
import example.Studyable;


public class School extends Classroom implements Studyable {

    int classRaum = 3;

//    public School(int classRaum, int roomNumber, String teacherName) {
//        super(roomNumber, teacherName);
//        this.classRaum = classRaum;
//    }

    public School() {
//        super(i);
        this(10);
    }

    public School(int classRaum) {
//        super();

        this.classRaum = classRaum;
    }

//    public School(int i, int classRaum) {
//        super(i);
//        this.classRaum = classRaum;
//    }

    static void ssrd() {
        Classroom classroom = new Classroom();
        //Studyable.study();
    }

    public static Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }

    public int getFloor() {
        return 5;
    }

    public static void main(String[] args) {
        Classroom school = new School(4);
        Classroom school2 = new Classroom();
        Classroom classroom = new Classroom();
        Studyable studyableSchool = new School();
        school2 = (Classroom) school;
        Studyable era = (Studyable) school;
//        Classroom ssse = (School) classroom;
        //System.out.println(school.roomNumber);
        //Classroom schole = (School) classroom;
        System.out.println(classroom.getFloor());
        System.out.println(school2.getFloor());
        System.out.println(school.getFloor());
        System.out.println(school);
//        System.out.println(classroom.floor);
//        System.out.println(classroom.teacherName);
    }

    @Override
    public int sale() {
        return 0;
    }

    @Override
    public void work() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void study() {
        Studyable.super.study();
    }
}
