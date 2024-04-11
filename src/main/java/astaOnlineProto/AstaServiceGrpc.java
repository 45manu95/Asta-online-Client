package astaOnlineProto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: astaOnLine.proto")
public final class AstaServiceGrpc {

  private AstaServiceGrpc() {}

  public static final String SERVICE_NAME = "AstaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente,
      astaOnlineProto.AstaOnLine.Empty> getRegistraUtenteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegistraUtente",
      requestType = astaOnlineProto.AstaOnLine.Utente.class,
      responseType = astaOnlineProto.AstaOnLine.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente,
      astaOnlineProto.AstaOnLine.Empty> getRegistraUtenteMethod() {
    io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente, astaOnlineProto.AstaOnLine.Empty> getRegistraUtenteMethod;
    if ((getRegistraUtenteMethod = AstaServiceGrpc.getRegistraUtenteMethod) == null) {
      synchronized (AstaServiceGrpc.class) {
        if ((getRegistraUtenteMethod = AstaServiceGrpc.getRegistraUtenteMethod) == null) {
          AstaServiceGrpc.getRegistraUtenteMethod = getRegistraUtenteMethod = 
              io.grpc.MethodDescriptor.<astaOnlineProto.AstaOnLine.Utente, astaOnlineProto.AstaOnLine.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AstaService", "RegistraUtente"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Utente.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AstaServiceMethodDescriptorSupplier("RegistraUtente"))
                  .build();
          }
        }
     }
     return getRegistraUtenteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente,
      astaOnlineProto.AstaOnLine.Empty> getAccediUtenteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccediUtente",
      requestType = astaOnlineProto.AstaOnLine.Utente.class,
      responseType = astaOnlineProto.AstaOnLine.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente,
      astaOnlineProto.AstaOnLine.Empty> getAccediUtenteMethod() {
    io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente, astaOnlineProto.AstaOnLine.Empty> getAccediUtenteMethod;
    if ((getAccediUtenteMethod = AstaServiceGrpc.getAccediUtenteMethod) == null) {
      synchronized (AstaServiceGrpc.class) {
        if ((getAccediUtenteMethod = AstaServiceGrpc.getAccediUtenteMethod) == null) {
          AstaServiceGrpc.getAccediUtenteMethod = getAccediUtenteMethod = 
              io.grpc.MethodDescriptor.<astaOnlineProto.AstaOnLine.Utente, astaOnlineProto.AstaOnLine.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AstaService", "AccediUtente"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Utente.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AstaServiceMethodDescriptorSupplier("AccediUtente"))
                  .build();
          }
        }
     }
     return getAccediUtenteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty,
      astaOnlineProto.AstaOnLine.MessaggioGenerico> getNotificaSuccessoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotificaSuccesso",
      requestType = astaOnlineProto.AstaOnLine.Empty.class,
      responseType = astaOnlineProto.AstaOnLine.MessaggioGenerico.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty,
      astaOnlineProto.AstaOnLine.MessaggioGenerico> getNotificaSuccessoMethod() {
    io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty, astaOnlineProto.AstaOnLine.MessaggioGenerico> getNotificaSuccessoMethod;
    if ((getNotificaSuccessoMethod = AstaServiceGrpc.getNotificaSuccessoMethod) == null) {
      synchronized (AstaServiceGrpc.class) {
        if ((getNotificaSuccessoMethod = AstaServiceGrpc.getNotificaSuccessoMethod) == null) {
          AstaServiceGrpc.getNotificaSuccessoMethod = getNotificaSuccessoMethod = 
              io.grpc.MethodDescriptor.<astaOnlineProto.AstaOnLine.Empty, astaOnlineProto.AstaOnLine.MessaggioGenerico>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AstaService", "NotificaSuccesso"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.MessaggioGenerico.getDefaultInstance()))
                  .setSchemaDescriptor(new AstaServiceMethodDescriptorSupplier("NotificaSuccesso"))
                  .build();
          }
        }
     }
     return getNotificaSuccessoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty,
      astaOnlineProto.AstaOnLine.Articolo> getGetArticoloInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArticoloInfo",
      requestType = astaOnlineProto.AstaOnLine.Empty.class,
      responseType = astaOnlineProto.AstaOnLine.Articolo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty,
      astaOnlineProto.AstaOnLine.Articolo> getGetArticoloInfoMethod() {
    io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty, astaOnlineProto.AstaOnLine.Articolo> getGetArticoloInfoMethod;
    if ((getGetArticoloInfoMethod = AstaServiceGrpc.getGetArticoloInfoMethod) == null) {
      synchronized (AstaServiceGrpc.class) {
        if ((getGetArticoloInfoMethod = AstaServiceGrpc.getGetArticoloInfoMethod) == null) {
          AstaServiceGrpc.getGetArticoloInfoMethod = getGetArticoloInfoMethod = 
              io.grpc.MethodDescriptor.<astaOnlineProto.AstaOnLine.Empty, astaOnlineProto.AstaOnLine.Articolo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AstaService", "GetArticoloInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Articolo.getDefaultInstance()))
                  .setSchemaDescriptor(new AstaServiceMethodDescriptorSupplier("GetArticoloInfo"))
                  .build();
          }
        }
     }
     return getGetArticoloInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente,
      astaOnlineProto.AstaOnLine.Articolo> getVisualizzaArticoliAcquistatiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VisualizzaArticoliAcquistati",
      requestType = astaOnlineProto.AstaOnLine.Utente.class,
      responseType = astaOnlineProto.AstaOnLine.Articolo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente,
      astaOnlineProto.AstaOnLine.Articolo> getVisualizzaArticoliAcquistatiMethod() {
    io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente, astaOnlineProto.AstaOnLine.Articolo> getVisualizzaArticoliAcquistatiMethod;
    if ((getVisualizzaArticoliAcquistatiMethod = AstaServiceGrpc.getVisualizzaArticoliAcquistatiMethod) == null) {
      synchronized (AstaServiceGrpc.class) {
        if ((getVisualizzaArticoliAcquistatiMethod = AstaServiceGrpc.getVisualizzaArticoliAcquistatiMethod) == null) {
          AstaServiceGrpc.getVisualizzaArticoliAcquistatiMethod = getVisualizzaArticoliAcquistatiMethod = 
              io.grpc.MethodDescriptor.<astaOnlineProto.AstaOnLine.Utente, astaOnlineProto.AstaOnLine.Articolo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AstaService", "VisualizzaArticoliAcquistati"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Utente.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Articolo.getDefaultInstance()))
                  .setSchemaDescriptor(new AstaServiceMethodDescriptorSupplier("VisualizzaArticoliAcquistati"))
                  .build();
          }
        }
     }
     return getVisualizzaArticoliAcquistatiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente,
      astaOnlineProto.AstaOnLine.Articolo> getVisualizzaArticoliRegistratiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VisualizzaArticoliRegistrati",
      requestType = astaOnlineProto.AstaOnLine.Utente.class,
      responseType = astaOnlineProto.AstaOnLine.Articolo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente,
      astaOnlineProto.AstaOnLine.Articolo> getVisualizzaArticoliRegistratiMethod() {
    io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Utente, astaOnlineProto.AstaOnLine.Articolo> getVisualizzaArticoliRegistratiMethod;
    if ((getVisualizzaArticoliRegistratiMethod = AstaServiceGrpc.getVisualizzaArticoliRegistratiMethod) == null) {
      synchronized (AstaServiceGrpc.class) {
        if ((getVisualizzaArticoliRegistratiMethod = AstaServiceGrpc.getVisualizzaArticoliRegistratiMethod) == null) {
          AstaServiceGrpc.getVisualizzaArticoliRegistratiMethod = getVisualizzaArticoliRegistratiMethod = 
              io.grpc.MethodDescriptor.<astaOnlineProto.AstaOnLine.Utente, astaOnlineProto.AstaOnLine.Articolo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AstaService", "VisualizzaArticoliRegistrati"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Utente.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Articolo.getDefaultInstance()))
                  .setSchemaDescriptor(new AstaServiceMethodDescriptorSupplier("VisualizzaArticoliRegistrati"))
                  .build();
          }
        }
     }
     return getVisualizzaArticoliRegistratiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Offerta,
      astaOnlineProto.AstaOnLine.MessaggioGenerico> getInviaOffertaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InviaOfferta",
      requestType = astaOnlineProto.AstaOnLine.Offerta.class,
      responseType = astaOnlineProto.AstaOnLine.MessaggioGenerico.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Offerta,
      astaOnlineProto.AstaOnLine.MessaggioGenerico> getInviaOffertaMethod() {
    io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Offerta, astaOnlineProto.AstaOnLine.MessaggioGenerico> getInviaOffertaMethod;
    if ((getInviaOffertaMethod = AstaServiceGrpc.getInviaOffertaMethod) == null) {
      synchronized (AstaServiceGrpc.class) {
        if ((getInviaOffertaMethod = AstaServiceGrpc.getInviaOffertaMethod) == null) {
          AstaServiceGrpc.getInviaOffertaMethod = getInviaOffertaMethod = 
              io.grpc.MethodDescriptor.<astaOnlineProto.AstaOnLine.Offerta, astaOnlineProto.AstaOnLine.MessaggioGenerico>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AstaService", "InviaOfferta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Offerta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.MessaggioGenerico.getDefaultInstance()))
                  .setSchemaDescriptor(new AstaServiceMethodDescriptorSupplier("InviaOfferta"))
                  .build();
          }
        }
     }
     return getInviaOffertaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty,
      astaOnlineProto.AstaOnLine.Articolo> getGetArticoliInVenditaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArticoliInVendita",
      requestType = astaOnlineProto.AstaOnLine.Empty.class,
      responseType = astaOnlineProto.AstaOnLine.Articolo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty,
      astaOnlineProto.AstaOnLine.Articolo> getGetArticoliInVenditaMethod() {
    io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty, astaOnlineProto.AstaOnLine.Articolo> getGetArticoliInVenditaMethod;
    if ((getGetArticoliInVenditaMethod = AstaServiceGrpc.getGetArticoliInVenditaMethod) == null) {
      synchronized (AstaServiceGrpc.class) {
        if ((getGetArticoliInVenditaMethod = AstaServiceGrpc.getGetArticoliInVenditaMethod) == null) {
          AstaServiceGrpc.getGetArticoliInVenditaMethod = getGetArticoliInVenditaMethod = 
              io.grpc.MethodDescriptor.<astaOnlineProto.AstaOnLine.Empty, astaOnlineProto.AstaOnLine.Articolo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AstaService", "GetArticoliInVendita"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Articolo.getDefaultInstance()))
                  .setSchemaDescriptor(new AstaServiceMethodDescriptorSupplier("GetArticoliInVendita"))
                  .build();
          }
        }
     }
     return getGetArticoliInVenditaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty,
      astaOnlineProto.AstaOnLine.MessaggioGenerico> getRiceviNotificheMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RiceviNotifiche",
      requestType = astaOnlineProto.AstaOnLine.Empty.class,
      responseType = astaOnlineProto.AstaOnLine.MessaggioGenerico.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty,
      astaOnlineProto.AstaOnLine.MessaggioGenerico> getRiceviNotificheMethod() {
    io.grpc.MethodDescriptor<astaOnlineProto.AstaOnLine.Empty, astaOnlineProto.AstaOnLine.MessaggioGenerico> getRiceviNotificheMethod;
    if ((getRiceviNotificheMethod = AstaServiceGrpc.getRiceviNotificheMethod) == null) {
      synchronized (AstaServiceGrpc.class) {
        if ((getRiceviNotificheMethod = AstaServiceGrpc.getRiceviNotificheMethod) == null) {
          AstaServiceGrpc.getRiceviNotificheMethod = getRiceviNotificheMethod = 
              io.grpc.MethodDescriptor.<astaOnlineProto.AstaOnLine.Empty, astaOnlineProto.AstaOnLine.MessaggioGenerico>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AstaService", "RiceviNotifiche"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  astaOnlineProto.AstaOnLine.MessaggioGenerico.getDefaultInstance()))
                  .setSchemaDescriptor(new AstaServiceMethodDescriptorSupplier("RiceviNotifiche"))
                  .build();
          }
        }
     }
     return getRiceviNotificheMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AstaServiceStub newStub(io.grpc.Channel channel) {
    return new AstaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AstaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AstaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AstaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AstaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AstaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registraUtente(astaOnlineProto.AstaOnLine.Utente request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistraUtenteMethod(), responseObserver);
    }

    /**
     */
    public void accediUtente(astaOnlineProto.AstaOnLine.Utente request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAccediUtenteMethod(), responseObserver);
    }

    /**
     */
    public void notificaSuccesso(astaOnlineProto.AstaOnLine.Empty request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.MessaggioGenerico> responseObserver) {
      asyncUnimplementedUnaryCall(getNotificaSuccessoMethod(), responseObserver);
    }

    /**
     */
    public void getArticoloInfo(astaOnlineProto.AstaOnLine.Empty request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetArticoloInfoMethod(), responseObserver);
    }

    /**
     */
    public void visualizzaArticoliAcquistati(astaOnlineProto.AstaOnLine.Utente request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo> responseObserver) {
      asyncUnimplementedUnaryCall(getVisualizzaArticoliAcquistatiMethod(), responseObserver);
    }

    /**
     */
    public void visualizzaArticoliRegistrati(astaOnlineProto.AstaOnLine.Utente request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo> responseObserver) {
      asyncUnimplementedUnaryCall(getVisualizzaArticoliRegistratiMethod(), responseObserver);
    }

    /**
     */
    public void inviaOfferta(astaOnlineProto.AstaOnLine.Offerta request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.MessaggioGenerico> responseObserver) {
      asyncUnimplementedUnaryCall(getInviaOffertaMethod(), responseObserver);
    }

    /**
     */
    public void getArticoliInVendita(astaOnlineProto.AstaOnLine.Empty request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetArticoliInVenditaMethod(), responseObserver);
    }

    /**
     */
    public void riceviNotifiche(astaOnlineProto.AstaOnLine.Empty request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.MessaggioGenerico> responseObserver) {
      asyncUnimplementedUnaryCall(getRiceviNotificheMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistraUtenteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                astaOnlineProto.AstaOnLine.Utente,
                astaOnlineProto.AstaOnLine.Empty>(
                  this, METHODID_REGISTRA_UTENTE)))
          .addMethod(
            getAccediUtenteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                astaOnlineProto.AstaOnLine.Utente,
                astaOnlineProto.AstaOnLine.Empty>(
                  this, METHODID_ACCEDI_UTENTE)))
          .addMethod(
            getNotificaSuccessoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                astaOnlineProto.AstaOnLine.Empty,
                astaOnlineProto.AstaOnLine.MessaggioGenerico>(
                  this, METHODID_NOTIFICA_SUCCESSO)))
          .addMethod(
            getGetArticoloInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                astaOnlineProto.AstaOnLine.Empty,
                astaOnlineProto.AstaOnLine.Articolo>(
                  this, METHODID_GET_ARTICOLO_INFO)))
          .addMethod(
            getVisualizzaArticoliAcquistatiMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                astaOnlineProto.AstaOnLine.Utente,
                astaOnlineProto.AstaOnLine.Articolo>(
                  this, METHODID_VISUALIZZA_ARTICOLI_ACQUISTATI)))
          .addMethod(
            getVisualizzaArticoliRegistratiMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                astaOnlineProto.AstaOnLine.Utente,
                astaOnlineProto.AstaOnLine.Articolo>(
                  this, METHODID_VISUALIZZA_ARTICOLI_REGISTRATI)))
          .addMethod(
            getInviaOffertaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                astaOnlineProto.AstaOnLine.Offerta,
                astaOnlineProto.AstaOnLine.MessaggioGenerico>(
                  this, METHODID_INVIA_OFFERTA)))
          .addMethod(
            getGetArticoliInVenditaMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                astaOnlineProto.AstaOnLine.Empty,
                astaOnlineProto.AstaOnLine.Articolo>(
                  this, METHODID_GET_ARTICOLI_IN_VENDITA)))
          .addMethod(
            getRiceviNotificheMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                astaOnlineProto.AstaOnLine.Empty,
                astaOnlineProto.AstaOnLine.MessaggioGenerico>(
                  this, METHODID_RICEVI_NOTIFICHE)))
          .build();
    }
  }

  /**
   */
  public static final class AstaServiceStub extends io.grpc.stub.AbstractStub<AstaServiceStub> {
    private AstaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AstaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AstaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AstaServiceStub(channel, callOptions);
    }

    /**
     */
    public void registraUtente(astaOnlineProto.AstaOnLine.Utente request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistraUtenteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accediUtente(astaOnlineProto.AstaOnLine.Utente request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccediUtenteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notificaSuccesso(astaOnlineProto.AstaOnLine.Empty request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.MessaggioGenerico> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotificaSuccessoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArticoloInfo(astaOnlineProto.AstaOnLine.Empty request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetArticoloInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void visualizzaArticoliAcquistati(astaOnlineProto.AstaOnLine.Utente request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getVisualizzaArticoliAcquistatiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void visualizzaArticoliRegistrati(astaOnlineProto.AstaOnLine.Utente request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getVisualizzaArticoliRegistratiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inviaOfferta(astaOnlineProto.AstaOnLine.Offerta request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.MessaggioGenerico> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInviaOffertaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArticoliInVendita(astaOnlineProto.AstaOnLine.Empty request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetArticoliInVenditaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void riceviNotifiche(astaOnlineProto.AstaOnLine.Empty request,
        io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.MessaggioGenerico> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRiceviNotificheMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AstaServiceBlockingStub extends io.grpc.stub.AbstractStub<AstaServiceBlockingStub> {
    private AstaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AstaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AstaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AstaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public astaOnlineProto.AstaOnLine.Empty registraUtente(astaOnlineProto.AstaOnLine.Utente request) {
      return blockingUnaryCall(
          getChannel(), getRegistraUtenteMethod(), getCallOptions(), request);
    }

    /**
     */
    public astaOnlineProto.AstaOnLine.Empty accediUtente(astaOnlineProto.AstaOnLine.Utente request) {
      return blockingUnaryCall(
          getChannel(), getAccediUtenteMethod(), getCallOptions(), request);
    }

    /**
     */
    public astaOnlineProto.AstaOnLine.MessaggioGenerico notificaSuccesso(astaOnlineProto.AstaOnLine.Empty request) {
      return blockingUnaryCall(
          getChannel(), getNotificaSuccessoMethod(), getCallOptions(), request);
    }

    /**
     */
    public astaOnlineProto.AstaOnLine.Articolo getArticoloInfo(astaOnlineProto.AstaOnLine.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetArticoloInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<astaOnlineProto.AstaOnLine.Articolo> visualizzaArticoliAcquistati(
        astaOnlineProto.AstaOnLine.Utente request) {
      return blockingServerStreamingCall(
          getChannel(), getVisualizzaArticoliAcquistatiMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<astaOnlineProto.AstaOnLine.Articolo> visualizzaArticoliRegistrati(
        astaOnlineProto.AstaOnLine.Utente request) {
      return blockingServerStreamingCall(
          getChannel(), getVisualizzaArticoliRegistratiMethod(), getCallOptions(), request);
    }

    /**
     */
    public astaOnlineProto.AstaOnLine.MessaggioGenerico inviaOfferta(astaOnlineProto.AstaOnLine.Offerta request) {
      return blockingUnaryCall(
          getChannel(), getInviaOffertaMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<astaOnlineProto.AstaOnLine.Articolo> getArticoliInVendita(
        astaOnlineProto.AstaOnLine.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetArticoliInVenditaMethod(), getCallOptions(), request);
    }

    /**
     */
    public astaOnlineProto.AstaOnLine.MessaggioGenerico riceviNotifiche(astaOnlineProto.AstaOnLine.Empty request) {
      return blockingUnaryCall(
          getChannel(), getRiceviNotificheMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AstaServiceFutureStub extends io.grpc.stub.AbstractStub<AstaServiceFutureStub> {
    private AstaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AstaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AstaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AstaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<astaOnlineProto.AstaOnLine.Empty> registraUtente(
        astaOnlineProto.AstaOnLine.Utente request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistraUtenteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<astaOnlineProto.AstaOnLine.Empty> accediUtente(
        astaOnlineProto.AstaOnLine.Utente request) {
      return futureUnaryCall(
          getChannel().newCall(getAccediUtenteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<astaOnlineProto.AstaOnLine.MessaggioGenerico> notificaSuccesso(
        astaOnlineProto.AstaOnLine.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getNotificaSuccessoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<astaOnlineProto.AstaOnLine.Articolo> getArticoloInfo(
        astaOnlineProto.AstaOnLine.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetArticoloInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<astaOnlineProto.AstaOnLine.MessaggioGenerico> inviaOfferta(
        astaOnlineProto.AstaOnLine.Offerta request) {
      return futureUnaryCall(
          getChannel().newCall(getInviaOffertaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<astaOnlineProto.AstaOnLine.MessaggioGenerico> riceviNotifiche(
        astaOnlineProto.AstaOnLine.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getRiceviNotificheMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRA_UTENTE = 0;
  private static final int METHODID_ACCEDI_UTENTE = 1;
  private static final int METHODID_NOTIFICA_SUCCESSO = 2;
  private static final int METHODID_GET_ARTICOLO_INFO = 3;
  private static final int METHODID_VISUALIZZA_ARTICOLI_ACQUISTATI = 4;
  private static final int METHODID_VISUALIZZA_ARTICOLI_REGISTRATI = 5;
  private static final int METHODID_INVIA_OFFERTA = 6;
  private static final int METHODID_GET_ARTICOLI_IN_VENDITA = 7;
  private static final int METHODID_RICEVI_NOTIFICHE = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AstaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AstaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRA_UTENTE:
          serviceImpl.registraUtente((astaOnlineProto.AstaOnLine.Utente) request,
              (io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Empty>) responseObserver);
          break;
        case METHODID_ACCEDI_UTENTE:
          serviceImpl.accediUtente((astaOnlineProto.AstaOnLine.Utente) request,
              (io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Empty>) responseObserver);
          break;
        case METHODID_NOTIFICA_SUCCESSO:
          serviceImpl.notificaSuccesso((astaOnlineProto.AstaOnLine.Empty) request,
              (io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.MessaggioGenerico>) responseObserver);
          break;
        case METHODID_GET_ARTICOLO_INFO:
          serviceImpl.getArticoloInfo((astaOnlineProto.AstaOnLine.Empty) request,
              (io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo>) responseObserver);
          break;
        case METHODID_VISUALIZZA_ARTICOLI_ACQUISTATI:
          serviceImpl.visualizzaArticoliAcquistati((astaOnlineProto.AstaOnLine.Utente) request,
              (io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo>) responseObserver);
          break;
        case METHODID_VISUALIZZA_ARTICOLI_REGISTRATI:
          serviceImpl.visualizzaArticoliRegistrati((astaOnlineProto.AstaOnLine.Utente) request,
              (io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo>) responseObserver);
          break;
        case METHODID_INVIA_OFFERTA:
          serviceImpl.inviaOfferta((astaOnlineProto.AstaOnLine.Offerta) request,
              (io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.MessaggioGenerico>) responseObserver);
          break;
        case METHODID_GET_ARTICOLI_IN_VENDITA:
          serviceImpl.getArticoliInVendita((astaOnlineProto.AstaOnLine.Empty) request,
              (io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.Articolo>) responseObserver);
          break;
        case METHODID_RICEVI_NOTIFICHE:
          serviceImpl.riceviNotifiche((astaOnlineProto.AstaOnLine.Empty) request,
              (io.grpc.stub.StreamObserver<astaOnlineProto.AstaOnLine.MessaggioGenerico>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AstaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AstaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return astaOnlineProto.AstaOnLine.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AstaService");
    }
  }

  private static final class AstaServiceFileDescriptorSupplier
      extends AstaServiceBaseDescriptorSupplier {
    AstaServiceFileDescriptorSupplier() {}
  }

  private static final class AstaServiceMethodDescriptorSupplier
      extends AstaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AstaServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AstaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AstaServiceFileDescriptorSupplier())
              .addMethod(getRegistraUtenteMethod())
              .addMethod(getAccediUtenteMethod())
              .addMethod(getNotificaSuccessoMethod())
              .addMethod(getGetArticoloInfoMethod())
              .addMethod(getVisualizzaArticoliAcquistatiMethod())
              .addMethod(getVisualizzaArticoliRegistratiMethod())
              .addMethod(getInviaOffertaMethod())
              .addMethod(getGetArticoliInVenditaMethod())
              .addMethod(getRiceviNotificheMethod())
              .build();
        }
      }
    }
    return result;
  }
}
