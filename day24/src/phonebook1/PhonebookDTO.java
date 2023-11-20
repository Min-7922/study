package phonebook1;

public class PhonebookDTO {
	private int idx;
	private String name;
	private String pnum;
	private int age;
	private String favorite;
	
	@Override
	public String toString() {
		String form = "%3d %s %s\t%2d살 [%s]";
		form = String.format(form, idx, name, pnum, age, favorite);
		return form;
	}

	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
	
	
}
