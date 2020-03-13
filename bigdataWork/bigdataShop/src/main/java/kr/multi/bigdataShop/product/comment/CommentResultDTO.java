package kr.multi.bigdataShop.product.comment;

public class CommentResultDTO {
	private String word;
	private String count_word;
	
	public CommentResultDTO() {
		// TODO Auto-generated constructor stub
	}

	public CommentResultDTO(String word, String count_word) {
		super();
		this.word = word;
		this.count_word = count_word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getCount_word() {
		return count_word;
	}

	public void setCount_word(String count_word) {
		this.count_word = count_word;
	}

	@Override
	public String toString() {
		return "CommentResultDTO [word=" + word + ", count_word=" + count_word + "]";
	}
	
	
	
}
