public class Players {
    private String name;
    private char marker;
    private int points;

    public Players(String name, char marker){
        this.name = name;
        this.marker = marker;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public char getMarker(){
        return marker;
    }
}
