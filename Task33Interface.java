import java.util.Arrays;
public class Task33Interface {
    public static void main(String[] args) {
        String spamWords [] = {"покупай", "реклама"};
        msFilter.TextAnalyzer app1 = new msFilter.SpamAnalyzer(spamWords);
        msFilter.TextAnalyzer app2 = new NegativetextAnalyzer();
        msFilter.TextAnalyzer app3 = new TooLongAnalyzer(30);

        msFilter.TextAnalyzer[] textFilter = {app1, app2, app3};

        String badNotice = "привет :(";
        msFilter.Label[] finalLabels = analyzeText(textFilter, badNotice);
        System.out.println(badNotice);
        System.out.println(Arrays.deepToString(finalLabels));
    }
    public static class msFilter{

        public enum Label{
            SPAM, NEGATIVE_TEXT, TOO_LONG, OK
        }
        public interface TextAnalyzer{
            Label processtext(String text);
        }
        public static class SpamAnalyzer implements TextAnalyzer{
            private String[] keywords;
            public SpamAnalyzer(String[] keywords){
                this.keywords = keywords;
            }

            @Override

            public Label processtext (String text){
                for (String word : keywords){
                    if (text.contains(word)){
                        return Label.SPAM;
                    }
                }
                return Label.OK;
            }
        }

    }
    public static class NegativetextAnalyzer implements msFilter.TextAnalyzer{

        @Override

        public msFilter.Label processtext(String text){
            if (text.contains(":(")){
                return msFilter.Label.NEGATIVE_TEXT;
            }
            return msFilter.Label.OK;
        }

    }
    public static class TooLongAnalyzer implements msFilter.TextAnalyzer {
        private int maxLength;
        public TooLongAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override

        public msFilter.Label processtext (String text){
            if (text.length() > maxLength){
                return msFilter.Label.TOO_LONG;
            }
            return msFilter.Label.OK;
        }
    }
    public static msFilter.Label[] analyzeText(msFilter.TextAnalyzer[] analyzers, String text){
        msFilter.Label[] resultLabels = new msFilter.Label[analyzers.length];
        for (int i = 0; i < analyzers.length; i++){
            resultLabels[i] = analyzers[i].processtext(text);
        }
        return resultLabels;
    }
}
