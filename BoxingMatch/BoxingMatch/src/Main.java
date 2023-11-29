public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("melik",25,330,85,45);
        Fighter f2 = new Fighter("ramazan",30,300,80,50);
        Match match = new Match(f1,f2,70,100);
        match.run();
    }
}