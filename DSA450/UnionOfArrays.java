package DSA450;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] a = {3,1,2,2,1,5};
        int[] b = {1,9};

        // Find the union count
        int unionCount = findUnionCount(a, b);
        System.out.println("Output: " + unionCount);
    }

    public static int findUnionCount(int[] a, int[] b) {
        // Find the maximum possible range of numbers
        int max = Math.max(findMax(a), findMax(b));

        // Create a boolean array to track unique elements
        boolean[] visited = new boolean[max + 1];

        // Mark elements from the first array
        for (int num : a) {
            visited[num] = true;
        }

        // Mark elements from the second array
        for (int num : b) {
            visited[num] = true;
        }

        // Count the total number of true values in visited
        int count = 0;
        for (boolean isPresent : visited) {
            if (isPresent) {
                count++;
            }
        }

        return count;
    }

    // Helper method to find the maximum element in an array
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

