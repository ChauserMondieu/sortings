package sortingMethods;

public class Elements implements Comparable<Elements>{
	private int id;
	private String content;
	
	public Elements() {
		// TODO Auto-generated constructor stub
	}
	
	public Elements(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int compareTo(Elements o) {
		// TODO Auto-generated method stub
		return (this.id>o.getId())?1:(this.id==o.getId())?0:-1;
	}
	
	
}
