class Choinka {
    public static void main(String[] args) {
        int size= Integer.parseInt(args[0]);

        for(int i=1; i<=size; i++){

            for(int j=1; j<=i; j++){

                System.out.print("*");

            }

            System.out.print("\n");

        }
    }
}