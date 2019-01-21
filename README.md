# InputViewDemo
此空间为常用的输入框 左边为key右边为输入框的value  
![Image text](https://github.com/Smartisan1/InputViewDemo/blob/master/pictureDemo.jpg)

使用方法
第一 在Project 的build.gradle
in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
第二 在Moudle:App
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Smartisan1:InputViewDemo:Tag'
	}
	
	
具体使用方法:

在布局文件中使用
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
        ></com.chenglin.inputviewlibrary.InputView>

其中对应的key 和value 分别对应的是 左边的标题(TextView) 右边的输入框(EditText)

 <attr name="keySize" format="dimension" />                          // 标题文字大小
        <attr name="keyColor" format="color" />                      //标题颜色
        <attr name="key" format="string" />                          //标题内容
        <attr name="padding" format="dimension"/>                    // 标题和输入框的左右内边距
        <attr name="valueMargainLefttoParent" format="dimension" />       输入框距离屏幕左边的距离 dp
        <attr name="valueSize" format="dimension" />                    //输入框文字大小
        <attr name="valueColor" format="color" />
        <attr name="valuehint" format="string"/>                     //输入框文字大小hint值
        <attr name="valueRight" format="boolean"/>                   //输入框文字是否靠右对齐
        <attr name="inputTypePassword" format="boolean"/>            // 输入框是否为密码格式
        <attr name="digits" format="string"/>                        // 输入框的输入类型限制
