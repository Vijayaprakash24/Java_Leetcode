class Solution {
    public int totalFruit(int[] fruits) {
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastCount = 0;
        int current = 0;
        int max = 0;

        for (int fruit : fruits) {
            if (fruit == lastFruit || fruit == secondLastFruit) {
                current++;
            } else {
                current = lastCount + 1;
            }

            if (fruit == lastFruit) {
                lastCount++;
            } else {
                lastCount = 1;
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            max = Math.max(max, current);
        }

        return max;
    }
}