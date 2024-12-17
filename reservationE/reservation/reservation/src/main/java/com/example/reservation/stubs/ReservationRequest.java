// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package com.example.reservation.stubs;

/**
 * <pre>
 * Message pour une demande de réservation
 * </pre>
 *
 * Protobuf type {@code ReservationRequest}
 */
public  final class ReservationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReservationRequest)
    ReservationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReservationRequest.newBuilder() to construct.
  private ReservationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReservationRequest() {
    dateDebut_ = "";
    dateFin_ = "";
    preferences_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReservationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReservationRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            clientId_ = input.readInt64();
            break;
          }
          case 16: {

            chambreId_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dateDebut_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            dateFin_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            preferences_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.reservation.stubs.ReservationServiceOuterClass.internal_static_ReservationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.reservation.stubs.ReservationServiceOuterClass.internal_static_ReservationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.reservation.stubs.ReservationRequest.class, com.example.reservation.stubs.ReservationRequest.Builder.class);
  }

  public static final int CLIENTID_FIELD_NUMBER = 1;
  private long clientId_;
  /**
   * <pre>
   * ID du client (type int64)
   * </pre>
   *
   * <code>int64 clientId = 1;</code>
   * @return The clientId.
   */
  public long getClientId() {
    return clientId_;
  }

  public static final int CHAMBREID_FIELD_NUMBER = 2;
  private long chambreId_;
  /**
   * <pre>
   * ID de la chambre (type int64)
   * </pre>
   *
   * <code>int64 chambreId = 2;</code>
   * @return The chambreId.
   */
  public long getChambreId() {
    return chambreId_;
  }

  public static final int DATEDEBUT_FIELD_NUMBER = 3;
  private volatile java.lang.Object dateDebut_;
  /**
   * <pre>
   * Date de début de la réservation (format ISO 8601 recommandé)
   * </pre>
   *
   * <code>string dateDebut = 3;</code>
   * @return The dateDebut.
   */
  public java.lang.String getDateDebut() {
    java.lang.Object ref = dateDebut_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateDebut_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Date de début de la réservation (format ISO 8601 recommandé)
   * </pre>
   *
   * <code>string dateDebut = 3;</code>
   * @return The bytes for dateDebut.
   */
  public com.google.protobuf.ByteString
      getDateDebutBytes() {
    java.lang.Object ref = dateDebut_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateDebut_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATEFIN_FIELD_NUMBER = 4;
  private volatile java.lang.Object dateFin_;
  /**
   * <pre>
   * Date de fin de la réservation (format ISO 8601 recommandé)
   * </pre>
   *
   * <code>string dateFin = 4;</code>
   * @return The dateFin.
   */
  public java.lang.String getDateFin() {
    java.lang.Object ref = dateFin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateFin_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Date de fin de la réservation (format ISO 8601 recommandé)
   * </pre>
   *
   * <code>string dateFin = 4;</code>
   * @return The bytes for dateFin.
   */
  public com.google.protobuf.ByteString
      getDateFinBytes() {
    java.lang.Object ref = dateFin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateFin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREFERENCES_FIELD_NUMBER = 5;
  private volatile java.lang.Object preferences_;
  /**
   * <pre>
   * Préférences spécifiques du client (par exemple : type de lit)
   * </pre>
   *
   * <code>string preferences = 5;</code>
   * @return The preferences.
   */
  public java.lang.String getPreferences() {
    java.lang.Object ref = preferences_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      preferences_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Préférences spécifiques du client (par exemple : type de lit)
   * </pre>
   *
   * <code>string preferences = 5;</code>
   * @return The bytes for preferences.
   */
  public com.google.protobuf.ByteString
      getPreferencesBytes() {
    java.lang.Object ref = preferences_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      preferences_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (clientId_ != 0L) {
      output.writeInt64(1, clientId_);
    }
    if (chambreId_ != 0L) {
      output.writeInt64(2, chambreId_);
    }
    if (!getDateDebutBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dateDebut_);
    }
    if (!getDateFinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dateFin_);
    }
    if (!getPreferencesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, preferences_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, clientId_);
    }
    if (chambreId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, chambreId_);
    }
    if (!getDateDebutBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dateDebut_);
    }
    if (!getDateFinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dateFin_);
    }
    if (!getPreferencesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, preferences_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.reservation.stubs.ReservationRequest)) {
      return super.equals(obj);
    }
    com.example.reservation.stubs.ReservationRequest other = (com.example.reservation.stubs.ReservationRequest) obj;

    if (getClientId()
        != other.getClientId()) return false;
    if (getChambreId()
        != other.getChambreId()) return false;
    if (!getDateDebut()
        .equals(other.getDateDebut())) return false;
    if (!getDateFin()
        .equals(other.getDateFin())) return false;
    if (!getPreferences()
        .equals(other.getPreferences())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientId());
    hash = (37 * hash) + CHAMBREID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getChambreId());
    hash = (37 * hash) + DATEDEBUT_FIELD_NUMBER;
    hash = (53 * hash) + getDateDebut().hashCode();
    hash = (37 * hash) + DATEFIN_FIELD_NUMBER;
    hash = (53 * hash) + getDateFin().hashCode();
    hash = (37 * hash) + PREFERENCES_FIELD_NUMBER;
    hash = (53 * hash) + getPreferences().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.reservation.stubs.ReservationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.reservation.stubs.ReservationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.reservation.stubs.ReservationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.reservation.stubs.ReservationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.reservation.stubs.ReservationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.reservation.stubs.ReservationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.reservation.stubs.ReservationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.reservation.stubs.ReservationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.reservation.stubs.ReservationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.reservation.stubs.ReservationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.reservation.stubs.ReservationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.reservation.stubs.ReservationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.reservation.stubs.ReservationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Message pour une demande de réservation
   * </pre>
   *
   * Protobuf type {@code ReservationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReservationRequest)
      com.example.reservation.stubs.ReservationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.reservation.stubs.ReservationServiceOuterClass.internal_static_ReservationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.reservation.stubs.ReservationServiceOuterClass.internal_static_ReservationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.reservation.stubs.ReservationRequest.class, com.example.reservation.stubs.ReservationRequest.Builder.class);
    }

    // Construct using com.example.reservation.stubs.ReservationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      clientId_ = 0L;

      chambreId_ = 0L;

      dateDebut_ = "";

      dateFin_ = "";

      preferences_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.reservation.stubs.ReservationServiceOuterClass.internal_static_ReservationRequest_descriptor;
    }

    @java.lang.Override
    public com.example.reservation.stubs.ReservationRequest getDefaultInstanceForType() {
      return com.example.reservation.stubs.ReservationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.reservation.stubs.ReservationRequest build() {
      com.example.reservation.stubs.ReservationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.reservation.stubs.ReservationRequest buildPartial() {
      com.example.reservation.stubs.ReservationRequest result = new com.example.reservation.stubs.ReservationRequest(this);
      result.clientId_ = clientId_;
      result.chambreId_ = chambreId_;
      result.dateDebut_ = dateDebut_;
      result.dateFin_ = dateFin_;
      result.preferences_ = preferences_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.reservation.stubs.ReservationRequest) {
        return mergeFrom((com.example.reservation.stubs.ReservationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.reservation.stubs.ReservationRequest other) {
      if (other == com.example.reservation.stubs.ReservationRequest.getDefaultInstance()) return this;
      if (other.getClientId() != 0L) {
        setClientId(other.getClientId());
      }
      if (other.getChambreId() != 0L) {
        setChambreId(other.getChambreId());
      }
      if (!other.getDateDebut().isEmpty()) {
        dateDebut_ = other.dateDebut_;
        onChanged();
      }
      if (!other.getDateFin().isEmpty()) {
        dateFin_ = other.dateFin_;
        onChanged();
      }
      if (!other.getPreferences().isEmpty()) {
        preferences_ = other.preferences_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.reservation.stubs.ReservationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.reservation.stubs.ReservationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long clientId_ ;
    /**
     * <pre>
     * ID du client (type int64)
     * </pre>
     *
     * <code>int64 clientId = 1;</code>
     * @return The clientId.
     */
    public long getClientId() {
      return clientId_;
    }
    /**
     * <pre>
     * ID du client (type int64)
     * </pre>
     *
     * <code>int64 clientId = 1;</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(long value) {
      
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID du client (type int64)
     * </pre>
     *
     * <code>int64 clientId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      
      clientId_ = 0L;
      onChanged();
      return this;
    }

    private long chambreId_ ;
    /**
     * <pre>
     * ID de la chambre (type int64)
     * </pre>
     *
     * <code>int64 chambreId = 2;</code>
     * @return The chambreId.
     */
    public long getChambreId() {
      return chambreId_;
    }
    /**
     * <pre>
     * ID de la chambre (type int64)
     * </pre>
     *
     * <code>int64 chambreId = 2;</code>
     * @param value The chambreId to set.
     * @return This builder for chaining.
     */
    public Builder setChambreId(long value) {
      
      chambreId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID de la chambre (type int64)
     * </pre>
     *
     * <code>int64 chambreId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearChambreId() {
      
      chambreId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object dateDebut_ = "";
    /**
     * <pre>
     * Date de début de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateDebut = 3;</code>
     * @return The dateDebut.
     */
    public java.lang.String getDateDebut() {
      java.lang.Object ref = dateDebut_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateDebut_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Date de début de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateDebut = 3;</code>
     * @return The bytes for dateDebut.
     */
    public com.google.protobuf.ByteString
        getDateDebutBytes() {
      java.lang.Object ref = dateDebut_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateDebut_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Date de début de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateDebut = 3;</code>
     * @param value The dateDebut to set.
     * @return This builder for chaining.
     */
    public Builder setDateDebut(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateDebut_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date de début de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateDebut = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateDebut() {
      
      dateDebut_ = getDefaultInstance().getDateDebut();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date de début de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateDebut = 3;</code>
     * @param value The bytes for dateDebut to set.
     * @return This builder for chaining.
     */
    public Builder setDateDebutBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateDebut_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dateFin_ = "";
    /**
     * <pre>
     * Date de fin de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateFin = 4;</code>
     * @return The dateFin.
     */
    public java.lang.String getDateFin() {
      java.lang.Object ref = dateFin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateFin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Date de fin de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateFin = 4;</code>
     * @return The bytes for dateFin.
     */
    public com.google.protobuf.ByteString
        getDateFinBytes() {
      java.lang.Object ref = dateFin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateFin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Date de fin de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateFin = 4;</code>
     * @param value The dateFin to set.
     * @return This builder for chaining.
     */
    public Builder setDateFin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateFin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date de fin de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateFin = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateFin() {
      
      dateFin_ = getDefaultInstance().getDateFin();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date de fin de la réservation (format ISO 8601 recommandé)
     * </pre>
     *
     * <code>string dateFin = 4;</code>
     * @param value The bytes for dateFin to set.
     * @return This builder for chaining.
     */
    public Builder setDateFinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateFin_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object preferences_ = "";
    /**
     * <pre>
     * Préférences spécifiques du client (par exemple : type de lit)
     * </pre>
     *
     * <code>string preferences = 5;</code>
     * @return The preferences.
     */
    public java.lang.String getPreferences() {
      java.lang.Object ref = preferences_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        preferences_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Préférences spécifiques du client (par exemple : type de lit)
     * </pre>
     *
     * <code>string preferences = 5;</code>
     * @return The bytes for preferences.
     */
    public com.google.protobuf.ByteString
        getPreferencesBytes() {
      java.lang.Object ref = preferences_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        preferences_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Préférences spécifiques du client (par exemple : type de lit)
     * </pre>
     *
     * <code>string preferences = 5;</code>
     * @param value The preferences to set.
     * @return This builder for chaining.
     */
    public Builder setPreferences(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      preferences_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Préférences spécifiques du client (par exemple : type de lit)
     * </pre>
     *
     * <code>string preferences = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPreferences() {
      
      preferences_ = getDefaultInstance().getPreferences();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Préférences spécifiques du client (par exemple : type de lit)
     * </pre>
     *
     * <code>string preferences = 5;</code>
     * @param value The bytes for preferences to set.
     * @return This builder for chaining.
     */
    public Builder setPreferencesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      preferences_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ReservationRequest)
  }

  // @@protoc_insertion_point(class_scope:ReservationRequest)
  private static final com.example.reservation.stubs.ReservationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.reservation.stubs.ReservationRequest();
  }

  public static com.example.reservation.stubs.ReservationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReservationRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReservationRequest>() {
    @java.lang.Override
    public ReservationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReservationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReservationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReservationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.reservation.stubs.ReservationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

