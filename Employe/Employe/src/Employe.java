public class Employe {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employe(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    int tax(){
        if(this.salary>1000){
            return (this.salary*3)/100;
        }
        return 0;
    }
    int bonus(){

        if(this.workHours>40){
            //this.salary = this.salary+(this.workHours-40)*30;
            return ((this.workHours-40)*30);
        }
        return 0;
    }
    int raiseSalary(){

        if(2021-this.hireYear<10){
            return ((this.salary*5)/100);
        }
        if(2021-this.hireYear>9 && 2021-this.hireYear<20){
            return ((this.salary*10)/100);
        }
        else {
            return ((this.salary*15)/100);
        }
    }
    void ToString(){
        System.out.printf(
                "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Tarihi : " + this.hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile Birlikte Maaş : " + (bonus() + this.salary-tax()) + "\n" +
                "Toplam Maaş : " + (bonus() + raiseSalary() +this.salary-tax()) + "\n" +
                "---------------------------"

                );
    }
}
