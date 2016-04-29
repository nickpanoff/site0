public class PhraseOMatic {
    public static void main (String[] args) {
	String [] wordList1 = {"ублюдок", "мать твою", "а ну иди сюда", "говно собачье", "решил ко мне лезть", "засранец", "вонючий", "мать твою", "А, ну иди сюда", "попробуй меня трахнуть"};
	String [] wordList2 = {"я тебя сам трахну", "ублюдок", "анонист", "чертов", "будь ты проклят", "иди", "идиот", "трахать тебя", "и всю твою семью", "говно собачье"};
	String [] wordList3 = {"дерьмо", "сука", "падла", "ну иди сюда", "мерзавец", "негодяй", "гад", "иди сюда", "говно", "жопа"};
	int length1 = wordList1.length;
	int length2 = wordList2.length;
	int length3 = wordList3.length;
	int rand1 = (int) (Math.random() * length1);
	int rand2 = (int) (Math.random() * length2);
	int rand3 = (int) (Math.random() * length3);

	String phrase = wordList1 [rand1] + " " + wordList2 [rand2] + " " + wordList3 [rand3];

	System.out.println("Слышь ты, " + phrase);
    }
}
