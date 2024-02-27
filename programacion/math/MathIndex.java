public class MathIndex
{
    public static void main(String[] args)
    {
        int abs; // Returns the absolute value of an integer
        int min; // Returns the smaller of two integer values
        int max; // Returns the greater of two integer values
        int addExact; // Returns the sum of its arguments, throwing an exception if the result overflows an int
        int subtractExact; // Returns the difference of the arguments, throwing an exception if the result overflows an int
        int incrementExact; // Returns the argument incremented by one, throwing an exception if the result overflows an int. The overflow only occurs for the maximum value
        int decrementExact; // Returns the argument decremented by one, throwing an exception if the result overflows an int. The overflow only occurs for the minimum value
        int multiplyExact; // Returns the product of the arguments, throwing an exception if the result overflows an int
        int negateExact; // Returns the negation of the argument, throwing an exception if the result overflows an int. The overflow only occurs for the minimum value
        long multiplyFull; // Returns the exact mathematical product of the arguments
        double sqrt; // Returns the square root of a double
        double pow; // Returns the value of the first argument raised to the power of the second argument
        double round; // Returns the closest integer to the argument, rounding to the nearest integer
        double ceil; // Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer
        double floor; // Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer
        double pi; // The double value that is closer than any other to pi, the ratio of the circumference of a circle to its diameter
        double random; // Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range
        double rint; // Returns the double value that is closest in value to the argument and is equal to a mathematical integer. If two double values that are mathematical integers are equally close, the result is the integer value that is even

        int x = 1;
        int y = 3;

        abs = Math.abs(-1);
        min = Math.min(x, y);
        max = Math.max(x, y);
        addExact = Math.addExact(x, y);
        subtractExact = Math.subtractExact(x, y);
        incrementExact = Math.incrementExact(x);
        decrementExact = Math.decrementExact(x);
        multiplyExact = Math.multiplyExact(x, y);
        negateExact = Math.negateExact(x);
        multiplyFull = Math.multiplyFull(x, y);
        sqrt = Math.sqrt(9);
        pow = Math.pow(3, y);
        round = Math.round(3.57);
        ceil = Math.ceil(3.57);
        floor = Math.floor(3.57);
        pi = Math.PI;
        random = Math.random();
        rint = Math.rint(3.57);

        System.out.println("abs: " + abs);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("addExact: " + addExact);
        System.out.println("subtractExact: " + subtractExact);
        System.out.println("incrementExact: " + incrementExact);
        System.out.println("decrementExact: " + decrementExact);
        System.out.println("multiplyExact: " + multiplyExact);
        System.out.println("negateExact: " + negateExact);
        System.out.println("multiplyFull: " + multiplyFull);
        System.out.println("sqrt: " + sqrt);
        System.out.println("pow: " + pow);
        System.out.println("round: " + round);
        System.out.println("ceil: " + ceil);
        System.out.println("floor: " + floor);
        System.out.println("pi: " + pi);
        System.out.println("random: " + random);
        System.out.println("rint: " + rint);
    }
}