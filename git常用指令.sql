1 设置用户签名 :
	git config -global user.name "用户名"
	git config -global user.email "注册邮箱"
2 绑定ssh密钥
	ssh-keygen -t rsa -C "注册邮箱"    ----> （一路回车） 
3 本地c盘/用户/Yulai 找到 .shh 文件夹 找到 d_rsa.pub  复制文件中的值 
4 setting  ->  SSH and GPG Keys -> New SSH Key  粘贴进去 --> Add SSH Key 


1 创建远程仓库：New repository --> 仓库名字、项目备注、Public  --> Create repository 
2 克隆远程库   ：git clone 自己仓库里的SSH链接   --> 手动yes  （可能）
	
克隆过程其实做了 3 件事：
1）拉取远程库的内容
2）初始化仓库
3）为仓库创建别名

3 提交代码：
	1）git add xxx                              --》 提交到缓存区 
	2）git commit -m "xxx"                		--》 提交到本地库
	3）git push -u origin master         		--》 提交到远程仓库




常用操作：

git add 文件名    		 将内容添加到缓存区
git add -A 			 提交所有更改、新增文件到缓冲区
git commit -m "提交说明"  	 将缓存区的数据提交的本地仓库
git commit -a -m "提交说明" 	 git add 和git commit 的合体(未跟踪的文件不会提交)
git status  			 查看状态
git init    			 初始化git工作目录
git rm --cached 文件名	 	 删除缓存区的内容（不会删除本地工作区域）
git log     			 查看历史版本 按（q）退出
git reset --hard HEAD^ 		 回退到上一个版本
git reset --hard HEAD^^		 回退到上上个版本
git reset --hard 版本号		 回退到具体版本
git reflog			 查看之前的版本记录
.gitignore 文件			 用来忽视某些文件的版本控制（.idea 、.gitignore等）
git mv old_name new_name	 文件重命名
git commit --amend		 此命令用来修改最后一次提交，如果没有做任何改动，直接运行此命令，相当于
				 可以重新编译提交说明。如果上次提交有些东西没有改，或者有些文件没有提交，则
				 可以先执行git add 然后再执行git commit --amend,让两次提交合并为一次提交
git diff			 参看修改文件的详情
git reset HEAD 文件名		 取消缓存区的文件
git checkout -- 文件名		 取消对文件的修改

标签：标签相当于一个不变分支的快照
git tag				 查看标签
git tag -a v1.0 -m "说明"	 创建一个标签
git show 标签名			 查看标签信息
git tag v1.0			 创建一个轻量级标签
git push origin 标签名		 创建的标签需要push到远端服务器
git push origin --tags		 推送所有的标签
git branch 分支名		 创建一个分支
git checkout 分支名		 切换到uat1分支
git checkout -b 分支名		 创建并切换到uat1分支
git merge uat1 			 合并分支
git branch -d uat1		 删除不用的分支
git push origin --delete 分支名  删除远程仓库分支
git remote prune origin    	 删除远程不存在的分支
git remote set-url origin git@10.1.22.30:LauncherGroup/Launcher.git  修改远程仓库地址

git rm -r --cached target/	 递归删除缓存中的target文件
解决冲突 当出现冲突时，打开冲突的文件，进行修改，然后git add  git commit

git config --global user.name username 
git config --global user.email email
git config --global credential.helper store 



git remote -v			 查看远程仓库信息（如果是clone版本会有一个origin默认名，如果没有，执行以下指令）
git remote add [仓库名字] 路径   绑定远程仓库
git fetch 远程仓库名		 从远程仓库抓取数据到本地，并没有合并
git pull 远程仓库名		 从远程仓库抓取数据并合并到分支
git remote show origin		 查看远程仓库的详细信息
git remote rename oldname newname修改远程仓库的别名
git remote rm origin		 删除远程仓库
git merge origin/master	[本地分支名]	 将远程仓库分支合并到本地仓库

Git如何在不提交当前分支的情况下切换到其它分支进行操作——git stash
假如现在的Bug你还没有解决，而上边又给你派了一个新的Bug，而这个Bug相比较现在正在苦思冥想的Bug比较容易解决。
你想先解决新的Bug，可是之前的Bug还没有解决完而不能提交。怎么办?
git stash 命令。将当前分支存起来
git stash list  查看我们“存储”的列表。
git stash apply 命令恢复
git stash show 显示暂存的内容
git stash show -p 显示第一个存储的改动
git stash drop stash@{0} 删除暂存数据
git stash clear 删除所有暂存数据	
git pull origin master 拉取master最新代碼
 git stash pop  获取暂存分支第一個
注意： 如果有一个分支上多个 stash，如果需要恢复指定的 stash ，可以在命令尾部加id，如  $ git stash apply stash@{0}，同样删除指定 stash 项目则执行如 $ git stash drop stash@{1}  。
用  $ git stash pop  命令，恢复的同时把 stash 存储列表的内容也删了。这时候再执行  $ git stash list 命令，id 为  8528ea2 s 的储藏项目不会在列表中。
git config 

git clone 克隆地址  如：http://158.220.155.113:28080/zj-project/zj-apps.git

cd zj-apps

git add .  所有文件添加到git上  “+”号

git commit -m "Initial commit" 将文件提交到本地git 绿色对勾号

git push -u origin master  将文件添加到master分支

nginx:
	nginx: [emerg] bind() to 0.0.0.0:8399 failed (98: Address already in use)
	nginx: [emerg] bind() to 0.0.0.0:8081 failed (98: Address already in use)
	......
	==>原因：在操作的时候忘记关闭nginx 导致启动冲突 这里要禁止掉端 
	       解决办法  ：sudo fuser -k 8081/tcp  再重启
