package com.springboot.actuatormonitoring;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testng.Assert;
import org.testng.annotations.Test;


@SpringBootTest
@AutoConfigureMockMvc
public class ActuatorEndpointTest extends AbstractTestNGSpringContextTests {

    @Resource
    private MockMvc mockMvc;

    @Test(description = "Test the Actuator info endpoint")
    public void testInfoEndpoint() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/my-actuator/info")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResponse().getContentAsString();
        ObjectMapper objectMapper = new ObjectMapper();
        Object info = objectMapper.readValue(content, Object.class);
        Assert.assertEquals(status, 200);
        Assert.assertNotNull(info);
    }

    @Test(description = "Test the Actuator metrics endpoint")
    public void testMetricsEndpoint() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/my-actuator/metrics")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResponse().getContentAsString();
        ObjectMapper objectMapper = new ObjectMapper();
        Object metrics = objectMapper.readValue(content, Object.class);
        Assert.assertEquals(status, 200);
        Assert.assertNotNull(metrics);
    }

    @Test(description = "Test the Actuator environment endpoint")
    public void testEnvEndpoint() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/my-actuator/env")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResponse().getContentAsString();
        ObjectMapper objectMapper = new ObjectMapper();
        Object env = objectMapper.readValue(content, Object.class);
        Assert.assertEquals(status, 200);
        Assert.assertNotNull(env);
    }

    @Test(description = "Test the Actuator health endpoint")
    public void testHealthEndpoint() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/my-actuator/health")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResponse().getContentAsString();
        ObjectMapper objectMapper = new ObjectMapper();
        Object health = objectMapper.readValue(content, Object.class);
        Assert.assertEquals(status, 200);
        Assert.assertNotNull(health);
    }
}
