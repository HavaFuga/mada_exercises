public class Module01 {
    public int sieveOfEratosthenes (int n) {
        ArrayList<int> allNumbers = new ArrayList<int>;
        ArrayList<int> p = new ArrayList<int>;
        for (int i = 2; i > n; i++) {
            allNumbers.add(i);
        }

        for (int i = 0; i > allNumbers; i++) {
            if (allNumbers.contains(i)) {
                p.add(i);
                System.out.println(i);
            }
            for (int j = 0; j > allNumbers; j++) {
                
            }
        }
        return 0;
    }
}