class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int currentH = 0, currentW = 0;
        int h = 0, w = 0;
        boolean go = true;
        
        for(int i=0; i<park.length; i++) {
            w = park[i].indexOf('S');
            if(w != -1) {
                h = i;
                currentH = h;
                currentW = w;
                break;
            }
        }
        
        for(int i=0; i<routes.length; i++) {
            String[] info = routes[i].split(" ");
            int count = Integer.parseInt(info[1]);
            w = currentW;
            h = currentH;
            go = true;
            
            if(info[0].equals("N")) {
                for(int j=0; j<count; j++) {
                    h -= 1;
                    if(h < 0 || h >= park.length || park[h].charAt(currentW) == 'X') {
                        go = false;
                        break;
                    }
                }
            } 
            else if(info[0].equals("E")) {
                for(int j=0; j<count; j++) {
                    w += 1;
                    if(w < 0 || w >= park[0].length() || park[currentH].charAt(w) == 'X') {
                        go = false;
                        break;
                    }
                }
            } 
            else if(info[0].equals("S")) {
                for(int j=0; j<count; j++) {
                    h += 1;
                    if(h < 0 || h >= park.length|| park[h].charAt(currentW) == 'X') {
                        go = false;
                        break;
                    }
                }
            } 
            else if(info[0].equals("W")) {
                for(int j=0; j<count; j++) {
                    w -= 1;
                    if(w < 0 || w >= park[0].length() || park[currentH].charAt(w) == 'X') {
                        go = false;
                        break;
                    }
                }
            }
             
            if(go) {
                currentW = w;
                currentH = h;
            }
        }
        answer[0] = currentH;
        answer[1] = currentW;
        
        return answer;
    }
}