# Lab5Programming
## Консольная программы для работы с коллекцией
### setup
```
# Создайте json файл и установите переменное окружение с именем "JSON_COLLECTION"
# windows
setx JSON_COLLECTION full/path/to/the/file
# linux
export JSON_COLLECTION=full/path/to/the/file
```

> Если вы работаете на MacOS, то возможно у вас будет устанавливаться переменное окружение не в тот системный файл, так как на MacOS уживаются два shell
> интерпритатора: zsh и bash. Что стоит у вас по умолчанию я не знаю, потому прикрепляю ссылку на сайты, где можно посмотреть пути добавления переменного 
> окружения на ваш MacOS
> 
> [ZSH](https://russianblogs.com/article/4257670842/)
> 
> [BASH и ZSH](https://www.inp.nsk.su/~bolkhov/teach/inpunix/setup_env.ru.html)


### build
```
mvn install
```

### run
```
# Перейдите в папку с lab-client в скаченном репазетории и выполните команду нижу
java -jar lab-client/target/lab-client-1.0-SNAPSHOT-jar-with-dependencies.jar
```
