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
  store i8* bitcast (i64 (i64, i8*)* @_run2 to i8*), i8** %4, align 8
  %5 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 1
  store i8* null, i8** %5, align 8
  %6 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 2
  store void (%_AnyClosure*, %_AnyClosure*)* @_run2.copy, void (%_AnyClosure*, %_AnyClosure*)** %6, align 8
  %7 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 3
  store void (%_AnyClosure*)* @_run2.drop, void (%_AnyClosure*)** %7, align 8
  %8 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 4
  store i64 (%_AnyClosure*, %_AnyClosure*)* @_run2.equal, i64 (%_AnyClosure*, %_AnyClosure*)** %8, align 8
  call fastcc void @_main5(%_AnyClosure* nonnull %2)
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

; Function Attrs: nounwind
define private fastcc void @_swap0(%_AnyArray* nocapture %0, i64 %1, i64 %2) unnamed_addr #1 {
entry:
  %3 = bitcast %_AnyArray* %0 to i64**
  %4 = load i64*, i64** %3, align 8
  %5 = getelementptr inbounds i64, i64* %4, i64 %1
  %6 = load i64, i64* %5, align 4
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @_Int.Type)
  %7 = load i64*, i64** %3, align 8
  %8 = getelementptr inbounds i64, i64* %7, i64 %1
  %9 = getelementptr inbounds i64, i64* %7, i64 %2
  %10 = load i64, i64* %9, align 4
  store i64 %10, i64* %8, align 4
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @_Int.Type)
  %11 = load i64*, i64** %3, align 8
  %12 = getelementptr inbounds i64, i64* %11, i64 %2
  store i64 %6, i64* %12, align 4
  ret void
}

; Function Attrs: nounwind
declare void @mvs_array_uniq(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #1

; Function Attrs: alwaysinline argmemonly norecurse nounwind readonly
define private i64 @_Int.te_equal(i8* nocapture readonly %0, i8* nocapture readonly %1) #3 {
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
define private fastcc void @_permute1(i64* %0, %_AnyArray* %1, i64 %2) unnamed_addr #1 {
entry:
  %3 = load i64, i64* %0, align 4
  %4 = add i64 %3, 1
  store i64 %4, i64* %0, align 4
  %.not = icmp eq i64 %2, 0
  br i1 %.not, label %tail, label %succ

succ:                                             ; preds = %entry
  %5 = add i64 %2, -1
  tail call fastcc void @_permute1(i64* nonnull %0, %_AnyArray* %1, i64 %5)
  br label %head

tail:                                             ; preds = %head, %entry
  ret void

head:                                             ; preds = %body, %succ
  %i.0 = phi i64 [ %5, %succ ], [ %7, %body ]
  %6 = icmp sgt i64 %i.0, -1
  br i1 %6, label %body, label %tail

body:                                             ; preds = %head
  tail call fastcc void @_swap0(%_AnyArray* %1, i64 %5, i64 %i.0)
  tail call fastcc void @_permute1(i64* nonnull %0, %_AnyArray* %1, i64 %5)
  tail call fastcc void @_swap0(%_AnyArray* %1, i64 %5, i64 %i.0)
  %7 = add nsw i64 %i.0, -1
  br label %head
}

; Function Attrs: nounwind
define private i64 @_run2(i64 %0, i8* nocapture readnone %1) #1 {
entry:
  %2 = alloca %_AnyArray, align 8
  %count = alloca i64, align 8
  %3 = icmp eq i64 %0, 6
  %4 = zext i1 %3 to i64
  tail call fastcc void @_assert(i64 %4)
  call void @mvs_array_init(%_AnyArray* nonnull %2, %_Metatype* nonnull @_Int.Type, i64 6, i64 8)
  %5 = getelementptr inbounds %_AnyArray, %_AnyArray* %2, i64 0, i32 0
  %6 = load i8*, i8** %5, align 8
  call void @llvm.memset.p0i8.i64(i8* nonnull align 4 dereferenceable(48) %6, i8 0, i64 48, i1 false)
  store i64 0, i64* %count, align 8
  call fastcc void @_permute1(i64* nonnull %count, %_AnyArray* nonnull %2, i64 %0)
  %7 = load i64, i64* %count, align 8
  call void @mvs_array_drop(%_AnyArray* nonnull %2, %_Metatype* nonnull @_Int.Type)
  ret i64 %7
}

; Function Attrs: nounwind
declare void @mvs_array_init(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1, i64 %2, i64 %3) local_unnamed_addr #1

; Function Attrs: nounwind
declare void @mvs_array_drop(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #1

; Function Attrs: nounwind
define private fastcc void @_noinline_verify3(%_AnyArray* nocapture readonly %0, i64 %1, i64 %2) unnamed_addr #1 {
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

define private fastcc void @_noinline_dump4(%_AnyArray* nocapture readonly %0, i64 %1) unnamed_addr {
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

define private fastcc void @_main5(%_AnyClosure* %0) unnamed_addr {
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
  call fastcc void @_noinline_verify3(%_AnyArray* nonnull %4, i64 %6, i64 %8)
  call void @mvs_array_drop(%_AnyArray* nonnull %4, %_Metatype* nonnull @_Int.Type)
  %35 = bitcast %_AnyArray* %5 to i64*
  store i64 0, i64* %35, align 8
  call void @mvs_array_copy(%_AnyArray* nonnull %5, %_AnyArray* nonnull %1)
  call fastcc void @_noinline_dump4(%_AnyArray* nonnull %5, i64 %6)
  call void @mvs_array_drop(%_AnyArray* nonnull %5, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %2, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %1, %_Metatype* nonnull @_Int.Type)
  ret void
}

; Function Attrs: argmemonly nounwind willreturn writeonly
declare void @llvm.memset.p0i8.i64(i8* nocapture writeonly %0, i8 %1, i64 %2, i1 immarg %3) #4

; Function Attrs: nounwind
declare void @mvs_array_copy(%_AnyArray* nocapture %0, %_AnyArray* nocapture readonly %1) local_unnamed_addr #1

define private void @_run2.copy(%_AnyClosure* %0, %_AnyClosure* nocapture readonly %1) {
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
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly %0, i8* noalias nocapture readonly %1, i64 %2, i1 immarg %3) #5

; Function Attrs: norecurse nounwind readnone
define private void @_run2.drop(%_AnyClosure* nocapture %0) #6 {
entry:
  ret void
}

; Function Attrs: norecurse nounwind readonly
define private i64 @_run2.equal(%_AnyClosure* nocapture readonly %0, %_AnyClosure* nocapture readonly %1) #7 {
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
attributes #3 = { alwaysinline argmemonly norecurse nounwind readonly }
attributes #4 = { argmemonly nounwind willreturn writeonly }
attributes #5 = { argmemonly nounwind willreturn }
attributes #6 = { norecurse nounwind readnone }
attributes #7 = { norecurse nounwind readonly }
