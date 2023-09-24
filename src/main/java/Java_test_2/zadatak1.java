package Java_test_2;

public class zadatak1 {
    public static void main(String[] args) {
        InstagramUser user1= new InstagramUser("miki", "miki mikic");
        InstagramUser user2= new InstagramUser("zika", "pera mikic");
        InstagramUser user3= new InstagramUser("pera", "miki lepic");
        InstagramUser user4= new InstagramUser("lepa", "lepa lukic");


        InstagramLocationAddOn location1= new InstagramLocationAddOn(34, 55, 100, 60, "beograd");
        InstagramMentionAddOn mention1= new InstagramMentionAddOn(33, 55, 20, 40, "pera zikic");

        InstagramStory story1= new InstagramStory(user1, "swipe", "htppp/qweffeefewfewf");

        story1.dodajAddOn(location1);
        story1.dodajAddOn(mention1);

        story1.setSwipeUp("www.fsfsf");
        user1.stampa();

        story1.pogledajStory(user1);
        story1.postaviStory();


    }
}
