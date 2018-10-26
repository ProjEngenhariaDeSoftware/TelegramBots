/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 26 13:28:14 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.replykeyboard;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ReplyKeyboardRemove_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/home/felipe/eclipse-workspace/TelegramBots/telegrambots-meta"); 
    java.lang.System.setProperty("user.home", "/home/felipe"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "felipe"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReplyKeyboardRemove_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember",
      "com.fasterxml.jackson.databind.MappingIterator",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier",
      "com.fasterxml.jackson.databind.ser.PropertyBuilder",
      "com.fasterxml.jackson.databind.deser.impl.FieldProperty",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.annotation.JsonFormat$Features",
      "com.fasterxml.jackson.databind.deser.std.EnumDeserializer",
      "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base",
      "org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod",
      "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider",
      "com.fasterxml.jackson.databind.type.MapLikeType",
      "com.fasterxml.jackson.databind.util.LinkedNode",
      "com.fasterxml.jackson.databind.type.MapType",
      "com.fasterxml.jackson.databind.ser.std.MapProperty",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer",
      "com.fasterxml.jackson.databind.ObjectWriter",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.deser.impl.PropertyValue$Any",
      "com.fasterxml.jackson.databind.node.TextNode",
      "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty",
      "com.fasterxml.jackson.core.util.Instantiatable",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder",
      "com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase",
      "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser",
      "com.fasterxml.jackson.annotation.JsonIgnoreProperties",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter",
      "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor",
      "com.fasterxml.jackson.databind.node.DecimalNode",
      "com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value",
      "com.fasterxml.jackson.databind.util.Annotations",
      "com.fasterxml.jackson.databind.deser.Deserializers",
      "com.fasterxml.jackson.databind.ser.std.CollectionSerializer",
      "com.fasterxml.jackson.databind.deser.KeyDeserializers",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable",
      "com.fasterxml.jackson.databind.util.CompactStringObjectMap",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.fasterxml.jackson.databind.type.CollectionLikeType",
      "com.fasterxml.jackson.core.FormatFeature",
      "com.fasterxml.jackson.databind.util.NameTransformer$2",
      "com.fasterxml.jackson.core.TreeNode",
      "com.fasterxml.jackson.databind.node.NumericNode",
      "com.fasterxml.jackson.databind.util.NameTransformer$1",
      "com.fasterxml.jackson.databind.deser.ValueInstantiator",
      "com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase",
      "com.fasterxml.jackson.databind.type.ResolvedRecursiveType",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.core.base.ParserMinimalBase",
      "com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerBase",
      "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping",
      "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition",
      "com.fasterxml.jackson.databind.util.NameTransformer$3",
      "com.fasterxml.jackson.core.util.JsonParserSequence",
      "com.fasterxml.jackson.databind.util.Converter",
      "com.fasterxml.jackson.databind.ser.std.FileSerializer",
      "com.fasterxml.jackson.core.SerializableString",
      "com.fasterxml.jackson.databind.deser.ValueInstantiators",
      "com.fasterxml.jackson.core.Versioned",
      "com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember",
      "com.fasterxml.jackson.databind.introspect.BasicBeanDescription",
      "com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer",
      "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer",
      "com.fasterxml.jackson.core.util.RequestPayload",
      "com.fasterxml.jackson.databind.JsonSerializable",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMember",
      "com.fasterxml.jackson.databind.BeanDescription",
      "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer",
      "com.fasterxml.jackson.core.filter.JsonPointerBasedFilter",
      "com.fasterxml.jackson.databind.ser.AnyGetterWriter",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap",
      "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams",
      "com.fasterxml.jackson.core.Base64Variant",
      "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty$PropertyReferring",
      "com.fasterxml.jackson.databind.exc.IgnoredPropertyException",
      "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap",
      "com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer",
      "com.fasterxml.jackson.core.io.MergedStream",
      "com.fasterxml.jackson.databind.SequenceWriter",
      "com.fasterxml.jackson.databind.ser.SerializerFactory",
      "com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer",
      "org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove",
      "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.ser.ContextualSerializer",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.ser.std.ClassSerializer",
      "com.fasterxml.jackson.databind.Module$SetupContext",
      "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
      "org.telegram.telegrambots.meta.api.interfaces.BotApiObject",
      "com.fasterxml.jackson.databind.node.ContainerNode",
      "com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.RuntimeJsonMappingException",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory",
      "com.fasterxml.jackson.databind.PropertyNamingStrategy",
      "com.fasterxml.jackson.databind.jsonschema.SchemaAware",
      "com.fasterxml.jackson.databind.AbstractTypeResolver",
      "com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor",
      "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer",
      "com.fasterxml.jackson.databind.ser.std.IterableSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer",
      "com.fasterxml.jackson.databind.util.ArrayBuilders",
      "com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter",
      "com.fasterxml.jackson.core.io.IOContext",
      "com.fasterxml.jackson.core.PrettyPrinter",
      "com.fasterxml.jackson.databind.util.RawValue",
      "com.fasterxml.jackson.core.base.GeneratorBase",
      "com.fasterxml.jackson.databind.exc.PropertyBindingException",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.BeanSerializer",
      "com.fasterxml.jackson.databind.PropertyNamingStrategy$KebabCaseStrategy",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.node.NullNode",
      "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base",
      "com.fasterxml.jackson.databind.ser.BeanSerializerModifier",
      "com.fasterxml.jackson.databind.jsontype.NamedType",
      "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder",
      "com.fasterxml.jackson.databind.introspect.ObjectIdInfo",
      "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer",
      "com.fasterxml.jackson.core.json.JsonWriteContext",
      "com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator",
      "com.fasterxml.jackson.core.io.UTF8Writer",
      "com.fasterxml.jackson.databind.BeanProperty",
      "com.fasterxml.jackson.core.Version",
      "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring",
      "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector",
      "com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder",
      "com.fasterxml.jackson.databind.annotation.JsonAppend$Attr",
      "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer",
      "com.fasterxml.jackson.core.io.InputDecorator",
      "com.fasterxml.jackson.databind.introspect.TypeResolutionContext",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat",
      "com.fasterxml.jackson.core.base.ParserBase",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.node.BinaryNode",
      "com.fasterxml.jackson.databind.introspect.AnnotationMap",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "com.fasterxml.jackson.databind.deser.DataFormatReaders",
      "com.fasterxml.jackson.core.format.DataFormatMatcher",
      "com.fasterxml.jackson.core.JsonGenerator",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.ser.Serializers",
      "com.fasterxml.jackson.databind.type.ClassStack",
      "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult",
      "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Single",
      "com.fasterxml.jackson.core.JsonEncoding",
      "com.fasterxml.jackson.databind.ObjectWriter$Prefetch",
      "com.fasterxml.jackson.core.JsonGenerationException",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty",
      "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer",
      "com.fasterxml.jackson.core.json.UTF8JsonGenerator",
      "com.fasterxml.jackson.databind.ser.std.EnumSetSerializer",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor",
      "com.fasterxml.jackson.databind.ser.std.SerializableSerializer",
      "com.fasterxml.jackson.databind.ser.BeanPropertyFilter",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD",
      "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap",
      "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator",
      "com.fasterxml.jackson.databind.util.TokenBuffer",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.databind.JsonMappingException$Reference",
      "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator",
      "com.fasterxml.jackson.databind.jsontype.TypeDeserializer",
      "com.fasterxml.jackson.databind.node.LongNode",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing",
      "com.fasterxml.jackson.databind.deser.CreatorProperty",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer",
      "com.fasterxml.jackson.databind.ObjectWriter$GeneratorSettings",
      "com.fasterxml.jackson.core.type.TypeReference",
      "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase",
      "com.fasterxml.jackson.databind.annotation.JacksonStdImpl",
      "com.fasterxml.jackson.core.JsonParseException",
      "com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer",
      "com.fasterxml.jackson.annotation.JsonBackReference",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.std.MapSerializer",
      "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.fasterxml.jackson.databind.JsonMappingException",
      "com.fasterxml.jackson.core.io.OutputDecorator",
      "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match",
      "com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.databind.node.ObjectNode",
      "com.fasterxml.jackson.databind.cfg.ConfigOverride",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.databind.util.TokenBuffer$Parser",
      "com.fasterxml.jackson.core.JsonPointer",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler",
      "com.fasterxml.jackson.annotation.JsonFormat$Shape",
      "com.fasterxml.jackson.databind.util.NameTransformer$Chained",
      "com.fasterxml.jackson.annotation.PropertyAccessor",
      "com.fasterxml.jackson.databind.deser.impl.PropertyValue$Map",
      "com.fasterxml.jackson.databind.introspect.AnnotatedField",
      "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase",
      "com.fasterxml.jackson.annotation.JsonFormat$Feature",
      "com.fasterxml.jackson.databind.deser.ContextualDeserializer",
      "com.fasterxml.jackson.databind.ser.std.ArraySerializerBase",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked",
      "com.fasterxml.jackson.annotation.ObjectIdGenerator",
      "com.fasterxml.jackson.databind.cfg.HandlerInstantiator",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "com.fasterxml.jackson.databind.ext.Java7Support",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "com.fasterxml.jackson.databind.type.TypeParser$MyTokenizer",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.annotation.JsonProperty",
      "com.fasterxml.jackson.core.filter.TokenFilterContext",
      "com.fasterxml.jackson.databind.JsonSerializable$Base",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "com.fasterxml.jackson.databind.node.NodeCursor",
      "com.fasterxml.jackson.databind.node.TreeTraversingParser",
      "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer",
      "com.fasterxml.jackson.databind.jsontype.TypeSerializer",
      "com.fasterxml.jackson.databind.jsonschema.JsonSchema",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std",
      "com.fasterxml.jackson.databind.type.ArrayType",
      "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor",
      "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader",
      "com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer",
      "com.fasterxml.jackson.databind.util.Named",
      "com.fasterxml.jackson.core.util.JsonParserDelegate",
      "com.fasterxml.jackson.core.format.InputAccessor$Std",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.databind.type.CollectionType",
      "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer",
      "com.fasterxml.jackson.annotation.JsonAutoDetect",
      "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1",
      "com.fasterxml.jackson.core.format.InputAccessor",
      "com.fasterxml.jackson.databind.node.ValueNode",
      "com.fasterxml.jackson.databind.ser.impl.IteratorSerializer",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer",
      "com.fasterxml.jackson.databind.util.ClassUtil$Ctor",
      "com.fasterxml.jackson.databind.ext.NioPathDeserializer",
      "com.fasterxml.jackson.databind.node.JsonNodeCreator",
      "com.fasterxml.jackson.databind.deser.SettableBeanProperty",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper",
      "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase",
      "com.fasterxml.jackson.core.json.ReaderBasedJsonParser",
      "com.fasterxml.jackson.core.JsonLocation",
      "com.fasterxml.jackson.databind.node.IntNode",
      "com.fasterxml.jackson.databind.node.FloatNode",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.jsontype.SubtypeResolver",
      "com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferring",
      "com.fasterxml.jackson.core.json.JsonReadContext",
      "com.fasterxml.jackson.databind.ser.std.EnumSerializer",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer",
      "com.fasterxml.jackson.databind.KeyDeserializer",
      "com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder",
      "com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer",
      "com.fasterxml.jackson.core.util.BufferRecycler",
      "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring",
      "com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator",
      "com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer",
      "com.fasterxml.jackson.annotation.ObjectIdResolver",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer",
      "com.fasterxml.jackson.databind.PropertyNamingStrategy$UpperCamelCaseStrategy",
      "com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer",
      "com.fasterxml.jackson.databind.deser.impl.PropertyValue",
      "com.fasterxml.jackson.databind.node.DoubleNode",
      "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor",
      "com.fasterxml.jackson.databind.ser.PropertyWriter",
      "com.fasterxml.jackson.databind.util.EnumResolver",
      "com.fasterxml.jackson.core.util.ByteArrayBuilder",
      "com.fasterxml.jackson.databind.type.ReferenceType",
      "com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer",
      "com.fasterxml.jackson.databind.Module",
      "com.fasterxml.jackson.annotation.JsonView",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.ContainerSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.deser.std.StringDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.databind.exc.InvalidTypeIdException",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.fasterxml.jackson.databind.node.POJONode",
      "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer",
      "com.fasterxml.jackson.databind.ObjectReader",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder",
      "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer",
      "com.fasterxml.jackson.databind.node.BaseJsonNode",
      "com.fasterxml.jackson.databind.node.BigIntegerNode",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.databind.JsonDeserializer",
      "com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder",
      "com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition",
      "com.fasterxml.jackson.databind.deser.impl.MethodProperty",
      "com.fasterxml.jackson.annotation.JsonRawValue",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.fasterxml.jackson.databind.node.ArrayNode",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy",
      "com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter",
      "com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla",
      "com.fasterxml.jackson.databind.exc.InvalidFormatException",
      "com.fasterxml.jackson.databind.deser.std.MapDeserializer",
      "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase",
      "com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder",
      "com.fasterxml.jackson.core.io.CharacterEscapes",
      "com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer",
      "com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.deser.impl.CreatorCollector",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers",
      "com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize",
      "com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMethod",
      "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey",
      "org.telegram.telegrambots.meta.api.interfaces.InputBotApiObject",
      "com.fasterxml.jackson.databind.deser.DataFormatReaders$AccessorForReader",
      "com.fasterxml.jackson.databind.jsontype.TypeIdResolver",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker",
      "com.fasterxml.jackson.core.JsonParser",
      "com.fasterxml.jackson.databind.introspect.AnnotatedParameter",
      "com.fasterxml.jackson.databind.ser.BeanPropertyWriter",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type",
      "com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream",
      "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Double",
      "com.fasterxml.jackson.core.JsonProcessingException",
      "com.fasterxml.jackson.core.JsonStreamContext",
      "com.fasterxml.jackson.core.format.MatchStrength",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Bucket",
      "com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value",
      "com.fasterxml.jackson.databind.cfg.MutableConfigOverride",
      "com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException",
      "com.fasterxml.jackson.core.filter.TokenFilter",
      "com.fasterxml.jackson.core.io.CharTypes",
      "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer$TypeSerializerRerouter",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer",
      "com.fasterxml.jackson.databind.ser.std.InetAddressSerializer",
      "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.databind.deser.std.StdDeserializer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.JsonNode",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty",
      "com.fasterxml.jackson.databind.ser.ResolvableSerializer",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi",
      "com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer",
      "com.fasterxml.jackson.databind.deser.impl.PropertyValue$Regular",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.ser.impl.StringArraySerializer",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer",
      "com.fasterxml.jackson.annotation.JsonManagedReference",
      "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty",
      "com.fasterxml.jackson.databind.annotation.JsonDeserialize",
      "com.fasterxml.jackson.databind.util.ObjectBuffer",
      "com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase",
      "com.fasterxml.jackson.core.io.JsonEOFException",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "com.fasterxml.jackson.databind.InjectableValues",
      "com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer",
      "com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer",
      "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair",
      "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor",
      "com.fasterxml.jackson.databind.ext.NioPathSerializer",
      "com.fasterxml.jackson.databind.deser.SettableAnyProperty$AnySetterReferring",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.deser.BeanDeserializer",
      "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor",
      "com.fasterxml.jackson.databind.node.JsonNodeType",
      "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator$CaseInsensitiveMap",
      "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer",
      "com.fasterxml.jackson.core.util.TextBuffer",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "org.telegram.telegrambots.meta.api.objects.ResponseParameters",
      "com.fasterxml.jackson.core.JsonFactory",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException",
      "com.fasterxml.jackson.databind.util.NameTransformer",
      "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer",
      "com.fasterxml.jackson.databind.util.EnumValues",
      "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap",
      "com.fasterxml.jackson.databind.node.BooleanNode",
      "com.fasterxml.jackson.databind.node.ShortNode",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD",
      "com.fasterxml.jackson.databind.node.MissingNode",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder",
      "com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator",
      "com.fasterxml.jackson.core.util.MinimalPrettyPrinter",
      "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.annotation.JsonFormat$Value",
      "com.fasterxml.jackson.databind.PropertyNamingStrategy$SnakeCaseStrategy",
      "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase",
      "com.fasterxml.jackson.databind.PropertyMetadata",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer",
      "com.fasterxml.jackson.databind.deser.ResolvableDeserializer",
      "com.fasterxml.jackson.core.json.DupDetector",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor",
      "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty",
      "com.fasterxml.jackson.databind.ser.FilterProvider",
      "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion",
      "com.fasterxml.jackson.databind.annotation.JsonAppend$Prop",
      "com.fasterxml.jackson.annotation.JsonFormat",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers",
      "com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.annotation.JsonTypeInfo",
      "com.fasterxml.jackson.databind.type.TypeModifier",
      "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException",
      "com.fasterxml.jackson.annotation.JsonUnwrapped",
      "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty",
      "com.fasterxml.jackson.core.filter.FilteringParserDelegate",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver",
      "com.fasterxml.jackson.core.json.JsonGeneratorImpl",
      "com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder",
      "com.fasterxml.jackson.databind.deser.AbstractDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer",
      "com.fasterxml.jackson.databind.deser.SettableAnyProperty",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer",
      "org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard",
      "com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "org.telegram.telegrambots.meta.api.interfaces.Validable",
      "com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.io.DataOutputAsStream",
      "com.fasterxml.jackson.core.io.SegmentedStringWriter",
      "com.fasterxml.jackson.databind.type.TypeBindings",
      "com.fasterxml.jackson.databind.ser.impl.WritableObjectId",
      "com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.core.JsonToken",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiException",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.cfg.ConfigFeature",
      "com.fasterxml.jackson.core.FormatSchema",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.fasterxml.jackson.databind.ser.PropertyFilter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReplyKeyboardRemove_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiException",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException"
    );
  }
}
