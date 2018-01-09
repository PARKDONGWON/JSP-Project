package test.cafe.dto;

public class CafeDto {
	private String title; 
	private String writer; 
	private String content; 
	private int LikeCount;
	private int commandCount; 
	private String regdate;
	private int startRowNum; //시작 row 번호
	private int endRowNum; //끝 row 번호
	private int prevNum; //이전글의 글번호
	private int nextNum;//다음글의 글번호
	
	public CafeDto() {}

	public CafeDto(String title, String writer, String content, int likeCount, int commandCount, String regdate,
			int startRowNum, int endRowNum, int prevNum, int nextNum) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
		LikeCount = likeCount;
		this.commandCount = commandCount;
		this.regdate = regdate;
		this.startRowNum = startRowNum;
		this.endRowNum = endRowNum;
		this.prevNum = prevNum;
		this.nextNum = nextNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikeCount() {
		return LikeCount;
	}

	public void setLikeCount(int likeCount) {
		LikeCount = likeCount;
	}

	public int getCommandCount() {
		return commandCount;
	}

	public void setCommandCount(int commandCount) {
		this.commandCount = commandCount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getStartRowNum() {
		return startRowNum;
	}

	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}

	public int getEndRowNum() {
		return endRowNum;
	}

	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}

	public int getPrevNum() {
		return prevNum;
	}

	public void setPrevNum(int prevNum) {
		this.prevNum = prevNum;
	}

	public int getNextNum() {
		return nextNum;
	}

	public void setNextNum(int nextNum) {
		this.nextNum = nextNum;
	}

	
	
	
}
