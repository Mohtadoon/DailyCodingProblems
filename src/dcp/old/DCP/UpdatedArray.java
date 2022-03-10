package dcp.old.DCP;

public class UpdatedArray {


    public int[] productAtIndex(int[] inputIntArray) {
        int[] productArray = new int[inputIntArray.length];

        for (int index = 0; index < inputIntArray.length; index++) {
            productArray[index] = productOfsubset(inputIntArray, index);
        }
        return productArray;
    }

    public int productOfsubset(int[] parentArray, int Index) {
        int product = 1;
        for (int index = 0; index < parentArray.length; index++) {
            if (index == Index) continue;
            product *= parentArray[index];
        }
        return product;
    }


}



