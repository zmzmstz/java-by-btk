public class Main {
    public static void main(String[] args) {
        String[] students = new String[4];
        students[0] = "Ali";
        students[1] = "Veli";
        students[2] = "Zeynep";
        students[3] = "Meryem";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        //another use of for loop for arrays
        for(String student:students){
            System.out.println(student);
        }
    }
}