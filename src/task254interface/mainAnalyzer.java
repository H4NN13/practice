package task254interface;
import java.util.Arrays;

public class mainAnalyzer {
    public static label[] analyzetext(TextAnalyzer[] analyzers, String text){
        label[] resultlabels = new label[analyzers.length];
        for (int i = 0; i < analyzers.length; i++){
            resultlabels[i] = analyzers[i].processtext(text);
        }
        return resultlabels;
    }

    public static void main(String[] args) {
        String[] spamwords = {"покупай","реклама"};

        TextAnalyzer app1 = new SpamAnalyzer(spamwords);
        TextAnalyzer app2 = new NegativetextAnalyzer();
        TextAnalyzer app3 = new TooLongAnalyzer(30);

        TextAnalyzer[] textFilter = {app1, app2, app3};

        String badNotice = "привет :(";
        label[] finalLabels = analyzetext(textFilter, badNotice);

        System.out.println(badNotice);
        System.out.println(Arrays.toString(finalLabels));
    }
}