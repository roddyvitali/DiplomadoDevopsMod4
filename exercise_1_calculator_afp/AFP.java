package exercise_1_calculator_afp;

class AFP {
    public static void main(String[] args) {
        System.out.println("AFP");
    }

    public int withdrawMoney(int balance) {
        if (balance <= 0)
            return 0;
        else if (balance <= 1000000)
            return balance;
        else if (0.1 * balance <= 1000000)
            return 1000000;
        else if (0.1 * balance <= 4300000)
            return (int) (0.1 * balance);
        return 4300000;
    }

}