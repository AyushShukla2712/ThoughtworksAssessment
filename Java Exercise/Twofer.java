public class Twofer {
    public String twofer(String name) {
        String nameToReturn = name == null ? "you" : name;
        return "One for " + nameToReturn + ", one for me.";
    }
}