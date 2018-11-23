# javafx-boot-demo
这个是 javafx 和 springboot 的整合。

需要注意视图文件名要和yaml文件名相同,一一对应,否则无法运行.
如视图文件MainView.java,则yaml文件需命名为main.fxml


# 打包

JavaFX-Maven-Plugin可以打包 jar、native、webbundle、key-store这些。

由于我是 mac，一般用 jar和 native，执行命令mvn jfx:native 会看到打包成了pkg 和 dmg 两种类型的安装包。并且都是180M 左右。由于没有 windows 计算机，所以还不知道打包成 exe 的状态。这么大的包，主要是因为 java 的 jdk 问题，模块化以后就好了。