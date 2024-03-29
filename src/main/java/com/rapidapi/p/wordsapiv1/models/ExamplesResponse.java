/*
 * WordsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.rapidapi.p.wordsapiv1.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for ExamplesResponse type.
 */
public class ExamplesResponse {
    private OptionalNullable<String> word;
    private OptionalNullable<List<String>> examples;

    /**
     * Default constructor.
     */
    public ExamplesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  word  String value for word.
     * @param  examples  List of String value for examples.
     */
    public ExamplesResponse(
            String word,
            List<String> examples) {
        this.word = OptionalNullable.of(word);
        this.examples = OptionalNullable.of(examples);
    }

    /**
     * Initialization constructor.
     * @param  word  String value for word.
     * @param  examples  List of String value for examples.
     */

    protected ExamplesResponse(OptionalNullable<String> word,
            OptionalNullable<List<String>> examples) {
        this.word = word;
        this.examples = examples;
    }

    /**
     * Internal Getter for Word.
     * The word that is searched.
     * @return Returns the Internal String
     */
    @JsonGetter("word")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetWord() {
        return this.word;
    }

    /**
     * Getter for Word.
     * The word that is searched.
     * @return Returns the String
     */
    public String getWord() {
        return OptionalNullable.getFrom(word);
    }

    /**
     * Setter for Word.
     * The word that is searched.
     * @param word Value for String
     */
    @JsonSetter("word")
    public void setWord(String word) {
        this.word = OptionalNullable.of(word);
    }

    /**
     * UnSetter for Word.
     * The word that is searched.
     */
    public void unsetWord() {
        word = null;
    }

    /**
     * Internal Getter for Examples.
     * The usage examples of the searched word.
     * @return Returns the Internal List of String
     */
    @JsonGetter("examples")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetExamples() {
        return this.examples;
    }

    /**
     * Getter for Examples.
     * The usage examples of the searched word.
     * @return Returns the List of String
     */
    public List<String> getExamples() {
        return OptionalNullable.getFrom(examples);
    }

    /**
     * Setter for Examples.
     * The usage examples of the searched word.
     * @param examples Value for List of String
     */
    @JsonSetter("examples")
    public void setExamples(List<String> examples) {
        this.examples = OptionalNullable.of(examples);
    }

    /**
     * UnSetter for Examples.
     * The usage examples of the searched word.
     */
    public void unsetExamples() {
        examples = null;
    }

    /**
     * Converts this ExamplesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ExamplesResponse [" + "word=" + word + ", examples=" + examples + "]";
    }

    /**
     * Builds a new {@link ExamplesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ExamplesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.word = internalGetWord();
        builder.examples = internalGetExamples();
        return builder;
    }

    /**
     * Class to build instances of {@link ExamplesResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> word;
        private OptionalNullable<List<String>> examples;



        /**
         * Setter for word.
         * @param  word  String value for word.
         * @return Builder
         */
        public Builder word(String word) {
            this.word = OptionalNullable.of(word);
            return this;
        }

        /**
         * UnSetter for word.
         * @return Builder
         */
        public Builder unsetWord() {
            word = null;
            return this;
        }

        /**
         * Setter for examples.
         * @param  examples  List of String value for examples.
         * @return Builder
         */
        public Builder examples(List<String> examples) {
            this.examples = OptionalNullable.of(examples);
            return this;
        }

        /**
         * UnSetter for examples.
         * @return Builder
         */
        public Builder unsetExamples() {
            examples = null;
            return this;
        }

        /**
         * Builds a new {@link ExamplesResponse} object using the set fields.
         * @return {@link ExamplesResponse}
         */
        public ExamplesResponse build() {
            return new ExamplesResponse(word, examples);
        }
    }
}
