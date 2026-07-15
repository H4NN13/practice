package task254interface;

public class SpamAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer (String[] keywords){
        this.keywords = keywords;
    }
    @Override
    public label processtext(String text){
        for (String word : keywords){
            if (text.contains(word)){
                return label.SPAM;
            }
        }
        return label.OK;
    }
}
