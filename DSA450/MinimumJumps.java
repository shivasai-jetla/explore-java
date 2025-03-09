   package DSA450;

public class MinimumJumps {
    public static int minJumps(int[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == 0) {
            return -1; // If array is empty or first element is 0, end is unreachable
        }

        int n = arr.length;
        int jumps = 0; // Number of jumps required to reach the end
        int currentEnd = 0; // Farthest index that can be reached with the current number of jumps
        int farthest = 0; // Farthest index that can be reached overall

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]); // Update farthest reachable index
            if (i == currentEnd) { // If we have reached the end of the current jump
                jumps++;
                currentEnd = farthest; // Update the range for the next jump
                if (currentEnd >= n - 1) {
                    break; // If we can reach the end, exit early
                }
            }
        }

        return currentEnd >= n - 1 ? jumps : -1; // Check if end is reachable
    }

    public static void main(String[] args) {
        int[] arr = {1,10,1,1, 1, 2, 6, 1, 6, 8, 9};
        int result = minJumps(arr);
        System.out.println("Minimum number of jumps: " + result);
    }
}

