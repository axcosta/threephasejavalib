package org.threephasejavalib;

import org.concordion.api.BeforeExample;
import org.concordion.api.MultiValueResult;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class RunFixture {
    Simulation simulation;
    @BeforeExample
    public void setupExample() {
        simulation = new Simulation();
    }
    public String getState() {
        return simulation.getState();
    }
    public void run () {
        simulation.run();
    }
}
