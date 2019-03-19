package com.greenfoxacademy.rest.controllertest;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.greenfoxacademy.rest.model.LogServiceInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
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


}
