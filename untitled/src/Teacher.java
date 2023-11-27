public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void Print(){
        System.out.printf("\n*********\nAdı: "+this.name+"\nTelefonu: "+this.mpno+"\nBölümü: "+this.branch);
    }
}
