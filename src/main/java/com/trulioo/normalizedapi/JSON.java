package com.trulioo.normalizedapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static DateTimeTypeAdapter dateTimeTypeAdapter = new DateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(DateTime.class, dateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.Address.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.AppendedField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.Business.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessDataFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessLocation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessRecord.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessRegistrationNumber.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessRegistrationNumberMask.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessSearchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessSearchRequestBusinessSearchModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessSearchResponseIndustryCode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessVerifyRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.BusinessVerifyRequestMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.CommonProviderCacheSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.CommonRequiredFieldMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.Communication.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.Consent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.CountrySubdivision.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.DataField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.DataFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.DatasourceField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.DatasourceResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.Document.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.DriverLicence.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.Location.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.LocationAdditionalFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.LoginSchemaRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.NationalId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.Passport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.PersonInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.PersonInfoAdditionalFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.PersonOfSignificantControl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.ProblemDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.Record.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.RecordRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.Result.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.RiskMonitorSettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.ServiceError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.SubmitAddressVerificationCredentialsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.TransactionRecordResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.TransactionStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.VerifyAddressCredentials.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.VerifyAddressRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.VerifyAddressResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.VerifyRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.VerifyRequestMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.VerifyResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.trulioo.normalizedapi.model.VerifyResultPartial.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for Joda DateTime type
     */
    public static class DateTimeTypeAdapter extends TypeAdapter<DateTime> {

        private DateTimeFormatter formatter;

        public DateTimeTypeAdapter() {
            this(new DateTimeFormatterBuilder()
                .append(ISODateTimeFormat.dateTime().getPrinter(), ISODateTimeFormat.dateOptionalTimeParser().getParser())
                .toFormatter());
        }

        public DateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, DateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.print(date));
            }
        }

        @Override
        public DateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return formatter.parseDateTime(date);
            }
        }
    }

    /**
     * Gson TypeAdapter for Joda LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(ISODateTimeFormat.date());
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.print(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return formatter.parseLocalDate(date);
            }
        }
    }

    public static void setDateTimeFormat(DateTimeFormatter dateFormat) {
        dateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
