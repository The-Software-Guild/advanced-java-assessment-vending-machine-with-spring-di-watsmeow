package com.watsmeow.VendingMachine;

import com.watsmeow.VendingMachine.controller.VendingMachineController;
import com.watsmeow.VendingMachine.dao.*;
import com.watsmeow.VendingMachine.service.VendingMachineDataValidationException;
import com.watsmeow.VendingMachine.service.VendingMachineDuplicateIdException;
import com.watsmeow.VendingMachine.service.VendingMachineServiceLayer;
import com.watsmeow.VendingMachine.service.VendingMachineServiceLayerImpl;
import com.watsmeow.VendingMachine.ui.UserConsoleImpl;
import com.watsmeow.VendingMachine.ui.UserIO;
import com.watsmeow.VendingMachine.ui.VendingMachineView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws VendingMachineDuplicateIdException,
            VendingMachinePersistenceException, VendingMachineDataValidationException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        VendingMachineController controller = ctx.getBean("controller", VendingMachineController.class);

        // Run the program/kick off the controller
        controller.run();
    }
}