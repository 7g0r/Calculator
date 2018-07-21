public class StringCalculator {

    public int add(String s) {
        if (s.equals( "" )) {
            return 0;
        } else if (s.length() == 1) {
            int singleNum = Integer.parseInt( s );
            return singleNum;
        }

        String[] arrayOfNumbers = s.split( "[,\n]" );
           int sum = 0;
           int parsedNumber;

    //    int element = Integer.parseInt( arrayOfNumbers[0] );
    //    int element2 = Integer.parseInt( arrayOfNumbers[1] );

        for (String number : arrayOfNumbers) {
            parsedNumber = Integer.parseInt( number );
            sum += parsedNumber;
        }
        return sum;
    }
}