
public class Essay extends GradedActivity {

    private int Grammar;
    private int Spelling;
    private int CorrectLength;
    private int Content;

    public Essay(int grammar, int spelling, int correctLength, int content, double Score) {
        Grammar = grammar;
        Spelling = spelling;
        CorrectLength = correctLength;
        Content = content;
        Score= Grammar+Spelling+CorrectLength+Content;
        setScore(Score);
    }

    public int getGrammar() {
        return Grammar;
    }

    public void setGrammar(int grammar) {
        Grammar = grammar;
    }

    public int getSpelling() {
        return Spelling;
    }

    public void setSpelling(int spelling) {
        Spelling = spelling;
    }

    public int getCorrectLength() {
        return CorrectLength;
    }

    public void setCorrectLength(int correctLength) {
        CorrectLength = correctLength;
    }

    public int getContent() {
        return Content;
    }

    public void setContent(int content) {
        Content = content;
    }
    
       

}
