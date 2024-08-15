    WELCOME
    --------------------------------------------------------------------------------
    Congratulations, you opened the README.txt file! You're well on your way to
    becoming a command line ninja.

    WHAT IS THIS?
    --------------------------------------------------------------------------------
    This is a set of challenges designed to help Linux newbies learn to use the
    command line. Each challenge prompts the student to learn a new command or
    concept about using the command line. Some challenges have multiple solutions,
    while others are more rigid.

    PHILOSOPHY
    --------------------------------------------------------------------------------
    The world of technology changes daily. Throughout your career as a developer,
    admin, consultant, or other IT professional, you will often have to learn new
    skills, concepts, tools, and technologies. For the most part, no one is going to
    teach these things to you; it's up to you to learn them on your own.

    The philosophy of these challenges is to guide the student through the process
    of learning the command line on their own. Therefore, there is no answer key
    for these challenges.

    DON'T PANIC!
    --------------------------------------------------------------------------------
    Before we get started, here are some words of encouragement: If you're new
    to Linux, don't be scared away by these challenges. Some of them are HARD. Don't
    give up, don't get discouraged, and, above all, don't panic.

    Don't feel like you have to solve all of these challenges in one sitting (or
    even one year). Many of these challenges will become obvious after you've spent
    some time using the command line on a regular basis, so don't try to force it.
    Solve the challenges that you can and research the ones that you can't. Get
    together with your friends and try to work them out as a team.

    INSTRUCTIONS
    --------------------------------------------------------------------------------

    1. Unless otherwise noted, all challenges can be completed by submitting only 1
    entry on the command line. That is to say, you will type something on the command
    line and press the <ENTER> key exactly once. Writing a script and executing it
    does not count.

    2. You may use any resources at your disposal to solve the challenges including
    friends or even Google. I would recommend, however, that you not simply google
    everything, but spend some time reading some books or articles for beginners.
    Furthermore, try and use the man pages instead of Google when you can. You get
    out of this what you put into it.

    When you complete a challenge, take the opportunity to learn more about the
    tools you used. If you learn a new command to complete a challenge, read
    through its man page. Many of the same commands are used in different ways
    throughout these challenges, so a little investment early on will make later
    challenges easier.

    3. Most challenges have more than one solution. You get "bonus points" for
    solving challenges in multiple ways.

    4. Some challenges stand alone, while others rely on challenges that came before
    them.

    5. Challenges are labeled "B" for beginner, "I" for intermediate, and "A" for
    advanced.

    6. All challenges assume you are using the Bourne Again Shell (bash).

    CHALLENGES
--------------------------------------------------------------------------------

OK! Let's get started.

1. (B) Extract the "challenges.tar.gz" archive; you'll need its contents to
   solve some of the challenges.

   Solução: tar -xzf challenges.tar.gz

2. (B) Change your working directory to the "challenges" directory that was
   created when you extracted "challenges.tar.gz"

   Solução: cd challenges/

3. (B) List the contents of the "challenges" directory.

    Solução: ls

4. (B) Create a new directory named "foo".

--SOLUÇÃO: mkdir foo

5. (I) Create a new directory named "foo/bar/1/2/3"

--SOLUÇÃO: mkdir "foo/bar/1/2/3"

6. (B) Remove the directory "foo" and all of its contents

--SOLUÇÃO: rm -rf foo

7. (B) Print the text "Hello World".

--SOLUÇÃO: echo "Hello World"

8. (B) Create a file named "hello.txt" that contains the text "Hello World".

--SOLUÇÃO: cat > hello.txt

9. (B) Create an empty file named "empty.txt"

--SOLUÇÃO: touch empty.txt

10. (B) Remove the file "empty.txt"

--SOLUÇÃO: rm -rf empty.txt

11. (I) Find a second way to solve challenge 9.

--SOLUÇÃO: echo -n "" > empty.txt

12. (I) Find a third way to solve challenge 9.

--SOLUÇÃO: > empty.txt

13. (B) Copy "hello.txt" and name the copy "goodbye.txt".

--SOLUÇÃO: cp hello.txt goodbye.txt

14. (B) Rename "goodby.txt" to "hello_copy.txt".

--SOLUÇÃO: mv goodbye.txt hello_copy.txt

15. (I) Prove that the contents of "hello.txt" and "hello_copy.txt" are
    identical.

    --SOLUÇÃO: diff hello.txt hello_copy.txt

16. (B) Concatenate the contents of "hello.txt" and "hello_copy.txt" and store
    the result in a file named "2_hellos.txt".

    --SOLUÇÃO: cat hello.txt hello_copy.txt > 2_hellos.txt

17. (B) Get the full path of your present working directory ("challenges").

--SOLUÇÃO: pwd

18. (B) List the contents of the "challenges" directory (like challenge 3), but
    show the permissions for each file.

    --SOLUÇÃO: ls -l

19. (B) Append some text to the end of "restricted.txt". It's OK to do this in
    2 steps.

    --SOLUÇÃO: chmod 777 restricted.txt / cat >> restricted.txt

20. (B) Run the "hello_executable" program.

--SOLUÇÃO: ./hello_executable

21. (B) Run the "challenge_20" program. It's OK to do this in 2 steps.

--SOLUÇÃO: chmod +x challenge_20 / ./challenge_20

22. (B) Compile and run "compile_me.c". It's OK to do this in 2 steps.

--SOLUÇÃO: gcc -o compilado compile_me.c / ./compilado

23. (A) Run the "redirect" program and collect all of its output in a file
    named "output.txt".

--SOLUÇÃO: cat redirect > output.txt

24. (B) Get the current date and time.

--SOLUÇÃO: date

25. (B) Show all of the running processes on your computer.

--SOLUÇÃO: top

26. (B) Show the number of processors/cores in your computer.

--SOLUÇÃO: nproc

27. (B) Find out what version of the Linux kernel is currently running.

--SOLUÇÃO: uname -r

28. (B) Find the file in the "bunch_of_files/" directory that contains the string:
    "You found the needle in the haystack!"

--SOLUÇÃO: grep "You found the needle in the haystack!" bunch_of_files/*    

29. (B) Print the first 25 lines of people.csv.

--SOLUÇÃO: cat -n people.csv | head -25

30. (B) Print the last 25 lines of people.csv.

--SOLUÇÃO: cat -n people.csv | tail -25

31. (I) Display just the differences between greeting1.txt and greeting2.txt

--SOLUÇÃO: diff greeting1.txt greeting2.txt

32. (I) Print "Hello", then wait 5 seconds, then print "world!".

--SOLUÇÃO: echo "Hello" && sleep 5 && echo "world"

33. (I) Create a 1MB file full of zeros.

--SOLUÇÃO: dd if=/dev/zero of=zero_file.bin bs=1M count=1
Referência: https://unix.stackexchange.com/questions/275243/what-does-dd-if-dev-zero-of-dev-sda-do

34. (I) Create a 2MB file full of random data.

--SOLUÇÃO: dd if=/dev/urandom of=random_file.txt bs=1M count=2
Referência: https://stackoverflow.com/questions/1462893/generating-a-random-binary-file

35. (I) Count the number of lines in README.txt.

--SOLUÇÃO: wc README.txt

36. (B) Display the contents of README.txt in reverse (last line first).

--SOLUÇÃO: tac README.txt

37. (I) Display all of the last names in people.csv.

--SOLUÇÃO: cut -d, -f2 people.csv
Referência: https://medium.com/@uiraribeiro/comando-cut-no-linux-cortar-por-colunas-guia-b%C3%A1sico-8aa9b1cb2211

38. (A) Count the number of unique last names in people.csv.

--SOLUÇÃO: awk -F, '{print $2}' people.csv | sort | uniq | wc -l
Referência: https://stackoverflow.com/questions/67832594/awk-sort-by-last-column-and-the-print-the-whole-line

39. (A) Did you accidentally count the CSV header in the previous challenge?

--SOLUÇÃO: Sim / Para resolver podemos usar tail -n +2 people.csv | awk -F, '{print $2}' | sort | uniq | wc -l

40. (A) There's a second way to exclude the CSV header from your count. Find it.

--SOLUÇÃO: sed '1d' people.csv | awk -F, '{print $2}' | sort | uniq | wc -l
Referência: https://www.vivaolinux.com.br/topico/Sed-Awk-ER-Manipulacao-de-Textos-Strings/Manipular-texto-com-SedAwk

41. (A) Now that you've found two ways to correctly count the number of unique
    last names in people.csv, can you prove whether or not one is more efficient
    (faster) than the other?

    --SOLUÇÃO: A diferença de desempenho dos dois métodos pode ser pequena em arquivos menores, entretanto em se tratando de arquivos maiores o tail pode ser melhor que o sed, por ser mais direto e mais rápido para pular linhas em arquivos grandes. após usar o comando time em ambos os comandos pude observar que o "tail" se saiu melhor nos testes

time sed '1d' people.csv | awk -F, '{print $2}' | sort | uniq | wc -l
time tail -n +2 people.csv | awk -F, '{print $2}' | sort | uniq | wc -l


42. (A) Count the number of people with the first name "Josiah" in people.csv.

--SOLUÇÃO: grep -c '^Josiah' people.csv

43. (I) Count the number of files (not directories) in the "challenges" directory .

--SOLUÇÃO: ls -la|grep -e "^-"|wc -l (com arquivos ocultos) ou ls -l|grep -e "^-"|wc -l (sem arquivos ocultos)

44. (I) Count the number of subdirectories in the "challenges" directory.

--SOLUÇÃO: ls -la|grep -e "^d"|wc -l (com diretórios ocultos) ou ls -l|grep -e "^d"|wc -l (sem diretorios ocultos)

45. (I) Remove all files with "deleteme" in the name.

--SOLUÇÃO: find . -type f -name '*deleteme*' -exec rm {} +

46. (I) In challenge 28 you found a file. Replace the string "You found the
    needle in the haystack!" with "The needle has been removed."

--SOLUÇÃO: sed -i 's/You found the needle in the haystack!/The needle has been removed./' bunch_of_files/file719.rand

47. (A) Transform people.csv from ',' delimited to '|' delimited and save the result in people_pipe.csv.

--SOLUÇÃO: sed 's/,/|/g' people.csv > people_pipe.csv

48. (A) Find all of the files in "bunch_of_files/" that are duplicates of "file001.rand".

--SOLUÇÃO: fdupes bunch_of_files/

49. (A) Execute this challenge in exactly 2 steps

    1) (B) Create an empty file named "supercalifragilisticexpialidocious.txt".
    2) (A) Remove "supercalifragilisticexpialidocious.txt". Your command may
           only use a maximum 5 total characters (no wildcards or globs).

--SOLUÇÃO: 
1) > supercalifragilisticexpialidocious.txt
2) rm s* 

rm s* remove todos os arquivos que começam com s, como superca... é o único arquivo 
que começa com s na pasta, então apenas ele será removido.         

50. (A) Create a set of empty files. Each file has a name in the form "L-N.txt"
    where L is a letter and N is a number. Valid letters are a,b,c, while valid
    numbers are 1,2,3. Create all permutations (total of 9 files). Make your
    command as short as possible. I can do it in 25 characters, can you do
    better?

--SOLUÇÃO: touch {a..c}-{1..3}.txt

BONUS: Create a challenge of your own and ask a friend to complete it.

Congratulations! You've completed all of the challenges. If you haven't
already, go back through and find different ways to do some of the challenges.
Compare notes with a friend!
