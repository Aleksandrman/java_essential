package play;

public class Play implements Playable, Recodable{
	Play(){
		
	}
	
	
	
	
	public static void mani(String[] args) {
		
			System.out.println("запись или проигрывание?");
			String playAndRec = "play";
			if(playAndRec == "play") {
				Playable playRec = new Play();
			}
			if(playAndRec == "rec") {
				Recodable playRec = new Play();
			}
		}
			
		
	




	@Override
	public void record() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
