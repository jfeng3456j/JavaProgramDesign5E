package BuildJavaPrograms.Chapter_7_Arrays.ProgramProjects.largeint;

public class LargeInteger {

    private static int LENGTH = 50;
    private int[] value;

    public LargeInteger() {
        this.value = new int[LENGTH];
    }

    public LargeInteger(int[] value) {

        if (value == null) throw new NullPointerException();

        if (value.length != 50) throw new IllegalArgumentException();

        this.value = value;
    }

    public LargeInteger(int value) {
        if (value < 0 ) throw new IllegalArgumentException();

        this.value = new int[LENGTH];

        int position = LENGTH - 1;
        while (value > 0) {
            this.value[position] = value % 10;
            value /= 10;
            position--;
        }
    }

    public LargeInteger(String num) {
        if (num == null) throw new NullPointerException();
        if (num.length() != LENGTH) throw new IllegalArgumentException();

        if (!isNumber(num)) throw new IllegalArgumentException();

        this.value = new int[50];
        for(int i = 0 ; i < num.length(); i++) {
            this.value[value.length - 1 - i] = Character.getNumericValue(num.charAt(num.length() - 1 -i));
        }
    }


    public static LargeInteger add(LargeInteger l1, LargeInteger l2) {
        int[] sum = new int[LENGTH];

        for(int i = LENGTH - 1; i >= 0; i--) {
            int next = sum[i] + l1.value[i] + l2.value[i];

            if (next < 10) {
                sum[i]  = next;
            } else if (i > 0) {
                sum[i] = next % 10;
                sum[i-1] = 1;
            } else {
                sum[i] = next % 10;
            }
        }

        return new LargeInteger(sum);
    }

    private boolean isNumber(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) return false;
        }

        return true;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < this.value.length; i++) {
            sb.append(this.value[i]);
        }

        return sb.toString();
    }


}
