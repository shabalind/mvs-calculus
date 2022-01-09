; ModuleID = 'main'
source_filename = "main"
target triple = "x86_64-pc-linux-gnu"

%_Metatype = type { i64, void (i8*)*, void (i8*)*, void (i8*, i8*)*, i64 (i8*, i8*)* }
%_AnyArray = type { i8* }
%_AnyClosure = type { i8*, i8*, void (%_AnyClosure*, %_AnyClosure*)*, void (%_AnyClosure*)*, i64 (%_AnyClosure*, %_AnyClosure*)* }
%State = type { %_AnyArray, %_AnyArray, %_AnyArray, %_AnyArray }

@_Int.Type = private global %_Metatype { i64 8, void (i8*)* null, void (i8*)* null, void (i8*, i8*)* null, i64 (i8*, i8*)* @_Int.te_equal }

; Function Attrs: argmemonly nounwind willreturn writeonly
declare void @llvm.memset.p0i8.i64(i8* nocapture writeonly %0, i8 %1, i64 %2, i1 immarg %3) #0

; Function Attrs: nounwind
declare void @mvs_array_drop(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #1

; Function Attrs: alwaysinline argmemonly norecurse nounwind readonly
define private i64 @_Int.te_equal(i8* nocapture readonly %0, i8* nocapture readonly %1) #2 {
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
declare void @mvs_array_copy(%_AnyArray* nocapture %0, %_AnyArray* nocapture readonly %1) local_unnamed_addr #1

; Function Attrs: alwaysinline nounwind
define private fastcc i64 @_uptime() unnamed_addr #3 {
entry:
  %0 = tail call i64 @mvs_uptime_nanoseconds()
  ret i64 %0
}

; Function Attrs: nounwind
declare i64 @mvs_uptime_nanoseconds() local_unnamed_addr #1

; Function Attrs: alwaysinline
define private fastcc void @_printint(i64 %0) unnamed_addr #4 {
entry:
  tail call void @mvs_print_i64(i64 %0)
  ret void
}

declare void @mvs_print_i64(i64 %0) local_unnamed_addr

; Function Attrs: alwaysinline norecurse nounwind readnone
define private fastcc i64 @_iand(i64 %0, i64 %1) unnamed_addr #5 {
entry:
  %2 = and i64 %1, %0
  ret i64 %2
}

; Function Attrs: alwaysinline nounwind
define private fastcc void @_assert(i64 %0) unnamed_addr #3 {
entry:
  %1 = tail call i64 @mvs_assert_i64(i64 %0)
  ret void
}

; Function Attrs: nounwind
declare i64 @mvs_assert_i64(i64 %0) local_unnamed_addr #1

; Function Attrs: alwaysinline nounwind
define private fastcc i64 @_iarg(i64 %0) unnamed_addr #3 {
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
  store i8* bitcast (i64 (i64, i8*)* @_run3 to i8*), i8** %4, align 8
  %5 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 1
  store i8* null, i8** %5, align 8
  %6 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 2
  store void (%_AnyClosure*, %_AnyClosure*)* @_run3.copy, void (%_AnyClosure*, %_AnyClosure*)** %6, align 8
  %7 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 3
  store void (%_AnyClosure*)* @_run3.drop, void (%_AnyClosure*)** %7, align 8
  %8 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %2, i64 0, i32 4
  store i64 (%_AnyClosure*, %_AnyClosure*)* @_run3.equal, i64 (%_AnyClosure*, %_AnyClosure*)** %8, align 8
  call fastcc void @_main6(%_AnyClosure* nonnull %2)
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

; Function Attrs: norecurse nounwind readonly
define private fastcc i64 @_getRowColumn0(%State* nocapture readonly %0, i64 %1, i64 %2) unnamed_addr #6 {
entry:
  %3 = bitcast %State* %0 to i64**
  %4 = load i64*, i64** %3, align 8
  %5 = getelementptr inbounds i64, i64* %4, i64 %1
  %6 = load i64, i64* %5, align 4
  %7 = getelementptr inbounds %State, %State* %0, i64 0, i32 1, i32 0
  %8 = bitcast i8** %7 to i64**
  %9 = load i64*, i64** %8, align 8
  %10 = add i64 %2, %1
  %11 = getelementptr inbounds i64, i64* %9, i64 %10
  %12 = load i64, i64* %11, align 4
  %13 = tail call fastcc i64 @_iand(i64 %6, i64 %12)
  %14 = getelementptr inbounds %State, %State* %0, i64 0, i32 2, i32 0
  %15 = bitcast i8** %14 to i64**
  %16 = load i64*, i64** %15, align 8
  %17 = sub i64 7, %1
  %18 = add i64 %17, %2
  %19 = getelementptr inbounds i64, i64* %16, i64 %18
  %20 = load i64, i64* %19, align 4
  %21 = tail call fastcc i64 @_iand(i64 %13, i64 %20)
  ret i64 %21
}

; Function Attrs: nounwind
define private fastcc void @_setRowColumn1(%State* nocapture %0, i64 %1, i64 %2, i64 %3) unnamed_addr #1 {
entry:
  %4 = getelementptr inbounds %State, %State* %0, i64 0, i32 0
  tail call void @mvs_array_uniq(%_AnyArray* %4, %_Metatype* nonnull @_Int.Type)
  %5 = bitcast %State* %0 to i64**
  %6 = load i64*, i64** %5, align 8
  %7 = getelementptr inbounds i64, i64* %6, i64 %1
  store i64 %3, i64* %7, align 4
  %8 = getelementptr inbounds %State, %State* %0, i64 0, i32 1
  tail call void @mvs_array_uniq(%_AnyArray* nonnull %8, %_Metatype* nonnull @_Int.Type)
  %9 = bitcast %_AnyArray* %8 to i64**
  %10 = load i64*, i64** %9, align 8
  %11 = add i64 %2, %1
  %12 = getelementptr inbounds i64, i64* %10, i64 %11
  store i64 %3, i64* %12, align 4
  %13 = getelementptr inbounds %State, %State* %0, i64 0, i32 2
  tail call void @mvs_array_uniq(%_AnyArray* nonnull %13, %_Metatype* nonnull @_Int.Type)
  %14 = bitcast %_AnyArray* %13 to i64**
  %15 = load i64*, i64** %14, align 8
  %16 = sub i64 7, %1
  %17 = add i64 %16, %2
  %18 = getelementptr inbounds i64, i64* %15, i64 %17
  store i64 %3, i64* %18, align 4
  ret void
}

; Function Attrs: nounwind
declare void @mvs_array_uniq(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #1

; Function Attrs: nounwind
define private fastcc i64 @_placeQueen2(%State* nocapture %0, i64 %1) unnamed_addr #1 {
entry:
  %2 = getelementptr inbounds %State, %State* %0, i64 0, i32 3
  %3 = bitcast %_AnyArray* %2 to i64**
  %4 = icmp eq i64 %1, 7
  %5 = add i64 %1, 1
  br label %head

head:                                             ; preds = %tail1, %entry
  %notFinished.0 = phi i64 [ 1, %entry ], [ %notFinished.1, %tail1 ]
  %r.0 = phi i64 [ 0, %entry ], [ %16, %tail1 ]
  %6 = icmp slt i64 %r.0, 8
  %7 = zext i1 %6 to i64
  %8 = tail call fastcc i64 @_iand(i64 %7, i64 %notFinished.0)
  %9 = and i64 %8, 1
  %.not = icmp eq i64 %9, 0
  br i1 %.not, label %tail, label %body

body:                                             ; preds = %head
  %10 = tail call fastcc i64 @_getRowColumn0(%State* %0, i64 %r.0, i64 %1)
  %11 = and i64 %10, 1
  %.not2 = icmp eq i64 %11, 0
  br i1 %.not2, label %tail1, label %succ

tail:                                             ; preds = %head
  %12 = and i64 %notFinished.0, 1
  %13 = xor i64 %12, 1
  ret i64 %13

succ:                                             ; preds = %body
  tail call void @mvs_array_uniq(%_AnyArray* nonnull %2, %_Metatype* nonnull @_Int.Type)
  %14 = load i64*, i64** %3, align 8
  %15 = getelementptr inbounds i64, i64* %14, i64 %r.0
  store i64 %1, i64* %15, align 4
  tail call fastcc void @_setRowColumn1(%State* %0, i64 %r.0, i64 %1, i64 0)
  br i1 %4, label %tail1, label %fail3

tail1:                                            ; preds = %fail6, %fail3, %succ, %body
  %notFinished.1 = phi i64 [ %notFinished.0, %body ], [ 0, %succ ], [ %notFinished.0, %fail6 ], [ 0, %fail3 ]
  %16 = add i64 %r.0, 1
  br label %head

fail3:                                            ; preds = %succ
  %17 = tail call fastcc i64 @_placeQueen2(%State* nonnull %0, i64 %5)
  %18 = and i64 %17, 1
  %.not3 = icmp eq i64 %18, 0
  br i1 %.not3, label %fail6, label %tail1

fail6:                                            ; preds = %fail3
  tail call fastcc void @_setRowColumn1(%State* nonnull %0, i64 %r.0, i64 %1, i64 1)
  br label %tail1
}

; Function Attrs: nounwind
define private i64 @_run3(i64 %0, i8* nocapture readnone %1) #1 {
entry:
  %2 = alloca %State, align 8
  %3 = alloca %_AnyArray, align 8
  %4 = alloca %_AnyArray, align 8
  %5 = alloca %_AnyArray, align 8
  %6 = alloca %_AnyArray, align 8
  %7 = getelementptr inbounds %State, %State* %2, i64 0, i32 3
  %8 = bitcast %_AnyArray* %7 to i64*
  store i64 0, i64* %8, align 8
  call void @mvs_array_init(%_AnyArray* nonnull %3, %_Metatype* nonnull @_Int.Type, i64 8, i64 8)
  %9 = bitcast %_AnyArray* %3 to i64**
  %10 = load i64*, i64** %9, align 8
  store i64 1, i64* %10, align 4
  %11 = getelementptr inbounds i64, i64* %10, i64 1
  store i64 1, i64* %11, align 4
  %12 = getelementptr inbounds i64, i64* %10, i64 2
  store i64 1, i64* %12, align 4
  %13 = getelementptr inbounds i64, i64* %10, i64 3
  store i64 1, i64* %13, align 4
  %14 = getelementptr inbounds i64, i64* %10, i64 4
  store i64 1, i64* %14, align 4
  %15 = getelementptr inbounds i64, i64* %10, i64 5
  store i64 1, i64* %15, align 4
  %16 = getelementptr inbounds i64, i64* %10, i64 6
  store i64 1, i64* %16, align 4
  %17 = getelementptr inbounds i64, i64* %10, i64 7
  store i64 1, i64* %17, align 4
  %18 = bitcast %State* %2 to i64*
  %19 = ptrtoint i64* %10 to i64
  store i64 %19, i64* %18, align 8
  %20 = getelementptr inbounds %State, %State* %2, i64 0, i32 1
  call void @mvs_array_init(%_AnyArray* nonnull %4, %_Metatype* nonnull @_Int.Type, i64 16, i64 8)
  %21 = bitcast %_AnyArray* %4 to i64**
  %22 = load i64*, i64** %21, align 8
  store i64 1, i64* %22, align 4
  %23 = getelementptr inbounds i64, i64* %22, i64 1
  store i64 1, i64* %23, align 4
  %24 = getelementptr inbounds i64, i64* %22, i64 2
  store i64 1, i64* %24, align 4
  %25 = getelementptr inbounds i64, i64* %22, i64 3
  store i64 1, i64* %25, align 4
  %26 = getelementptr inbounds i64, i64* %22, i64 4
  store i64 1, i64* %26, align 4
  %27 = getelementptr inbounds i64, i64* %22, i64 5
  store i64 1, i64* %27, align 4
  %28 = getelementptr inbounds i64, i64* %22, i64 6
  store i64 1, i64* %28, align 4
  %29 = getelementptr inbounds i64, i64* %22, i64 7
  store i64 1, i64* %29, align 4
  %30 = getelementptr inbounds i64, i64* %22, i64 8
  store i64 1, i64* %30, align 4
  %31 = getelementptr inbounds i64, i64* %22, i64 9
  store i64 1, i64* %31, align 4
  %32 = getelementptr inbounds i64, i64* %22, i64 10
  store i64 1, i64* %32, align 4
  %33 = getelementptr inbounds i64, i64* %22, i64 11
  store i64 1, i64* %33, align 4
  %34 = getelementptr inbounds i64, i64* %22, i64 12
  store i64 1, i64* %34, align 4
  %35 = getelementptr inbounds i64, i64* %22, i64 13
  store i64 1, i64* %35, align 4
  %36 = getelementptr inbounds i64, i64* %22, i64 14
  store i64 1, i64* %36, align 4
  %37 = getelementptr inbounds i64, i64* %22, i64 15
  store i64 1, i64* %37, align 4
  %38 = bitcast %_AnyArray* %20 to i64*
  %39 = ptrtoint i64* %22 to i64
  store i64 %39, i64* %38, align 8
  %40 = getelementptr inbounds %State, %State* %2, i64 0, i32 2
  call void @mvs_array_init(%_AnyArray* nonnull %5, %_Metatype* nonnull @_Int.Type, i64 16, i64 8)
  %41 = bitcast %_AnyArray* %5 to i64**
  %42 = load i64*, i64** %41, align 8
  store i64 1, i64* %42, align 4
  %43 = getelementptr inbounds i64, i64* %42, i64 1
  store i64 1, i64* %43, align 4
  %44 = getelementptr inbounds i64, i64* %42, i64 2
  store i64 1, i64* %44, align 4
  %45 = getelementptr inbounds i64, i64* %42, i64 3
  store i64 1, i64* %45, align 4
  %46 = getelementptr inbounds i64, i64* %42, i64 4
  store i64 1, i64* %46, align 4
  %47 = getelementptr inbounds i64, i64* %42, i64 5
  store i64 1, i64* %47, align 4
  %48 = getelementptr inbounds i64, i64* %42, i64 6
  store i64 1, i64* %48, align 4
  %49 = getelementptr inbounds i64, i64* %42, i64 7
  store i64 1, i64* %49, align 4
  %50 = getelementptr inbounds i64, i64* %42, i64 8
  store i64 1, i64* %50, align 4
  %51 = getelementptr inbounds i64, i64* %42, i64 9
  store i64 1, i64* %51, align 4
  %52 = getelementptr inbounds i64, i64* %42, i64 10
  store i64 1, i64* %52, align 4
  %53 = getelementptr inbounds i64, i64* %42, i64 11
  store i64 1, i64* %53, align 4
  %54 = getelementptr inbounds i64, i64* %42, i64 12
  store i64 1, i64* %54, align 4
  %55 = getelementptr inbounds i64, i64* %42, i64 13
  store i64 1, i64* %55, align 4
  %56 = getelementptr inbounds i64, i64* %42, i64 14
  store i64 1, i64* %56, align 4
  %57 = getelementptr inbounds i64, i64* %42, i64 15
  store i64 1, i64* %57, align 4
  %58 = bitcast %_AnyArray* %40 to i64*
  %59 = ptrtoint i64* %42 to i64
  store i64 %59, i64* %58, align 8
  %60 = getelementptr inbounds %State, %State* %2, i64 0, i32 3
  call void @mvs_array_init(%_AnyArray* nonnull %6, %_Metatype* nonnull @_Int.Type, i64 16, i64 8)
  %61 = bitcast %_AnyArray* %6 to i64**
  %62 = load i64*, i64** %61, align 8
  %63 = getelementptr inbounds i64, i64* %62, i64 15
  %64 = bitcast i64* %62 to i8*
  call void @llvm.memset.p0i8.i64(i8* nonnull align 4 dereferenceable(120) %64, i8 -1, i64 120, i1 false)
  store i64 1, i64* %63, align 4
  %65 = bitcast %_AnyArray* %60 to i64*
  %66 = ptrtoint i64* %62 to i64
  store i64 %66, i64* %65, align 8
  %67 = call fastcc i64 @_placeQueen2(%State* nonnull %2, i64 0)
  %68 = getelementptr inbounds %State, %State* %2, i64 0, i32 0
  call void @mvs_array_drop(%_AnyArray* nonnull %68, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %20, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %40, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %60, %_Metatype* nonnull @_Int.Type)
  ret i64 %67
}

; Function Attrs: nounwind
declare void @mvs_array_init(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1, i64 %2, i64 %3) local_unnamed_addr #1

; Function Attrs: nounwind
define private fastcc void @_noinline_verify4(%_AnyArray* nocapture readonly %0, i64 %1, i64 %2) unnamed_addr #1 {
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

define private fastcc void @_noinline_dump5(%_AnyArray* nocapture readonly %0, i64 %1) unnamed_addr {
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

define private fastcc void @_main6(%_AnyClosure* %0) unnamed_addr {
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
  call fastcc void @_noinline_verify4(%_AnyArray* nonnull %4, i64 %6, i64 %8)
  call void @mvs_array_drop(%_AnyArray* nonnull %4, %_Metatype* nonnull @_Int.Type)
  %35 = bitcast %_AnyArray* %5 to i64*
  store i64 0, i64* %35, align 8
  call void @mvs_array_copy(%_AnyArray* nonnull %5, %_AnyArray* nonnull %1)
  call fastcc void @_noinline_dump5(%_AnyArray* nonnull %5, i64 %6)
  call void @mvs_array_drop(%_AnyArray* nonnull %5, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %2, %_Metatype* nonnull @_Int.Type)
  call void @mvs_array_drop(%_AnyArray* nonnull %1, %_Metatype* nonnull @_Int.Type)
  ret void
}

define private void @_run3.copy(%_AnyClosure* %0, %_AnyClosure* nocapture readonly %1) {
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
define private void @_run3.drop(%_AnyClosure* nocapture %0) #8 {
entry:
  ret void
}

; Function Attrs: norecurse nounwind readonly
define private i64 @_run3.equal(%_AnyClosure* nocapture readonly %0, %_AnyClosure* nocapture readonly %1) #6 {
entry:
  %2 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %0, i64 0, i32 0
  %3 = load i8*, i8** %2, align 8
  %4 = getelementptr inbounds %_AnyClosure, %_AnyClosure* %1, i64 0, i32 0
  %5 = load i8*, i8** %4, align 8
  %6 = icmp eq i8* %3, %5
  %7 = zext i1 %6 to i64
  ret i64 %7
}

attributes #0 = { argmemonly nounwind willreturn writeonly }
attributes #1 = { nounwind }
attributes #2 = { alwaysinline argmemonly norecurse nounwind readonly }
attributes #3 = { alwaysinline nounwind }
attributes #4 = { alwaysinline }
attributes #5 = { alwaysinline norecurse nounwind readnone }
attributes #6 = { norecurse nounwind readonly }
attributes #7 = { argmemonly nounwind willreturn }
attributes #8 = { norecurse nounwind readnone }
