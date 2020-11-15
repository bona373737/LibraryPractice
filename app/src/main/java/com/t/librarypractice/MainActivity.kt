package com.t.librarypractice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun setupEvents() {

//        Action_Call 을 이용하여 바로 전화연결 -> 권한 획득 처리로 같이 진행
//        권한이 있었는지 판별하여 있을때와 없을때 행동 가이드북을 만들어서 -> 실제 권한 체크
//        TexPermisstion 라이브러리 활용

//      권한상태에 따른 행동요령(가이드북:permission Listener:pl) 작성
//      object : 가이드북을 닮기 위한 임시(익명) 클래스 => 자바에서는 인터페이스 활용이라는 의미
//      permissionListener => object가 어떤 종류의 가이드북을 담는지?
//       granted : 승인되었을때 코드, Denied :

        val pl = object : PermissionListener

//



        callBtn.setOnClickListener{
            val myUri = Uri.parse("tel:010-8888-7777")
            val myIntent = Intent(Intent.ACTION_CALL,myUri)
            startActivity(myIntent)
        }

    }

    override fun setValues() {

       Glide.with(mContext).load(http://m.blog.daum.net/01199053017/4329181).into(fisrtImg)


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}