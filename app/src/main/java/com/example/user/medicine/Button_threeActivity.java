package com.example.user.medicine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

public class Button_threeActivity extends AppCompatActivity {
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_three); // layout 보여주기

        input = (EditText) findViewById(R.id.editText5); // 약 이름 검색하는 것을 Input이라고 쳐주기

        ListView listView = (ListView) findViewById(R.id.listView); // ListView로 보여주기
        ListViewAdapter listViewAdapter = new ListViewAdapter(); // ListViewAdapter 생성하기
        listView.setAdapter(listViewAdapter);
    }

    public void find_three(View v) throws IOException {
        new Thread() {
            public void run() {
                // * 네이버 API 사용하기 위해서 아이디랑 비밀번호 설정하기
                String clientSecret = "UjTH4pc6amYpH8hvTbIUkktfuuDqzW0G1zmYACmlIVg0zt3O%2F3LhFjeGeEV7Swze69ymF4jypkiLwjJdIG%2FlbA%3D%3D";//애플리케이션 클라이언트 시크릿값";
                try {
                    // 0. 입력값 URL에 추가해서 보낼 준비하기
                    String text = URLEncoder.encode(input.getText().toString(), "UTF-8");
                    String apiURL = " http://apis.data.go.kr/1471057/MdcinPrductPrmisnInfoService/getMdcinPrductList?ServiceKey=" + clientSecret + "&item_name=" + text + "&numOfRows=1";

                    // 1. Request
                    URL url = new URL(apiURL);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();

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
                    while ((inputLine = br.readLine()) != null) {
                        response.append(inputLine);
                    }
                    br.close();
                    String result = response.toString();
                    System.out.println(result);

                    ArrayList<Medicine> arrayList = null;
                    XmlPullParserFactory factory = XmlPullParserFactory.newInstance(); // XmlPullParser 클래스 생성
                    XmlPullParser parser = factory.newPullParser();
                    parser.setInput(new StringReader(result));
                    int eventType = parser.getEventType(); // 코드의 시작과 끝을 알려주는 것을 의미
                    Medicine medicine = null;

                    while (eventType != XmlPullParser.END_DOCUMENT) {
                        switch (eventType) {
                            case XmlPullParser.END_DOCUMENT://문서의 끝
                                break;
                            case XmlPullParser.START_DOCUMENT:
                                arrayList = new ArrayList<Medicine>();
                                break;
                            case XmlPullParser.END_TAG: { //태그의 끝
                                String endtag = parser.getName();
                                if (endtag.equals("item")) {
                                    arrayList.add(medicine);
                                    medicine = null;
                                }
                            }

                            case XmlPullParser.START_TAG: { // 태그의 시작
                                String tag = parser.getName(); // 키를 얻어가는 방식이다.
                                switch (tag) {
                                    case "item": //item가 열렸다는것은 새로운 클래스 Medicine이 나온다는것
                                        medicine = new Medicine();
                                        break;
                                    case "ITEM_SEQ":
                                        if (medicine != null)
                                            medicine.setITEM_SEQ(parser.nextText());
                                        break;
                                    case "ITEM_NAME":
                                        if (medicine != null)
                                            medicine.setITEM_NAME(parser.nextText());
                                        break;
                                    case "ENTP_NAME":
                                        if (medicine != null)
                                            medicine.setENTP_NAME(parser.nextText());
                                        break;
                                    case "ITEM_PERMIT_DATE":
                                        if (medicine != null)
                                            medicine.setITEM_PERMIT_DATE(parser.nextText());
                                        break;
                                    case "INDUTY":
                                        if (medicine != null)
                                            medicine.setINDUTY(parser.nextText());
                                        break;
                                    case "PRDLST_STDR_CODE":
                                        if (medicine != null)
                                            medicine.setPRDLST_STDR_CODE(parser.nextText());
                                        break;
                                    case "SPCLTY_PBLC":
                                        if (medicine != null)
                                            medicine.setSPCLTY_PBLC(parser.nextText());
                                        break;
                                    case "PRDUCT_TYPE":
                                        if (medicine != null)
                                            medicine.setPRDUCT_TYPE(parser.nextText());
                                        break;
                                    case "PRDUCT_PRMISN_NO":
                                        if (medicine != null)
                                            medicine.setPRDUCT_PRMISN_NO(parser.nextText());
                                        break;
                                    case "ITEM_INGR_NAME":
                                        if (medicine != null)
                                            medicine.setITEM_INGR_NAME(parser.nextText());
                                        break;
                                    case "ITEM_INGR_CNT":
                                        if (medicine != null)
                                            medicine.setITEM_INGR_CNT(parser.nextText());
                                        break;
                                    case "PERMIT_KIND_CODE":
                                        if (medicine != null)
                                            medicine.setPERMIT_KIND_CODE(parser.nextText());
                                        break;
                                    case "CANCEL_DATE":
                                        if (medicine != null)
                                            medicine.setCANCEL_DATE(parser.nextText());
                                        break;
                                    case "CANCEL_NAME":
                                        if (medicine != null)
                                            medicine.setCANCEL_NAME(parser.nextText());
                                        break;
                                }
                                break;
                            }
                        }
                        eventType = parser.next();
                    }
                    for (Medicine b: arrayList)
                        System.out.println(b);
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
