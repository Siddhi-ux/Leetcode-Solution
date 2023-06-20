class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum;
        int counter = 0;
        StringBuilder output = new StringBuilder();

        while (i >= 0 || j >= 0) {
            sum = counter;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            i--;
            j--;
            output.append(sum % 2);
            counter = sum / 2;
        }

        if (counter != 0) {
            output.append(1);
        }

        return output.reverse().toString();
    }
}
