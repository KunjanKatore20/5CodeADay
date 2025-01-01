class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Original array: ");
        printArray(arr);
        reverseArray(arr);
        System.out.println("Reversed array: ");
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int temp = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}