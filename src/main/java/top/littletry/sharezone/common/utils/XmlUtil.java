package top.littletry.sharezone.common.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/8
 * Time: 23:36
 *
 * @author LittleTry
 */
public class XmlUtil {
    protected transient static Log log = LogFactory.getLog(XmlUtil.class);
    public static void main(String[] args) {

    }

    private static XStream xStream;
    static {
        xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
    }
    public static String object2Xml(Object ro, Class<?>[] types) throws Exception {
        xStream.autodetectAnnotations(true);
        xStream.processAnnotations(types);
        return xStream.toXML(ro);
    }

    public static Object xml2Object(String inputXml, Class<?>[] types) throws Exception {
        if (null == inputXml || "".equals(inputXml)) {
            return null;
        }
        xStream.processAnnotations(types);
        return xStream.fromXML(inputXml);
    }

    public static <T> T getXML(String xmlPath, Class<T> cla) {
        XStream xStream = new XStream(new DomDriver("UTF-8"));
        xStream.autodetectAnnotations(true);
        FileInputStream fis = null;
        try {
            log.debug("getXML URL :"+xmlPath);
            fis = new FileInputStream(xmlPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        xStream.processAnnotations(cla);
        T obj = (T) xStream.fromXML(fis);
        return obj;
    }

    public static String setXML(Object obj){
        XStream xStream = new XStream();
        xStream.autodetectAnnotations(true);
        String xml = xStream.toXML(obj);
        log.debug("setXML :"+xml.length());
        return xml;
    }

    public static void writerXML(Object obj,String xmlPath) {
        XStream xStream = new XStream();
        xStream.autodetectAnnotations(true);
        try {
            FileOutputStream fs = new FileOutputStream(xmlPath);
            log.debug("writerXML URL :"+xmlPath);
            xStream.toXML(obj, fs);
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
