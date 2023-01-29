package Week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void takeVideo() {
		System.out.println("Take the video1");
	}
	@Override
	public void makeCall() {
		// TODO Auto-generated method stub
		super.makeCall();
	}
	public void connectWatsapp() {
		System.out.println("Smart Phone:");
	}
		public static void main(String args[])
		{
		SmartPhone smart = new SmartPhone();
		smart.makeCall();
		smart.sendMsg();
		smart.connectWatsapp();
		smart.saveContact();
		smart.takeVideo();
		}
		
	}
	
          
                            
