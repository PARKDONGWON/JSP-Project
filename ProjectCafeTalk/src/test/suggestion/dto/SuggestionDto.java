package test.suggestion.dto;

public class SuggestionDto {
	private int num;
	private String writer;
	private String title;
	private String smallTitle;
	private String content;
	private int viewCount;
	private String regdate;
	public SuggestionDto(int num, String writer, String title, String smallTitle, String content, int viewCount,
			String regdate) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.smallTitle = smallTitle;
		this.content = content;
		this.viewCount = viewCount;
		this.regdate = regdate;
	}
	
	public SuggestionDto() {}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSmallTitle() {
		return smallTitle;
	}

	public void setSmallTitle(String smallTitle) {
		this.smallTitle = smallTitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	
}
