package com.naoh.iossupersign.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ：Ami.tsai
 * @date ：Created in 2019-07-05 09:05
 * @description：执行shell脚本
 * @modified By：
 * @version: 1.0
 */
public class ShellUtils {

    /**
      * create by: Ami
      * description: 执行shell
      * create time: 2019-07-05 09:17

      * @return 是否执行成功
      */
    public static boolean run(String command) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String line;
        int exitValue = process.waitFor();
        System.out.println(exitValue);
        while((line = reader.readLine())!= null){
            System.out.println(line);
        }
        return exitValue==0;
    }

}
