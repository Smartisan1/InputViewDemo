package com.chenglin.inputviewlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.InputType;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chenglin.inputviewlibrary.R;

public class InputView extends RelativeLayout {

    private   TextView tvKey;
    private  EditText etValue;


    public InputView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public InputView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    public EditText getEditext(){
        return etValue;
    }

    private void initView(Context context, AttributeSet attrs) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_input_view, this);
        RelativeLayout rlItem = inflate.findViewById(R.id.rl_item);
        tvKey = inflate.findViewById(R.id.tv_key);
        etValue = inflate.findViewById(R.id.et_value);
        if (attrs != null) {
            TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.InputView);
            // padding 边距
            float dimension = typedArray.getDimension(R.styleable.InputView_padding, 18);
            int round = PxDpUtil.dp2px(getContext(), dimension);
            rlItem.setPadding(round, 0, round, 0);

/******************  key 内容 ********************/
            // key 内容的大小
            float keySize = typedArray.getDimension(R.styleable.InputView_keySize, PxDpUtil.sp2px(context,14));
            tvKey.setTextSize(TypedValue.COMPLEX_UNIT_PX,keySize);
            // key 文字大小
            String key = typedArray.getString(R.styleable.InputView_key);
            tvKey.setText(key);
            // key颜色
            int color = typedArray.getColor(R.styleable.InputView_keyColor, Color.BLACK);
            tvKey.setTextColor(color);
            /******************  Value 内容 ********************/
            // 输入框距离父类 左边距离 ---为了保证对齐好看
            float valueLeftToParent = typedArray.getDimension(R.styleable.InputView_valueMargainLefttoParent, 120);
            alertMaginLeft1(etValue, Math.round(valueLeftToParent));
            // 输入框的颜色
            int color1 = typedArray.getColor(R.styleable.InputView_valueColor, Color.BLACK);
            etValue.setTextColor(color1);

            String hint = typedArray.getString(R.styleable.InputView_valuehint);
            etValue.setHint(hint);
            // 输入框文字大小
            float valueSize = typedArray.getDimension(R.styleable.InputView_valueSize, PxDpUtil.sp2px(context,14));  //这个方法会将原有的值以px为单位进行转换
            etValue.setTextSize(TypedValue.COMPLEX_UNIT_PX, valueSize);
            //gravity 方式
            boolean aBoolean = typedArray.getBoolean(R.styleable.InputView_valueRight, false);
            if (aBoolean) {
                etValue.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
            } else {
                etValue.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL);
            }

            // 输入的是否是密码
            boolean inputType = typedArray.getBoolean(R.styleable.InputView_inputTypePassword, false);
            if (inputType){
                etValue.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }

        }


    }

    private void alertMaginLeft1(EditText et, int left) { //        这个必须是TextView的父布局,但是布局w，h可以任意设置？？
        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(left, 0, 0, 0);
        et.setLayoutParams(params);
    }

}
