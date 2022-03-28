package com.alfajores.integration;

import com.alfajores.controllers.AlfajoresRestController;
import com.alfajores.services.interfaces.AlfajoresService;
import com.alfajores.utils.CreationMother;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AlfajoresRestController.class)
public class AlfajoresRestIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AlfajoresService alfajoresService;

    @Test
    void emptyAlfajores() throws Exception {
        when(alfajoresService.getAllAlfajores())
                .thenReturn(new ArrayList<>());

        mockMvc.perform(get("/api/alfajores"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(equalTo("[]")));

        verify(alfajoresService).getAllAlfajores();
    }

    @Test
    void shouldHaveAlfajores() throws Exception {
        when(alfajoresService.getAllAlfajores())
                .thenReturn(Arrays.asList(CreationMother.createAlfajor()));

        mockMvc.perform(get("/api/alfajores"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(equalTo(expectedArrayOfAlfajores())));

        verify(alfajoresService).getAllAlfajores();
    }

    @Test
    void shouldReturnAnAlfajor() throws Exception {
        when(alfajoresService.getAlfajorByName("Jorgito"))
                .thenReturn(CreationMother.createAlfajor());

        mockMvc.perform(get("/api/alfajores/search?alfajor=Jorgito"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(equalTo(expectedAlfajor())));

        verify(alfajoresService).getAlfajorByName("Jorgito");
    }

    static String expectedArrayOfAlfajores() {
        return  "[" + expectedAlfajor() + "]";
    }

    static String expectedAlfajor() {
        return  "{\"id\":1,\"name\":\"Jorgito\",\"description\":\"Es muy rico\",\"weight\":100,\"price\":150,\"categoria\":{\"id\":1,\"name\":\"Dulce de leche\",\"description\":\"\"}}";
    }
}
