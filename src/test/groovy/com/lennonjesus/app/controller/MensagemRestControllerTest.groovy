package com.lennonjesus.app.controller

import com.google.gson.Gson
import com.lennonjesus.app.MySpringBootTestProjectApplication
import com.lennonjesus.app.entity.Mensagem
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * Created by lennonjesus on 28/08/15.
 */
@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = MySpringBootTestProjectApplication.class)
@WebAppConfiguration
class MensagemRestControllerTest {


    def MockMvc mockMvc

    def HttpMessageConverter mappingJackson2HttpMessageConverter

    @Autowired
    def WebApplicationContext webApplicationContext

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build()
    }

    @Test
    public void deveAdicionarNovaMensagem() throws Exception {
        mockMvc.perform(post("/mensagem")
                .contentType("application/json")
                .content(new Gson().toJson(new Mensagem(texto: "Hello World!")))
        ).andExpect(status().isOk())

    }

    @Test
    public void naoDeveAdicionarMensagemSemTexto() throws Exception {
        mockMvc.perform(post("/mensagem")
                .contentType("application/json")
                .content(new Gson().toJson(new Mensagem()))
        ).andExpect(status().isBadRequest())

    }

}