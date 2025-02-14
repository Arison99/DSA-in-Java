package Roman;
import java.util.HashMap;
import java.util.Map;

class Roman {
    /**
     * Converts a Roman numeral to an integer.
     * 
     * @param s the Roman numeral string
     * @return the integer representation of the Roman numeral
     */
    public int romanToInt(String s) {
        // Create a map to store the Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0; // Initialize the result variable
        int length = s.length(); // Get the length of the input string

        // Iterate through each character in the string
        for (int i = 0; i < length; i++) {
            int currentVal = romanMap.get(s.charAt(i)); // Get the value of the current Roman numeral
            // If the current value is less than the next value, subtract it from the result
            if (i < length - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                // Otherwise, add it to the result
                result += currentVal;
            }
        }

        return result; // Return the final result
    }

    public static void main(String[] args) {
        Roman Roman = new Roman();
        
        // Test cases
        System.out.println(Roman.romanToInt("III")); // Output: 3
        System.out.println(Roman.romanToInt("IV")); // Output: 4
        System.out.println(Roman.romanToInt("IX")); // Output: 9
        System.out.println(Roman.romanToInt("LVIII")); // Output: 58
        System.out.println(Roman.romanToInt("MCMXCIV")); // Output: 1994
    }
}