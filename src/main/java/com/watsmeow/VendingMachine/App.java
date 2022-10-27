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


        /*
        UserIO io = new UserConsoleImpl();

        // Instantiate the view and view the UserIO implementation into it
        VendingMachineView view = new VendingMachineView(io);

        // Instantiate the dao
        VendingMachineDao dao = new VendingMachineDaoImpl();

        // Instantiate the audie dao
        VendingMachineAuditDao auditDao = new VendingMachineAuditDaoFileImpl();

        // Instantiate the service layer and wire the dao and audit dao into it
        VendingMachineServiceLayer myService = new VendingMachineServiceLayerImpl(dao, auditDao);

        // Instantiate the controller and wire the service layer into it
        VendingMachineController controller = new VendingMachineController(myService, view);
        */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        VendingMachineController controller = ctx.getBean("controller", VendingMachineController.class);

        // Run the program/kick off the controller
        controller.run();
    }
}