
# Проект по автоматизации тестирования для компании [intexsoft]([https://www.intexsoft.by/])    
<a href="https://www.zentist.io/"><img src="media/logo/images.png" width="150" height="150"  alt="IDEA"/></a>

> Zentist — это платформа для управления доходами от стоматологического страхования. Наша миссия — помочь стоматологическим практикам и их пациентам мгновенно обрабатывать претензии по стоматологическому страхованию, способствуя росту доходов практики и повышению удовлетворенности пациентов обслуживанием.

## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="media/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="media/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
 
</p>

____
<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
____
- ✓ *Проверка заполнения формы ScheduleDemo*
- ✓ *Проверка заполнения формы ContactUs*
- ✓ *Проверка наличия описания вопроса из FAQ*
- ✓ *Проверка заголовка на странице TestImonials*
- ✓ *Проверка заголовка в одном из блоков на странице BlueprintSmiles*


____
<a id="jenkins"></a>
## </a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/011-mmuradov-JenkinsExercise-on-example-ZentistsTest/8/"><)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/011-mmuradov-JenkinsExercise-on-example-ZentistsTest/8/"><img src="media/jenkins.PNG" alt="Jenkins" width="950"/></a>  
</p>


### **Параметры сборки в Jenkins:**

- *BROWSER (браузер, по умолчанию chrome)*
- *BROWSER_VERSION (версия браузера, по умолчанию 122.0)*
- *BROWSER_SIZE (размер окна браузера, по умолчанию 1920x1080)*
- *WDHOST (логин, пароль и адрес удаленного сервера Selenoid)*

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
clean zentist_test
```

***Удалённый запуск через Jenkins:***
```bash  
clean zentist_test
"-DWdhost=${WDHOST}" 
"-DBrowser=${BROWSER}" 
"-DBrowserVersion=${BROWSER_VERSION}" 
"-DBrowserSize=${BROWSER_SIZE}"
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="media/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/011-mmuradov-JenkinsExercise-on-example-ZentistsTest/8/allure/)</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="media/mainStrReport.PNG" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="media/testcases.PNG" width="850">  
</p>

### *Графики*

  <p align="center">
<img title="Allure Graphics" src="media/graphs.PNG" width="850">  
</p>


____
<a id="telegram"></a>
## <img alt="Allure" height="25" src="media/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="media/tg.PNG" width="550">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="media/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="media/video/470f6b2753afb53b7b40c85ff9bf39ac.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="media/video/19814c3a87a0ee88ed76eb9daf3bf89a.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="media/video/542049445965362482ef06d86d38a82c.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="media/video/4d7d0e92a0013e68c51e65483ac60b52.gif" width="550" height="350"  alt="video">   
</p>
<p align="center">
<img title="Selenoid Video" src="media/video/21c09f7d266c28ee22b4d3ba67b4b2c0.gif" width="550" height="350"  alt="video">   
</p>
