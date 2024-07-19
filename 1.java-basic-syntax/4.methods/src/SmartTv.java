public class SmartTv {
  boolean isOn = false;
  int volume = 50;
  int channel = 1;
  
  public void turnOn () {
    isOn = true;
  }

  public void turnOff () {
    isOn = false;
  }

  public void turnVolumeUp () {
    volume++;
  }

  public void turnVolumeDown () {
    volume--;
  }

  public void turnChannelUp () {
    channel++;
  }

  public void turnChannelDown () {
    channel--;
  }

  public void selectChannel (int choosedChannel) {
    channel = choosedChannel;
  }
}
