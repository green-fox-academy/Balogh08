package com.greenfoxacademy.rest.controllertest;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.Mockito.when;

import com.greenfoxacademy.rest.controller.RestController;

import com.greenfoxacademy.rest.model.LogServiceInterface;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest(RestController.class)
public class RestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LogServiceInterface logService;

    @Test
    public void doubling_NoValue_ReturnProvideNumber() throws Exception {
        this.mockMvc.perform(get("/doubling"))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }

    @Test
    public void doubling_15_Return30() throws Exception {
        this.mockMvc.perform(get("/doubling?input=15"))
                .andExpect(jsonPath("$.result", is(30)));
    }

    @Test
    public void greeter_NameAndTitle_Greet() throws Exception {
        this.mockMvc.perform(get("/greeter?name=Boti&title=student"))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Boti, my dear student!")));
    }

    @Test
    public void greeter_NameButNoTitle_ProvideTitle() throws Exception {
        this.mockMvc.perform(get("/greeter?name=Boti"))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }

    @Test
    public void greeter_TitleButNoName_ProvideName() throws Exception {
        this.mockMvc.perform(get("/greeter?title=student"))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }

    @Test
    public void appenda_Kuty_ReturnsKutya() throws Exception {
        this.mockMvc.perform(get("/appenda/kuty"))
                .andExpect(jsonPath("$.appended", is("kutya")));
    }

    @Test
    public void appenda_Null_ReturnsNotFund() throws Exception {
        this.mockMvc.perform(get("/appenda/"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void doUntil_Sum10_Returns55() throws Exception {
        this.mockMvc.perform(post("/dountil/sum")
                    .contentType(MediaType.APPLICATION_JSON_UTF8)
                    .content("{\"until\": 10}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result",
                        is(55)));
    }

    @Test
    public void doUntil_Factory5_Returns120() throws Exception {
        this.mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\"until\": 5}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result",
                        is(120)));
    }

    @Test
    public void doUntil_ActrionMissingAtSum_ProvideNumber() throws Exception {
        this.mockMvc.perform(post("/dountil/sum"))
                .andExpect(jsonPath("$.error",
                        is("Please provide a number!")));
    }

    @Test
    public void doUntil_ActrionMissingAtFactory_ProvideNumber() throws Exception {
        this.mockMvc.perform(post("/dountil/factor"))
                .andExpect(jsonPath("$.error",
                        is("Please provide a number!")));
    }

    @Test
    public void arrays_Null_ErrorMessage() throws Exception {
        this.mockMvc.perform(post("/arrays"))
                .andExpect(jsonPath("$.error",
                        is("Please provide what to do with the numbers!")));
    }

    @Test
    public void arrays_Sum_RetrunSumOfArray() throws Exception {
        this.mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\"what\":\"sum\"," + "\"numbers\":[2,3,5,6]}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result",
                        is(16))); // TODO: 2019. 03. 19. $.result solve
    }

}
