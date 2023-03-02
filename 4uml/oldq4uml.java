public class oldq4uml{
  public static void main(String[]args){
    TV tv1 = new TV();
    tv1.turnOn(); tv1.tostring();
    TV tv2 = new TV(30,3);
    tv2.turnOn(); tv2.tostring();
    TV tv3 = new TV(30,1);
    tv3.turnOn(); tv3.channelUp();
    tv3.volumeDown(); tv3.volumeDown();
    System.out.print("Now TV's channel is "+tv3.getChannel()+" and volume level is "+tv3.getVolume());
  }
}