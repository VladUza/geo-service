package i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceTests {

    LocalizationServiceImpl testLocalizationService;

    @BeforeEach
    public void prepare() {
        testLocalizationService = new LocalizationServiceImpl();
    }


    @Test
    public void localeRussia() {

        //arrange
        String expected = ("Добро пожаловать");

        //act
        String result = testLocalizationService.locale(Country.RUSSIA);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void localeUsa() {

        //arrange
        String expected = ("Welcome");

        //act
        String result = testLocalizationService.locale(Country.USA);

        //assert
        Assertions.assertEquals(expected, result);
    }

}