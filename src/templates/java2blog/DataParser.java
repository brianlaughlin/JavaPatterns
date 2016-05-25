/*
Template
http://www.java2blog.com/2013/03/template-method-design-pattern-in-java.html

*/
package templates.java2blog;


abstract public class DataParser {
    
    // Template Method
    
    public final void parseDataAndGenerateOutput(){
        readData();
        processData();
        writeData();
    }

    abstract void readData();
    abstract void processData();
    
    public void writeData(){
        
        System.out.println("Output generated, writing to CSV.");
    }
    
}
