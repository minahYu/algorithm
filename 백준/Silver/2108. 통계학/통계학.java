import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        Map<Integer, Integer> freq = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            nums[i] = val;
            sum += val;

            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        Arrays.sort(nums);

        int avg = (int) Math.round((double) sum / N);
        int median = nums[N / 2];
        int maxFreq = Collections.max(freq.values());
        
        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modeList.add(entry.getKey());
            }
        }

        Collections.sort(modeList);
        
        int mode = (modeList.size() >= 2) ? modeList.get(1) : modeList.get(0);
        int range = nums[N - 1] - nums[0];

        System.out.println(avg);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}
