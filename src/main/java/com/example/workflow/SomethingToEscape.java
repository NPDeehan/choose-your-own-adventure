package com.example.workflow;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class SomethingToEscape implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {

        String action = (String) execution.getVariable("action");
        if(action.equalsIgnoreCase("scream")){
            System.out.println("AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        }
        if(action.equalsIgnoreCase("sit")){
            System.out.println("Your butt is wet");
        }
        if(action.equalsIgnoreCase("jump")){
            throw new BpmnError("Jump");
        }

    }
}
