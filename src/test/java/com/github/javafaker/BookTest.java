package com.github.javafaker;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BookTest {

    private Faker faker;

    @Before
    public void before() {
        faker = new Faker();
    }

    @Test
    public void testTitle() {
        assertThat(faker.book().title(), matchesRegularExpression("([\\p{L}'\\-\\?]+[!,]? ?){2,9}"));
    }

    @Test
    public void testAuthor() {
        assertThat(faker.book().author(), matchesRegularExpression("([\\w']+\\.? ?){2,3}"));
    }

    @Test
    public void testPublisher() {
        assertThat(faker.book().publisher(), matchesRegularExpression("([\\p{L}'&\\-]+[,.]? ?){1,5}"));
    }

    @Test
    public void testGenre() {
        assertThat(faker.book().genre(), matchesRegularExpression("([\\w/]+ ?){2,4}"));
    }
}
