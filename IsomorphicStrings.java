class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (mapS[sc] != mapT[tc]) {
                return false;
            }

            mapS[sc] = i + 1;
            mapT[tc] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings solution = new IsomorphicStrings();

        String s1 = "egg";
        String t1 = "add";
        System.out.println(solution.isIsomorphic(s1, t1)); // true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(solution.isIsomorphic(s2, t2)); // false

        String s3 = "paper";
        String t3 = "title";
        System.out.println(solution.isIsomorphic(s3, t3)); // true
    }
}
// import java.util.HashMap;
// import java.util.Map;

// class IsomorphicStringChecker {
//     public boolean isIsomorphic(String s, String t) {
//         if (s.length() != t.length()) return false;

//         Map<Character, Character> mp = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             char original = s.charAt(i);
//             char replacement = t.charAt(i);

//             if (!mp.containsKey(original)) {
//                 if (mp.containsValue(replacement)) {
//                     return false; // Two characters from s mapping to the same character in t
//                 }
//                 mp.put(original, replacement);
//             } else {
//                 if (mp.get(original) != replacement) {
//                     return false; // Mismatch in mapping
//                 }
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         IsomorphicStringChecker checker = new IsomorphicStringChecker();

//         System.out.println(checker.isIsomorphic("egg", "add"));    // true
//         System.out.println(checker.isIsomorphic("foo", "bar"));    // false
//         System.out.println(checker.isIsomorphic("paper", "title"));// true
//         System.out.println(checker.isIsomorphic("ab", "aa"));      // false
//     }
// }
