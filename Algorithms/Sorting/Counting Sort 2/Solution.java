//     Author: Rodney Shaghoulian
//     Github: github.com/RodneyShag
// HackerRank: hackerrank.com/RodneyShag

static int[] countingSort(int[] givenArray) {
    /* Save into buckets */
    final int maxValue = 100;
    int[] bucket = new int[maxValue];
    for (int value : givenArray) {
        bucket[value]++;
    }

    /* Create sorted array */
    int[] sortedArray = new int[givenArray.length];
    int position = 0;
    for (int i = 0; i < bucket.length; i++) {
        for (int j = 0 ; j < bucket[i]; j++) {
            sortedArray[position++] = i;
        }
    }
    return sortedArray;
}
