package tests;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;

/**
 * Created by blanfordrobinson on 6/18/2016.
 */
public class Velocity {

    public static void main(String[] args) {


        VelocityEngine ve = new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        ve.setProperty(RuntimeConstants.RUNTIME_LOG_LOGSYSTEM_CLASS, "org.apache.velocity.runtime.log.Log4JLogChute" );
        ve.setProperty("runtime.log.logsystem.log4j.logger","velocity");
        ve.init();

        Template t = ve.getTemplate("templates/verify.vm");
        VelocityContext templateContext = new VelocityContext();
        templateContext.put("date", "hello" );
        StringWriter sw = new StringWriter();
        t.merge(templateContext, sw);
        //org.ici.mail.Emailer emailer = new org.ici.mail.Emailer("mapiarray.ici.org", "viewpoints@ici.org", true);
        //emailer.sendEmailHTML("blanford.robinson@ici.org", "hello", sw.toString());

    }


}
