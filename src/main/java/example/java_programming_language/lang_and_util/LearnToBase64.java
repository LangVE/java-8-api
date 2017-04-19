package example.java_programming_language.lang_and_util;

import com.sun.xml.internal.fastinfoset.Encoder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * Created by 이영호 on 2017-04-19.
 */
public class LearnToBase64 {
    public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException {
        URL myurl = new URL("http://example.com?param1=1&param2=2+");
        System.out.println("myurl = " + myurl);
        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        byte[] encodedMyurl = urlEncoder.encode(myurl.toString().getBytes(Encoder.UTF_8));
        System.out.println("Base64 Encoded URL : " + new String(encodedMyurl,"UTF-8"));

        String mystr = "http://example.com?param1=1&param2=2+";
        System.out.println("mystr = " + mystr);
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encodedMystr = encoder.encode(mystr.getBytes());
        System.out.println("Base64 Encoded Str : " + new String(encodedMystr,"UTF-8"));
    }
}
