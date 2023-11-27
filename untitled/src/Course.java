public class Course {
    String name;
    String mpno;
    String branch;
    String code;
    String prefix;
    int note;



    Teacher teacher;



    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }
    void AddTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        }
        else {
            System.out.printf("Öğretmenin Dersi Uyuşmuyor");
        }


    }


    void TeacherInfo(){
        this.teacher.Print();
    }

}
