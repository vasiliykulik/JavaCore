package src.m11filesio;

/**
 * Created by Стрела on 07.12.2016.
 */
public class MainForEmailBuilder {
    public static void main(String[] args) {
        EmailBuilder emailBuilder = new EmailBuilder();
        /*emailBuilder.setFromEmail("aa@aa.com");
        emailBuilder.setFromName("John");
        emailBuilder.setSubject("Hello");
        emailBuilder.setMessage("a) read file, save to string var\n" +
                "b) replace words");*/
        emailBuilder.setFromEmail("aa@aa.com")
                .setFromName("John")
                .setSubject("Hello")
                .setMessage("a) read file, save to string var\n" +
                        "b) replace words");
        Email email = emailBuilder.build(); // emailBuilder у нас уже есть, а методом build созд экземпляр класса email
        // который мы прописывали в email Buildere
        //-------------------------------------------
        // Вместо конструктора по всем полям, или кучи конструкторов
        // Создали отдельный класс сетит
        // В Builder  так и в append есть ссылка на сомого себя

        //
EmailImmutable emailImmutable = new EmailImmutable.Builder()
        .setFromEmail("aa@aa.com")
        .setFromName("John")
        .setSubject("Hello")
        .setMessage("a) read file, save to string var\n" +
                "b) replace words").build();
    }
    // есть два Builder - где
}
