package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Это пользователь один, всем привет!");
        user1.sendMessage(user2, "Пользователь два и три, вы тут?");

        user2.sendMessage(user1, "Привет, пользователь два тут");
        user2.sendMessage(user1, "Я очень сильно занят, вынужден покинуть конфеернцию");
        user2.sendMessage(user1, "Всем пока");

        user3.sendMessage(user1, "Привет, пользователь три на связи");
        user3.sendMessage(user1, "Чат вроде бы работает!");
        user3.sendMessage(user1, "Но, моей нервной системе нужен отдых, после такого забега");

        user1.sendMessage(user3, "Надо совмещать прятное с полезным!");
        user1.sendMessage(user3, "Во время отдыха пробегись по решенным дням " +
                                      ", особенно заостри внимание на 'коллекциях'");
        user1.sendMessage(user3, "И не забудь прочитать официальную документацию по классу Collections");

        user3.sendMessage(user1, "Да, так и сделаю");

        user1.subscribe(user3);
        user3.subscribe(user1);
        System.out.println(user1.isSubscribed(user3));
        System.out.println(user3.isSubscribed(user1));

        System.out.println(user1.isFriend(user3));
        System.out.println(user3.isFriend(user1));

        System.out.println(user1.getSubscriptions());
        System.out.println(user3.getSubscriptions());

        MessageDatabase.showDialog(user1, user3);
        System.out.println(MessageDatabase.getMessage());
    }
}
