package com.aem.modelimplementations;
import com.aem.openAem;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;


@GraphWalker(value = "random(edge_coverage(100))", start = "v_login")
public class AemLogin extends ExecutionContext implements openAem {

    @Override
    public void v_login() {
        System.out.println("Running: v_login");
    }

    @Override
    public void e_open_aem() {
        System.out.println("Running: e_open_aem");
    }
    @Override
    public void e_auth() {
        System.out.println("Running: e_auth");
    }

    @Override
    public void v_logout() {
        System.out.println("Running: v_logout");
    }

    @Override
    public void v_aem_welcome() {
        System.out.println("Running: v_aem_welcome");
    }
}