package gw.internal.schema.gw.xsd.w3c.wsdl.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class TImport extends gw.internal.schema.gw.xsd.w3c.wsdl.types.complex.TExtensibleAttributesDocumented implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Location = new javax.xml.namespace.QName( "", "location", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Namespace = new javax.xml.namespace.QName( "", "namespace", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Documentation = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "documentation", "wsdl" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "tImport", "wsdl" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.wsdl.types.complex.TImport" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public TImport() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected TImport( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TDocumented_Documentation Documentation() {
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TDocumented_Documentation) TYPE.get().getTypeInfo().getProperty( "Documentation" ).getAccessor().getValue( this );
  }

  public void setDocumentation$( gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TDocumented_Documentation param ) {
    TYPE.get().getTypeInfo().getProperty( "Documentation" ).getAccessor().setValue( this, param );
  }


  public java.net.URI Location() {
    return (java.net.URI) TYPE.get().getTypeInfo().getProperty( "Location" ).getAccessor().getValue( this );
  }

  public void setLocation$( java.net.URI param ) {
    TYPE.get().getTypeInfo().getProperty( "Location" ).getAccessor().setValue( this, param );
  }


  public java.net.URI Namespace() {
    return (java.net.URI) TYPE.get().getTypeInfo().getProperty( "Namespace" ).getAccessor().getValue( this );
  }

  public void setNamespace$( java.net.URI param ) {
    TYPE.get().getTypeInfo().getProperty( "Namespace" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = -6050492648119042255L;

}
