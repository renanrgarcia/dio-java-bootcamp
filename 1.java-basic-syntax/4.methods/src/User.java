public class User {
		public static void main(String[] args) throws Exception {
			SmartTv smartTv = new SmartTv();

			System.out.println("TV is on? " + smartTv.isOn);
			System.out.println("What's the volume? " + smartTv.volume);
			System.out.println("What's the channel? " + smartTv.channel);

			smartTv.turnOn();
			System.out.println("New status->TV is on? " + smartTv.isOn);

			smartTv.turnOff();
			System.out.println("New status->TV is on? " + smartTv.isOn);

			smartTv.turnVolumeUp();
			smartTv.turnVolumeUp();
			smartTv.turnVolumeUp();
			smartTv.turnVolumeDown();
			System.out.println("New status->What's the volume? " + smartTv.volume);

			smartTv.turnChannelUp();
			smartTv.turnChannelUp();
			smartTv.turnChannelUp();
			smartTv.turnChannelUp();
			smartTv.turnChannelUp();
			smartTv.turnChannelDown();
			smartTv.turnChannelDown();
			System.out.println("New status->What's the channel? " + smartTv.channel);

			smartTv.selectChannel(60);
			System.out.println("New status->What's the channel? " + smartTv.channel);

		}
}
