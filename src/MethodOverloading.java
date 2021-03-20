public class MethodOverloading {
    public static void main(String[] args){
        score("Keerthanaa", 89);
        score(900);
        score();
    }
    public static int score(String name, int points){
        System.out.println("Player " + name + " got " + points + " points.");
        return 1;
    }
    public static int score(int points){
        System.out.println("Unnamed player got " + points + " points.");
        return 0;
    }
    public static int score(){
        System.out.println("No name and No points");
        return 0;
    }
}
