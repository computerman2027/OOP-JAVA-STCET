class College {
    String collegeName;
    Student student;

    public College(String collegeName, College.Student student) {
        this.collegeName = collegeName;
        this.student = student;
    }

    class Student {
        String studentName;
        String department;

        public Student(String studentName, String department) {
            this.studentName = studentName;
            this.department = department;
        }

        void displayStudent() {
            System.out.println("Name = " + studentName + "\nDept = " + department + "\nCollege = " + collegeName);
        }
    }

    void displayStudentOuter() {
        // System.out.println("Name = " + studentName + "\nDept = " + department +
        // "\nCollege = " + collegeName);
        // cannot be access from outer class

        System.out.println(
                "Name = " + student.studentName + "\nDept = " + student.department + "\nCollege = " + collegeName);
    }
}

public class NonStaticNestedClass {

    public static void main(String[] args) {
        College obj1 = new College("ABCD", null);
        College.Student obj2 = obj1.new Student("Rohit Das", "CSE");
        System.out.println("Access from inner class");
        obj2.displayStudent();

        System.out.println("Access from outer class");
        try {
            System.out.println("Student variable not initialized");
            obj1.displayStudentOuter();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        obj1.student = obj2;

        System.out.println("Student variable initialized");
        obj1.displayStudentOuter();
    }

}
