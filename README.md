Java Spring
===============================
    Когда вы слышите что-то, вы забываете это.
    Когда вы видите что-то, вы запоминаете это.
    Но только когда вы начинаете делать это,
    вы начинаете понимать это

    Старинная китайская поговорка

Понятия в Spring
===============
IoC (Inversion of Controll) - принцип Don't call us, we'll call you
DI (Dependency Injection) - способ внедрения обьектов через конструкторы, сеттеры, методы (шаблон проектирования для реализации IoC)

В IoC мы забираем контроль у обьекта и передаем его какому то другому контейнеру. Т.е. обьект уже сам не управляет созданием других обьектов и не знает с кем он будет работать пока ему явно не укажут.

IoC - это принцип (можно сказать методология). А DI это конкретный споб реализации этого принципа.

Два типа реализации IoC
BeanFactory - базовый интерфейс (представляет базовый функционал)
ApplicationContext - расширенный интерфейс

Bean Scope (Область действия)
Singleton (default)
-возвращяет единственный экземпляр
-ограничение на уровне контейнера, не на уровне класса

Prototype
-возвращяет новый экземляр при каждом обращении

Если указать init-method и destroy-method мы можем выбрать любые методы, то перед инициализацией и уничтожением обьектов будуть вызываться эти методы.
 
Если в контейнере указать default-init-method и default-destroy-method то они будут вызываться при создании и уничтожении всех бинов.

Интерфейсы InitializingBean, DisposableBean выполняют то же что и init&destroy методы. Но мы в контейнере ничего не указываем об этом. А просто реализуем эти два интерфейса в нашем классе (бин).

 BeanPostProcessor сюда будут попадать все наши бины. Используются при каждом инициализации нашего бина. При инициализации будут вызываться вот эти методы:
 -postProcessBeforeInitialization(Object o, String s) - до инициализации
 -postProcessAfterInitialization(Object o, String s) -  после инициализации
 Здесь мы можем участвовать в жизненном цикле нашего бина, делать доп обработки (похоже на фильтрацию)
 
 BeanPostProcessor - если хотим обрабатовать инициализацию нашего обьекта т.е. участвовать в жизненном цикле обьекта то используем этот интерфейс.
 
 Последовательность инициализаций бинов. В xml атрибут depends-on = "имя бина" указывает что сначала инициализируется бин указанный в depends-on потом сам бин
 
 <bean id="t800" class="com.hanada.spring.implementation.T800"
           p:hand-ref="toshibaHand" p:leg-ref="sonyLeg" p:head-ref="sonyHead"
     depends-on="databaseBean">
 
         <constructor-arg value="silver" index="0" type="java.lang.String" />
         <constructor-arg value="2005" index="1" type="int" />
         <constructor-arg value="true" index="2" type="boolean" />
 </bean>
 
 <bean id="databaseBean" class="com.hanada.spring.implementation.Database"/>
 
 Сначала инициализируются обьекты бина databaseBean затем t800:
 Test connection!
         com.hanada.spring.implementation.Database@ae45eb6 - postProcessBeforeInitialization()
         com.hanada.spring.implementation.toshiba.ToshibaHand@3e9b1010 - postProcessBeforeInitialization()
         com.hanada.spring.implementation.sony.SonyHead@5ae63ade - postProcessBeforeInitialization()
         com.hanada.spring.implementation.sony.SonyLeg@610694f1 - postProcessBeforeInitialization()
         com.hanada.spring.implementation.T800@43814d18 - method init()
         com.hanada.spring.implementation.T800@43814d18 - postProcessBeforeInitialization()
         com.hanada.spring.implementation.T800@43814d18
 
 
Aspect Oriented Programming
===============================

Цель AOP - разделение основного функционала от второстепенного.
AOP - это методика программирования в рамках классовой парадигмы, основанная на понятии аспекта - блока кода инкапсулирующего сквозное поведение в составе классов и повторно используемых модулей. 

Для того что бы привести AOP в действие, мы должны обернуть необходимый код в советы. Этот код называется join point или точка соединения, а pointcut является набором join points.

В applicationContext.xml мы создали аспект, в котором указываем наш логгер (ref="myLogger") и создаем pointcut для методов SomeService. 
   
       
        <aop:config>
                <!--@Component class MyLogger-->
                <aop:aspect id="log" ref="myLogger">
                    <aop:pointcut id="getValue"
                                  expression="execution(* com.hanada.spring.implementation.aop.aop_objects.SomeService.*(..))" />
                    <aop:before pointcut-ref="getValue" method="init" />
                    <aop:after pointcut-ref="getValue" method="close" />
                    <aop:after-returning pointcut-ref="getValue" returning="obj" method="printValue" />
                </aop:aspect>
            </aop:config>
            
            
Нужный функционал (Join Points) мы обьявляем в pointcut, обьявляем советы (Advice), которые будем использовать для данного pointcut'а и средствами AOP (создается так называемый перехватчик или Proxy, который берет управление на себя) "внедряем" в код приложения. Такую функциональность еще называют сквозной или cross-cutting.

С помощью AOP мы можем выполнять дополнительные действия над существующим кодом, при этом не изменяя его. Заметь обьекты (бины) MyLogger и SomeService друг о друге ни чего не знают.