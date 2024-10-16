Microsoft Windows [Version 10.0.22631.4317]
(c) Microsoft Corporation. All rights reserved.

C:\Fabiha\git_file>git clone https://github.com/alomfabiha/asl.git
Cloning into 'asl'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Receiving objects: 100% (3/3), done.

C:\Fabiha\git_file>cd asl

C:\Fabiha\git_file\asl>git status
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean

C:\Fabiha\git_file\asl>cat index.txt
'cat' is not recognized as an internal or external command,
operable program or batch file.

C:\Fabiha\git_file\asl>echo,>index.txt

C:\Fabiha\git_file\asl>echo,>index.html

C:\Fabiha\git_file\asl>git status
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        index.html
        index.txt

nothing added to commit but untracked files present (use "git add" to track)

C:\Fabiha\git_file\asl>git add"index.txt"
git: 'addindex.txt' is not a git command. See 'git --help'.

C:\Fabiha\git_file\asl>git add "index.txt"

C:\Fabiha\git_file\asl>git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   index.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        index.html


C:\Fabiha\git_file\asl>git add .

C:\Fabiha\git_file\asl>git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   index.html
        new file:   index.txt


C:\Fabiha\git_file\asl>git commit -m "add indel tetxt and htmn file"
[main 5af60c9] add indel tetxt and htmn file
 2 files changed, 2 insertions(+)
 create mode 100644 index.html
 create mode 100644 index.txt

C:\Fabiha\git_file\asl>git brunch
git: 'brunch' is not a git command. See 'git --help'.

The most similar command is
        branch

C:\Fabiha\git_file\asl>git branch
* main

C:\Fabiha\git_file\asl>git push origin main
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 297 bytes | 297.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/alomfabiha/asl.git
   d0bc75e..5af60c9  main -> main

C:\Fabiha\git_file\asl>git pull origin main
From https://github.com/alomfabiha/asl
 * branch            main       -> FETCH_HEAD
Already up to date.

C:\Fabiha\git_file\asl>git pull origin main
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (3/3), 947 bytes | 118.00 KiB/s, done.
From https://github.com/alomfabiha/asl
 * branch            main       -> FETCH_HEAD
   5af60c9..dcf82ef  main       -> origin/main
Updating 5af60c9..dcf82ef
Fast-forward
 README.md | 3 ++-
 1 file changed, 2 insertions(+), 1 deletion(-)

C:\Fabiha\git_file\asl># java_AddieSoft
