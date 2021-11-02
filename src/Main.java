public class Main {
    public static void main(String[] args) {
        BmiService markBio = new BmiService();
        double height = 1.87;
        int weight = 95;
        int indexBio = markBio.calculate(height, weight);
        System.out.println(indexBio);
    }
}
