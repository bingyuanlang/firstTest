public class Main {
    public static void main(String[] args){
        for (int i = 0 ; i < args.length ; ++i)
            System.out.println("args["+i+"] : " + args[i]);
        int a = 'a';
        int b = 'b';
        if (args.length >=2) {
            try {
                a = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                a = -1;
            }
            try {
                b = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                b = -1;
            }
        }

        Plus pl = new Plus(a, b);
        System.out.println(a + " + " + b + " = " + pl.value());
    }

    static class Plus {
        public Plus (int a, int b) {
            mA = a;
            mB = b;
        }
        public int value () {
            return mA + mB;
        }
        private int mA;
        private int mB;
    }
}
