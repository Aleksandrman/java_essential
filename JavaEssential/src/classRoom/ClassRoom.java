package classRoom;

public class ClassRoom {
	
	
	
	public ClassRoom(Pupil students){
		System.out.println("Я студент и я:");
		students.study();
		students.read();
		students.write();
		students.relax();
		
	}

	
	
	
	public static void main(String[] args) {
		Pupil std1 = new ExcelentPupil();
		Pupil std3 = new GoodPupil();
		Pupil std4 = new BadPupil();		
		
		
		ClassRoom st1 = new ClassRoom(std1);
		ClassRoom st2 = new ClassRoom(std1);
		ClassRoom st3 = new ClassRoom(std3);
		ClassRoom st4 = new ClassRoom(std4);

	}

}
