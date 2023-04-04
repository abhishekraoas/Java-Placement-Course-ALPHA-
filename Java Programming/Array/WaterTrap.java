public class WaterTrap {

    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // calculate left max boundary- array
        int leftMAx[] = new int[n];
        leftMAx[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMAx[i] = Math.max(height[i], leftMAx[i - 1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMAx[i], rightMax[i]);

            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(height));
    }
}
