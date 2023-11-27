public class Student {
    String name;
    String stdNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    int s1;
    int s2;
    int s3;


    double avarage;
    double lesson;
    boolean isPass;

    Student(String name,String stdNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }
    void addBulkExamNote(int note1,int note2,int note3){
        if (note1 >=0 && note1<=100) {
            this.c1.note = note1;
        }
        if (note2 >=0 && note2<=100) {
            this.c2.note = note2;
        }
        if (note3 >=0 && note3<=100) {
            this.c3.note = note3;
        }
    }
    void isPass(){
        this.avarage = (this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.avarage>55){
            System.out.printf("\nSayın: "+this.name +"\n"+this.avarage+": Ortalama İle Geçtiniz");
            this.isPass = true;
        }
        else {
            System.out.printf("\nSayın: "+this.name +"\n"+this.avarage+": Ortalama İle Kaldınız");
            this.isPass = false;

        }


    }
    void courseGradePointAverage(int s1,int s2,int s3){
        System.out.printf("\n" + c1.name + "  " + c1.prefix +" :'ders ort: " + ((this.s1*0.2)+(this.c1.note*0.8)));
        System.out.printf("\n" + c2.name + "  " + c2.prefix + " :'ders ort: " + ((this.s2*0.2)+(this.c2.note*0.8)));
        System.out.printf("\n" + c3.name + "  " + c3.prefix + " :'ders ort: " + ((this.s3*0.2)+(this.c3.note*0.8)));



    }
    void printNote(){
        System.out.printf("\n"+this.c1.name + "  : " + this.c1.note);
        System.out.printf("\n"+this.c2.name + "  : " + this.c2.note);
        System.out.printf("\n"+this.c3.name + "  : " + this.c3.note);
    }

}
