package p35_insert_meaningful_content.bad_case;

public class GuessStatisticsMessage {
	private void printGuessStatistics(char _candidate, int _count) {
		String number;			// �ο���
		String verb;			// ����
		String pluralModifier;	// ���� ���ľ�
		
		if(_count == 0) {
			number = "no";
			verb = "are";
			pluralModifier = "s";
			
		} else if(_count == 1) {
			number = "1";
			verb = "is";
			pluralModifier = "";
			
		} else {
			number = Integer.toString(_count);
			verb = "are";
			pluralModifier = "s";
		}
		
		String guessMessage = String.format(
				"there %s %s %s%s", verb, number, _candidate, pluralModifier
		);
	}
}
