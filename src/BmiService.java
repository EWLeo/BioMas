public class BmiService {
    public int calculate(double height, int weight) {
        int Bio = (int) (weight / (height * height));
        return Bio;
    }
}
