package geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceTests {

    GeoServiceImpl testGeoService;

    @BeforeEach
    public void prepare() {
        testGeoService = new GeoServiceImpl();
    }

    @Test
    public void testByIpLocal() {

        //arrange
        Country expected = null;

        //act
        Country result = testGeoService.byIp("127.0.0.1")
                .getCountry();

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testByIpRussia() {

        //arrange
        Country expected = Country.RUSSIA;

        //act
        Country result = testGeoService.byIp("172.0.32.11")
                .getCountry();

        //assert
        Assertions.assertEquals(expected, result);
    }
}