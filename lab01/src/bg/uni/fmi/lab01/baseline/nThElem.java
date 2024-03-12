package bg.uni.fmi.lab01.baseline;

public class nThElem {

//    Task1
    int nThElement(int[] array, int n) throws Exception {
        int oddCount = 0;
        for (int j : array) {
            if (j % 2 == 1) {
                oddCount++;
            }

            if (oddCount == n) {
                return j;
            }
        }

        throw new Exception("Index exceeds the list size");
    }

    public static void main(String[] args) {
        nThElem exercise = new nThElem();

//        int[] arr1 = {5,3,8,1,9};
//        int n = 10;
//        try {
//            System.out.println(exercise.nThElement(arr1, n));
//        }
//        catch(Exception e){
//            System.out.println("Exception: " + e.getMessage());
//        }
    }
}


