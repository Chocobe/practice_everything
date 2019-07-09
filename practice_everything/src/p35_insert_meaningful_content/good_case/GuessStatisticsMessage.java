package p35_insert_meaningful_content.good_case;

public class GuessStatisticsMessage {
	String number;
	String verb;
	String pluralModifier;
	
	public String make(char _candidate, int _count) {
		this.createPluralDefendentMessageParts(_count);
		
		return String.format(
				"There %s %s %s%s", 
				this.verb, this,number, _candidate, this.pluralModifier
		);
	}
	
	private void createPluralDefendentMessageParts(int _count) {
		if(_count == 0) {
			// 많이 있음
			this.thereAreManyLetters(_count);
			
		} else if(_count == 1) {
			// 한명 있음
			this.thereIsOneLetters();
			
		} else {
			// 많음
			this.thereAreNoLetters();
		}
	}
	
	private void thereAreManyLetters(int _count) {
		this.number = Integer.toString(_count);
		this.verb = "are";
		pluralModifier = "s";
	}
	
	private void thereIsOneLetters() {
		this.number = "1";
		this.verb = "is";
		this.pluralModifier = "";
	}
	
	private void thereAreNoLetters() {
		this.number = "no";
		this.verb = "are";
		this.pluralModifier = "s";
	}
}
