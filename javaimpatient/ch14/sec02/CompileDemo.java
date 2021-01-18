package ch14.sec02;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CompileDemo {
    public static void main(String[] args) throws IOException, ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");

        //if (engine implements Compilable) {
            Reader reader = Files.newBufferedReader(Paths.get("/tmp/next.js"));            
            CompiledScript script = ((Compilable) engine).compile(reader);
            script.eval();
        //}    
    }
}
