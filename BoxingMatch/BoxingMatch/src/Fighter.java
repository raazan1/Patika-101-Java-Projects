public class Fighter {
    String name;
    int damage;
    int healthy;
    int weight;
    int dodge;

    Fighter(String name,int damage,int healthy,int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.healthy = healthy;
        this.weight = weight;
        if(dodge>=0 && dodge<=100){
            this.dodge = dodge;
        }
        else{
            this.dodge = 0;
        }
        this.dodge = dodge;
    }

    int hit(Fighter foe){
        System.out.printf("\n" + this.name + " => " + foe.name + " " + this.damage);
        if(foe.isDodge()){
            System.out.printf( foe.name + "Gelen Hamleyi Blokladı !!!");
            System.out.printf("\n------------------");

        }

        if(foe.healthy -this.damage <0){
            return 0;
        }
        return foe.healthy-this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber<=this.dodge;
    }


}
