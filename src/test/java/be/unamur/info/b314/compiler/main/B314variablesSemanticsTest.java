package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314variablesSemanticsTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314variablesSemanticsTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }
    ;
    };

     //
    // Serie variables OK
    //
    @Test
    public void testvariables_id_operationAdd_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/test_generation_examen.b314", testFolder.newFile(), true, "variables: id_operationAdd");
    }

    @Test
    public void test_function_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/test_function_ok.b314", testFolder.newFile(), true, "variables: id_operationAdd");
    }



    @Test
    public void  testlocalvariabledecl_fct_local_variable_diff_names_ok_Local() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/testlocalvariabledecl_fct_local_variable_diff_names_ok.b314", testFolder.newFile(), true, "variables: id_operationAdd");
    }

    @Test
    public void  test_instruction_if_else() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/test_instruction_if_else.b314", testFolder.newFile(), true, "variables: id_operationAdd");
    }
    @Test
    public void affecxt_int_array_right_expressions() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/affecxt_int_array_right_expressions.b314", testFolder.newFile(), true, "variables: id_operationAdd");
    }
    @Test
    public void previous_series_and_if() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/previous_series_and_if.b314", testFolder.newFile(), true, "variables: id_operationAdd");
    }


    @Test
    public void test_affect_square_array_constant() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/test_affect_square_array_constant.b314", testFolder.newFile(), true, "variables: id_operationAdd");
    }



    //
    // Serie variables KO
    //
    @Test
    public void test_globalvardecl_struct_mistake() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/test_globalvardecl_struct_mistake.b314", testFolder.newFile(), false, "variables: id_operationAdd");
    }
    @Test
    public void test_square_function_no_local_var() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/test_square_function_no_local_var.b314", testFolder.newFile(), false, "variables: id_operationAdd");
    }
    @Test
    public void test_function_no_local_var() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/test_function_no_local_var.b314", testFolder.newFile(), false, "variables: id_operationAdd");
    }
    @Test
    public void testvariables_id_operationAdd_mistake_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/id_operationAdd_mistake.b314", testFolder.newFile(), false, "variables: id_operationAdd_mistake");
    }


}