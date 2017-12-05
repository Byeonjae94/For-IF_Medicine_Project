package com.example.user.medicine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Button_oneActivity extends AppCompatActivity {
    EditText input;
    TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_one);
        input = (EditText) findViewById(R.id.editText4);
    }

    public void find(View v) {
        new Thread() {
            public void run() {
                // * 네이버 API 사용하기 위해서 아이디랑 비밀번호 설정하기
                String clientId = "9TnfWU9CmPmmnnBoYCqE";//애플리케이션 클라이언트 아이디값";
                String clientSecret = "Xj8Phoj87a";//애플리케이션 클라이언트 시크릿값";
                try {
                    // 0. 입력값 URL에 추가해서 보낼 준비하기
                    String text = URLEncoder.encode(input.getText().toString(), "UTF-8");
                    String apiURL = "https://openapi.naver.com/v1/search/encyc.json?query=" + text; // json 결과
                    //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과

                    // 1. Request
                    URL url = new URL(apiURL);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection(); // 소켓 연결하기
                    con.setRequestMethod("GET");
                    con.setRequestProperty("X-Naver-Client-Id", clientId);
                    con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
                    // 2. Response
                    int responseCode = con.getResponseCode();
                    BufferedReader br; // 내가 받고 싶은 데이터들이 여기에 다 들어있다.
                    if (responseCode == 200) { // 정상 호출 - 200만 정상인 특징이다.
                        br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    } else {  // 에러 발생
                        br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                    }
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    // 3. 한 줄씩 계속해서 값을 받아오는 것이라고 생각하면 된다.
                    while ((inputLine = br.readLine()) != null) { // 한줄 읽어오는 방식이다.
                        response.append(inputLine);
                    }
                    br.close();
                    String result = response.toString();
                    System.out.println(result);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }.start();
    }
}
