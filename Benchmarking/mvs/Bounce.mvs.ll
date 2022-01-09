; ModuleID = 'main'
source_filename = "main"
target triple = "x86_64-pc-linux-gnu"

%_Metatype = type { i64, void (i8*)*, void (i8*)*, void (i8*, i8*)*, i64 (i8*, i8*)* }
%Ball = type { i64, i64, i64, i64 }
%_AnyClosure = type { i8*, i8*, void (%_AnyClosure*, %_AnyClosure*)*, void (%_AnyClosure*)*, i64 (%_AnyClosure*, %_AnyClosure*)* }
%Random = type { i64 }
%_AnyArray = type { i8* }

@Ball.Type = private global %_Metatype { i64 32, void (i8*)* null, void (i8*)* null, void (i8*, i8*)* @Ball.te_copy, i64 (i8*, i8*)* @Ball.te_equal }
@_Int.Type = private global %_Metatype { i64 8, void (i8*)* null, void (i8*)* null, void (i8*, i8*)* null, i64 (i8*, i8*)* @_Int.te_equal }

; Function Attrs: argmemonly nounwind willreturn
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly %0, i8* noalias nocapture readonly %1, i64 %2, i1 immarg %3) #0

; Function Attrs: alwaysinline nounwind
define private void @Ball.te_copy(i8* nocapture %0, i8* nocapture readonly %1) #1 {
entry:
  %2 = bitcast i8* %0 to %Ball*
  %3 = bitcast i8* %1 to %Ball*
  tail call fastcc void @Ball.copy(%Ball* %2, %Ball* %3)
  ret void
}

; Function Attrs: alwaysinline argmemonly nounwind
define private fastcc void @Ball.copy(%Ball* nocapture %0, %Ball* nocapture readonly %1) unnamed_addr #2 {
entry:
  %2 = bitcast %Ball* %0 to i8*
  %3 = bitcast %Ball* %1 to i8*
  tail call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %2, i8* nonnull align 1 dereferenceable(32) %3, i64 32, i1 false)
  ret void
}

; Function Attrs: alwaysinline norecurse nounwind readonly
define private i64 @Ball.te_equal(i8* nocapture readonly %0, i8* nocapture readonly %1) #3 {
entry:
  %2 = bitcast i8* %0 to %Ball*
  %3 = bitcast i8* %1 to %Ball*
  %4 = tail call fastcc i64 @Ball.equal(%Ball* %2, %Ball* %3)
  ret i64 %4
}

; Function Attrs: norecurse nounwind readonly
define private fastcc i64 @Ball.equal(%Ball* nocapture readonly %0, %Ball* nocapture readonly %1) unnamed_addr #4 {
entry:
  %2 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 0
  %3 = getelementptr inbounds %Ball, %Ball* %1, i64 0, i32 0
  %4 = load i64, i64* %2, align 4
  %5 = load i64, i64* %3, align 4
  %6 = icmp eq i64 %4, %5
  br i1 %6, label %eq, label %ne

ne:                                               ; preds = %eq1, %eq, %entry
  ret i64 0

eq:                                               ; preds = %entry
  %7 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 1
  %8 = getelementptr inbounds %Ball, %Ball* %1, i64 0, i32 1
  %9 = load i64, i64* %7, align 4
  %10 = load i64, i64* %8, align 4
  %11 = icmp eq i64 %9, %10
  br i1 %11, label %eq1, label %ne

eq1:                                              ; preds = %eq
  %12 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 2
  %13 = getelementptr inbounds %Ball, %Ball* %1, i64 0, i32 2
  %14 = load i64, i64* %12, align 4
  %15 = load i64, i64* %13, align 4
  %16 = icmp eq i64 %14, %15
  br i1 %16, label %eq2, label %ne

eq2:                                              ; preds = %eq1
  %17 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 3
  %18 = getelementptr inbounds %Ball, %Ball* %1, i64 0, i32 3
  %19 = load i64, i64* %17, align 4
  %20 = load i64, i64* %18, align 4
  %21 = icmp eq i64 %19, %20
  %spec.select = zext i1 %21 to i64
  ret i64 %spec.select
}

; Function Attrs: alwaysinline nounwind
define private fastcc i64 @_uptime() unnamed_addr #1 {
entry:
  %0 = tail call i64 @mvs_uptime_nanoseconds()
  ret i64 %0
}

; Function Attrs: nounwind
declare i64 @mvs_uptime_nanoseconds() local_unnamed_addr #5

; Function Attrs: alwaysinline
define private fastcc void @_printint(i64 %0) unnamed_addr #6 {
entry:
  tail call void @mvs_print_i64(i64 %0)
  ret void
}

declare void @mvs_print_i64(i64 %0) local_unnamed_addr

; Function Attrs: alwaysinline norecurse nounwind readnone
define private fastcc i64 @_imod(i64 %0, i64 %1) unnamed_addr #7 {
entry:
  %2 = srem i64 %0, %1
  ret i64 %2
}

; Function Attrs: alwaysinline norecurse nounwind readnone
define private fastcc i64 @_iand(i64 %0) unnamed_addr #7 {
entry:
  %1 = and i64 %0, 65535
  ret i64 %1
}

; Function Attrs: alwaysinline norecurse nounwind readnone
define private fastcc i64 @_iabs(i64 %0) unnamed_addr #7 {
entry:
  %1 = icmp slt i64 %0, 0
  %2 = sub i64 0, %0
  %3 = select i1 %1, i64 %2, i64 %0
  ret i64 %3
}

; Function Attrs: alwaysinline nounwind
define private fastcc void @_assert(i64 %0) unnamed_addr #1 {
entry:
  %1 = tail call i64 @mvs_assert_i64(i64 %0)
  ret void
}

; Function Attrs: nounwind
declare i64 @mvs_assert_i64(i64 %0) local_unnamed_addr #5

; Function Attrs: alwaysinline nounwind
define private fastcc i64 @_iarg(i64 %0) unnamed_addr #1 {
entry:
  %1 = tail call i64 @mvs_iarg(i64 %0)
  ret i64 %1
}

; Function Attrs: nounwind
declare i64 @mvs_iarg(i64 %0) local_unnamed_addr #5

define i32 @main(i32 %0, i32* %1) local_unnamed_addr {
entry:
  %2 = alloca %_AnyClosure, align 8
  %3 = tail call i64 @mvs_init(i32 %0, i32* %1)
  %4 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 0
  store i8* bitcast (i64 (i64, i8*)* @_run4 to i8*), i8** %4, align 8
  %5 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 1
  store i8* null, i8** %5, align 8
  %6 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 2
  store void (%_AnyClosure*, %_AnyClosure*)* @_run4.copy, void (%_AnyClosure*, %_AnyClosure*)** %6, align 8
  %7 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 3
  store void (%_AnyClosure*)* @_run4.drop, void (%_AnyClosure*)** %7, align 8
  %8 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 4
  store i64 (%_AnyClosure*, %_AnyClosure*)* @_run4.equal, i64 (%_AnyClosure*, %_AnyClosure*)** %8, align 8
  call fastcc void @_main7(%_AnyClosure* nonnull %2)
  %9 = load void (%_AnyClosure*)*, void (%_AnyClosure*)** %7, align 8
  %10 = icmp eq void (%_AnyClosure*)* %9, null
  br i1 %10, label %then, label %else

else:                                             ; preds = %entry
  call void %9(%_AnyClosure* nonnull %2)
  br label %then

then:                                             ; preds = %else, %entry
  call void @mvs_print_i64(i64 0)
  ret i32 0
}

; Function Attrs: nounwind
declare i64 @mvs_init(i32 %0, i32* %1) local_unnamed_addr #5

; Function Attrs: nofree norecurse nounwind writeonly
define private fastcc void @_randomInit0(%Random* nocapture %0) unnamed_addr #8 {
entry:
  %1 = getelementptr %Random, %Random* %0, i64 0, i32 0
  store i64 74755, i64* %1, align 1
  ret void
}

; Function Attrs: argmemonly nounwind willreturn writeonly
declare void @llvm.memset.p0i8.i64(i8* nocapture writeonly %0, i8 %1, i64 %2, i1 immarg %3) #9

; Function Attrs: nofree norecurse nounwind
define private fastcc i64 @_randomNext1(%Random* nocapture %0) unnamed_addr #10 {
entry:
  %1 = getelementptr inbounds %Random, %Random* %0, i64 0, i32 0
  %2 = load i64, i64* %1, align 4
  %3 = mul i64 %2, 1309
  %4 = add i64 %3, 13849
  %5 = tail call fastcc i64 @_iand(i64 %4)
  store i64 %5, i64* %1, align 4
  ret i64 %5
}

; Function Attrs: nounwind
define private fastcc void @_randomized2(%Ball* nocapture %0, %Random* nocapture %1) unnamed_addr #5 {
entry:
  %2 = tail call fastcc i64 @_randomNext1(%Random* %1)
  %3 = tail call fastcc i64 @_imod(i64 %2, i64 500)
  %4 = tail call fastcc i64 @_randomNext1(%Random* %1)
  %5 = tail call fastcc i64 @_imod(i64 %4, i64 500)
  %6 = tail call fastcc i64 @_randomNext1(%Random* %1)
  %7 = tail call fastcc i64 @_imod(i64 %6, i64 300)
  %8 = add i64 %7, -150
  %9 = tail call fastcc i64 @_randomNext1(%Random* %1)
  %10 = tail call fastcc i64 @_imod(i64 %9, i64 300)
  %11 = add i64 %10, -150
  %.sroa.0.0..sroa_idx = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 0
  store i64 %3, i64* %.sroa.0.0..sroa_idx, align 1
  %.sroa.3.0..sroa_idx1 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 1
  store i64 %5, i64* %.sroa.3.0..sroa_idx1, align 1
  %.sroa.4.0..sroa_idx2 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 2
  store i64 %8, i64* %.sroa.4.0..sroa_idx2, align 1
  %.sroa.5.0..sroa_idx3 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 3
  store i64 %11, i64* %.sroa.5.0..sroa_idx3, align 1
  ret void
}

; Function Attrs: nofree norecurse nounwind
define private fastcc i64 @_bounce3(%Ball* %0) unnamed_addr #10 {
entry:
  %1 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 0
  %2 = load i64, i64* %1, align 4
  %3 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 2
  %4 = load i64, i64* %3, align 4
  %5 = add i64 %4, %2
  store i64 %5, i64* %1, align 4
  %6 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 1
  %7 = load i64, i64* %6, align 4
  %8 = getelementptr inbounds %Ball, %Ball* %0, i64 0, i32 3
  %9 = load i64, i64* %8, align 4
  %10 = add i64 %9, %7
  store i64 %10, i64* %6, align 4
  %11 = icmp sgt i64 %5, 500
  br i1 %11, label %tail.thread, label %tail

tail.thread:                                      ; preds = %entry
  store i64 500, i64* %1, align 4
  %12 = tail call fastcc i64 @_iabs(i64 %4)
  %13 = sub i64 0, %12
  br label %tail3.sink.split

tail:                                             ; preds = %entry
  %14 = icmp slt i64 %5, 0
  br i1 %14, label %succ1, label %tail3

succ1:                                            ; preds = %tail
  store i64 0, i64* %1, align 4
  %15 = tail call fastcc i64 @_iabs(i64 %4)
  br label %tail3.sink.split

tail3.sink.split:                                 ; preds = %succ1, %tail.thread
  %.sink = phi i64 [ %13, %tail.thread ], [ %15, %succ1 ]
  store i64 %.sink, i64* %3, align 4
  br label %tail3

tail3:                                            ; preds = %tail3.sink.split, %tail
  %bounced.1 = phi i64 [ 0, %tail ], [ 1, %tail3.sink.split ]
  %16 = icmp sgt i64 %10, 500
  br i1 %16, label %tail6.thread, label %tail6

tail6.thread:                                     ; preds = %tail3
  store i64 500, i64* %6, align 4
  %17 = tail call fastcc i64 @_iabs(i64 %9)
  %18 = sub i64 0, %17
  br label %tail9.sink.split

tail6:                                            ; preds = %tail3
  %19 = icmp slt i64 %10, 0
  br i1 %19, label %succ7, label %tail9

succ7:                                            ; preds = %tail6
  store i64 0, i64* %6, align 4
  %20 = tail call fastcc i64 @_iabs(i64 %9)
  br label %tail9.sink.split

tail9.sink.split:                                 ; preds = %succ7, %tail6.thread
  %.sink4 = phi i64 [ %18, %tail6.thread ], [ %20, %succ7 ]
  store i64 %.sink4, i64* %8, align 4
  br label %tail9

tail9:                                            ; preds = %tail9.sink.split, %tail6
  %bounced.3 = phi i64 [ %bounced.1, %tail6 ], [ 1, %tail9.sink.split ]
  ret i64 %bounced.3
}

; Function Attrs: nounwind
define private i64 @_run4(i64 %0, i8* nocapture readnone %1) #5 {
entry:
  %2 = alloca %Random, align 8
  %3 = alloca %_AnyArray, align 8
  %4 = alloca %Ball, align 8
  %5 = alloca %Ball, align 8
  %6 = alloca %Ball, align 8
  %7 = alloca %Ball, align 8
  %8 = alloca %Ball, align 8
  %9 = alloca %Ball, align 8
  %10 = alloca %Ball, align 8
  %11 = alloca %Ball, align 8
  %12 = alloca %Ball, align 8
  %13 = alloca %Ball, align 8
  %14 = alloca %Ball, align 8
  %15 = alloca %Ball, align 8
  %16 = alloca %Ball, align 8
  %17 = alloca %Ball, align 8
  %18 = alloca %Ball, align 8
  %19 = alloca %Ball, align 8
  %20 = alloca %Ball, align 8
  %21 = alloca %Ball, align 8
  %22 = alloca %Ball, align 8
  %23 = alloca %Ball, align 8
  %24 = alloca %Ball, align 8
  %25 = alloca %Ball, align 8
  %26 = alloca %Ball, align 8
  %27 = alloca %Ball, align 8
  %28 = alloca %Ball, align 8
  %29 = alloca %Ball, align 8
  %30 = alloca %Ball, align 8
  %31 = alloca %Ball, align 8
  %32 = alloca %Ball, align 8
  %33 = alloca %Ball, align 8
  %34 = alloca %Ball, align 8
  %35 = alloca %Ball, align 8
  %36 = alloca %Ball, align 8
  %37 = alloca %Ball, align 8
  %38 = alloca %Ball, align 8
  %39 = alloca %Ball, align 8
  %40 = alloca %Ball, align 8
  %41 = alloca %Ball, align 8
  %42 = alloca %Ball, align 8
  %43 = alloca %Ball, align 8
  %44 = alloca %Ball, align 8
  %45 = alloca %Ball, align 8
  %46 = alloca %Ball, align 8
  %47 = alloca %Ball, align 8
  %48 = alloca %Ball, align 8
  %49 = alloca %Ball, align 8
  %50 = alloca %Ball, align 8
  %51 = alloca %Ball, align 8
  %52 = alloca %Ball, align 8
  %53 = alloca %Ball, align 8
  %54 = alloca %Ball, align 8
  %55 = alloca %Ball, align 8
  %56 = alloca %Ball, align 8
  %57 = alloca %Ball, align 8
  %58 = alloca %Ball, align 8
  %59 = alloca %Ball, align 8
  %60 = alloca %Ball, align 8
  %61 = alloca %Ball, align 8
  %62 = alloca %Ball, align 8
  %63 = alloca %Ball, align 8
  %64 = alloca %Ball, align 8
  %65 = alloca %Ball, align 8
  %66 = alloca %Ball, align 8
  %67 = alloca %Ball, align 8
  %68 = alloca %Ball, align 8
  %69 = alloca %Ball, align 8
  %70 = alloca %Ball, align 8
  %71 = alloca %Ball, align 8
  %72 = alloca %Ball, align 8
  %73 = alloca %Ball, align 8
  %74 = alloca %Ball, align 8
  %75 = alloca %Ball, align 8
  %76 = alloca %Ball, align 8
  %77 = alloca %Ball, align 8
  %78 = alloca %Ball, align 8
  %79 = alloca %Ball, align 8
  %80 = alloca %Ball, align 8
  %81 = alloca %Ball, align 8
  %82 = alloca %Ball, align 8
  %83 = alloca %Ball, align 8
  %84 = alloca %Ball, align 8
  %85 = alloca %Ball, align 8
  %86 = alloca %Ball, align 8
  %87 = alloca %Ball, align 8
  %88 = alloca %Ball, align 8
  %89 = alloca %Ball, align 8
  %90 = alloca %Ball, align 8
  %91 = alloca %Ball, align 8
  %92 = alloca %Ball, align 8
  %93 = alloca %Ball, align 8
  %94 = alloca %Ball, align 8
  %95 = alloca %Ball, align 8
  %96 = alloca %Ball, align 8
  %97 = alloca %Ball, align 8
  %98 = alloca %Ball, align 8
  %99 = alloca %Ball, align 8
  %100 = alloca %Ball, align 8
  %101 = alloca %Ball, align 8
  %102 = alloca %Ball, align 8
  %103 = alloca %Ball, align 8
  %104 = icmp eq i64 %0, 100
  %105 = zext i1 %104 to i64
  tail call fastcc void @_assert(i64 %105)
  call fastcc void @_randomInit0(%Random* nonnull %2)
  call void @mvs_array_init(%_AnyArray* nonnull %3, %_Metatype* nonnull @Ball.Type, i64 100, i64 32)
  %106 = bitcast %_AnyArray* %3 to %Ball**
  %107 = load %Ball*, %Ball** %106, align 8
  call fastcc void @_randomized2(%Ball* nonnull %4, %Random* nonnull %2)
  %108 = bitcast %Ball* %107 to i8*
  %109 = bitcast %Ball* %4 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %108, i8* nonnull align 8 dereferenceable(32) %109, i64 32, i1 false)
  %110 = getelementptr inbounds %Ball, %Ball* %107, i64 1
  call fastcc void @_randomized2(%Ball* nonnull %5, %Random* nonnull %2)
  %111 = bitcast %Ball* %110 to i8*
  %112 = bitcast %Ball* %5 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %111, i8* nonnull align 8 dereferenceable(32) %112, i64 32, i1 false)
  %113 = getelementptr inbounds %Ball, %Ball* %107, i64 2
  call fastcc void @_randomized2(%Ball* nonnull %6, %Random* nonnull %2)
  %114 = bitcast %Ball* %113 to i8*
  %115 = bitcast %Ball* %6 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %114, i8* nonnull align 8 dereferenceable(32) %115, i64 32, i1 false)
  %116 = getelementptr inbounds %Ball, %Ball* %107, i64 3
  call fastcc void @_randomized2(%Ball* nonnull %7, %Random* nonnull %2)
  %117 = bitcast %Ball* %116 to i8*
  %118 = bitcast %Ball* %7 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %117, i8* nonnull align 8 dereferenceable(32) %118, i64 32, i1 false)
  %119 = getelementptr inbounds %Ball, %Ball* %107, i64 4
  call fastcc void @_randomized2(%Ball* nonnull %8, %Random* nonnull %2)
  %120 = bitcast %Ball* %119 to i8*
  %121 = bitcast %Ball* %8 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %120, i8* nonnull align 8 dereferenceable(32) %121, i64 32, i1 false)
  %122 = getelementptr inbounds %Ball, %Ball* %107, i64 5
  call fastcc void @_randomized2(%Ball* nonnull %9, %Random* nonnull %2)
  %123 = bitcast %Ball* %122 to i8*
  %124 = bitcast %Ball* %9 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %123, i8* nonnull align 8 dereferenceable(32) %124, i64 32, i1 false)
  %125 = getelementptr inbounds %Ball, %Ball* %107, i64 6
  call fastcc void @_randomized2(%Ball* nonnull %10, %Random* nonnull %2)
  %126 = bitcast %Ball* %125 to i8*
  %127 = bitcast %Ball* %10 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %126, i8* nonnull align 8 dereferenceable(32) %127, i64 32, i1 false)
  %128 = getelementptr inbounds %Ball, %Ball* %107, i64 7
  call fastcc void @_randomized2(%Ball* nonnull %11, %Random* nonnull %2)
  %129 = bitcast %Ball* %128 to i8*
  %130 = bitcast %Ball* %11 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %129, i8* nonnull align 8 dereferenceable(32) %130, i64 32, i1 false)
  %131 = getelementptr inbounds %Ball, %Ball* %107, i64 8
  call fastcc void @_randomized2(%Ball* nonnull %12, %Random* nonnull %2)
  %132 = bitcast %Ball* %131 to i8*
  %133 = bitcast %Ball* %12 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %132, i8* nonnull align 8 dereferenceable(32) %133, i64 32, i1 false)
  %134 = getelementptr inbounds %Ball, %Ball* %107, i64 9
  call fastcc void @_randomized2(%Ball* nonnull %13, %Random* nonnull %2)
  %135 = bitcast %Ball* %134 to i8*
  %136 = bitcast %Ball* %13 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %135, i8* nonnull align 8 dereferenceable(32) %136, i64 32, i1 false)
  %137 = getelementptr inbounds %Ball, %Ball* %107, i64 10
  call fastcc void @_randomized2(%Ball* nonnull %14, %Random* nonnull %2)
  %138 = bitcast %Ball* %137 to i8*
  %139 = bitcast %Ball* %14 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %138, i8* nonnull align 8 dereferenceable(32) %139, i64 32, i1 false)
  %140 = getelementptr inbounds %Ball, %Ball* %107, i64 11
  call fastcc void @_randomized2(%Ball* nonnull %15, %Random* nonnull %2)
  %141 = bitcast %Ball* %140 to i8*
  %142 = bitcast %Ball* %15 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %141, i8* nonnull align 8 dereferenceable(32) %142, i64 32, i1 false)
  %143 = getelementptr inbounds %Ball, %Ball* %107, i64 12
  call fastcc void @_randomized2(%Ball* nonnull %16, %Random* nonnull %2)
  %144 = bitcast %Ball* %143 to i8*
  %145 = bitcast %Ball* %16 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %144, i8* nonnull align 8 dereferenceable(32) %145, i64 32, i1 false)
  %146 = getelementptr inbounds %Ball, %Ball* %107, i64 13
  call fastcc void @_randomized2(%Ball* nonnull %17, %Random* nonnull %2)
  %147 = bitcast %Ball* %146 to i8*
  %148 = bitcast %Ball* %17 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %147, i8* nonnull align 8 dereferenceable(32) %148, i64 32, i1 false)
  %149 = getelementptr inbounds %Ball, %Ball* %107, i64 14
  call fastcc void @_randomized2(%Ball* nonnull %18, %Random* nonnull %2)
  %150 = bitcast %Ball* %149 to i8*
  %151 = bitcast %Ball* %18 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %150, i8* nonnull align 8 dereferenceable(32) %151, i64 32, i1 false)
  %152 = getelementptr inbounds %Ball, %Ball* %107, i64 15
  call fastcc void @_randomized2(%Ball* nonnull %19, %Random* nonnull %2)
  %153 = bitcast %Ball* %152 to i8*
  %154 = bitcast %Ball* %19 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %153, i8* nonnull align 8 dereferenceable(32) %154, i64 32, i1 false)
  %155 = getelementptr inbounds %Ball, %Ball* %107, i64 16
  call fastcc void @_randomized2(%Ball* nonnull %20, %Random* nonnull %2)
  %156 = bitcast %Ball* %155 to i8*
  %157 = bitcast %Ball* %20 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %156, i8* nonnull align 8 dereferenceable(32) %157, i64 32, i1 false)
  %158 = getelementptr inbounds %Ball, %Ball* %107, i64 17
  call fastcc void @_randomized2(%Ball* nonnull %21, %Random* nonnull %2)
  %159 = bitcast %Ball* %158 to i8*
  %160 = bitcast %Ball* %21 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %159, i8* nonnull align 8 dereferenceable(32) %160, i64 32, i1 false)
  %161 = getelementptr inbounds %Ball, %Ball* %107, i64 18
  call fastcc void @_randomized2(%Ball* nonnull %22, %Random* nonnull %2)
  %162 = bitcast %Ball* %161 to i8*
  %163 = bitcast %Ball* %22 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %162, i8* nonnull align 8 dereferenceable(32) %163, i64 32, i1 false)
  %164 = getelementptr inbounds %Ball, %Ball* %107, i64 19
  call fastcc void @_randomized2(%Ball* nonnull %23, %Random* nonnull %2)
  %165 = bitcast %Ball* %164 to i8*
  %166 = bitcast %Ball* %23 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %165, i8* nonnull align 8 dereferenceable(32) %166, i64 32, i1 false)
  %167 = getelementptr inbounds %Ball, %Ball* %107, i64 20
  call fastcc void @_randomized2(%Ball* nonnull %24, %Random* nonnull %2)
  %168 = bitcast %Ball* %167 to i8*
  %169 = bitcast %Ball* %24 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %168, i8* nonnull align 8 dereferenceable(32) %169, i64 32, i1 false)
  %170 = getelementptr inbounds %Ball, %Ball* %107, i64 21
  call fastcc void @_randomized2(%Ball* nonnull %25, %Random* nonnull %2)
  %171 = bitcast %Ball* %170 to i8*
  %172 = bitcast %Ball* %25 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %171, i8* nonnull align 8 dereferenceable(32) %172, i64 32, i1 false)
  %173 = getelementptr inbounds %Ball, %Ball* %107, i64 22
  call fastcc void @_randomized2(%Ball* nonnull %26, %Random* nonnull %2)
  %174 = bitcast %Ball* %173 to i8*
  %175 = bitcast %Ball* %26 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %174, i8* nonnull align 8 dereferenceable(32) %175, i64 32, i1 false)
  %176 = getelementptr inbounds %Ball, %Ball* %107, i64 23
  call fastcc void @_randomized2(%Ball* nonnull %27, %Random* nonnull %2)
  %177 = bitcast %Ball* %176 to i8*
  %178 = bitcast %Ball* %27 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %177, i8* nonnull align 8 dereferenceable(32) %178, i64 32, i1 false)
  %179 = getelementptr inbounds %Ball, %Ball* %107, i64 24
  call fastcc void @_randomized2(%Ball* nonnull %28, %Random* nonnull %2)
  %180 = bitcast %Ball* %179 to i8*
  %181 = bitcast %Ball* %28 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %180, i8* nonnull align 8 dereferenceable(32) %181, i64 32, i1 false)
  %182 = getelementptr inbounds %Ball, %Ball* %107, i64 25
  call fastcc void @_randomized2(%Ball* nonnull %29, %Random* nonnull %2)
  %183 = bitcast %Ball* %182 to i8*
  %184 = bitcast %Ball* %29 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %183, i8* nonnull align 8 dereferenceable(32) %184, i64 32, i1 false)
  %185 = getelementptr inbounds %Ball, %Ball* %107, i64 26
  call fastcc void @_randomized2(%Ball* nonnull %30, %Random* nonnull %2)
  %186 = bitcast %Ball* %185 to i8*
  %187 = bitcast %Ball* %30 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %186, i8* nonnull align 8 dereferenceable(32) %187, i64 32, i1 false)
  %188 = getelementptr inbounds %Ball, %Ball* %107, i64 27
  call fastcc void @_randomized2(%Ball* nonnull %31, %Random* nonnull %2)
  %189 = bitcast %Ball* %188 to i8*
  %190 = bitcast %Ball* %31 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %189, i8* nonnull align 8 dereferenceable(32) %190, i64 32, i1 false)
  %191 = getelementptr inbounds %Ball, %Ball* %107, i64 28
  call fastcc void @_randomized2(%Ball* nonnull %32, %Random* nonnull %2)
  %192 = bitcast %Ball* %191 to i8*
  %193 = bitcast %Ball* %32 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %192, i8* nonnull align 8 dereferenceable(32) %193, i64 32, i1 false)
  %194 = getelementptr inbounds %Ball, %Ball* %107, i64 29
  call fastcc void @_randomized2(%Ball* nonnull %33, %Random* nonnull %2)
  %195 = bitcast %Ball* %194 to i8*
  %196 = bitcast %Ball* %33 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %195, i8* nonnull align 8 dereferenceable(32) %196, i64 32, i1 false)
  %197 = getelementptr inbounds %Ball, %Ball* %107, i64 30
  call fastcc void @_randomized2(%Ball* nonnull %34, %Random* nonnull %2)
  %198 = bitcast %Ball* %197 to i8*
  %199 = bitcast %Ball* %34 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %198, i8* nonnull align 8 dereferenceable(32) %199, i64 32, i1 false)
  %200 = getelementptr inbounds %Ball, %Ball* %107, i64 31
  call fastcc void @_randomized2(%Ball* nonnull %35, %Random* nonnull %2)
  %201 = bitcast %Ball* %200 to i8*
  %202 = bitcast %Ball* %35 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %201, i8* nonnull align 8 dereferenceable(32) %202, i64 32, i1 false)
  %203 = getelementptr inbounds %Ball, %Ball* %107, i64 32
  call fastcc void @_randomized2(%Ball* nonnull %36, %Random* nonnull %2)
  %204 = bitcast %Ball* %203 to i8*
  %205 = bitcast %Ball* %36 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %204, i8* nonnull align 8 dereferenceable(32) %205, i64 32, i1 false)
  %206 = getelementptr inbounds %Ball, %Ball* %107, i64 33
  call fastcc void @_randomized2(%Ball* nonnull %37, %Random* nonnull %2)
  %207 = bitcast %Ball* %206 to i8*
  %208 = bitcast %Ball* %37 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %207, i8* nonnull align 8 dereferenceable(32) %208, i64 32, i1 false)
  %209 = getelementptr inbounds %Ball, %Ball* %107, i64 34
  call fastcc void @_randomized2(%Ball* nonnull %38, %Random* nonnull %2)
  %210 = bitcast %Ball* %209 to i8*
  %211 = bitcast %Ball* %38 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %210, i8* nonnull align 8 dereferenceable(32) %211, i64 32, i1 false)
  %212 = getelementptr inbounds %Ball, %Ball* %107, i64 35
  call fastcc void @_randomized2(%Ball* nonnull %39, %Random* nonnull %2)
  %213 = bitcast %Ball* %212 to i8*
  %214 = bitcast %Ball* %39 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %213, i8* nonnull align 8 dereferenceable(32) %214, i64 32, i1 false)
  %215 = getelementptr inbounds %Ball, %Ball* %107, i64 36
  call fastcc void @_randomized2(%Ball* nonnull %40, %Random* nonnull %2)
  %216 = bitcast %Ball* %215 to i8*
  %217 = bitcast %Ball* %40 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %216, i8* nonnull align 8 dereferenceable(32) %217, i64 32, i1 false)
  %218 = getelementptr inbounds %Ball, %Ball* %107, i64 37
  call fastcc void @_randomized2(%Ball* nonnull %41, %Random* nonnull %2)
  %219 = bitcast %Ball* %218 to i8*
  %220 = bitcast %Ball* %41 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %219, i8* nonnull align 8 dereferenceable(32) %220, i64 32, i1 false)
  %221 = getelementptr inbounds %Ball, %Ball* %107, i64 38
  call fastcc void @_randomized2(%Ball* nonnull %42, %Random* nonnull %2)
  %222 = bitcast %Ball* %221 to i8*
  %223 = bitcast %Ball* %42 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %222, i8* nonnull align 8 dereferenceable(32) %223, i64 32, i1 false)
  %224 = getelementptr inbounds %Ball, %Ball* %107, i64 39
  call fastcc void @_randomized2(%Ball* nonnull %43, %Random* nonnull %2)
  %225 = bitcast %Ball* %224 to i8*
  %226 = bitcast %Ball* %43 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %225, i8* nonnull align 8 dereferenceable(32) %226, i64 32, i1 false)
  %227 = getelementptr inbounds %Ball, %Ball* %107, i64 40
  call fastcc void @_randomized2(%Ball* nonnull %44, %Random* nonnull %2)
  %228 = bitcast %Ball* %227 to i8*
  %229 = bitcast %Ball* %44 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %228, i8* nonnull align 8 dereferenceable(32) %229, i64 32, i1 false)
  %230 = getelementptr inbounds %Ball, %Ball* %107, i64 41
  call fastcc void @_randomized2(%Ball* nonnull %45, %Random* nonnull %2)
  %231 = bitcast %Ball* %230 to i8*
  %232 = bitcast %Ball* %45 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %231, i8* nonnull align 8 dereferenceable(32) %232, i64 32, i1 false)
  %233 = getelementptr inbounds %Ball, %Ball* %107, i64 42
  call fastcc void @_randomized2(%Ball* nonnull %46, %Random* nonnull %2)
  %234 = bitcast %Ball* %233 to i8*
  %235 = bitcast %Ball* %46 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %234, i8* nonnull align 8 dereferenceable(32) %235, i64 32, i1 false)
  %236 = getelementptr inbounds %Ball, %Ball* %107, i64 43
  call fastcc void @_randomized2(%Ball* nonnull %47, %Random* nonnull %2)
  %237 = bitcast %Ball* %236 to i8*
  %238 = bitcast %Ball* %47 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %237, i8* nonnull align 8 dereferenceable(32) %238, i64 32, i1 false)
  %239 = getelementptr inbounds %Ball, %Ball* %107, i64 44
  call fastcc void @_randomized2(%Ball* nonnull %48, %Random* nonnull %2)
  %240 = bitcast %Ball* %239 to i8*
  %241 = bitcast %Ball* %48 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %240, i8* nonnull align 8 dereferenceable(32) %241, i64 32, i1 false)
  %242 = getelementptr inbounds %Ball, %Ball* %107, i64 45
  call fastcc void @_randomized2(%Ball* nonnull %49, %Random* nonnull %2)
  %243 = bitcast %Ball* %242 to i8*
  %244 = bitcast %Ball* %49 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %243, i8* nonnull align 8 dereferenceable(32) %244, i64 32, i1 false)
  %245 = getelementptr inbounds %Ball, %Ball* %107, i64 46
  call fastcc void @_randomized2(%Ball* nonnull %50, %Random* nonnull %2)
  %246 = bitcast %Ball* %245 to i8*
  %247 = bitcast %Ball* %50 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %246, i8* nonnull align 8 dereferenceable(32) %247, i64 32, i1 false)
  %248 = getelementptr inbounds %Ball, %Ball* %107, i64 47
  call fastcc void @_randomized2(%Ball* nonnull %51, %Random* nonnull %2)
  %249 = bitcast %Ball* %248 to i8*
  %250 = bitcast %Ball* %51 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %249, i8* nonnull align 8 dereferenceable(32) %250, i64 32, i1 false)
  %251 = getelementptr inbounds %Ball, %Ball* %107, i64 48
  call fastcc void @_randomized2(%Ball* nonnull %52, %Random* nonnull %2)
  %252 = bitcast %Ball* %251 to i8*
  %253 = bitcast %Ball* %52 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %252, i8* nonnull align 8 dereferenceable(32) %253, i64 32, i1 false)
  %254 = getelementptr inbounds %Ball, %Ball* %107, i64 49
  call fastcc void @_randomized2(%Ball* nonnull %53, %Random* nonnull %2)
  %255 = bitcast %Ball* %254 to i8*
  %256 = bitcast %Ball* %53 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %255, i8* nonnull align 8 dereferenceable(32) %256, i64 32, i1 false)
  %257 = getelementptr inbounds %Ball, %Ball* %107, i64 50
  call fastcc void @_randomized2(%Ball* nonnull %54, %Random* nonnull %2)
  %258 = bitcast %Ball* %257 to i8*
  %259 = bitcast %Ball* %54 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %258, i8* nonnull align 8 dereferenceable(32) %259, i64 32, i1 false)
  %260 = getelementptr inbounds %Ball, %Ball* %107, i64 51
  call fastcc void @_randomized2(%Ball* nonnull %55, %Random* nonnull %2)
  %261 = bitcast %Ball* %260 to i8*
  %262 = bitcast %Ball* %55 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %261, i8* nonnull align 8 dereferenceable(32) %262, i64 32, i1 false)
  %263 = getelementptr inbounds %Ball, %Ball* %107, i64 52
  call fastcc void @_randomized2(%Ball* nonnull %56, %Random* nonnull %2)
  %264 = bitcast %Ball* %263 to i8*
  %265 = bitcast %Ball* %56 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %264, i8* nonnull align 8 dereferenceable(32) %265, i64 32, i1 false)
  %266 = getelementptr inbounds %Ball, %Ball* %107, i64 53
  call fastcc void @_randomized2(%Ball* nonnull %57, %Random* nonnull %2)
  %267 = bitcast %Ball* %266 to i8*
  %268 = bitcast %Ball* %57 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %267, i8* nonnull align 8 dereferenceable(32) %268, i64 32, i1 false)
  %269 = getelementptr inbounds %Ball, %Ball* %107, i64 54
  call fastcc void @_randomized2(%Ball* nonnull %58, %Random* nonnull %2)
  %270 = bitcast %Ball* %269 to i8*
  %271 = bitcast %Ball* %58 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %270, i8* nonnull align 8 dereferenceable(32) %271, i64 32, i1 false)
  %272 = getelementptr inbounds %Ball, %Ball* %107, i64 55
  call fastcc void @_randomized2(%Ball* nonnull %59, %Random* nonnull %2)
  %273 = bitcast %Ball* %272 to i8*
  %274 = bitcast %Ball* %59 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %273, i8* nonnull align 8 dereferenceable(32) %274, i64 32, i1 false)
  %275 = getelementptr inbounds %Ball, %Ball* %107, i64 56
  call fastcc void @_randomized2(%Ball* nonnull %60, %Random* nonnull %2)
  %276 = bitcast %Ball* %275 to i8*
  %277 = bitcast %Ball* %60 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %276, i8* nonnull align 8 dereferenceable(32) %277, i64 32, i1 false)
  %278 = getelementptr inbounds %Ball, %Ball* %107, i64 57
  call fastcc void @_randomized2(%Ball* nonnull %61, %Random* nonnull %2)
  %279 = bitcast %Ball* %278 to i8*
  %280 = bitcast %Ball* %61 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %279, i8* nonnull align 8 dereferenceable(32) %280, i64 32, i1 false)
  %281 = getelementptr inbounds %Ball, %Ball* %107, i64 58
  call fastcc void @_randomized2(%Ball* nonnull %62, %Random* nonnull %2)
  %282 = bitcast %Ball* %281 to i8*
  %283 = bitcast %Ball* %62 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %282, i8* nonnull align 8 dereferenceable(32) %283, i64 32, i1 false)
  %284 = getelementptr inbounds %Ball, %Ball* %107, i64 59
  call fastcc void @_randomized2(%Ball* nonnull %63, %Random* nonnull %2)
  %285 = bitcast %Ball* %284 to i8*
  %286 = bitcast %Ball* %63 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %285, i8* nonnull align 8 dereferenceable(32) %286, i64 32, i1 false)
  %287 = getelementptr inbounds %Ball, %Ball* %107, i64 60
  call fastcc void @_randomized2(%Ball* nonnull %64, %Random* nonnull %2)
  %288 = bitcast %Ball* %287 to i8*
  %289 = bitcast %Ball* %64 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %288, i8* nonnull align 8 dereferenceable(32) %289, i64 32, i1 false)
  %290 = getelementptr inbounds %Ball, %Ball* %107, i64 61
  call fastcc void @_randomized2(%Ball* nonnull %65, %Random* nonnull %2)
  %291 = bitcast %Ball* %290 to i8*
  %292 = bitcast %Ball* %65 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %291, i8* nonnull align 8 dereferenceable(32) %292, i64 32, i1 false)
  %293 = getelementptr inbounds %Ball, %Ball* %107, i64 62
  call fastcc void @_randomized2(%Ball* nonnull %66, %Random* nonnull %2)
  %294 = bitcast %Ball* %293 to i8*
  %295 = bitcast %Ball* %66 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %294, i8* nonnull align 8 dereferenceable(32) %295, i64 32, i1 false)
  %296 = getelementptr inbounds %Ball, %Ball* %107, i64 63
  call fastcc void @_randomized2(%Ball* nonnull %67, %Random* nonnull %2)
  %297 = bitcast %Ball* %296 to i8*
  %298 = bitcast %Ball* %67 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %297, i8* nonnull align 8 dereferenceable(32) %298, i64 32, i1 false)
  %299 = getelementptr inbounds %Ball, %Ball* %107, i64 64
  call fastcc void @_randomized2(%Ball* nonnull %68, %Random* nonnull %2)
  %300 = bitcast %Ball* %299 to i8*
  %301 = bitcast %Ball* %68 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %300, i8* nonnull align 8 dereferenceable(32) %301, i64 32, i1 false)
  %302 = getelementptr inbounds %Ball, %Ball* %107, i64 65
  call fastcc void @_randomized2(%Ball* nonnull %69, %Random* nonnull %2)
  %303 = bitcast %Ball* %302 to i8*
  %304 = bitcast %Ball* %69 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %303, i8* nonnull align 8 dereferenceable(32) %304, i64 32, i1 false)
  %305 = getelementptr inbounds %Ball, %Ball* %107, i64 66
  call fastcc void @_randomized2(%Ball* nonnull %70, %Random* nonnull %2)
  %306 = bitcast %Ball* %305 to i8*
  %307 = bitcast %Ball* %70 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %306, i8* nonnull align 8 dereferenceable(32) %307, i64 32, i1 false)
  %308 = getelementptr inbounds %Ball, %Ball* %107, i64 67
  call fastcc void @_randomized2(%Ball* nonnull %71, %Random* nonnull %2)
  %309 = bitcast %Ball* %308 to i8*
  %310 = bitcast %Ball* %71 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %309, i8* nonnull align 8 dereferenceable(32) %310, i64 32, i1 false)
  %311 = getelementptr inbounds %Ball, %Ball* %107, i64 68
  call fastcc void @_randomized2(%Ball* nonnull %72, %Random* nonnull %2)
  %312 = bitcast %Ball* %311 to i8*
  %313 = bitcast %Ball* %72 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %312, i8* nonnull align 8 dereferenceable(32) %313, i64 32, i1 false)
  %314 = getelementptr inbounds %Ball, %Ball* %107, i64 69
  call fastcc void @_randomized2(%Ball* nonnull %73, %Random* nonnull %2)
  %315 = bitcast %Ball* %314 to i8*
  %316 = bitcast %Ball* %73 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %315, i8* nonnull align 8 dereferenceable(32) %316, i64 32, i1 false)
  %317 = getelementptr inbounds %Ball, %Ball* %107, i64 70
  call fastcc void @_randomized2(%Ball* nonnull %74, %Random* nonnull %2)
  %318 = bitcast %Ball* %317 to i8*
  %319 = bitcast %Ball* %74 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %318, i8* nonnull align 8 dereferenceable(32) %319, i64 32, i1 false)
  %320 = getelementptr inbounds %Ball, %Ball* %107, i64 71
  call fastcc void @_randomized2(%Ball* nonnull %75, %Random* nonnull %2)
  %321 = bitcast %Ball* %320 to i8*
  %322 = bitcast %Ball* %75 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %321, i8* nonnull align 8 dereferenceable(32) %322, i64 32, i1 false)
  %323 = getelementptr inbounds %Ball, %Ball* %107, i64 72
  call fastcc void @_randomized2(%Ball* nonnull %76, %Random* nonnull %2)
  %324 = bitcast %Ball* %323 to i8*
  %325 = bitcast %Ball* %76 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %324, i8* nonnull align 8 dereferenceable(32) %325, i64 32, i1 false)
  %326 = getelementptr inbounds %Ball, %Ball* %107, i64 73
  call fastcc void @_randomized2(%Ball* nonnull %77, %Random* nonnull %2)
  %327 = bitcast %Ball* %326 to i8*
  %328 = bitcast %Ball* %77 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %327, i8* nonnull align 8 dereferenceable(32) %328, i64 32, i1 false)
  %329 = getelementptr inbounds %Ball, %Ball* %107, i64 74
  call fastcc void @_randomized2(%Ball* nonnull %78, %Random* nonnull %2)
  %330 = bitcast %Ball* %329 to i8*
  %331 = bitcast %Ball* %78 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %330, i8* nonnull align 8 dereferenceable(32) %331, i64 32, i1 false)
  %332 = getelementptr inbounds %Ball, %Ball* %107, i64 75
  call fastcc void @_randomized2(%Ball* nonnull %79, %Random* nonnull %2)
  %333 = bitcast %Ball* %332 to i8*
  %334 = bitcast %Ball* %79 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %333, i8* nonnull align 8 dereferenceable(32) %334, i64 32, i1 false)
  %335 = getelementptr inbounds %Ball, %Ball* %107, i64 76
  call fastcc void @_randomized2(%Ball* nonnull %80, %Random* nonnull %2)
  %336 = bitcast %Ball* %335 to i8*
  %337 = bitcast %Ball* %80 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %336, i8* nonnull align 8 dereferenceable(32) %337, i64 32, i1 false)
  %338 = getelementptr inbounds %Ball, %Ball* %107, i64 77
  call fastcc void @_randomized2(%Ball* nonnull %81, %Random* nonnull %2)
  %339 = bitcast %Ball* %338 to i8*
  %340 = bitcast %Ball* %81 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %339, i8* nonnull align 8 dereferenceable(32) %340, i64 32, i1 false)
  %341 = getelementptr inbounds %Ball, %Ball* %107, i64 78
  call fastcc void @_randomized2(%Ball* nonnull %82, %Random* nonnull %2)
  %342 = bitcast %Ball* %341 to i8*
  %343 = bitcast %Ball* %82 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %342, i8* nonnull align 8 dereferenceable(32) %343, i64 32, i1 false)
  %344 = getelementptr inbounds %Ball, %Ball* %107, i64 79
  call fastcc void @_randomized2(%Ball* nonnull %83, %Random* nonnull %2)
  %345 = bitcast %Ball* %344 to i8*
  %346 = bitcast %Ball* %83 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %345, i8* nonnull align 8 dereferenceable(32) %346, i64 32, i1 false)
  %347 = getelementptr inbounds %Ball, %Ball* %107, i64 80
  call fastcc void @_randomized2(%Ball* nonnull %84, %Random* nonnull %2)
  %348 = bitcast %Ball* %347 to i8*
  %349 = bitcast %Ball* %84 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %348, i8* nonnull align 8 dereferenceable(32) %349, i64 32, i1 false)
  %350 = getelementptr inbounds %Ball, %Ball* %107, i64 81
  call fastcc void @_randomized2(%Ball* nonnull %85, %Random* nonnull %2)
  %351 = bitcast %Ball* %350 to i8*
  %352 = bitcast %Ball* %85 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %351, i8* nonnull align 8 dereferenceable(32) %352, i64 32, i1 false)
  %353 = getelementptr inbounds %Ball, %Ball* %107, i64 82
  call fastcc void @_randomized2(%Ball* nonnull %86, %Random* nonnull %2)
  %354 = bitcast %Ball* %353 to i8*
  %355 = bitcast %Ball* %86 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %354, i8* nonnull align 8 dereferenceable(32) %355, i64 32, i1 false)
  %356 = getelementptr inbounds %Ball, %Ball* %107, i64 83
  call fastcc void @_randomized2(%Ball* nonnull %87, %Random* nonnull %2)
  %357 = bitcast %Ball* %356 to i8*
  %358 = bitcast %Ball* %87 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %357, i8* nonnull align 8 dereferenceable(32) %358, i64 32, i1 false)
  %359 = getelementptr inbounds %Ball, %Ball* %107, i64 84
  call fastcc void @_randomized2(%Ball* nonnull %88, %Random* nonnull %2)
  %360 = bitcast %Ball* %359 to i8*
  %361 = bitcast %Ball* %88 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %360, i8* nonnull align 8 dereferenceable(32) %361, i64 32, i1 false)
  %362 = getelementptr inbounds %Ball, %Ball* %107, i64 85
  call fastcc void @_randomized2(%Ball* nonnull %89, %Random* nonnull %2)
  %363 = bitcast %Ball* %362 to i8*
  %364 = bitcast %Ball* %89 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %363, i8* nonnull align 8 dereferenceable(32) %364, i64 32, i1 false)
  %365 = getelementptr inbounds %Ball, %Ball* %107, i64 86
  call fastcc void @_randomized2(%Ball* nonnull %90, %Random* nonnull %2)
  %366 = bitcast %Ball* %365 to i8*
  %367 = bitcast %Ball* %90 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %366, i8* nonnull align 8 dereferenceable(32) %367, i64 32, i1 false)
  %368 = getelementptr inbounds %Ball, %Ball* %107, i64 87
  call fastcc void @_randomized2(%Ball* nonnull %91, %Random* nonnull %2)
  %369 = bitcast %Ball* %368 to i8*
  %370 = bitcast %Ball* %91 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %369, i8* nonnull align 8 dereferenceable(32) %370, i64 32, i1 false)
  %371 = getelementptr inbounds %Ball, %Ball* %107, i64 88
  call fastcc void @_randomized2(%Ball* nonnull %92, %Random* nonnull %2)
  %372 = bitcast %Ball* %371 to i8*
  %373 = bitcast %Ball* %92 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %372, i8* nonnull align 8 dereferenceable(32) %373, i64 32, i1 false)
  %374 = getelementptr inbounds %Ball, %Ball* %107, i64 89
  call fastcc void @_randomized2(%Ball* nonnull %93, %Random* nonnull %2)
  %375 = bitcast %Ball* %374 to i8*
  %376 = bitcast %Ball* %93 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %375, i8* nonnull align 8 dereferenceable(32) %376, i64 32, i1 false)
  %377 = getelementptr inbounds %Ball, %Ball* %107, i64 90
  call fastcc void @_randomized2(%Ball* nonnull %94, %Random* nonnull %2)
  %378 = bitcast %Ball* %377 to i8*
  %379 = bitcast %Ball* %94 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %378, i8* nonnull align 8 dereferenceable(32) %379, i64 32, i1 false)
  %380 = getelementptr inbounds %Ball, %Ball* %107, i64 91
  call fastcc void @_randomized2(%Ball* nonnull %95, %Random* nonnull %2)
  %381 = bitcast %Ball* %380 to i8*
  %382 = bitcast %Ball* %95 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %381, i8* nonnull align 8 dereferenceable(32) %382, i64 32, i1 false)
  %383 = getelementptr inbounds %Ball, %Ball* %107, i64 92
  call fastcc void @_randomized2(%Ball* nonnull %96, %Random* nonnull %2)
  %384 = bitcast %Ball* %383 to i8*
  %385 = bitcast %Ball* %96 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %384, i8* nonnull align 8 dereferenceable(32) %385, i64 32, i1 false)
  %386 = getelementptr inbounds %Ball, %Ball* %107, i64 93
  call fastcc void @_randomized2(%Ball* nonnull %97, %Random* nonnull %2)
  %387 = bitcast %Ball* %386 to i8*
  %388 = bitcast %Ball* %97 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %387, i8* nonnull align 8 dereferenceable(32) %388, i64 32, i1 false)
  %389 = getelementptr inbounds %Ball, %Ball* %107, i64 94
  call fastcc void @_randomized2(%Ball* nonnull %98, %Random* nonnull %2)
  %390 = bitcast %Ball* %389 to i8*
  %391 = bitcast %Ball* %98 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %390, i8* nonnull align 8 dereferenceable(32) %391, i64 32, i1 false)
  %392 = getelementptr inbounds %Ball, %Ball* %107, i64 95
  call fastcc void @_randomized2(%Ball* nonnull %99, %Random* nonnull %2)
  %393 = bitcast %Ball* %392 to i8*
  %394 = bitcast %Ball* %99 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %393, i8* nonnull align 8 dereferenceable(32) %394, i64 32, i1 false)
  %395 = getelementptr inbounds %Ball, %Ball* %107, i64 96
  call fastcc void @_randomized2(%Ball* nonnull %100, %Random* nonnull %2)
  %396 = bitcast %Ball* %395 to i8*
  %397 = bitcast %Ball* %100 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %396, i8* nonnull align 8 dereferenceable(32) %397, i64 32, i1 false)
  %398 = getelementptr inbounds %Ball, %Ball* %107, i64 97
  call fastcc void @_randomized2(%Ball* nonnull %101, %Random* nonnull %2)
  %399 = bitcast %Ball* %398 to i8*
  %400 = bitcast %Ball* %101 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %399, i8* nonnull align 8 dereferenceable(32) %400, i64 32, i1 false)
  %401 = getelementptr inbounds %Ball, %Ball* %107, i64 98
  call fastcc void @_randomized2(%Ball* nonnull %102, %Random* nonnull %2)
  %402 = bitcast %Ball* %401 to i8*
  %403 = bitcast %Ball* %102 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %402, i8* nonnull align 8 dereferenceable(32) %403, i64 32, i1 false)
  %404 = getelementptr inbounds %Ball, %Ball* %107, i64 99
  call fastcc void @_randomized2(%Ball* nonnull %103, %Random* nonnull %2)
  %405 = bitcast %Ball* %404 to i8*
  %406 = bitcast %Ball* %103 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(32) %405, i8* nonnull align 8 dereferenceable(32) %406, i64 32, i1 false)
  br label %head

head:                                             ; preds = %tail3, %entry
  %i.0 = phi i64 [ 0, %entry ], [ %414, %tail3 ]
  %bounces.0 = phi i64 [ 0, %entry ], [ %bounces.1, %tail3 ]
  %407 = icmp ult i64 %i.0, 50
  br i1 %407, label %head1, label %tail

tail:                                             ; preds = %head
  call void @mvs_array_drop(%_AnyArray* nonnull %3, %_Metatype* nonnull @Ball.Type)
  ret i64 %bounces.0

head1:                                            ; preds = %head, %body2
  %bounces.1 = phi i64 [ %bounces.2, %body2 ], [ %bounces.0, %head ]
  %j.0 = phi i64 [ %413, %body2 ], [ 0, %head ]
  %408 = icmp slt i64 %j.0, %0
  br i1 %408, label %body2, label %tail3

body2:                                            ; preds = %head1
  call void @mvs_array_uniq(%_AnyArray* nonnull %3, %_Metatype* nonnull @Ball.Type)
  %409 = load %Ball*, %Ball** %106, align 8
  %410 = getelementptr inbounds %Ball, %Ball* %409, i64 %j.0
  %411 = tail call fastcc i64 @_bounce3(%Ball* %410)
  %412 = and i64 %411, 1
  %bounces.2 = add i64 %412, %bounces.1
  %413 = add nuw nsw i64 %j.0, 1
  br label %head1

tail3:                                            ; preds = %head1
  %414 = add nuw nsw i64 %i.0, 1
  br label %head
}

; Function Attrs: nounwind
declare void @mvs_array_init(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1, i64 %2, i64 %3) local_unnamed_addr #5

; Function Attrs: nounwind
declare void @mvs_array_uniq(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #5

; Function Attrs: nounwind
declare void @mvs_array_drop(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #5

; Function Attrs: nounwind
define private fastcc void @_noinline_verify5(%_AnyArray* nocapture readonly %0, i64 %1, i64 %2) unnamed_addr #5 {
entry:
  %3 = bitcast %_AnyArray* %0 to i64**
  br label %head

head:                                             ; preds = %body, %entry
  %i.0 = phi i64 [ 0, %entry ], [ %10, %body ]
  %4 = icmp slt i64 %i.0, %1
  br i1 %4, label %body, label %tail

body:                                             ; preds = %head
  %5 = load i64*, i64** %3, align 8
  %6 = getelementptr inbounds i64, i64* %5, i64 %i.0
  %7 = load i64, i64* %6, align 4
  %8 = icmp eq i64 %7, %2
  %9 = zext i1 %8 to i64
  tail call fastcc void @_assert(i64 %9)
  %10 = add nuw nsw i64 %i.0, 1
  br label %head

tail:                                             ; preds = %head
  ret void
}

define private fastcc void @_noinline_dump6(%_AnyArray* nocapture readonly %0, i64 %1) unnamed_addr {
entry:
  %2 = bitcast %_AnyArray* %0 to i64**
  br label %head

head:                                             ; preds = %body, %entry
  %i.0 = phi i64 [ 0, %entry ], [ %7, %body ]
  %3 = icmp slt i64 %i.0, %1
  br i1 %3, label %body, label %tail

body:                                             ; preds = %head
  %4 = load i64*, i64** %2, align 8
  %5 = getelementptr inbounds i64, i64* %4, i64 %i.0
  %6 = load i64, i64* %5, align 4
  tail call fastcc void @_printint(i64 %6)
  %7 = add nuw nsw i64 %i.0, 1
  br label %head

tail:                                             ; preds = %head
  ret void
}

define private fastcc void @_main7(%_AnyClosure* %0) unnamed_addr {
entry:
  %1 = alloca %_AnyArray, align 8
  %2 = alloca %_AnyArray, align 8
  %3 = alloca %_AnyClosure, align 8
  %4 = alloca %_AnyArray, align 8
  %5 = alloca %_AnyArray, align 8
  %6 = tail call fastcc i64 @_iarg(i64 1)
  %7 = tail call fastcc i64 @_iarg(i64 2)
  %8 = tail call fastcc i64 @_iarg(i64 3)
  %9 = icmp eq i64 %6, 1000
  %10 = zext i1 %9 to i64
  tail call fastcc void @_assert(i64 %10)
  call void @mvs_array_init(%_AnyArray* nonnull %1, %_Metatype* nonnull @_Int.Type, i64 1000, i64 8)
  %11 = bitcast %_AnyArray* %1 to i64**
  %12 = getelementptr inbounds %_AnyArray, %_AnyArray* %1, i64 0, i32 0
  %13 = load i8*, i8** %12, align 8
  call void @llvm.memset.p0i8.i64(i8* nonnull align 4 dereferenceable(8000) %13, i8 0, i64 8000, i1 false)
  call void @mvs_array_init(%_AnyArray* nonnull %2, %_Metatype* nonnull @_Int.Type, i64 1000, i64 8)
  %14 = bitcast %_AnyArray* %2 to i64**
  %15 = getelementptr inbounds %_AnyArray, %_AnyArray* %2, i64 0, i32 0
  %16 = load i8*, i8** %15, align 8
  %17 = bitcast %_AnyClosure* %3 to i8*
  %18 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %0, i64 0, i32 2
  %19 = bitcast %_AnyClosure* %3 to i64 (i64, i8*)**
  %20 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %3, i64 0, i32 1
  call void @llvm.memset.p0i8.i64(i8* nonnull align 4 dereferenceable(8000) %16, i8 0, i64 8000, i1 false)
  br label %head

head:                                             ; preds = %body, %entry
  %i.0 = phi i64 [ 0, %entry ], [ %33, %body ]
  %21 = icmp slt i64 %i.0, %6
  br i1 %21, label %body, label %tail

body:                                             ; preds = %head
  %22 = call fastcc i64 @_uptime()
  call void @llvm.memset.p0i8.i64(i8* nonnull align 8 dereferenceable(40) %17, i8 0, i64 40, i1 false)
  %23 = load void (%_AnyClosure*, %_AnyClosure*)*, void (%_AnyClosure*, %_AnyClosure*)** %18, align 8
  call void %23(%_AnyClosure* nonnull %3, %_AnyClosure* %0)
  %24 = load i64 (i64, i8*)*, i64 (i64, i8*)** %19, align 8
  %25 = load i8*, i8** %20, align 8
  %26 = call i64 %24(i64 %7, i8* %25)
  %27 = call fastcc i64 @_uptime()
  call void @mvs_array_uniq(%_AnyArray* nonnull %2, %_Metatype* nonnull @_Int.Type)
  %28 = load i64*, i64** %14, align 8
  %29 = getelementptr inbounds i64, i64* %28, i64 %i.0
  store i64 %26, i64* %29, align 4
  call void @mvs_array_uniq(%_AnyArray* nonnull %1, %_Metatype* nonnull @_Int.Type)
  %30 = load i64*, i64** %11, align 8
  %31 = getelementptr inbounds i64, i64* %30, i64 %i.0
  %32 = sub i64 %27, %22
  store i64 %32, i64* %31, align 4
  %33 = add nuw nsw i64 %i.0, 1
  br label %head

tail:                                             ; preds = %head
  %34 = bitcast %_AnyArray* %4 to i64*
  store i64 0, i64* %34, align 8
  call void @mvs_array_copy(%_AnyArray* nonnull %4, %_AnyArray* nonnull %2)
  call fastcc void @_noinline_verify5(%_AnyArray* nonnull %4, i64 %6, i64 %8)
  call void @mvs_array_drop(%_AnyArray* nonnull %4, %_Metatype* nonnull @_Int.Type)
  %35 = bitcast %_AnyArray* %5 to i64*
  store i64 0, i64* %35, align 8
  call void @mvs_array_copy(%_AnyArray* nonnull %5, %_AnyArray* nonnull %1)
  call fastcc void @_noinline_dump6(%_AnyArray* nonnull %5, i64 %6)
  call void @mvs_array_drop(%_AnyArray* nonnull %5, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %2, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %1, %_Metatype* nonnull @_Int.Type)
  ret void
}

; Function Attrs: alwaysinline argmemonly norecurse nounwind readonly
define private i64 @_Int.te_equal(i8* nocapture readonly %0, i8* nocapture readonly %1) #11 {
entry:
  %2 = bitcast i8* %0 to i64*
  %3 = load i64, i64* %2, align 4
  %4 = bitcast i8* %1 to i64*
  %5 = load i64, i64* %4, align 4
  %6 = icmp eq i64 %3, %5
  %7 = zext i1 %6 to i64
  ret i64 %7
}

; Function Attrs: nounwind
declare void @mvs_array_copy(%_AnyArray* nocapture %0, %_AnyArray* nocapture readonly %1) local_unnamed_addr #5

define private void @_run4.copy(%_AnyClosure* %0, %_AnyClosure* nocapture readonly %1) {
entry:
  %2 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %0, i64 0, i32 3
  %3 = load void (%_AnyClosure*)*, void (%_AnyClosure*)** %2, align 8
  %4 = icmp eq void (%_AnyClosure*)* %3, null
  br i1 %4, label %then, label %else

else:                                             ; preds = %entry
  tail call void %3(%_AnyClosure* nonnull %0)
  br label %then

then:                                             ; preds = %else, %entry
  %5 = bitcast %_AnyClosure* %0 to i8*
  %6 = bitcast %_AnyClosure* %1 to i8*
  tail call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(40) %5, i8* nonnull align 1 dereferenceable(40) %6, i64 40, i1 false)
  ret void
}

; Function Attrs: norecurse nounwind readnone
define private void @_run4.drop(%_AnyClosure* nocapture %0) #12 {
entry:
  ret void
}

; Function Attrs: norecurse nounwind readonly
define private i64 @_run4.equal(%_AnyClosure* nocapture readonly %0, %_AnyClosure* nocapture readonly %1) #4 {
entry:
  %2 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %0, i64 0, i32 0
  %3 = load i8*, i8** %2, align 8
  %4 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %1, i64 0, i32 0
  %5 = load i8*, i8** %4, align 8
  %6 = icmp eq i8* %3, %5
  %7 = zext i1 %6 to i64
  ret i64 %7
}

attributes #0 = { argmemonly nounwind willreturn }
attributes #1 = { alwaysinline nounwind }
attributes #2 = { alwaysinline argmemonly nounwind }
attributes #3 = { alwaysinline norecurse nounwind readonly }
attributes #4 = { norecurse nounwind readonly }
attributes #5 = { nounwind }
attributes #6 = { alwaysinline }
attributes #7 = { alwaysinline norecurse nounwind readnone }
attributes #8 = { nofree norecurse nounwind writeonly }
attributes #9 = { argmemonly nounwind willreturn writeonly }
attributes #10 = { nofree norecurse nounwind }
attributes #11 = { alwaysinline argmemonly norecurse nounwind readonly }
attributes #12 = { norecurse nounwind readnone }
