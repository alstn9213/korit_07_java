package ch14_abstraction.interfaces;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
// ------------------------------------------- 생성자
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton) {

        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
    }
// ----------------------------------------------- 생성자 오버로딩
    public TvRemoteController(VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }
//    -------------------------------------------------
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }
    public String onUpChannelUpButton() {
        return channelUpButton.onUp();
    }
//    public void onUpChannelUpButton() {
//        System.out.println(channelUpButton.onUp());
//    }
// -------------------------------
    void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }
    void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    String onUpVolumeUpButton() { // 방법 1
        return volumeUpButton.onUp();
    }
    void onUpVolumeUpButton2() { // 방법 2
        System.out.println(volumeUpButton.onUp());
    }
}
