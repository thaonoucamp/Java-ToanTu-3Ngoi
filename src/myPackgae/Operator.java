package myPackgae;

public class Operator {
    public static void main(String[] args) {
        int sum = 0;
        int x = 5;

        if (x > 5) {
            sum = sum + 1;
        } else {
            sum = sum - 1;
        }
        // Toán tử 3 ngôi dùng cho trường hợp chọn 1 in 2. Đúng hoặc sai;
        sum = (x > 5) ? (sum + 1) : (sum - 1);

        String s = (x < 5) ? "Hello" : "Goodbye";
    }
}
