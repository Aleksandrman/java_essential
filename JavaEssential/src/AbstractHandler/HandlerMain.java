package AbstractHandler;

public class HandlerMain {

	public static void main(String[] args) {
		String typeDog = "xml";
		
		AbstractHandler xml = new XMLHandler();
		AbstractHandler doc = new DOCHandler();
		AbstractHandler txt = new TXTHandler();
		
		switch (typeDog) {
		case "xml": xml.change();
					xml.create();
					xml.open();
					xml.save();
					break;
		case "doc":
			doc.change();
			doc.create();
			doc.open();
			doc.save();
			break;
		case "txt":
			txt.change();
			txt.create();
			txt.open();
			txt.save();
			break;
		default:
			System.out.println("формат неизвестен");
			break;
		}
		
		
	}

}
