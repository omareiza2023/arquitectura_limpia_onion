// test/usecase/RegistrarUsuarioUseCaseTest.java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class RegistrarUsuarioUseCaseTest {

    private UsuarioRepository usuarioRepository;
    private RegistrarUsuarioUseCase useCase;

    @BeforeEach
    public void setUp() {
        usuarioRepository = mock(UsuarioRepository.class);
        useCase = new RegistrarUsuarioUseCase(usuarioRepository);
    }

    @Test
    public void registrarUsuarioExitosamente() {
        Usuario usuario = new Usuario(
                "1", "Juan Pérez", "CC", "12345678", "3111234567",
                LocalDate.of(1990, 5, 10), "Masculino"
        );

        when(usuarioRepository.existePorIdentificacion("CC", "12345678")).thenReturn(false);

        useCase.ejecutar(usuario);

        verify(usuarioRepository, times(1)).guardar(usuario);
    }

    @Test
    public void noPermitirRegistrarUsuarioExistente() {
        Usuario usuario = new Usuario(
                "2", "Ana Gómez", "CC", "87654321", "3107654321",
                LocalDate.of(1985, 3, 15), "Femenino"
        );

        when(usuarioRepository.existePorIdentificacion("CC", "87654321")).thenReturn(true);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            useCase.ejecutar(usuario);
        });

        assertEquals("El usuario ya existe con esta identificación.", exception.getMessage());
        verify(usuarioRepository, never()).guardar(usuario);
    }
}