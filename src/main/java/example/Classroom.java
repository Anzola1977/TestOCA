package example;

public class Classroom {
    public int roomNumber = 67;
    public String teacherName;
    protected static int globalKey = 54321;
    public int floor = 3;

    public int getFloor() {
        return 3;
    }
    private static void main(String[] args){}
    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
    public void sum(){
        System.out.println("1456");
    }
    double amount = 0xE;
    int amount1 = 0xE;

    public Classroom(int roomNumber) {
        this.roomNumber = roomNumber;
        System.out.println("1567");
    }

    public Classroom() {
    }



    //    public Classroom(int r, String t) {
//        this.roomNumber = r;
//        this.teacherName = t;
//    }
}
