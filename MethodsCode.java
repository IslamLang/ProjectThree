import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class MethodsCode {

    /**
     * TASK 1
     * Write a method named getTotal
     * that accepts number as string argument
     * and return sum of digits in provided number,
     * but there is a catch
     * if digit is even you digit is multiplied by 2
     * if digit is odd you digit is multiplied by -1
     * Note: if sum is zero then return -1
     *
     * ex1: you passed argument "85" and return is 11
     * because: (8 * 2) + (5 * -1) = 11
     *
     * ex2: "0" ->  -1
     * because:
     */
    //write you code here
    public int getTotal(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            Integer digit = Integer.valueOf(number.substring(i, i + 1));
            if (digit % 2 == 0) {
                sum += digit * 2;
            } else {
                sum += digit * -1;
            }
        }
        return sum == 0 ? -1 : sum;
    }

    //end

    /**
     * TASK 2
     * Write a method named bankStatementCalculator
     * that accepts bankStatements as List<String> argument
     * and return total of bank statements
     * Note: if total is zero then return -1
     *
     * ex: arguments is like: {$15.00, $10.20, $2,050,75} and return is 2075.95
     *
     * Hint: remove the unnecessary icons and calculate the total
     */
    //write you code here
    public double bankStatementCalculator(List<String> myStatement) {
        double sum = 0;
        for (String str : myStatement) {
            String removedDollar = str.replace("$", "");
            String removedComma = removedDollar.replace(",", "");
            sum += Double.valueOf(removedComma);
        }
        return sum == 0 ? -1 : sum;
    }
    //end


    /**
     * TASK 3
     * Write a method named randomGenerator
     * that accepts bound as int argument
     * and return random number with provided bound which is bigger than 1
     * if bound is less than 1  return -1
     * if bound is equal to 1 return 1
     *
     * ex: 1 -> 1
     * ex2: -1000 -> -1
     * ex3: 10 -> (random number between 1 and 10)
     */
    //write you code here
    public int randomGenerator(int bound) {
        if (bound < 1) {
            return -1;
        } else if (bound == 1) {
            return 1;
        } else {
            Random rand = new Random();
            int randomNumber = rand.nextInt(10) + 1;
            return randomNumber;
        }

    }
    //end


    /**
     * TASK 4
     * Write a method named getPopulation
     * that accepts countries as List<String>, populations in countries as List<String> and selected country as String arguments
     * and return string population of selected country in
     * countries list
     * if selected country is not in the countries list then return "-1"
     *
     * NOTE:
     * this method will not work if you don't finish the randomNumber method
     * <
     * ex:
     * countries -> "USA", "Mexico", "Canada", "Brazil"
     * populations -> "350000000", "100000000", "50000000", "120000000"
     * selected country -> "Canada"
     *
     * return is "50000000"
     * because: canada has population of 50000000
     *
     * ex2:
     *
     * countries -> "USA", "Mexico", "Canada", "Brazil"
     * populations -> "350000000", "100000000", "50000000", "120000000"
     * selected country -> "Germany"
     *
     * return is "-1"
     */
    //write you code here
    public String getPopulation(List<String> countries, List<String> populations, String randomCountry) {
        if (countries.contains(randomCountry)) {
            int index = countries.indexOf(randomCountry);
            return populations.get(index);
        } else
            return "-1";
    }

    //end

    /**
     * TASK 5
     * Bob was writing names of his relatives, but he did some mistakes while writing them
     * you as a best friend want to help him to correct that list
     *
     * Write a method named correctListOfNames
     * that accepts names as List<String>, wrongName as string and correctName as string argument
     * and return corrected names
     *
     * ex:
     * names: {"Alice", "Bob", "Alo"}
     * wrongName: Alo
     * correctName: Ali
     *
     * return {"Alice", "Bob", "Ali"}
     */
    // write your code here
    public List<String> correctListOfNames(List<String> asList, String wrongName, String correctName) {
        for (int i = 0; i < asList.size(); i++) {
            if (asList.get(i).equals(wrongName)) {
                asList.set(i, correctName);
            }
        }
        return asList;
    }

    //end

}
