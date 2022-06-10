package com.javaseleniumtemplate.suite;

import com.javaseleniumtemplate.tests.AlmoxLocaTests;
import com.javaseleniumtemplate.tests.LoginTests;
import com.javaseleniumtemplate.tests.RelatorioPosicaoEstoqueTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    LoginTests.class,
    AlmoxLocaTests.class,
    RelatorioPosicaoEstoqueTest.class
})

public class SuiteTeste {

}
