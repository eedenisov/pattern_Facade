public class BinOps {
    public String sum(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);

        int sum = a1 + b1;
        System.out.println("Результат сложения: " + sum);

        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);

        int mult = a1 * b1;
        System.out.println("Результат умножения: " + mult);

        String result = Integer.toBinaryString(mult);

        return result;
    }
}

