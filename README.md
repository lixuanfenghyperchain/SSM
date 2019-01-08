# 创建SSM后台权限管理系统
## 1、删除误提交到远程的文件
```
直接修改.gitignore文件,将不需要的文件过滤掉，然后执行命令
git rm -r --cached .
git add .
git commit
git push  -u origin master
```
## 2、使用git在本地创建一个项目的过程
````
    $ makdir ~/hello-world    //创建一个项目hello-world
    $ cd ~/hello-world       //打开这个项目
    $ git init             //初始化 
    $ touch README
    $ git add README        //更新README文件
    $ git commit -m 'first commit'     //提交更新，并注释信息“first commit”
    $ git remote add origin git@github.com:dedsf/hello-world.git     //连接远程github项目  
    $ git push -u origin master     //将本地项目更新到github项目上去
```