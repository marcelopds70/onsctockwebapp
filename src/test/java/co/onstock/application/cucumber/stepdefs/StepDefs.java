package co.onstock.application.cucumber.stepdefs;

import co.onstock.application.OnsctockwebappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = OnsctockwebappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
