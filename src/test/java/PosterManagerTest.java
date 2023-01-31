import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PosterManager;

public class PosterManagerTest {
    @Test
    public void ShouldFindAllAddFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllFilms() { // Тестируем случай, когда добавление фильмов не происходит
        PosterManager manager = new PosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastAddFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
