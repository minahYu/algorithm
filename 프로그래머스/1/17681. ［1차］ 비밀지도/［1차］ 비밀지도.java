class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] arr1Str = new String[arr1.length];
        String[] arr2Str = new String[arr1.length];
        
        arr1Str = getBinary(arr1, n);
        arr2Str = getBinary(arr2, n);
        
        for(int i=0; i<arr1.length; i++) {
            answer[i] = "";
            for(int j=0; j<arr1Str[i].length(); j++) {
                if(arr1Str[i].charAt(j) == '1' || arr2Str[i].charAt(j) == '1')
                    answer[i] += "#";
                else 
                    answer[i] += " ";
            }
        }
        return answer;
    }
    
    String[] getBinary(int[] arr, int n) {
        String[] strArr = new String[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            while(arr[i] > 0) {
                sb.insert(0, arr[i] % 2);
                arr[i] /= 2;
            }
            while(sb.length() < n)
                sb.insert(0, "0");
            strArr[i] = sb.toString();
        }
        return strArr;
    }
}