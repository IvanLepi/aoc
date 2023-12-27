class Aoc {

    public static void main(String[] args) {

        int solution = 0;
        String inputs = "";
        String[] myInput = {"1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"};

        for (int i = 0; i < myInput.length; i++) {
            // Go trough a string ti find first number 
            for (int j = 0; j < myInput[i].length(); j++) {

                if (Character.isAlphabetic(myInput[i].charAt(j))) {
                    //its a character we continue
                } else {
                    inputs = inputs + myInput[i].charAt(j);
                    break;
                }
            }
            // Go trough a string from the back to find first number}
            for (int k = myInput[i].length() - 1; k >= 0 ; k--) {

                if (Character.isAlphabetic(myInput[i].charAt(k))) {
                } else {
                    inputs = inputs + myInput[i].charAt(k);
                    break;
                }
            }

            solution += Integer.parseInt(inputs);
            inputs = "";
        }

        System.out.println(solution);


    }
}
