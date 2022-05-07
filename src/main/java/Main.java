public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        
        String resultSum = binOps.sum("10001", "1010"); //17 и 10
        String resultMult = binOps.mult("1101", "1101"); // 13 и 13

        System.out.println("Результат суммы в двоичной записи: "
                + resultSum);
        System.out.println("Результат умножения в двоичной записи: "
                + resultMult);
    }
}
