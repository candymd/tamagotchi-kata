import org.junit.jupiter.api.Test;
import org.tamagotchi.Tamagotchi;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class tamagotchitest {


    @Test
    void cuandoMandyJuegaSeCansa() {

        Tamagotchi mandy = new Tamagotchi();

        String energy = mandy.play();
        assertThat(energy, equalTo("(-_-)"));

    }

    @Test
    void CuandoElHumorEstaPorEncimaDe8EstaContento() {

        Tamagotchi mandy = new Tamagotchi();

        mandy.play();
        mandy.play();
        mandy.play();
        mandy.play();
        String mood = mandy.play();

        assertThat(mood, equalTo(":-)"));


    }
    @Test
    void CuandoLaEnergiaLlegaACeroSeDuerme() {

        Tamagotchi mandy = new Tamagotchi();

        mandy.play();
        mandy.play();
        mandy.play();
        String energy = mandy.play();

        assertThat(energy, equalTo("(-_-) zZZ"));


    }
    @Test
    void cuandoELlHumorEstaPorDebajoDe2SeEnfada() {

        Tamagotchi mandy = new Tamagotchi();

        mandy.play();
        mandy.play();
        String mood = mandy.sleep();

        assertThat(mood, equalTo("ఠ_ఠ"));


    }

    @Test
    void cuandoComeEnergiaDisminuyeUnPunto() {

        Tamagotchi mandy = new Tamagotchi();

        String energy = mandy.eat();
        assertThat(energy, equalTo("(-_-)"));

    }@Test
    void cuandoComeHambreDisminuyeDosPuntos() {

        Tamagotchi mandy = new Tamagotchi();

        String hunger = mandy.eat();
        assertThat(hunger, equalTo("(-_-)"));

    }

    @Test
    void RestoDeCasosEsNormal() {

        Tamagotchi mandy = new Tamagotchi();

        mandy.eat();
        String hunger = mandy.play();
        String mood = mandy.sleep();
        String energy = mandy.sleep();
        assertThat(hunger, equalTo(":-|"));
        assertThat(energy, equalTo(":-|"));
        assertThat(mood, equalTo(":-|"));

    }
}
