public class Display {
    private StringBuilder currentDisplay;

    public Display() {
        currentDisplay = new StringBuilder();
    }

    public void updateDisplay(String value) {
        currentDisplay.append(value);
    }

    public String getDisplay() {
        return currentDisplay.toString();
    }

    public void clearDisplay() {
        currentDisplay.setLength(0);
    }
}
