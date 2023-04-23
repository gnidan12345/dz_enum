// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        //1.Створити Java enum з іменем CardRank який репрезентує колоду гральних карт
        // і містить наступні константи: ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN,
        // and KING.Кожна константа має мати додаткове цифрове значення  від 1 до 13

        CardRank cardRank = CardRank.JACK;
        System.out.println(cardRank);
        System.out.println(cardRank.getIndex());

        //2.String sentence = "I would like to have a dog";
        //Порахуйте загальну кількість голосних (a, e, i, o, u) у рядку.
        //Розділіть рядок на масив слів за допомогою пробілу як роздільника.
        //Витягніть перші три символи першого слова та виведіть їх на консоль.
        //Замініть всі входження слова "dog" на "cat" у рядку.


        String sentence = "I would like to have a dog";


        //Порахуйте загальну кількість голосних (a, e, i, o, u) у рядку.


        char[] sentenceToCharArray = sentence.toLowerCase().toCharArray();

        char [] helpArray = new char []{'a', 'e', 'i', 'o', 'u'};

        int counter = 0;



        for (char ch: sentenceToCharArray){
            for(char chHelpArray: helpArray)
            {
                if(ch == chHelpArray ){
                    counter++;
                }
            }

        }

        System.out.println(counter);


        //Розділіть рядок на масив слів за допомогою пробілу як роздільника.

        String[] stringArray = sentence.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

//        //Витягніть перший символ першого слова та виведіть їх на консоль.

        System.out.println(sentence.substring(0, 1));

//        //Замініть всі входження слова "dog" на "cat" у рядку.

//
        System.out.println(sentence.replace("dog", "cat"));

        //3. Створіть StringBuilder
        //Додати по одному слову "I would like to have a dog";
        //Перетворіть у стірнг
        //Виведіть у консоль в upper case

        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < stringArray.length; i++) {
            stringBuilder.append(stringArray[i] + " ");

        }
        System.out.print(stringBuilder.toString());

    }
}