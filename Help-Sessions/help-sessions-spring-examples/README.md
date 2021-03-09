Below are commonly used Spring annotation which makes a bean auto-detectable:

+ `@Repository` – Used to mark a bean as a *DAO Component* on the persistence layer
+ `@Service` – Used to mark a bean as a *Service Component* on the business layer
+ `@Controller` – Used to mark a bean as a *Controller Component* on the *Presentation layer*
+ `@Configuration` – Used to mark a bean as a `Configuration Component`.
+ `@Component` – General purpose annotation, can be used as a replacement for the above annotations.

In this example, you can even discard the *Configuration* class altogether as it does 
not contain any methods annotated with `@Bean`.

#### Credits

Most of these materials are from:

+ [Spring Auto-detection autowire & Component-scanning Example With Annotations][link]

[link]: http://websystique.com/spring/spring-auto-detection-autowire-component-scanning-example-with-annotations/