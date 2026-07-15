package task254interface;

public class NegativetextAnalyzer implements TextAnalyzer{
    @Override
    public label processtext(String text){
        if (text.contains(":(")){
            return label.NEGATIVE_TEXT;
        }
        return label.OK;
    }
}
