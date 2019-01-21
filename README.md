# InputViewDemo
此控件为常用的输入框 左边为输入框名称key,右边为输入框value  
![Image text](https://github.com/Smartisan1/InputViewDemo/blob/master/pictureDemo.jpg)

使用方法
# 在Project 的build.gradle
in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
# 在Moudle:App
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Smartisan1:InputViewDemo:v1.0'
	}
	
	
# 具体使用方法:

在布局文件中使用
```
  <com.chenglin.inputviewlibrary.InputView
        android:layout_width="match_parent"
        android:layout_height="48dp"
        app:key="用户名:"
        app:keySize="18sp"
        app:valuehint="请输入用户名"
        app:valueMargainLefttoParent="90dp"
        app:valueSize="16sp"
        app:keyColor="#00ffff"
        app:valueRight="true"
        />
```

其中对应的key 和value 分别对应的是 左边的标题名称(TextView) 右边的输入框(EditText)


|参数|对应的值|
|:---|:---|
|key|名称文字值|
|keySize|名称文字大小|
|keyColor|名称文字颜色|
|padding|名称和输入框的左右内边距|
|valueMargainLefttoParent|输入框距离屏幕左边的距离 dp|
|valueSize|输入框文字大小|
|valueColor|输入框文字颜色|
|valuehint|输入框文字大小hint值|
|valueRight|输入框文字是否靠右对齐|
|inputTypePassword|输入框是否为密码格式|
|digits|输入框的输入类型限制|


