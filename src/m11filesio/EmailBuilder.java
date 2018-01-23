package src.m11filesio;

import java.util.Map;

/**
 * Created by Стрела on 07.12.2016.
 * f здесь setter
 * void заменили на
 */
public class EmailBuilder {
    private String fromEmail;
    private String fromName;
    private String subject;
    private Map<String, String> recipientsAddressTo;
    private Map<String, String> recipientsAddressCc;//копия
    private Map<String, String> recipientsAddressBcc;// скрытая копия
    private Map<String, byte[]> attachments;
    private String message;
    private String tag;

    public EmailBuilder setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
        return this; // ТОГО ЖЕ ТИПА , возвращает самого себя, повторяет поля "базоваго" класса который он билдит
    }

    public EmailBuilder setFromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    public EmailBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBuilder setRecipientsAddressTo(Map<String, String> recipientsAddressTo) {
        this.recipientsAddressTo = recipientsAddressTo;
        return this;
    }

    public EmailBuilder setRecipientsAddressCc(Map<String, String> recipientsAddressCc) {
        this.recipientsAddressCc = recipientsAddressCc;
        return this;
    }

    public EmailBuilder setRecipientsAddressBcc(Map<String, String> recipientsAddressBcc) {
        this.recipientsAddressBcc = recipientsAddressBcc;
        return this;
    }

    public EmailBuilder setAttachments(Map<String, byte[]> attachments) {
        this.attachments = attachments;
        return this;
    }

    public EmailBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public EmailBuilder setTag(String tag) {
        this.tag = tag;
        return this;
    }

    // создали
    public Email build() {
        Email email = new Email();
        // использую сеттеры "базоваого класса"
        /*если есть хоть один set то класс мутабельный*/
        // мы ушли от конструкторов, кроме по умолчанию и используем builder (то есть уходим от кучи конструкторов на все случаи жизни)
        // и на сетить поля которые иметь только необходимо
        email.setFromEmail(fromEmail);
        email.setFromName(fromName);
        email.setSubject(subject);
        email.setRecipientsAddressTo(recipientsAddressTo);
        email.setRecipientsAddressCc(recipientsAddressCc);
        email.setRecipientsAddressBcc(recipientsAddressBcc);
        email.setAttachments(attachments);
        email.setMessage(message);
        email.setTag(tag);
        return email;
    }
}
