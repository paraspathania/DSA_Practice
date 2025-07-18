package LuckBalance;

import java.io.*;
import java.util.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.toList;

class Result {
    public static int luckBalance(int k, List<List<Integer>> contests) {
        //write your code here
        List<Integer> important = new ArrayList<>();
        int luck = 0;

        for (List<Integer> contest : contests) {
            int l = contest.get(0);
            int t = contest.get(1);

            if (t == 0) {
                luck += l;  
            } else {
                important.add(l);  
            }
        }

        
        Collections.sort(important, Collections.reverseOrder());

       
        for (int i = 0; i < important.size(); i++) {
            if (i < k) {
                luck += important.get(i);
            } else {
                luck -= important.get(i);
            }
        }

        return luck;
    }
}


public class LuckBalance {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> contests = new ArrayList<>();

        // IntStream.range(0, n).forEach(i -> {
        //     try {
        //         contests.add(
        //             Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //                 .map(Integer::parseInt)
        //                 .collect(toList())
        //         );
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });

        int result = Result.luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
