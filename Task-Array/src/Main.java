public class Main {
    public static void main(String[] args) {

        int[] temps =new int[5];

        temps[0]=15;
        temps[1]=20;
        temps[2]=45;
        temps[3]=41;
        temps[4]=31;

        temps[2]=10;
        for(int i :temps) {
            System.out.println(i);
        }

    }
}