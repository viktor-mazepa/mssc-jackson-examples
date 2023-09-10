package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializedDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":11112222,\"price\":\"12.99\",\"createdDate\":\"2023-09-10T15:+0300\",\"lastUpdatedDate\":\"2023-09-10T15:47:43.877258+03:00\",\"myLocalDate\":\"20230910\",\"beerId\":\"cf04b17a-133d-4f25-bc44-6ea3c68ba7d2\"}";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }
}