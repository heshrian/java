public class stringManip {
    public static void main(String[] args) {
//        String url = "https//www.reddit.com/r/nevertellmethebots";
//        url =url.replace("bots", "odds");
////        url =url.replace("https//","https://");
//
//        String result = "http://";
//        int subIndex = url.indexOf("w")-1;
//        System.out.println(subIndex);
//        url = result + url.substring(subIndex,url.length());
//        System.out.println(url);
//        String todoText = " - Buy milk\n";
//        todoText=todoText.concat(" - Downlaod Diablo\n");
//        todoText=todoText.concat(" \t - Plaaaay");
//        System.out.println(todoText);
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String answer = "";
        for (int i = reversed.length()-1; i >= 0 ; i--) {
                answer = answer.concat(String.valueOf(reversed.charAt(i)));
        }
        System.out.println(answer);
    }
}
