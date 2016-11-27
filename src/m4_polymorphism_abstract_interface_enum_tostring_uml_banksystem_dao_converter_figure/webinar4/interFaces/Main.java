package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.webinar4.interFaces;

/**
 * Created by Стрела on 02.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        DeveloperDbService developerDbService = new DeveloperDbService();//1. создание экзепляра в лоб
/*
        2.Декларирование интерфейсом при декларировании что хотим то и указываем(в левой части интерфейс) =
         (а в правой части) инициализация - здесь важно - инициализировать интерфейсом ты не можешь,
         инициализировать абстрактным классом ты не можешь - а вот всем остальным пожалуйста
        DBService devDbService= new DeveloperDbService();
        Сейчас это возможно - потому что DeveloperDbService импелементит DBService
        // Инициализация классом - здесь так получиться
        //Хорошая практика - круче писать
*/
        // declaration (задекларировал интерфейсом)
        DBService devDbService;
        // initialisation (инициализировал классом), да два, это хорошая практика
        // Сейчас это возможно - потому что DeveloperDbService импелементит DBService
        devDbService= new DeveloperDbService();
        // После имплентации DBService в ManagerDbService я уже могу так создавать объкт
        devDbService= new ManagerDbService();

        Test Developer = new DeveloperDbService();

        //а якщо DeveloperDBService implements 2 interfaces? Можно прописати DBService dbs = new DeveloperDBService()?

    }
}
