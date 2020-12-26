package com.zking.ssm.util;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import lombok.Data;

import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;

@Data
public class zfb {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000116668275";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWufMrhutfJFPo2acugEjRDydZt+EJ80e+LodrQnDn40enqXNE1wAW1ARf1nm7nkPn5qvPyaDyKP7EYmnaen2Rse7WC0ptxJGEN1OsnARTbYjetva+/sIjfznPbmrGPFYWWodpP4LMBgiofFtK+BxUfGMSvw92ujby+QxiFEmjRJcpwsbCDYAeuMsWKz7LVF0rlDA9wDvuv1/g0Eq79Lp+OBUTft7U9X9qNU2m/knJtBVfsqUDFOKSrAzAGcwAx+YAHlQ077A2WSJ8BrURP1w64dbrXoWZ2/w/er+ehBH3G0QTOkhL3gM3qnWiYYrHHHMbKlKt3TeXiuKWhABgHfxtAgMBAAECggEAL7CmQB9wWaok4of7Xbs5Tux8huanTX6sNICEWGutTbGb+nCjCCT+4jozKB+0ZKiu07Eoq5YgVn6iHYEF/RrEoFSsPQ1Vf2WypSLcVsEGnV8K72z0pXn180VOBVPqdM6ibnA2aBawS92c37J5MD9Qt2qj7kqFmgtRV491W5MPuZh9WouaJEeQwSWa9JF5396tfxR9hC3yX3W3uiNKlVbGEiEIRNI8hKcaQHkVE7D+QnGpgHuH91Pp9KD26SFu+k80+ULHUF08F1OR3ZIXu1pcRfzN6Kcw4bnH+dH4J/0tjsFh9rLrNWVXH/4R6gRwu7D6//b+alLMl+xXIqh9QhkcAQKBgQDYPqX4J1GCJF7RYQ4MGC4eck4gRGs+LPW2XKTPR3pqvm6ShPF7MtQFSSULJOIQkIWHJClOT1trrxtpkR6ArblOrKvkoGcp2LpfnsrrmH0KNIor4XnN+ZXd8ru0OIwrGP+jNPQlfzq6lvaDLqrFUorOtREMUitZ8QDO0P7DVft0swKBgQCyb74hxDHbGt2UP6CTRplwIlXoKch3RT5QboDB3fFIIhHgHTzHskiaCR8Bj3en/ulFtlaqngwENy7qK4VEqTPu7NUxttj2tFckO5q736WVk3cHBUmJsFb8ekDMQ1WpFzUZ2tsM9+PrU8ydafTcXgd8SdPDk5S+TuxC/mn67v6aXwKBgQDJ5RQIMI2FOHfefQMkf57vhkEzFy4ZitiOPskRTecZqlqKKd1b7QTPOo9/bBw04voIRtbZ6nWsgHzTf04/TfNpZQXIG4q2I0c+538FoAV+dbdbaNTUXmZyJqLhjLoxstFai6I3MCag9zmJGRUPzhUTETKtkjovazgZ4D88GRcAyQKBgDS8U7wVCQsReJU87M86GVULwMn5t1aQr2cEEae6WXoRH6lV2sXGSjDEK1bBuQJ8kyLYTerlBPYl/QaWUC/HtiKR+jxUJvFawTpjJ0sJQR3g1FfN1zsLU9oQo5/68pEj27zFcuH1TXYacSnAy+5pF9tC0oRF1LseBjOSj23rPnIPAoGADb/Cig7rBSkhZL2o+f5pFVFP76Z9zWyVrHX9czg877AIJrslZO3l9vfVjq3jN3J9l5NSN+mU9jJt8wieFVmge/Sj/bvZ1McV8FhiCCWPSsNW4GmIc0LY5fdpqg0mOYxMhvm26cyFqzMBmDWh3Ia7h3i1OaQUVGXf8SBgvi+B4ZM=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvSQQn0CZXax2ObmPfY1HzLp06UI6hrDn00YumBz1/7kgxp5IAnwiIwvAbi53f6oMlztk7WacaaAeL7KOAPBrqQPkUyIk4Ain84PmYSluH1eSGr1QOCNfw760CR/4ZIi9iPXrAqTGacazSFW8gzafgkaRifAGP23QZ6LaEa+lQnFRYtfLpEMGO1/JoWJzGi1E1Qo/2jf/9VDjr+iCMKczT6Rg2AiR94qRouthTEPJ9AGMMoVT0NMOEWlG5wcypH+SzzkcrEENoq4dwM7I7k6mauKGgRcRR3VRNVjlDA2b5WqPQJcStcTsbvUj8E5IX8Cw1g3hP/WwnpU9yXAMRe2l9wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8088/qtxm/";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8088/qtxm/";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";
        JsonData jsonData=new JsonData();

    AlipayClient alipayClient =  new DefaultAlipayClient(gatewayUrl,app_id,merchant_private_key,"json",charset,alipay_public_key,sign_type);

    public AlipayClient getAlipayClient(){
        return this.alipayClient;
    }

    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_"
                    + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
