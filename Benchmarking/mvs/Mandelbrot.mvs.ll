; ModuleID = 'main'
source_filename = "main"
target triple = "x86_64-pc-linux-gnu"

%_Metatype = type { i64, void (i8*)*, void (i8*)*, void (i8*, i8*)*, i64 (i8*, i8*)* }
%_AnyClosure = type { i8*, i8*, void (%_AnyClosure*, %_AnyClosure*)*, void (%_AnyClosure*)*, i64 (%_AnyClosure*, %_AnyClosure*)* }
%_AnyArray = type { i8* }

@_Int.Type = private global %_Metatype { i64 8, void (i8*)* null, void (i8*)* null, void (i8*, i8*)* null, i64 (i8*, i8*)* @_Int.te_equal }

; Function Attrs: alwaysinline nounwind
define private fastcc i64 @_uptime() unnamed_addr #0 {
entry:
  %0 = tail call i64 @mvs_uptime_nanoseconds()
  ret i64 %0
}

; Function Attrs: nounwind
declare i64 @mvs_uptime_nanoseconds() local_unnamed_addr #1

; Function Attrs: alwaysinline
define private fastcc void @_printint(i64 %0) unnamed_addr #2 {
entry:
  tail call void @mvs_print_i64(i64 %0)
  ret void
}

declare void @mvs_print_i64(i64 %0) local_unnamed_addr

; Function Attrs: alwaysinline norecurse nounwind readnone
define private fastcc i64 @_iand(i64 %0, i64 %1) unnamed_addr #3 {
entry:
  %2 = and i64 %1, %0
  ret i64 %2
}

; Function Attrs: alwaysinline norecurse nounwind readnone
define private fastcc i64 @_xor(i64 %0, i64 %1) unnamed_addr #3 {
entry:
  %2 = xor i64 %1, %0
  ret i64 %2
}

; Function Attrs: alwaysinline norecurse nounwind readnone
define private fastcc i64 @_shl(i64 %0, i64 %1) unnamed_addr #3 {
entry:
  %2 = shl i64 %0, %1
  ret i64 %2
}

; Function Attrs: alwaysinline norecurse nounwind readnone
define private fastcc double @_itof(i64 %0) unnamed_addr #3 {
entry:
  %1 = sitofp i64 %0 to double
  ret double %1
}

; Function Attrs: alwaysinline nounwind
define private fastcc void @_assert(i64 %0) unnamed_addr #0 {
entry:
  %1 = tail call i64 @mvs_assert_i64(i64 %0)
  ret void
}

; Function Attrs: nounwind
declare i64 @mvs_assert_i64(i64 %0) local_unnamed_addr #1

; Function Attrs: alwaysinline nounwind
define private fastcc i64 @_iarg(i64 %0) unnamed_addr #0 {
entry:
  %1 = tail call i64 @mvs_iarg(i64 %0)
  ret i64 %1
}

; Function Attrs: nounwind
declare i64 @mvs_iarg(i64 %0) local_unnamed_addr #1

define i32 @main(i32 %0, i32* %1) local_unnamed_addr {
entry:
  %2 = alloca %_AnyClosure, align 8
  %3 = tail call i64 @mvs_init(i32 %0, i32* %1)
  %4 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 0
  store i8* bitcast (i64 (i64, i8*)* @_run0 to i8*), i8** %4, align 8
  %5 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 1
  store i8* null, i8** %5, align 8
  %6 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 2
  store void (%_AnyClosure*, %_AnyClosure*)* @_run0.copy, void (%_AnyClosure*, %_AnyClosure*)** %6, align 8
  %7 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 3
  store void (%_AnyClosure*)* @_run0.drop, void (%_AnyClosure*)** %7, align 8
  %8 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 4
  store i64 (%_AnyClosure*, %_AnyClosure*)* @_run0.equal, i64 (%_AnyClosure*, %_AnyClosure*)** %8, align 8
  call fastcc void @_main3(%_AnyClosure* nonnull %2)
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
declare i64 @mvs_init(i32 %0, i32* %1) local_unnamed_addr #1

; Function Attrs: norecurse nounwind readnone
define private i64 @_run0(i64 %0, i8* nocapture readnone %1) #4 {
entry:
  %2 = add i64 %0, -1
  br label %head

head:                                             ; preds = %tail3, %entry
  %y.0 = phi i64 [ 0, %entry ], [ %14, %tail3 ]
  %bitNum.0 = phi i64 [ 0, %entry ], [ %bitNum.1, %tail3 ]
  %byteAcc.0 = phi i64 [ 0, %entry ], [ %byteAcc.1, %tail3 ]
  %sum.0 = phi i64 [ 0, %entry ], [ %sum.1, %tail3 ]
  %3 = icmp slt i64 %y.0, %0
  br i1 %3, label %body, label %tail

body:                                             ; preds = %head
  %4 = shl i64 %y.0, 1
  %5 = tail call fastcc double @_itof(i64 %4)
  %6 = tail call fastcc double @_itof(i64 %0)
  %7 = fdiv double %5, %6
  %8 = fadd double %7, -1.000000e+00
  br label %head1

tail:                                             ; preds = %head
  ret i64 %sum.0

head1:                                            ; preds = %tail10, %body
  %x.0 = phi i64 [ 0, %body ], [ %35, %tail10 ]
  %bitNum.1 = phi i64 [ %bitNum.0, %body ], [ %bitNum.2, %tail10 ]
  %byteAcc.1 = phi i64 [ %byteAcc.0, %body ], [ %byteAcc.2, %tail10 ]
  %sum.1 = phi i64 [ %sum.0, %body ], [ %sum.2, %tail10 ]
  %9 = icmp slt i64 %x.0, %0
  br i1 %9, label %body2, label %tail3

body2:                                            ; preds = %head1
  %10 = shl i64 %x.0, 1
  %11 = tail call fastcc double @_itof(i64 %10)
  %12 = fdiv double %11, %6
  %13 = fadd double %12, -1.500000e+00
  br label %head4

tail3:                                            ; preds = %head1
  %14 = add nuw i64 %y.0, 1
  br label %head

head4:                                            ; preds = %body5, %body2
  %escape.0 = phi i64 [ 0, %body2 ], [ %.escape.0, %body5 ]
  %notDone.0 = phi i64 [ 1, %body2 ], [ %.notDone.0, %body5 ]
  %z.0 = phi i64 [ 0, %body2 ], [ %28, %body5 ]
  %zizi.0 = phi double [ 0.000000e+00, %body2 ], [ %25, %body5 ]
  %zi.0 = phi double [ 0.000000e+00, %body2 ], [ %23, %body5 ]
  %zrzr.0 = phi double [ 0.000000e+00, %body2 ], [ %24, %body5 ]
  %15 = icmp slt i64 %z.0, 50
  %16 = zext i1 %15 to i64
  %17 = tail call fastcc i64 @_iand(i64 %notDone.0, i64 %16)
  %18 = and i64 %17, 1
  %.not = icmp eq i64 %18, 0
  br i1 %.not, label %tail6, label %body5

body5:                                            ; preds = %head4
  %19 = fsub double %zrzr.0, %zizi.0
  %20 = fadd double %13, %19
  %21 = fmul double %20, 2.000000e+00
  %22 = fmul double %zi.0, %21
  %23 = fadd double %8, %22
  %24 = fmul double %20, %20
  %25 = fmul double %23, %23
  %26 = fadd double %24, %25
  %27 = fcmp ogt double %26, 4.000000e+00
  %.escape.0 = select i1 %27, i64 1, i64 %escape.0
  %.notDone.0 = select i1 %27, i64 0, i64 %notDone.0
  %28 = add i64 %z.0, 1
  br label %head4

tail6:                                            ; preds = %head4
  %29 = tail call fastcc i64 @_shl(i64 %byteAcc.1, i64 1)
  %30 = add i64 %29, %escape.0
  %31 = add i64 %bitNum.1, 1
  %32 = icmp eq i64 %31, 8
  br i1 %32, label %tail10.sink.split, label %fail9

fail9:                                            ; preds = %tail6
  %33 = icmp eq i64 %x.0, %2
  br i1 %33, label %succ11, label %tail10

tail10.sink.split:                                ; preds = %tail6, %succ11
  %.sink = phi i64 [ %37, %succ11 ], [ %30, %tail6 ]
  %34 = tail call fastcc i64 @_xor(i64 %sum.1, i64 %.sink)
  br label %tail10

tail10:                                           ; preds = %tail10.sink.split, %fail9
  %bitNum.2 = phi i64 [ %31, %fail9 ], [ 0, %tail10.sink.split ]
  %byteAcc.2 = phi i64 [ %30, %fail9 ], [ 0, %tail10.sink.split ]
  %sum.2 = phi i64 [ %sum.1, %fail9 ], [ %34, %tail10.sink.split ]
  %35 = add nuw i64 %x.0, 1
  br label %head1

succ11:                                           ; preds = %fail9
  %36 = sub i64 7, %bitNum.1
  %37 = tail call fastcc i64 @_shl(i64 %30, i64 %36)
  br label %tail10.sink.split
}

; Function Attrs: nounwind
define private fastcc void @_noinline_verify1(%_AnyArray* nocapture readonly %0, i64 %1, i64 %2) unnamed_addr #1 {
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

define private fastcc void @_noinline_dump2(%_AnyArray* nocapture readonly %0, i64 %1) unnamed_addr {
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

define private fastcc void @_main3(%_AnyClosure* %0) unnamed_addr {
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
  call fastcc void @_noinline_verify1(%_AnyArray* nonnull %4, i64 %6, i64 %8)
  call void @mvs_array_drop(%_AnyArray* nonnull %4, %_Metatype* nonnull @_Int.Type)
  %35 = bitcast %_AnyArray* %5 to i64*
  store i64 0, i64* %35, align 8
  call void @mvs_array_copy(%_AnyArray* nonnull %5, %_AnyArray* nonnull %1)
  call fastcc void @_noinline_dump2(%_AnyArray* nonnull %5, i64 %6)
  call void @mvs_array_drop(%_AnyArray* nonnull %5, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %2, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %1, %_Metatype* nonnull @_Int.Type)
  ret void
}

; Function Attrs: nounwind
declare void @mvs_array_init(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1, i64 %2, i64 %3) local_unnamed_addr #1

; Function Attrs: alwaysinline argmemonly norecurse nounwind readonly
define private i64 @_Int.te_equal(i8* nocapture readonly %0, i8* nocapture readonly %1) #5 {
entry:
  %2 = bitcast i8* %0 to i64*
  %3 = load i64, i64* %2, align 4
  %4 = bitcast i8* %1 to i64*
  %5 = load i64, i64* %4, align 4
  %6 = icmp eq i64 %3, %5
  %7 = zext i1 %6 to i64
  ret i64 %7
}

; Function Attrs: argmemonly nounwind willreturn writeonly
declare void @llvm.memset.p0i8.i64(i8* nocapture writeonly %0, i8 %1, i64 %2, i1 immarg %3) #6

; Function Attrs: nounwind
declare void @mvs_array_uniq(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #1

; Function Attrs: nounwind
declare void @mvs_array_copy(%_AnyArray* nocapture %0, %_AnyArray* nocapture readonly %1) local_unnamed_addr #1

; Function Attrs: nounwind
declare void @mvs_array_drop(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #1

define private void @_run0.copy(%_AnyClosure* %0, %_AnyClosure* nocapture readonly %1) {
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

; Function Attrs: argmemonly nounwind willreturn
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly %0, i8* noalias nocapture readonly %1, i64 %2, i1 immarg %3) #7

; Function Attrs: norecurse nounwind readnone
define private void @_run0.drop(%_AnyClosure* nocapture %0) #4 {
entry:
  ret void
}

; Function Attrs: norecurse nounwind readonly
define private i64 @_run0.equal(%_AnyClosure* nocapture readonly %0, %_AnyClosure* nocapture readonly %1) #8 {
entry:
  %2 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %0, i64 0, i32 0
  %3 = load i8*, i8** %2, align 8
  %4 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %1, i64 0, i32 0
  %5 = load i8*, i8** %4, align 8
  %6 = icmp eq i8* %3, %5
  %7 = zext i1 %6 to i64
  ret i64 %7
}

attributes #0 = { alwaysinline nounwind }
attributes #1 = { nounwind }
attributes #2 = { alwaysinline }
attributes #3 = { alwaysinline norecurse nounwind readnone }
attributes #4 = { norecurse nounwind readnone }
attributes #5 = { alwaysinline argmemonly norecurse nounwind readonly }
attributes #6 = { argmemonly nounwind willreturn writeonly }
attributes #7 = { argmemonly nounwind willreturn }
attributes #8 = { norecurse nounwind readonly }
