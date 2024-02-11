package Lecture_06_Methods;

public class MiddleCharacter {
    public static void displayMiddleCharacter  (String[] array){
        //String: Указва, че този параметър очаква низ като вход.
        //str: Кратко за "string", като подчертава, че това е променлива, съдържаща низ.
        //Кода използва цикъл for-each (интерация чрез всички елементи)
        // за обхождане на всеки елемент в масива от низове (array)
        //for (String str : array): този синтаксис казва на Java да вземе всеки елемент
        // от масива array и да го присвои на променливата str.
        // След това тялото на цикъла изпълнява кода за всеки елемент в масива.
        //int length = str.length();, това измерва дължината на текущия низ,
        // който е в момента на итерация в цикъла.
        // като целта е да измерим дължината на всеки елемент в масива отделно.

        for (String str : array) {
            int length = str.length();

            if (length ==0 ){
                System.out.println("The string is empty");
            } else if (length %2 == 0){
                // Ако дължината е четна, има два средни символа, които се извеждат.
                int middle1 = length / 2-1;
                int middle2 = length / 2;
                System.out.println("MiddleCharacters of \"" + str + "\": " + str.charAt(middle1) + " " + str.charAt(middle2));

            }
        }

    }
    public static void main(String[] args) {
        // Примерен масив от низове
        String[] exampleArray = {"Здравей", "свят", "Java"};

        // Извикване на метода displayMiddleCharacter
        displayMiddleCharacter(exampleArray);
    }
}

