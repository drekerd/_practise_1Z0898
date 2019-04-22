import org.omg.CORBA.PRIVATE_MEMBER;

public enum Color {

    RED(255,0,0, "BENFICA"),
    BLUE(0,0,255, "PORTO"),
    YELLOW(255,255,0,"BEIRA MAR"),
    BLACK(0,0,0,"BOAVISTA");

    private int red;
    private int green;
    private int blue;
    private String club;

    Color(int red, int blue, int green, String club){

        this.red = red;
        this.green = green;
        this.blue = blue;
        this.club = club;

    }

    public String rgbValue(){
        return String.format("(%d,%d,%d,%s)",red, green, blue, club);
    }


}
