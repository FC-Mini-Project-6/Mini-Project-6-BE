//package com.mini.money.api;
//
//import com.mini.money.entity.Deposit;
//import com.mini.money.repository.DepositRepository;
//import lombok.RequiredArgsConstructor;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//
//@Component
//@RequiredArgsConstructor
//public class DepositApi {
//
//    private final DepositRepository depositRepository;
//    @Value("${api.auth}")
//    private String auth;
//
//    public void exampleApi() throws IOException, ParseException {
//        // 1. URL을 만들기 위한 StringBuilder.
//        StringBuilder urlBuilder = new StringBuilder("http://finlife.fss.or.kr/finlifeapi/depositProductsSearch.json"); /*URL*/
//        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
//        urlBuilder.append("?" + URLEncoder.encode("auth","UTF-8") + "=" + auth); /*Service Key*/
//        urlBuilder.append("&" + URLEncoder.encode("topFinGrpNo","UTF-8") + "=" + URLEncoder.encode("020000", "UTF-8")); /*은행*/
//        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 넘버*/
//        // 3. URL 객체 생성.
//        URL url = new URL(urlBuilder.toString());
//        // 4. 요청하고자 하는 URL과 통신하기 위한 Connection 객체 생성.
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        // 5. 통신을 위한 메소드 SET.
//        conn.setRequestMethod("GET");
//        // 6. 통신을 위한 Content-type SET.
//        conn.setRequestProperty("Content-type", "application/json");
//        // 7. 통신 응답 코드 확인.
//        System.out.println("Response code: " + conn.getResponseCode());
//        // 8. 전달받은 데이터를 BufferedReader 객체로 저장.
//        BufferedReader rd;
//        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
//            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        } else {
//            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
//        }
//        // 9. 저장된 데이터를 라인별로 읽어 StringBuilder 객체로 저장.
//        StringBuilder sb = new StringBuilder();
//        String line;
//        while ((line = rd.readLine()) != null) {
//            sb.append(line);
//        }
//        // 10. 객체 해제.
//        rd.close();
//        conn.disconnect();
//        // 11. 전달받은 데이터 확인.
//
//        JSONParser parser = new JSONParser();
//        JSONObject obj = (JSONObject) parser.parse(sb.toString());
//
//        JSONObject parseResult = (JSONObject) obj.get("result");
//        JSONArray parseBaseList = (JSONArray) parseResult.get("baseList");
//
//        for (int i = 0; i < parseBaseList.size(); i++) {
//            JSONObject saveData = (JSONObject) parseBaseList.get(i);
//
//            Deposit deposit =
//                    new Deposit(String.valueOf(saveData.get("fin_prdt_cd")), String.valueOf(saveData.get("kor_co_nm")), String.valueOf(saveData.get("fin_prdt_nm")),
//                            String.valueOf(saveData.get("join_way")), String.valueOf(saveData.get("mtrt_int")),
//                            String.valueOf(saveData.get("spcl_cnd")), String.valueOf(saveData.get("join_member")),
//                            String.valueOf(saveData.get("etc_note")), String.valueOf(saveData.get("max_limit")), String.valueOf(saveData.get("dcls_strt_day")),
//                            String.valueOf(saveData.get("dcls_end_day")));
//
//
//            depositRepository.save(deposit);
//        }
//
//    }
//}
