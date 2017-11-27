# PerfectNumberPicker

A number picker that is completely customizable ...

# ScreenShot

![](http://s9.picofile.com/file/8311417518/SEPersianDatePicker.png)

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
|se_pdp_day|The selected day of datepicker|The selected day of datepicker|
|se_pdp_month|The selected month of datepicker|wewr|
|se_pdp_year|The selected year of datepicker|werw|
|se_pdp_divider_color|Color of divider line between row of each column|sefwe|
|se_pdp_text_color|Color of datepicker texts|wewef|
|se_pdp_max_year|Maximum value for year|fssadfsa|
|se_pdp_min_year|Minimum value for year|afasasd|

## Methods

|Method name|Method description|
|:-:|:-:|
|getDateString(String seperator)|String - Returns complete date in string with given seperator like 1397-01-24 or 1397/01/24|
|getDay()|int - Returns selected day of datepicker in int|
|getMonth()|int - Returns selected month of datepicker in int|
|getYear()|int - Returns selected year of datepicker in int|
