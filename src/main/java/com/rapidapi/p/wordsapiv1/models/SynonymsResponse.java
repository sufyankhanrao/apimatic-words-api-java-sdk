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
 * This is a model class for SynonymsResponse type.
 */
public class SynonymsResponse {
    private OptionalNullable<String> word;
    private OptionalNullable<List<String>> synonyms;

    /**
     * Default constructor.
     */
    public SynonymsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  word  String value for word.
     * @param  synonyms  List of String value for synonyms.
     */
    public SynonymsResponse(
            String word,
            List<String> synonyms) {
        this.word = OptionalNullable.of(word);
        this.synonyms = OptionalNullable.of(synonyms);
    }

    /**
     * Initialization constructor.
     * @param  word  String value for word.
     * @param  synonyms  List of String value for synonyms.
     */

    protected SynonymsResponse(OptionalNullable<String> word,
            OptionalNullable<List<String>> synonyms) {
        this.word = word;
        this.synonyms = synonyms;
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
     * Internal Getter for Synonyms.
     * The synonyms of the searched word.
     * @return Returns the Internal List of String
     */
    @JsonGetter("synonyms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetSynonyms() {
        return this.synonyms;
    }

    /**
     * Getter for Synonyms.
     * The synonyms of the searched word.
     * @return Returns the List of String
     */
    public List<String> getSynonyms() {
        return OptionalNullable.getFrom(synonyms);
    }

    /**
     * Setter for Synonyms.
     * The synonyms of the searched word.
     * @param synonyms Value for List of String
     */
    @JsonSetter("synonyms")
    public void setSynonyms(List<String> synonyms) {
        this.synonyms = OptionalNullable.of(synonyms);
    }

    /**
     * UnSetter for Synonyms.
     * The synonyms of the searched word.
     */
    public void unsetSynonyms() {
        synonyms = null;
    }

    /**
     * Converts this SynonymsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SynonymsResponse [" + "word=" + word + ", synonyms=" + synonyms + "]";
    }

    /**
     * Builds a new {@link SynonymsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SynonymsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.word = internalGetWord();
        builder.synonyms = internalGetSynonyms();
        return builder;
    }

    /**
     * Class to build instances of {@link SynonymsResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> word;
        private OptionalNullable<List<String>> synonyms;



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
         * Setter for synonyms.
         * @param  synonyms  List of String value for synonyms.
         * @return Builder
         */
        public Builder synonyms(List<String> synonyms) {
            this.synonyms = OptionalNullable.of(synonyms);
            return this;
        }

        /**
         * UnSetter for synonyms.
         * @return Builder
         */
        public Builder unsetSynonyms() {
            synonyms = null;
            return this;
        }

        /**
         * Builds a new {@link SynonymsResponse} object using the set fields.
         * @return {@link SynonymsResponse}
         */
        public SynonymsResponse build() {
            return new SynonymsResponse(word, synonyms);
        }
    }
}
