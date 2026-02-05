public class IT25102956Tute01Q5 {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int exp1 = cal.square(
                    cal.add(
                        cal.multiply(3, 4),
                        cal.multiply(5, 7)
                    )
                  );

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int exp2 = cal.add(
                    cal.square(cal.add(4, 7)),
                    cal.square(cal.add(8, 3))
                  );

        System.out.println("Result 1: " + exp1);
        System.out.println("Result 2: " + exp2);
    }
}
