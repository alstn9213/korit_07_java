package ch14_abstraction.interfaces;

public class AirConditionerController{
    private TemperatureUpButton temperatureUpButton;
    private TemperatureDownButton temperatureDownButton;
    private ModeChangeButton modeChangeButton;
    private PowerButton powerButton;
    public AirConditionerController(TemperatureUpButton temperatureUpButton, TemperatureDownButton temperatureDownButton, ModeChangeButton modeChangeButton, PowerButton powerButton) {
        this.temperatureUpButton = temperatureUpButton;
        this.temperatureDownButton = temperatureDownButton;
        this.modeChangeButton = modeChangeButton;
        this.powerButton = powerButton;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    void onPressedTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }

    void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }
    void onPressesdTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }
    String onUpTemperatureUpButton() {
        return temperatureUpButton.onUp();
    }
    void modeChange() {
        modeChangeButton.onPressed();
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
}
