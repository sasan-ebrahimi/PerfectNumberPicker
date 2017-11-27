# PerfectNumberPicker

A number picker that is completely customizable ...

# ScreenShot

![](http://s8.picofile.com/file/8312829276/PerfectNumberPicker2.png)

# Usage

## Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
## Step 2. Add the dependency

```gradle
	dependencies {
		compile 'com.github.sasan-ebrahimi:perfectnumberpicker:1.0.0'
	}
```

## Step 3. Use as XML

```xml
<com.sasanebrahimi.perfectnumberpicker.PerfectNumberPicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
```

Custom Attributes

```xml
<com.sasanebrahimi.perfectnumberpicker.PerfectNumberPicker
        android:id="@+id/npMaxOrder"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="right"
        android:layout_margin="10dp"
        android:gravity="center"
        app:se_pnp_max_value="9"
        app:se_pnp_min_value="-8"
        app:se_pnp_minus_color="#00ff00"
        app:se_pnp_plus_color="#00dd77"
        app:se_pnp_step="2"
        app:se_pnp_textSize="26dp"
        app:se_pnp_text_color="#000"
        app:se_pnp_value="-2">
```

## Attributes

|attribute name|attribute description|default value|
|:-:|:-:|:-:|
|se_pnp_max_value|Maximum value for the numberpicker|100|
|se_pnp_min_value|Minimum value for the numberpicker|0|
|se_pnp_value|The selected value of datepicker|10|
|se_pnp_step|step of increase and decrease for numberpicker value|1|
|se_pnp_textSize|number, plus and minus button text size|19dp|
|se_pnp_text_color|Color of value text|#737373|
|se_pnp_plus_color|Color of plus button text|#2196f3|
|se_pnp_minus_color|Color of minus button text|#d81b60|


## Methods

|Method name|Method description|
|:-:|:-:|
|getValue()|int - Returns the selected value of numberpicker|
