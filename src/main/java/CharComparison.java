public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        int aResult = 0;
        int bResult = 0;
        int shortest = 0;
        if(a.length < b.length) {
            shortest = a.length;
        } else {
            shortest = b.length;
        }
        for(int i = 0; i < shortest; i++) {
            if(a[i] < b[i]) {
                bResult++;
            } else if (a[i] > b[i]) {
                aResult++;
            } else {
                aResult++;
                bResult++;
            }
        }
        if(aResult < bResult) {
            return -1;
        } else if (aResult > bResult) {
            return 1;
        } else {
            return 0;
        }
    }
}
