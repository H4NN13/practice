package task254interface;

public class TooLongAnalyzer implements TextAnalyzer{
    private int maxlength;

    public TooLongAnalyzer (int maxlength){
        this.maxlength = maxlength;

    }
    @Override
    public label processtext(String text){
        if (text.length() > maxlength){
            return label.TOO_LONG;
        }
        return label.OK;
    }
}
