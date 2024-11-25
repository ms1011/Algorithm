import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static char[] vowel = {'a', 'e', 'i', 'o', 'u'};
    static List<String> passwords = new ArrayList<>();
    static boolean validVowel = false;
    static boolean validThree = true;
    static boolean validDoubleEO = true;

    static void input() {
        while (true) {
            String password = scan.nextLine();
            if (password.equals("end")) {
                break;
            } else {
                passwords.add(password);
            }
        }
    }

    static boolean checkVowel(char word) {        
        for (char v : vowel) {
            if (word == v) {
                return true;
            }
        }

        return false;
    }

    static void checkThree(char word1, char word2, char word3) {
        if (validThree) {
            if (checkVowel(word1) && checkVowel(word2) && checkVowel(word3)) {
                validThree = false;
            }
            if (!checkVowel(word1) && !checkVowel(word2) && !checkVowel(word3)) {
                validThree = false;
            }
        }
    }

    static void checkDoubleEO(char word1, char word2) {
        if (validDoubleEO && word1 == word2 && (word1 == 'e' || word1 == 'o')) {
            validDoubleEO = true;
        } else if (word1 == word2) {
            validDoubleEO = false;
        }
    }

    static void print(String password) {
        if (validVowel && validThree && validDoubleEO) {
            sb.append("<").append(password).append(">").append(" is acceptable.");
        } else {
            sb.append("<").append(password).append(">").append(" is not acceptable.");
        }
        sb.append("\n");
    }

    static void pro() {
        for (String password : passwords) {

            for (int i = 0; i < password.length(); i++) {
                if (!validVowel) {
                    validVowel = checkVowel(password.charAt(i));
                }
                if (i >= 2) {
                    checkThree(password.charAt(i-2), password.charAt(i-1), password.charAt(i));
                }
                if (i >= 1) {
                    checkDoubleEO(password.charAt(i-1), password.charAt(i));
                }
            }

            print(password);

            validVowel = false;
            validThree = true;
            validDoubleEO = true;
        }
    }

    public static void main(String[] args) {
        input();
        pro();
        System.out.println(sb);
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}