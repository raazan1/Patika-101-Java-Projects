public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Match(Fighter f1, Fighter f2 ,int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()) {
            System.out.printf("\n Dövüş Başlasın: \n");

            while (this.f1.healthy >0 && this.f2.healthy>0){
                System.out.printf("\n****************(--New Round--)****************");
                if(isPunch()<=5){
                    this.f2.healthy = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                }
                else{
                    this.f1.healthy = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                }


                System.out.printf("\n" + this.f1.name + " Sağlık: " + this.f1.healthy);
                System.out.printf("\n" + this.f2.name + " Sağlık: " + this.f2.healthy);
            }
        }
        else{
            System.out.printf("Sikletler Uyuşmuyor");
        }
    }
    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <=maxWeight);
    }
    boolean isWin(){
        if(this.f1.healthy == 0){
            System.out.printf(this.f2.name + " :Kazandı");
            return true;
        }
        if(this.f2.healthy == 0){
            System.out.printf(this.f1.name + " :Kazandı");
            return true;
        }
        return false;
    }
    double isPunch(){
        double randNum = Math.random()*10;
        return randNum;

    }


}
