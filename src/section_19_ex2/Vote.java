package section_19_ex2;

public class Vote {
	
	private String name;
	private Integer votes;
	
	public Vote(String name, Integer votes) {
		this.name = name;
		this.votes = votes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}
}
