## Как запустить тестирование и проверить на правильность выполнение кода:
1) Находим раздел com.example.company.myapplication (androidTest):
![image](https://user-images.githubusercontent.com/55315647/195304538-dc2c47b8-bc52-4529-a381-7463b7fbae85.png)

2) Нажимаем правой кнопкой мыши на этот раздел:
![image](https://user-images.githubusercontent.com/55315647/195304980-ac9ce3eb-ca02-4809-90eb-b2e5a1ab346b.png)

3) Нажимаем на Run 'Tests in 'com.exampl...' 

4) Запускается тестирование:
![image](https://user-images.githubusercontent.com/55315647/195305406-02e8878d-dffd-4235-9c1e-19e94b37afc4.png)

5) Если код сделан правильно, тогда все 8 тестов успешно пройдут, и в logcat выведется сообщение с секретным кодом (его вбиваем в stepik), при не прохождении хотя бы одного теста, программа не выведет в logcat данный код

6) Ищем в Logcat по тэгу CHECKER собственно это сообщение с секретным кодом:
![image](https://user-images.githubusercontent.com/55315647/195305979-1ad60f25-e29a-4264-8403-86ecac48e9f7.png)

7) Копируем код и вставляем в Stepik ✅
