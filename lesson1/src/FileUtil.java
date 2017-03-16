
public class FileUtil {
	private String filename;
	private boolean mode; //true for read, false for write
	private final int MAX_LINE=50;
	public FileUtil(String filename){
		this(filename, true);
	}
	public FileUtil(String filename,boolean mode){
		this.filename=filename;
		this.mode=mode;
	}
	
	public String[] readFile(){
		String[] lines=new String[50];
		//TODO read file and return all the lines
		return lines;
	}
	
	
}
