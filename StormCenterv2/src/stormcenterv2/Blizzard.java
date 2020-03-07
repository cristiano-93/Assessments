package stormcenterv2;
/**
 *
 * @author Cristiano
 */
public class Blizzard extends Storm {

    public Blizzard(String nameIn, int windIn, int tempIn) {
        super(nameIn, windIn, tempIn);
    }

    private String classification;

    int wind = getWindSpeed();
    private int temp;
    private String advice;

    @Override
    public String calcClass() {
        int wind = getWindSpeed();

        //there is a error in this method but i can't find it
        if (wind >= 35) {
            if (wind >= 45 && temp <= -12) {
                classification = "Severe Blizzard";
            }
            classification = "Blizzard";
        }
        else {
            classification = "Snow Storm";
        }
        return classification;
    }

    @Override
    public String getAdvice() {
        int wind = getWindSpeed();
        int temp = getTemp();

        if (wind >= 35) {
            if (wind >= 45 && temp <= -12) {
                advice = "Keep warm and avoid all travel.";
            } else {
                advice = "Keep warm, \nDo not travel unless absolutely essential.";
            }
        } else if (wind < 35) {
            advice = "Take care and avoid travel if possible.";
        }
        return advice;
    }
}
