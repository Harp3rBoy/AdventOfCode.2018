import java.io.BufferedReader;
import java.io.FileReader;

public class _2018One {

    public static void main(String[] args) {
        System.out.println(total());
    }

    private static int total() {
        int output = 0;
        try (BufferedReader in = new BufferedReader(new FileReader("input"))) {
            String temp;
            while ((temp = in.readLine()) != null) {
                if (temp.charAt(0) == '+') {
                    output += Integer.parseInt(temp.substring(1));
                } else {
                    output -= Integer.parseInt(temp.substring(1));
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return output;
    }
}
