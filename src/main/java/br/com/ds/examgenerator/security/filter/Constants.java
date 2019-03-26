package br.com.ds.examgenerator.security.filter;

import java.util.concurrent.TimeUnit;

/**
 * @author Douglas Souza on 25/03/2019
 */
public class Constants {
    public static final String SECRET = "secre";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final long EXPIRATION_TIME = 86400000L; //1 day

    public static void main(String[] args) {
        System.out.println(TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
    }
}
