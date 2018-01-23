package src.m11filesio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Стрела on 07.12.2016.
 * Начинаем с создания Immutable класса(getter)
 */

public class EmailImmutable {
    private final String fromEmail;
    private final String fromName;
    private final String subject;
    private final Map<String, String> recipientsAddressTo;
    private final Map<String, String> recipientsAddressCc;//копия
    private final Map<String, String> recipientsAddressBcc;// скрытая копия
    private final Map<String, byte[]> attachments;
    private final String message;
    private final String tag;

    // конструктор "базового класса " - работает с иннер класса
    // базовый класс МОЖНО сделать немутабельным (потомучто нет сеттеров, и поля final - и инициализируются в конструкторе),
// и экономия сеттерво
    private EmailImmutable(Builder builder) {
        this.fromEmail = builder.fromEmail;
        this.fromName = builder.fromName;
        this.subject = builder.subject;
        this.recipientsAddressTo = builder.recipientsAddressTo;
        this.recipientsAddressCc = builder.recipientsAddressCc;
        this.recipientsAddressBcc = builder.recipientsAddressBcc;
        this.attachments = builder.attachments;
        this.message = builder.message;
        this.tag = builder.tag;
    }
    // два способа написания Builder (Pattern)
    // с использованием статического inner class
    // отд builder класс
// при создании мы можем применить builder что бы не создавать мильйон конструкторов

    public String getFromEmail() {
        return fromEmail;
    }

    public String getFromName() {
        return fromName;
    }

    public String getSubject() {
        return subject;
    }

    public Map<String, String> getRecipientsAddressTo() {
        return recipientsAddressTo;
    }

    public Map<String, String> getRecipientsAddressCc() {
        return recipientsAddressCc;
    }

    public Map<String, String> getRecipientsAddressBcc() {
        return recipientsAddressBcc;
    }

    public Map<String, byte[]> getAttachments() {
        return attachments;
    }

    public String getMessage() {
        return message;
    }

    public String getTag() {
        return tag;
    }

    // на уровне метода
    public static class Builder {
        // внутри класса
        private String fromEmail;
        private String fromName;
        private String subject;
        private Map<String, String> recipientsAddressTo;
        private Map<String, String> recipientsAddressCc;//копия
        private Map<String, String> recipientsAddressBcc;// скрытая копия
        private Map<String, byte[]> attachments;
        private String message;
        private String tag;

        /*конструктор по умолчанию - создаст пустой объект - но поля не будут проинициолизированны - по умолчанию
        public Builder() {
            this.fromEmail = "";
            this.fromName = "";
            this.subject = "";
            this.recipientsAddressTo = new HashMap<>();
            this.recipientsAddressCc = new HashMap<>();
            this.recipientsAddressBcc = new HashMap<>();
            this.attachments = new HashMap<>();
            this.message = "";
            this.tag = "";
        }*/

        public Builder setFromEmail(String fromEmail) {
            this.fromEmail = fromEmail;
            return this;
        }

        public Builder setFromName(String fromName) {
            this.fromName = fromName;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder setRecipientsAddressTo(Map<String, String> recipientsAddressTo) {
            this.recipientsAddressTo = recipientsAddressTo;
            return this;
        }

        public Builder setRecipientsAddressCc(Map<String, String> recipientsAddressCc) {
            this.recipientsAddressCc = recipientsAddressCc;
            return this;
        }

        public Builder setRecipientsAddressBcc(Map<String, String> recipientsAddressBcc) {
            this.recipientsAddressBcc = recipientsAddressBcc;
            return this;
        }

        public Builder setAttachments(Map<String, byte[]> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        /*создаю экземпляр "базового" класса и "передаю сам себя" Builder*/
        public EmailImmutable build() {
            return new EmailImmutable(this);
        }

    }
}
