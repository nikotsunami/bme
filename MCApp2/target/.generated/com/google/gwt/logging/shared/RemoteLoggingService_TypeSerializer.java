package com.google.gwt.logging.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class RemoteLoggingService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final MethodMap methodMapNative;
  private static final Map<String, String> signatureMapJava;
  private static final JsArrayString signatureMapNative;
  
  static {
    if (GWT.isScript()) {
      methodMapJava = null;
      methodMapNative = loadMethodsNative();
      signatureMapJava = null;
      signatureMapNative = loadSignaturesNative();
    } else {
      methodMapJava = loadMethodsJava();
      methodMapNative = null;
      signatureMapJava = loadSignaturesJava();
      signatureMapNative = null;
    }
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.allen_sauer.gwt.dnd.client.VetoDragException/1174378338", "com.allen_sauer.gwt.dnd.client.VetoDragException_FieldSerializer");
    result.put("com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable/2762350108", "com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable_FieldSerializer");
    result.put("com.google.gwt.core.client.impl.SerializableThrowable/3336179259", "com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer");
    result.put("com.google.gwt.http.client.RequestException/190587325", "com.google.gwt.http.client.RequestException_FieldSerializer");
    result.put("com.google.gwt.json.client.JSONException/2941795468", "com.google.gwt.json.client.JSONException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.SerializableException/3047383460", "com.google.gwt.user.client.rpc.SerializableException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.SerializationException/2836333220", "com.google.gwt.user.client.rpc.SerializationException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447", "com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer");
    result.put("java.io.IOException/1159940531", "com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer");
    result.put("java.io.UnsupportedEncodingException/1526756933", "com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer");
    result.put("java.lang.ArithmeticException/1539622151", "com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer");
    result.put("java.lang.ArrayIndexOutOfBoundsException/600550433", "com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer");
    result.put("java.lang.ArrayStoreException/3540507190", "com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer");
    result.put("java.lang.AssertionError/3490171458", "com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer");
    result.put("java.lang.ClassCastException/702295179", "com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer");
    result.put("java.lang.Error/1331973429", "com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer");
    result.put("java.lang.Exception/1920171873", "com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer");
    result.put("java.lang.IllegalArgumentException/1755012560", "com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer");
    result.put("java.lang.IllegalStateException/1972187323", "com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer");
    result.put("java.lang.IndexOutOfBoundsException/2489527753", "com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer");
    result.put("java.lang.NegativeArraySizeException/3846860241", "com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer");
    result.put("java.lang.NullPointerException/1463492344", "com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer");
    result.put("java.lang.NumberFormatException/3305228476", "com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer");
    result.put("java.lang.RuntimeException/515124647", "com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer");
    result.put("java.lang.StackTraceElement/1098092073", "com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_FieldSerializer");
    result.put("[Ljava.lang.StackTraceElement;/168204027", "com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("java.lang.StringIndexOutOfBoundsException/500777603", "com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer");
    result.put("java.lang.Throwable/2953622131", "com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer");
    result.put("java.lang.UnsupportedOperationException/3744010015", "com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer");
    result.put("java.lang.annotation.AnnotationFormatError/2257184627", "com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer");
    result.put("java.lang.annotation.AnnotationTypeMismatchException/976205828", "com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer");
    result.put("java.security.DigestException/629316798", "com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer");
    result.put("java.security.GeneralSecurityException/2669239907", "com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer");
    result.put("java.security.NoSuchAlgorithmException/2892037213", "com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer");
    result.put("java.util.ConcurrentModificationException/2717383897", "com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer");
    result.put("java.util.EmptyStackException/89438517", "com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer");
    result.put("java.util.NoSuchElementException/1559248883", "com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer");
    result.put("java.util.TooManyListenersException/2023078032", "com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer");
    result.put("java.util.logging.Level/2839552483", "com.google.gwt.user.client.rpc.core.java.util.logging.Level_FieldSerializer");
    result.put("java.util.logging.LogRecord/2492345967", "com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.allen_sauer.gwt.dnd.client.VetoDragException/1174378338"] = [
        ,
        ,
        @com.allen_sauer.gwt.dnd.client.VetoDragException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/allen_sauer/gwt/dnd/client/VetoDragException;)
      ];
    
    result["com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable/2762350108"] = [
        ,
        ,
        @com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/allen_sauer/gwt/log/shared/UnwrappedClientThrowable;)
      ];
    
    result["com.google.gwt.core.client.impl.SerializableThrowable/3336179259"] = [
        ,
        ,
        @com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/core/client/impl/SerializableThrowable;)
      ];
    
    result["com.google.gwt.http.client.RequestException/190587325"] = [
        ,
        ,
        @com.google.gwt.http.client.RequestException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/http/client/RequestException;)
      ];
    
    result["com.google.gwt.json.client.JSONException/2941795468"] = [
        ,
        ,
        @com.google.gwt.json.client.JSONException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/json/client/JSONException;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/RpcTokenException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializableException/3047383460"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializableException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializationException/2836333220"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializationException;)
      ];
    
    result["com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/ServiceDefTarget$NoServiceEntryPointSpecifiedException;)
      ];
    
    result["java.io.IOException/1159940531"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/io/IOException;)
      ];
    
    result["java.io.UnsupportedEncodingException/1526756933"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/io/UnsupportedEncodingException;)
      ];
    
    result["java.lang.ArithmeticException/1539622151"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArithmeticException;)
      ];
    
    result["java.lang.ArrayIndexOutOfBoundsException/600550433"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArrayIndexOutOfBoundsException;)
      ];
    
    result["java.lang.ArrayStoreException/3540507190"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArrayStoreException;)
      ];
    
    result["java.lang.AssertionError/3490171458"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/AssertionError;)
      ];
    
    result["java.lang.ClassCastException/702295179"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ClassCastException;)
      ];
    
    result["java.lang.Error/1331973429"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Error;)
      ];
    
    result["java.lang.Exception/1920171873"] = [
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Exception;),
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Exception;)
      ];
    
    result["java.lang.IllegalArgumentException/1755012560"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IllegalArgumentException;)
      ];
    
    result["java.lang.IllegalStateException/1972187323"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IllegalStateException;)
      ];
    
    result["java.lang.IndexOutOfBoundsException/2489527753"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IndexOutOfBoundsException;)
      ];
    
    result["java.lang.NegativeArraySizeException/3846860241"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NegativeArraySizeException;)
      ];
    
    result["java.lang.NullPointerException/1463492344"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NullPointerException;)
      ];
    
    result["java.lang.NumberFormatException/3305228476"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NumberFormatException;)
      ];
    
    result["java.lang.RuntimeException/515124647"] = [
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/RuntimeException;),
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/RuntimeException;)
      ];
    
    result["java.lang.StackTraceElement/1098092073"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/StackTraceElement;)
      ];
    
    result["[Ljava.lang.StackTraceElement;/168204027"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/StackTraceElement;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.lang.StringIndexOutOfBoundsException/500777603"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/StringIndexOutOfBoundsException;)
      ];
    
    result["java.lang.Throwable/2953622131"] = [
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Throwable;),
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Throwable;)
      ];
    
    result["java.lang.UnsupportedOperationException/3744010015"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/UnsupportedOperationException;)
      ];
    
    result["java.lang.annotation.AnnotationFormatError/2257184627"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/AnnotationFormatError;)
      ];
    
    result["java.lang.annotation.AnnotationTypeMismatchException/976205828"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/AnnotationTypeMismatchException;)
      ];
    
    result["java.security.DigestException/629316798"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/DigestException;)
      ];
    
    result["java.security.GeneralSecurityException/2669239907"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/GeneralSecurityException;)
      ];
    
    result["java.security.NoSuchAlgorithmException/2892037213"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/NoSuchAlgorithmException;)
      ];
    
    result["java.util.ConcurrentModificationException/2717383897"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ConcurrentModificationException;)
      ];
    
    result["java.util.EmptyStackException/89438517"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/EmptyStackException;)
      ];
    
    result["java.util.NoSuchElementException/1559248883"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/NoSuchElementException;)
      ];
    
    result["java.util.TooManyListenersException/2023078032"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TooManyListenersException;)
      ];
    
    result["java.util.logging.Level/2839552483"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/logging/Level;)
      ];
    
    result["java.util.logging.LogRecord/2492345967"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/logging/LogRecord;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.allen_sauer.gwt.dnd.client.VetoDragException", "com.allen_sauer.gwt.dnd.client.VetoDragException/1174378338");
    result.put("com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable", "com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable/2762350108");
    result.put("com.google.gwt.core.client.impl.SerializableThrowable", "com.google.gwt.core.client.impl.SerializableThrowable/3336179259");
    result.put("com.google.gwt.http.client.RequestException", "com.google.gwt.http.client.RequestException/190587325");
    result.put("com.google.gwt.json.client.JSONException", "com.google.gwt.json.client.JSONException/2941795468");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.SerializableException", "com.google.gwt.user.client.rpc.SerializableException/3047383460");
    result.put("com.google.gwt.user.client.rpc.SerializationException", "com.google.gwt.user.client.rpc.SerializationException/2836333220");
    result.put("com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException", "com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447");
    result.put("java.io.IOException", "java.io.IOException/1159940531");
    result.put("java.io.UnsupportedEncodingException", "java.io.UnsupportedEncodingException/1526756933");
    result.put("java.lang.ArithmeticException", "java.lang.ArithmeticException/1539622151");
    result.put("java.lang.ArrayIndexOutOfBoundsException", "java.lang.ArrayIndexOutOfBoundsException/600550433");
    result.put("java.lang.ArrayStoreException", "java.lang.ArrayStoreException/3540507190");
    result.put("java.lang.AssertionError", "java.lang.AssertionError/3490171458");
    result.put("java.lang.ClassCastException", "java.lang.ClassCastException/702295179");
    result.put("java.lang.Error", "java.lang.Error/1331973429");
    result.put("java.lang.Exception", "java.lang.Exception/1920171873");
    result.put("java.lang.IllegalArgumentException", "java.lang.IllegalArgumentException/1755012560");
    result.put("java.lang.IllegalStateException", "java.lang.IllegalStateException/1972187323");
    result.put("java.lang.IndexOutOfBoundsException", "java.lang.IndexOutOfBoundsException/2489527753");
    result.put("java.lang.NegativeArraySizeException", "java.lang.NegativeArraySizeException/3846860241");
    result.put("java.lang.NullPointerException", "java.lang.NullPointerException/1463492344");
    result.put("java.lang.NumberFormatException", "java.lang.NumberFormatException/3305228476");
    result.put("java.lang.RuntimeException", "java.lang.RuntimeException/515124647");
    result.put("java.lang.StackTraceElement", "java.lang.StackTraceElement/1098092073");
    result.put("[Ljava.lang.StackTraceElement;", "[Ljava.lang.StackTraceElement;/168204027");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("java.lang.StringIndexOutOfBoundsException", "java.lang.StringIndexOutOfBoundsException/500777603");
    result.put("java.lang.Throwable", "java.lang.Throwable/2953622131");
    result.put("java.lang.UnsupportedOperationException", "java.lang.UnsupportedOperationException/3744010015");
    result.put("java.lang.annotation.AnnotationFormatError", "java.lang.annotation.AnnotationFormatError/2257184627");
    result.put("java.lang.annotation.AnnotationTypeMismatchException", "java.lang.annotation.AnnotationTypeMismatchException/976205828");
    result.put("java.security.DigestException", "java.security.DigestException/629316798");
    result.put("java.security.GeneralSecurityException", "java.security.GeneralSecurityException/2669239907");
    result.put("java.security.NoSuchAlgorithmException", "java.security.NoSuchAlgorithmException/2892037213");
    result.put("java.util.ConcurrentModificationException", "java.util.ConcurrentModificationException/2717383897");
    result.put("java.util.EmptyStackException", "java.util.EmptyStackException/89438517");
    result.put("java.util.NoSuchElementException", "java.util.NoSuchElementException/1559248883");
    result.put("java.util.TooManyListenersException", "java.util.TooManyListenersException/2023078032");
    result.put("java.util.logging.Level", "java.util.logging.Level/2839552483");
    result.put("java.util.logging.LogRecord", "java.util.logging.LogRecord/2492345967");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.allen_sauer.gwt.dnd.client.VetoDragException::class)] = "com.allen_sauer.gwt.dnd.client.VetoDragException/1174378338";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable::class)] = "com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable/2762350108";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.core.client.impl.SerializableThrowable::class)] = "com.google.gwt.core.client.impl.SerializableThrowable/3336179259";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.http.client.RequestException::class)] = "com.google.gwt.http.client.RequestException/190587325";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.json.client.JSONException::class)] = "com.google.gwt.json.client.JSONException/2941795468";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializableException::class)] = "com.google.gwt.user.client.rpc.SerializableException/3047383460";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializationException::class)] = "com.google.gwt.user.client.rpc.SerializationException/2836333220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException::class)] = "com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.io.IOException::class)] = "java.io.IOException/1159940531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.io.UnsupportedEncodingException::class)] = "java.io.UnsupportedEncodingException/1526756933";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArithmeticException::class)] = "java.lang.ArithmeticException/1539622151";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArrayIndexOutOfBoundsException::class)] = "java.lang.ArrayIndexOutOfBoundsException/600550433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArrayStoreException::class)] = "java.lang.ArrayStoreException/3540507190";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.AssertionError::class)] = "java.lang.AssertionError/3490171458";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ClassCastException::class)] = "java.lang.ClassCastException/702295179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Error::class)] = "java.lang.Error/1331973429";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Exception::class)] = "java.lang.Exception/1920171873";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IllegalArgumentException::class)] = "java.lang.IllegalArgumentException/1755012560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IllegalStateException::class)] = "java.lang.IllegalStateException/1972187323";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IndexOutOfBoundsException::class)] = "java.lang.IndexOutOfBoundsException/2489527753";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NegativeArraySizeException::class)] = "java.lang.NegativeArraySizeException/3846860241";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NullPointerException::class)] = "java.lang.NullPointerException/1463492344";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NumberFormatException::class)] = "java.lang.NumberFormatException/3305228476";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.RuntimeException::class)] = "java.lang.RuntimeException/515124647";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StackTraceElement::class)] = "java.lang.StackTraceElement/1098092073";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StackTraceElement[]::class)] = "[Ljava.lang.StackTraceElement;/168204027";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StringIndexOutOfBoundsException::class)] = "java.lang.StringIndexOutOfBoundsException/500777603";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Throwable::class)] = "java.lang.Throwable/2953622131";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.UnsupportedOperationException::class)] = "java.lang.UnsupportedOperationException/3744010015";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.AnnotationFormatError::class)] = "java.lang.annotation.AnnotationFormatError/2257184627";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.AnnotationTypeMismatchException::class)] = "java.lang.annotation.AnnotationTypeMismatchException/976205828";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.DigestException::class)] = "java.security.DigestException/629316798";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.GeneralSecurityException::class)] = "java.security.GeneralSecurityException/2669239907";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.NoSuchAlgorithmException::class)] = "java.security.NoSuchAlgorithmException/2892037213";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ConcurrentModificationException::class)] = "java.util.ConcurrentModificationException/2717383897";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.EmptyStackException::class)] = "java.util.EmptyStackException/89438517";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.NoSuchElementException::class)] = "java.util.NoSuchElementException/1559248883";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TooManyListenersException::class)] = "java.util.TooManyListenersException/2023078032";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.logging.Level::class)] = "java.util.logging.Level/2839552483";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.logging.LogRecord::class)] = "java.util.logging.LogRecord/2492345967";
    return result;
  }-*/;
  
  public RemoteLoggingService_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
