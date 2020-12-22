package com.bravesejin.databindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bravesejin.databindingexample.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    //xml파일 이름 기준으로 클래스 생성된 것.

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        이렇게.
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //xml의 activity 변수를 이 액티비티로 하겠다는 말. 즉, activity 변수는 함수나 변수를 참조할 수 있다.
        //setActivity() 함수는 xml에 activity라는 변수를 만들었기 때문에 자동생성.
        binding.setActivity(this);

    }
    //클릭이벤트 콜백은 xml에 등록한다.
    public void onBtnClick(View view){
        Toast.makeText(this, "ButtonClick",Toast.LENGTH_LONG).show();
    }
}