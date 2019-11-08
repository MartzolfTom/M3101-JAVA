package servers;

public class LowerCaseServer implements Server<String,String> {

	@Override
	public String fetch(String key) {
		return key.toLowerCase();
	}
	

}
