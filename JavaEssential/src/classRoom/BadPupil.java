package classRoom;

public class BadPupil extends Pupil{
	@Override
	void study() {
		System.out.println("я учусь плохо");
	}
	@Override
	 void read() {
		 System.out.println("я читаю плохо");
	 }
	@Override
	 void write() {
		 System.out.println("я пишу плохо");
	 }
	@Override
	 void relax() {
		 System.out.println("я отлично отдыхать");
		 
	 }
}
