package io.quarkiverse.langchain4j;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * When used on a method of an AiService annotated with {@link RegisterAiService}, the method will result in
 * ReAct prompting to be used.
 */
@Retention(RUNTIME)
@Target({ METHOD })
public @interface ReActAgent {

}
