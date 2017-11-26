package com.sasanebrahimi.perfectnumberpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Sasan Ebrahimi on 11/26/17  1:14 AM.
 */

public class PerfectNumberPicker extends LinearLayout {

    int value = 10;
    int minValue = 0;
    int maxValue = 100;
    int step = 1;
    int textSize = 0;
    int textColor;
    int plusColor;
    int minusColor;
    TextView tv;
    TextView btnIncrease, btnDecrease;
    OnNumberPickerValueChanged onNumberPickerValueChanged;

    public PerfectNumberPicker(Context context) {
        super(context);
        init(context);

    }

    public PerfectNumberPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);

    }

    public PerfectNumberPicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
        init(context, attrs);

    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.pnp, this, true);
        tv = (TextView) view.findViewById(R.id.tv);
        setValue(value);
        btnIncrease = (TextView) view.findViewById(R.id.increment);
        btnIncrease.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                increase();
            }
        });
        btnDecrease = (TextView) view.findViewById(R.id.decrement);
        btnDecrease.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease();
            }
        });
        textSize = convertDpToPixels(19 , context);
        textColor = Color.parseColor("#737373");
        plusColor = Color.parseColor("#2196f3");
        minusColor = Color.parseColor("#d81b60");
    }

    public void init(Context context, AttributeSet attrs) {
        init(context);
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.PerfectNumberPicker, 0, 0);
        setMaxValue(a.getInt(R.styleable.PerfectNumberPicker_se_pnp_max_value, maxValue));
        setMinValue(a.getInt(R.styleable.PerfectNumberPicker_se_pnp_min_value, minValue));
        setValue(a.getInt(R.styleable.PerfectNumberPicker_se_pnp_value, value));
        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX,  a.getDimensionPixelOffset(R.styleable.PerfectNumberPicker_se_pnp_textSize, textSize));
        btnDecrease.setTextSize(TypedValue.COMPLEX_UNIT_PX,  a.getDimensionPixelOffset(R.styleable.PerfectNumberPicker_se_pnp_textSize, textSize));
        btnIncrease.setTextSize(TypedValue.COMPLEX_UNIT_PX,  a.getDimensionPixelOffset(R.styleable.PerfectNumberPicker_se_pnp_textSize, textSize));

        tv.setTextColor(a.getColor(R.styleable.PerfectNumberPicker_se_pnp_text_color, textColor));
        btnIncrease.setTextColor(a.getColor(R.styleable.PerfectNumberPicker_se_pnp_plus_color, plusColor));
        btnDecrease.setTextColor(a.getColor(R.styleable.PerfectNumberPicker_se_pnp_minus_color, minusColor));
        step = a.getInt(R.styleable.PerfectNumberPicker_se_pnp_step, step);
    }

    public void increase() {
        setValue(value + step);

    }

    public void decrease() {
        setValue(value - step);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        int pre = this.value;
        if (value >= minValue && value <= maxValue) {
            this.value = value;
            //tv.setText(MyString.getArabicFormat(value));
            tv.setText("" + value);
        }
        int now = this.value;
        if (onNumberPickerValueChanged != null)
            onNumberPickerValueChanged.onChanged(pre, now);
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public OnNumberPickerValueChanged getOnNumberPickerValueChanged() {
        return onNumberPickerValueChanged;
    }

    public void setOnNumberPickerValueChanged(OnNumberPickerValueChanged onNumberPickerValueChanged) {
        this.onNumberPickerValueChanged = onNumberPickerValueChanged;
    }

    public int convertDpToPixels(float dp, Context context) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
        return px;
    }
}
