package com.example.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

//import butterknife.BindView;
//import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    //@BindView(R.id.topbar)
    //QMUITopBar mTopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         setContentView(R.layout.activity_main);
    }

//    private void initTopBar() {
//        mTopBar.setBackgroundColor(ContextCompat.getColor(this, R.color.app_color_theme_4));
//        mTopBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//                overridePendingTransition(R.anim.slide_still, R.anim.slide_out_right);
//            }
//        });
//
//        mTopBar.setTitle("沉浸式状态栏示例");
//    }


    public void onClickShowDefaultDialog(View view) {
        new AlertDialog.Builder(this)
                .setTitle("默认对话框标题")
                .setMessage("这是默认对话框的内容")
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .create()
                .show();
    }

    public void onClickShowQMUIDialog(View view) {
        new QMUIDialog.MessageDialogBuilder(this)
                .setTitle("QMUI对话框标题")
                .setMessage("这是QMUI框架对话框的内容")
                .addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "点击了取消按钮", Toast.LENGTH_SHORT).show();

                    }
                })
                .addAction("确定", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}

