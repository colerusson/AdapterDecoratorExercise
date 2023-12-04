package Decorator;

public class Main {
    public static void main(String[] args) {
        StringSource firstString = new FirstString(0);
        StringSource secondString = new SecondString(0);

        System.out.println("Before manipulation: " + firstString.next());
        System.out.println("Before manipulation: " + secondString.next());

        StringSource firstExclamation = new ExclamationDecorator(firstString);
        StringSource firstQuestionMark = new QuestionMarkDecorator(firstExclamation);
        StringSource firstSpace = new SpaceDecorator(firstQuestionMark);

        StringSource secondExclamation = new ExclamationDecorator(secondString);
        StringSource secondQuestionMark = new QuestionMarkDecorator(secondExclamation);
        StringSource secondSpace = new SpaceDecorator(secondQuestionMark);

        System.out.println("After manipulation: " + firstSpace.next());

        System.out.println("After manipulation: " + secondSpace.next());
    }
}
