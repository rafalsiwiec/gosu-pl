package gw.internal.schema.gw.xsd.config.xml.schemalocations.anonymous.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Schemalocations_Schema extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ExternalLocations = new javax.xml.namespace.QName( "", "externalLocations", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ResourcePath = new javax.xml.namespace.QName( "", "resourcePath", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_XmlNamespace = new javax.xml.namespace.QName( "", "xmlNamespace", "" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.config.xml.schemalocations.anonymous.types.complex.Schemalocations_Schema" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public Schemalocations_Schema() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected Schemalocations_Schema( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public java.util.List<java.net.URI> ExternalLocations() {
    //noinspection unchecked
    return (java.util.List<java.net.URI>) TYPE.get().getTypeInfo().getProperty( "ExternalLocations" ).getAccessor().getValue( this );
  }

  public void setExternalLocations$( java.util.List<java.net.URI> param ) {
    TYPE.get().getTypeInfo().getProperty( "ExternalLocations" ).getAccessor().setValue( this, param );
  }


  public java.lang.String ResourcePath() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "ResourcePath" ).getAccessor().getValue( this );
  }

  public void setResourcePath$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "ResourcePath" ).getAccessor().setValue( this, param );
  }


  public java.net.URI XmlNamespace() {
    return (java.net.URI) TYPE.get().getTypeInfo().getProperty( "XmlNamespace" ).getAccessor().getValue( this );
  }

  public void setXmlNamespace$( java.net.URI param ) {
    TYPE.get().getTypeInfo().getProperty( "XmlNamespace" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 872265990474503471L;

}
