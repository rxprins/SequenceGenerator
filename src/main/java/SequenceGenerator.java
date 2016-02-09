/**
 * Created by rianaprins on 2/8/16.
 */
public class SequenceGenerator {
    private char theChars = 0;

    public String printSequence(int begin, int end, boolean isNumber, boolean isOdd) {
        String answer = "";
        for (Integer i = begin; i <= end; i++) {
            if (isOdd) {
                if (i % 2 == 1) {
                    answer += i.toString() + " ";
                }
            } else if (isNumber) {
                answer += i.toString() + " ";
            } else {
                //integer to int
                int j = i.intValue();
                theChars = (char) j;
                answer += theChars + " ";
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        System.out.println("Print this : " + sequenceGenerator.printSequence(3, 19, true, false));
        System.out.println("Print this : " + sequenceGenerator.printSequence('a', 'f', false, false));
        System.out.println("Print this : " + sequenceGenerator.printSequence(4, 13, true, true));

    }

}
