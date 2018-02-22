package classRoom;

public class GoodPupil extends Pupil{
	@Override
	void study() {
		System.out.println("я учусь хорошо");
	}
	@Override
	 void read() {
		 System.out.println("я читаю хорошо");
	 }
	@Override
	 void write() {
		 System.out.println("я пишу хорошо");
	 }
	@Override
	 void relax() {
		 System.out.println("иногда я отдыхаю отдыхать");
		 
	 }
}
