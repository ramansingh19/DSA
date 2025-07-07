package FunctionAndMethod;


public class binaryTodecimal {

    public static void BinTodec (int BinNum){
        int myNum = BinNum;
        int pow = 0;
        int Dec = 0;
        while (BinNum > 0){
            int lastNum = BinNum % 10;
            Dec = Dec + (lastNum * (int)(Math.pow(2,pow)));
            pow++;
            BinNum = BinNum/10;
        }
        System.out.println("Decimal of "+myNum +" = "+ Dec);
    }

    public static void main(String[] args) {
        BinTodec(1000);
    }
}

