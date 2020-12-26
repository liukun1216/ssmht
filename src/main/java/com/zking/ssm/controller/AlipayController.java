package com.zking.ssm.controller;


import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.zking.ssm.util.zfb;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class AlipayController {

    /**
     * 快捷支付调用支付宝支付接口
     * @param model，id，payables，
     * @throws IOException ，AlipayApiException
     * @return Object
     * @author 有梦想一起实现
     */
    @RequestMapping("alipaySum")
    public Object alipayIumpSum(Model model, String payables, String subject, String body, HttpServletResponse response)
            throws Exception {
        zfb zffb=new zfb();
        // 获得初始化的AlipayClient
        AlipayClient alipayClient = zffb.getAlipayClient();
        // 设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(zfb.return_url);
        alipayRequest.setNotifyUrl(zfb.notify_url);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        // 商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = sdf.format(new Date());
        // 付款金额，必填
        String total_amount = payables.replace(",", "");
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
                + "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        // 请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
         System.out.println(result);
        zfb.logResult(result);// 记录支付日志
        response.setContentType("text/html; charset=gbk");
        PrintWriter out = response.getWriter();
        out.print(result);
        return null;
    }
    @RequestMapping("notify_url")
    public void Notify() throws Exception {
        System.out.println("----------------------------notify_url------------------------");

//        if (trade_status.equals("TRADE_SUCCESS")) {//支付成功商家操作
//            //下面是我写的一个简单的插入操作，根据你的操作自行编写
//            /*Map<Object, Object> map = new HashMap<Object, Object>();
//            map.put("cuId", Integer.valueOf(cus));
//            RepaymentPlan repaymentPlan = new RepaymentPlan();
//            Integer id = Integer.valueOf(out_trade_no);
//            double payablesCheck = Double.valueOf(total_amount);
//            RepaymentPlan repayCheck = serviceMain.selectByPrimaryKey(id);
//            double total = repayCheck.getPayables();
//            if (Double.valueOf(total_amount) < repayCheck.getPayables()) {
//                map.put("ubalance", total - Double.valueOf(total_amount));
//                serviceMain.updateCusMoney(map);
//            }
//            repaymentPlan.setId(id);
//            repaymentPlan.setActualPayment(total);
//            repaymentPlan.setRepaymentStatus(1);
//            int i = serviceMain.updateByPrimaryKeySelective(repaymentPlan);
//            System.out.println("---------------------还款影响行数----------------------------" + i);*/
//        }
    }
}
