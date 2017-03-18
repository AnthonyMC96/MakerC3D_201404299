SET JAVA_HOME="C:\Program Files\java\jdk1.8.0_101\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\carlo\OneDrive\Documentos\GithubCompi2\MakerC3D_201404299\src\org\compi2\codigo3d\parser
JAVA -classpath C:\libjava java_cup.Main -parser Sintactico -symbols sym Sintactico.cup

pause