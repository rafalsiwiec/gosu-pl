package gosu.js;

import gw.config.CommonServices;
import gw.lang.parser.*;
import gw.util.GosuExceptionUtil;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ecai on 7/11/2016.
 */
public class ExtendsTest {

    private static ScriptEngine engine;

    @BeforeClass
    public static void beforeClass() {
        engine = new ScriptEngineManager().getEngineByName("nashorn");
        Utils.maybeInit();
    }

    @Test
    public void addedMethods()  {
        assertEquals(42, eval("var extended = new ExtendsClass(); return extended.foo()"));
    }

    @Test
    public void inheritedMethods() {
        assertEquals("hello", eval("var extended = new ExtendsClass(); extended.add('hello'); return extended.get(0)"));
    }

    @Test
    public void overridedMethods() {
        assertEquals(2, eval("var extended = new ExtendsClass(); extended.add(1); return extended.size()"));
    }

    @Test
    public void superInNonoverrideMethod() {
        assertEquals(6, eval("var extended = new ExtendsClass(); extended.anotherAdd(6); return extended.get(0)"));
    }

    @Test
    public void overloadedInheritedMethod() {
        /*remove can either take an object or an index*/
        assertEquals("hello", eval("var extended = new ExtendsClass(); " +
                "extended.anotherAdd('hello'); " +
                "return extended.remove(0)"));

    }

    @Test
    public void gosuBlockOnExtendedClass() {
        assertEquals(3, eval("var extended = new ExtendsClass(); " +
                "extended.add(1);extended.add(2);extended.add(3); " +
                "return extended.where(\\s -> s > 2)[0]"));
    }

    private Object eval( String program )
    {
        IGosuProgramParser programParser = CommonServices.getGosuParserFactory().createProgramParser();
        try
        {
            IParseResult iParseResult = programParser.parseExpressionOrProgram( program, new StandardSymbolTable( true ), new ParserOptions() );
            return iParseResult.getProgram().evaluate( new ExternalSymbolMapForMap( new HashMap<>() ) );
        }
        catch( Exception e )
        {
            throw GosuExceptionUtil.forceThrow( e );
        }
    }
}
