# Java_FSD_Learning

Practice repository from a Java Full-Stack Development course (GUVI). It's a day-by-day
collection of exercises and small standalone projects covering core Java, then Spring / Spring
Boot / Spring MVC / JDBC / JPA / Spring Security, plus one small end-to-end app.

## Status

Learning/practice collection, not a single product. Each folder is an independent exercise or
mini-project — most Spring Boot projects come with the default generated test class only (no real
test coverage), and the `servlet-in-spring` and `eclipse-workspace` dispatcher-servlet exercises
are explicitly noted in commit history as not working as expected.

## What's inside

### Core Java & DSA (`Day_1/`, `Day2/`, `Day_3/`, `Collections/`, `Java_Features/`)

- `Day_1/` — datatypes, conditional statements, loops, and an MCQ notes file.
- `Day2/` — array and string coding exercises (e.g. spiral matrix, richest wealth, permutations,
  defanging an IP address, restore string), plus an MCQ notes file.
- `Day_3/OOPs/` — one exercise per OOP concept: abstraction, encapsulation (same-package and
  different-package variants), inheritance, interfaces, inner classes, polymorphism, singleton,
  static vs. non-static.
- `Collections/` — `ArrayListExample.java`, `LinkedListExample.java`.
- `Java_Features/` — Java 8+ features: `Predicate` (including chaining with `and`), `Optional`,
  `Stream` API, `DateTime`, and stream/file `InputStream` handling.

### Spring / Spring Boot exercises (one Maven project per folder)

| Folder | What it demonstrates |
|---|---|
| `first-spring` | Bare Spring Boot starter project (`spring-boot-starter`), default generated classes. |
| `spring1` | Spring (non-Boot) IoC container basics using `spring-context` and a manual `AppConfig`. |
| `spring-mvc` | Standalone servlet + embedded Tomcat experiment (`tomcat-embed-core`, `HelloServlet`). |
| `servlet-in-spring` | Spring MVC via `DispatcherServlet` packaged as a WAR (`spring-webmvc`). |
| `SpringBootWeb1` | Spring Boot MVC web app returning a view (`spring-boot-starter-web`, JSP/Tomcat Jasper). |
| `demo` | Plain JDBC connection example (`DBConnection`, `mysql-connector-java`), no Spring. |
| `spring_jdbc` | Spring's `JdbcTemplate`-based `StudentRepo`/`StudentService` over `spring-boot-starter-jdbc` (H2 + MySQL). |
| `sprnig-jpa` | Spring Data JPA: `Student` entity, `StudentRepo extends JpaRepository`, JPQL query methods, and derived finder methods (`findByMarksGreaterThan`). |
| `spring-security` | Spring Boot + `spring-boot-starter-security`; default form login, a `HelloController` and `StudentController`. |
| `rest-demo` | REST API version of the job-posting exercise — CRUD `JobController` backed by an in-memory `List<JobPost>` (`JobRepo`), no database. |
| `jobportal` | JSP-based Spring MVC version of the same job-posting exercise — `home`/`addjob`/`viewalljobs` JSP views, jobs stored in the same in-memory `JobRepo` list (not persisted to a database). |

### `eclipse-workspace/`

An Eclipse workspace directory (`.settings`, a Tomcat server config, and three sub-projects:
`test`, `testing`, `springMVCDemo`) used while experimenting with servlets and Spring MVC outside
VS Code. Includes some committed build output (`target/classes`) from that workspace.

## Tech stack

- **Language**: Java 21 (Spring Boot projects), built with Maven
- **Frameworks**: Spring Boot, Spring MVC, Spring Data JPA, Spring Data JDBC, Spring Security
- **Databases**: H2 (runtime/test), MySQL (`mysql-connector-j` / `mysql-connector-java`)
- **View tech**: JSP (with Tomcat Jasper / JSTL) for the MVC-style exercises
- **Build tool**: Maven (each Spring project has its own `pom.xml` and Maven wrapper)
- **Other**: Lombok, JUnit, Mockito (in `spring-mvc`)

## Getting started

Each Spring Boot folder is an independent Maven project. To run one, `cd` into it and use its
Maven wrapper, e.g.:

```bash
cd jobportal
./mvnw spring-boot:run
```

or, for the plain JDBC/console examples (`demo`, `Day_1`, `Day2`, `Day_3`, `Collections`,
`Java_Features`), compile and run the relevant `.java` file directly with `javac`/`java`.

## Folder structure

```
Day_1/, Day2/, Day_3/    # Core Java, DSA, and OOP exercises
Collections/             # Java Collections examples
Java_Features/           # Java 8+ features (Streams, Optional, Predicate, DateTime)
demo/                    # Plain JDBC example (no Spring)
first-spring/, spring1/  # Spring / Spring Boot fundamentals
spring-mvc/              # Standalone servlet experiment
servlet-in-spring/       # Spring MVC via DispatcherServlet (WAR)
SpringBootWeb1/          # Spring Boot MVC web app
spring_jdbc/             # Spring JdbcTemplate example
sprnig-jpa/              # Spring Data JPA example
spring-security/         # Spring Security basics
rest-demo/               # REST job-posting API (in-memory storage)
jobportal/               # JSP job-posting app (in-memory storage)
eclipse-workspace/       # Eclipse IDE workspace used for early servlet/MVC experiments
```
