package CompoundInterest;

public class CompuundInterest {
    public static void main(String[] args) {
        final double STARTRATE=10;
        final int NRATES=6;
        final int NYEARS=10;

        //установить процентные ставки 10...15%
        double [] interestRate=new double[NRATES];
        for (int j=0; j<interestRate.length;j++){
            interestRate [j]=(STARTRATE+j)/100.0;
            System.out.println(interestRate [j]);
        }

        double [][] balances=new double[NYEARS][NRATES];
        for (int j=0;j<balances[0].length;j++) {
            balances[0][j] = 10000;
            System.out.println(balances[0][j]);
            System.out.println(balances.length);
            }

        //расчитать проценты на следующие годы
        for (int i=1; i<balances.length; i++)
        {
                for (int j=0; j<balances[i].length; j++)

                {
                    double oldBalance=balances[i-1] [j];
                    System.out.println(balances[i-1] [j]);

                    double interest=oldBalance*interestRate[j];
                    System.out.println(interest);

                    balances [i] [j]=oldBalance+interest;
                    System.out.println(balances [i] [j]);
                }
                //выводим ряд процентных ставок
            for (int j=0;j<interestRate.length;j++)
                System.out.printf("%9.0f%%", 100 * interestRate[j]);
            System.out.println();
            for (double[]row:balances){
                for (double b:row)
                    System.out.printf("%10.2f",b);
                System.out.println();
            }
        }
    }
}