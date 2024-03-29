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

/**
 * This is a model class for PronunciationResponse type.
 */
public class PronunciationResponse {
    private OptionalNullable<String> word;
    private PronunciationDetails pronunciation;

    /**
     * Default constructor.
     */
    public PronunciationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  word  String value for word.
     * @param  pronunciation  PronunciationDetails value for pronunciation.
     */
    public PronunciationResponse(
            String word,
            PronunciationDetails pronunciation) {
        this.word = OptionalNullable.of(word);
        this.pronunciation = pronunciation;
    }

    /**
     * Initialization constructor.
     * @param  word  String value for word.
     * @param  pronunciation  PronunciationDetails value for pronunciation.
     */

    protected PronunciationResponse(OptionalNullable<String> word,
            PronunciationDetails pronunciation) {
        this.word = word;
        this.pronunciation = pronunciation;
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
     * Getter for Pronunciation.
     * This model contains pronunciation details of a specific word.
     * @return Returns the PronunciationDetails
     */
    @JsonGetter("pronunciation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PronunciationDetails getPronunciation() {
        return pronunciation;
    }

    /**
     * Setter for Pronunciation.
     * This model contains pronunciation details of a specific word.
     * @param pronunciation Value for PronunciationDetails
     */
    @JsonSetter("pronunciation")
    public void setPronunciation(PronunciationDetails pronunciation) {
        this.pronunciation = pronunciation;
    }

    /**
     * Converts this PronunciationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PronunciationResponse [" + "word=" + word + ", pronunciation=" + pronunciation
                + "]";
    }

    /**
     * Builds a new {@link PronunciationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PronunciationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pronunciation(getPronunciation());
        builder.word = internalGetWord();
        return builder;
    }

    /**
     * Class to build instances of {@link PronunciationResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> word;
        private PronunciationDetails pronunciation;



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
         * Setter for pronunciation.
         * @param  pronunciation  PronunciationDetails value for pronunciation.
         * @return Builder
         */
        public Builder pronunciation(PronunciationDetails pronunciation) {
            this.pronunciation = pronunciation;
            return this;
        }

        /**
         * Builds a new {@link PronunciationResponse} object using the set fields.
         * @return {@link PronunciationResponse}
         */
        public PronunciationResponse build() {
            return new PronunciationResponse(word, pronunciation);
        }
    }
}
