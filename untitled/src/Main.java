public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Melik Hoca","TRH","234525");
        Teacher teacher2 = new Teacher("Mahmut Hoca","MAT","2324");
        Teacher teacher3 = new Teacher("Ramazan Hoca","EDB","4677");

        Course tarih = new Course("Ramazan","trh101","TRH");
        tarih.AddTeacher(teacher);

        Course mat = new Course("Melik Ramazan","mat101","MAT");
        mat.AddTeacher(teacher2);
        Course edbiyat = new Course("Bağcı","edb101","EDB");
        edbiyat.AddTeacher(teacher3);

        Student s1 = new Student("Saban","123","4",tarih,mat,edbiyat);
        Student s2 = new Student("Mahmut","321","3",tarih,mat,edbiyat);
        s2.addBulkExamNote(100,67,67);
        s2.isPass();
        s1.addBulkExamNote(90,67,98);
        //s1.printNote();
        s1.isPass();
        s1.courseGradePointAverage(100,78,96);


    }

}