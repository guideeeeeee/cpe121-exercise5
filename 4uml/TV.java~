public class TV{
  private int channel;
  private int volumeLevel;
  private boolean on;
  public TV(){
    this.channel = 1;
    this.volumeLevel = 1;
  }
  public TV(int Ch, int Vol){
    this.channel= Ch;
    this.volumeLevel = Vol;
  }
  public void turnOn(){
    this.on = true;
  }
  public void turnOff(){
    this.on = false;
  }
  public void setChannel(int newChannel){
    this.channel = newChannel;
  }
  public void channelUp(){
    if (channel<30)
      this.channel = channel+1;
  }
  public void channelDown(){
    if (channel>0)
    this.channel = channel-1;
  }
  public void setVolume(int newVolumeLevel){
    this.volumeLevel = newVolumeLevel;
  }
  public void volumeUp(){
    if (volumeLevel<15)
      this.volumeLevel = volumeLevel+1;
  }
  public void volumeDown(){
    if (volumeLevel>0)
      this.volumeLevel = volumeLevel-1;
  }
  public int getChannel(){
    return channel;
  }
  public int getVolume(){
    return volumeLevel;
  }
  public void tostring(){
    if (on)
      System.out.println("Now TV's channel is "+channel+" and volume level is "+volumeLevel);
  }
}