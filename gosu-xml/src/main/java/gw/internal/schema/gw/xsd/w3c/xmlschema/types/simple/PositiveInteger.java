package gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class PositiveInteger extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple.NonNegativeInteger implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "positiveInteger", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.types.simple.PositiveInteger" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public PositiveInteger() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected PositiveInteger( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }

  public PositiveInteger( java.math.BigInteger value ) {
    this();
    TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().setValue( this, value );
  }


  @Deprecated
  public java.math.BigInteger getValue$$gw_xsd_w3c_xmlschema_types_simple_NonNegativeInteger() {
    return super.getValue$$gw_xsd_w3c_xmlschema_types_simple_NonNegativeInteger();
  }

  @Deprecated
  public void setValue$$gw_xsd_w3c_xmlschema_types_simple_NonNegativeInteger( java.math.BigInteger param ) {
    super.setValue$$gw_xsd_w3c_xmlschema_types_simple_NonNegativeInteger( param );
  }

  public java.math.BigInteger getValue$$gw_xsd_w3c_xmlschema_types_simple_PositiveInteger() {
    return (java.math.BigInteger) TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().getValue( this );
  }

  public void setValue$$gw_xsd_w3c_xmlschema_types_simple_PositiveInteger( java.math.BigInteger param ) {
    TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 2110283714877373226L;

}