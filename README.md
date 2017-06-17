# BackgroundDrawable

### 效果图如下：

<div>
<img src="http://img.blog.csdn.net/20170616175028441?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvWmhhbmdMZWkyODA=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" width = 40%>
</div>


### 使用方法如下：

    BackgroundDrawable drawable = BackgroundDrawable.builder()
                .left(50)//设置左侧斜切点的高度（取值范围是大于0，小于100）
                .right(70)//设置右侧侧斜切点的高度（取值范围是大于0，小于100）
                .topColor(Color.parseColor("#FCD62D"))//设置上半部分的颜色（默认是白色）
                .bottomColor(Color.parseColor("#76C4EB"))//设置下半部分的颜色（默认是白色）
                .build();//调用build进行创建。
                
    // 将这个drawable设置给View
    view.setBackground(drawable);
    

### 导入项目：
     
    大家直接复制源码吧，源码也就一个类而已，还有就是我还不会如何将项目生成远程连接直接在Android Studio中使用
    
    大家谁会呀，教教我可好。
