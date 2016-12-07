package src.m11filesio;

import java.util.Map;

/**
 * Created by Стрела on 07.12.2016.
 * Начинаем с создания Immutable класса(getter)
 */
public class Email {
    private String fromEmail;
    private String fromName;
    private String subject;
    private Map<String, String> recipientsAddressTo;
    private Map<String, String> recipientsAddressCc;//копия
    private Map<String, String> recipientsAddressBcc;// скрытая копия
    private Map<String, byte[]> attachments;
    private String message;
    private String tag;

// два способа написания Builder (Pattern)
    // с использованием статического inner class
    // отд builder класс
// при создании мы можем применить builder что бы не создавать мильйон конструкторов


    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Map<String, String> getRecipientsAddressTo() {
        return recipientsAddressTo;
    }

    public void setRecipientsAddressTo(Map<String, String> recipientsAddressTo) {
        this.recipientsAddressTo = recipientsAddressTo;
    }

    public Map<String, String> getRecipientsAddressCc() {
        return recipientsAddressCc;
    }

    public void setRecipientsAddressCc(Map<String, String> recipientsAddressCc) {
        this.recipientsAddressCc = recipientsAddressCc;
    }

    public Map<String, String> getRecipientsAddressBcc() {
        return recipientsAddressBcc;
    }

    public void setRecipientsAddressBcc(Map<String, String> recipientsAddressBcc) {
        this.recipientsAddressBcc = recipientsAddressBcc;
    }

    public Map<String, byte[]> getAttachments() {
        return attachments;
    }

    public void setAttachments(Map<String, byte[]> attachments) {
        this.attachments = attachments;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
