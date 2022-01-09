; ModuleID = 'main'
source_filename = "main"
target triple = "x86_64-pc-linux-gnu"

%_Metatype = type { i64, void (i8*)*, void (i8*)*, void (i8*, i8*)*, i64 (i8*, i8*)* }
%Vec3 = type { double, double, double }
%Body = type { %Vec3, %Vec3, double, double }
%_AnyClosure = type { i8*, i8*, void (%_AnyClosure*, %_AnyClosure*)*, void (%_AnyClosure*)*, i64 (%_AnyClosure*, %_AnyClosure*)* }
%_AnyArray = type { i8* }

@Body.Type = private global %_Metatype { i64 64, void (i8*)* null, void (i8*)* null, void (i8*, i8*)* @Body.te_copy, i64 (i8*, i8*)* @Body.te_equal }
@_Int.Type = private global %_Metatype { i64 8, void (i8*)* null, void (i8*)* null, void (i8*, i8*)* null, i64 (i8*, i8*)* @_Int.te_equal }

; Function Attrs: argmemonly nounwind willreturn
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly %0, i8* noalias nocapture readonly %1, i64 %2, i1 immarg %3) #0

; Function Attrs: norecurse nounwind readonly
define private fastcc i64 @Vec3.equal(%Vec3* nocapture readonly %0, %Vec3* nocapture readonly %1) unnamed_addr #1 {
entry:
  %2 = getelementptr inbounds %Vec3, %Vec3* %0, i64 0, i32 0
  %3 = getelementptr inbounds %Vec3, %Vec3* %1, i64 0, i32 0
  %4 = load double, double* %2, align 8
  %5 = load double, double* %3, align 8
  %6 = fcmp oeq double %4, %5
  br i1 %6, label %eq, label %ne

ne:                                               ; preds = %eq2, %eq1, %eq, %entry
  %merge = phi i64 [ 0, %eq1 ], [ 0, %eq ], [ 0, %entry ], [ 1, %eq2 ]
  ret i64 %merge

eq:                                               ; preds = %entry
  %7 = getelementptr inbounds %Vec3, %Vec3* %0, i64 0, i32 1
  %8 = getelementptr inbounds %Vec3, %Vec3* %1, i64 0, i32 1
  %9 = load double, double* %7, align 8
  %10 = load double, double* %8, align 8
  %11 = fcmp oeq double %9, %10
  br i1 %11, label %eq1, label %ne

eq1:                                              ; preds = %eq
  %12 = getelementptr inbounds %Vec3, %Vec3* %0, i64 0, i32 2
  %13 = getelementptr inbounds %Vec3, %Vec3* %1, i64 0, i32 2
  %14 = load double, double* %12, align 8
  %15 = load double, double* %13, align 8
  %16 = fcmp oeq double %14, %15
  br i1 %16, label %eq2, label %ne

eq2:                                              ; preds = %eq1
  br label %ne
}

; Function Attrs: alwaysinline nounwind
define private void @Body.te_copy(i8* nocapture %0, i8* nocapture readonly %1) #2 {
entry:
  %2 = bitcast i8* %0 to %Body*
  %3 = bitcast i8* %1 to %Body*
  tail call fastcc void @Body.copy(%Body* %2, %Body* %3)
  ret void
}

; Function Attrs: alwaysinline argmemonly nounwind
define private fastcc void @Body.copy(%Body* nocapture %0, %Body* nocapture readonly %1) unnamed_addr #3 {
entry:
  %2 = bitcast %Body* %0 to i8*
  %3 = bitcast %Body* %1 to i8*
  tail call void @llvm.memcpy.p0i8.p0i8.i64(i8* nonnull align 1 dereferenceable(64) %2, i8* nonnull align 1 dereferenceable(64) %3, i64 64, i1 false)
  ret void
}

; Function Attrs: alwaysinline norecurse nounwind readonly
define private i64 @Body.te_equal(i8* nocapture readonly %0, i8* nocapture readonly %1) #4 {
entry:
  %2 = bitcast i8* %0 to %Body*
  %3 = bitcast i8* %1 to %Body*
  %4 = tail call fastcc i64 @Body.equal(%Body* %2, %Body* %3)
  ret i64 %4
}

; Function Attrs: norecurse nounwind readonly
define private fastcc i64 @Body.equal(%Body* nocapture readonly %0, %Body* nocapture readonly %1) unnamed_addr #1 {
entry:
  %2 = getelementptr inbounds %Body, %Body* %0, i64 0, i32 0
  %3 = getelementptr inbounds %Body, %Body* %1, i64 0, i32 0
  %4 = tail call fastcc i64 @Vec3.equal(%Vec3* %2, %Vec3* %3)
  %5 = and i64 %4, 1
  %.not = icmp eq i64 %5, 0
  br i1 %.not, label %ne, label %eq

ne:                                               ; preds = %eq3, %eq, %entry, %eq2, %eq1
  %merge = phi i64 [ 0, %eq ], [ 0, %entry ], [ 0, %eq2 ], [ 0, %eq1 ], [ 1, %eq3 ]
  ret i64 %merge

eq:                                               ; preds = %entry
  %6 = getelementptr inbounds %Body, %Body* %0, i64 0, i32 1
  %7 = getelementptr inbounds %Body, %Body* %1, i64 0, i32 1
  %8 = tail call fastcc i64 @Vec3.equal(%Vec3* nonnull %6, %Vec3* nonnull %7)
  %9 = and i64 %8, 1
  %.not4 = icmp eq i64 %9, 0
  br i1 %.not4, label %ne, label %eq1

eq1:                                              ; preds = %eq
  %10 = getelementptr inbounds %Body, %Body* %0, i64 0, i32 2
  %11 = getelementptr inbounds %Body, %Body* %1, i64 0, i32 2
  %12 = load double, double* %10, align 8
  %13 = load double, double* %11, align 8
  %14 = fcmp oeq double %12, %13
  br i1 %14, label %eq2, label %ne

eq2:                                              ; preds = %eq1
  %15 = getelementptr inbounds %Body, %Body* %0, i64 0, i32 3
  %16 = getelementptr inbounds %Body, %Body* %1, i64 0, i32 3
  %17 = load double, double* %15, align 8
  %18 = load double, double* %16, align 8
  %19 = fcmp oeq double %17, %18
  br i1 %19, label %eq3, label %ne

eq3:                                              ; preds = %eq2
  br label %ne
}

; Function Attrs: alwaysinline nounwind
define private fastcc i64 @_uptime() unnamed_addr #2 {
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

; Function Attrs: alwaysinline nounwind
define private fastcc double @_sqrt(double %0) unnamed_addr #2 {
entry:
  %1 = tail call double @mvs_sqrt(double %0)
  ret double %1
}

; Function Attrs: nounwind
declare double @mvs_sqrt(double %0) local_unnamed_addr #5

; Function Attrs: alwaysinline norecurse nounwind readnone
define private fastcc i64 @_ftoi(double %0) unnamed_addr #7 {
entry:
  %1 = fptosi double %0 to i64
  ret i64 %1
}

; Function Attrs: alwaysinline nounwind
define private fastcc void @_assert(i64 %0) unnamed_addr #2 {
entry:
  %1 = tail call i64 @mvs_assert_i64(i64 %0)
  ret void
}

; Function Attrs: nounwind
declare i64 @mvs_assert_i64(i64 %0) local_unnamed_addr #5

; Function Attrs: alwaysinline nounwind
define private fastcc i64 @_iarg(i64 %0) unnamed_addr #2 {
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
declare i64 @mvs_init(i32 %0, i32* %1) local_unnamed_addr #5

; Function Attrs: nounwind
define private fastcc void @_advance0(%_AnyArray* %0, i64 %1) unnamed_addr #5 {
entry:
  %2 = bitcast %_AnyArray* %0 to %Body**
  br label %head

head:                                             ; preds = %tail3, %entry
  %i.0 = phi i64 [ 0, %entry ], [ %77, %tail3 ]
  %3 = icmp slt i64 %i.0, %1
  br i1 %3, label %head1, label %head4

head1:                                            ; preds = %head, %body2
  %j.0.in = phi i64 [ %j.0, %body2 ], [ %i.0, %head ]
  %j.0 = add i64 %j.0.in, 1
  %4 = icmp slt i64 %j.0, %1
  br i1 %4, label %body2, label %tail3

body2:                                            ; preds = %head1
  %5 = load %Body*, %Body** %2, align 8
  %6 = getelementptr inbounds %Body, %Body* %5, i64 %i.0, i32 0, i32 0
  %7 = load double, double* %6, align 8
  %8 = getelementptr inbounds %Body, %Body* %5, i64 %j.0, i32 0, i32 0
  %9 = load double, double* %8, align 8
  %10 = fsub double %7, %9
  %11 = getelementptr inbounds %Body, %Body* %5, i64 %i.0, i32 0, i32 1
  %12 = load double, double* %11, align 8
  %13 = getelementptr inbounds %Body, %Body* %5, i64 %j.0, i32 0, i32 1
  %14 = load double, double* %13, align 8
  %15 = fsub double %12, %14
  %16 = getelementptr inbounds %Body, %Body* %5, i64 %i.0, i32 0, i32 2
  %17 = load double, double* %16, align 8
  %18 = getelementptr inbounds %Body, %Body* %5, i64 %j.0, i32 0, i32 2
  %19 = load double, double* %18, align 8
  %20 = fsub double %17, %19
  %21 = fmul double %10, %10
  %22 = fmul double %15, %15
  %23 = fadd double %21, %22
  %24 = fmul double %20, %20
  %25 = fadd double %23, %24
  %26 = tail call fastcc double @_sqrt(double %25)
  %27 = fmul double %26, %25
  %28 = fdiv double 1.000000e-02, %27
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @Body.Type)
  %29 = load %Body*, %Body** %2, align 8
  %30 = getelementptr inbounds %Body, %Body* %29, i64 %i.0, i32 1, i32 0
  %31 = load double, double* %30, align 8
  %32 = getelementptr inbounds %Body, %Body* %29, i64 %j.0, i32 2
  %33 = load double, double* %32, align 8
  %34 = fmul double %10, %33
  %35 = fmul double %28, %34
  %36 = fsub double %31, %35
  store double %36, double* %30, align 8
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @Body.Type)
  %37 = load %Body*, %Body** %2, align 8
  %38 = getelementptr inbounds %Body, %Body* %37, i64 %i.0, i32 1, i32 1
  %39 = load double, double* %38, align 8
  %40 = getelementptr inbounds %Body, %Body* %37, i64 %j.0, i32 2
  %41 = load double, double* %40, align 8
  %42 = fmul double %15, %41
  %43 = fmul double %28, %42
  %44 = fsub double %39, %43
  store double %44, double* %38, align 8
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @Body.Type)
  %45 = load %Body*, %Body** %2, align 8
  %46 = getelementptr inbounds %Body, %Body* %45, i64 %i.0, i32 1, i32 2
  %47 = load double, double* %46, align 8
  %48 = getelementptr inbounds %Body, %Body* %45, i64 %j.0, i32 2
  %49 = load double, double* %48, align 8
  %50 = fmul double %20, %49
  %51 = fmul double %28, %50
  %52 = fsub double %47, %51
  store double %52, double* %46, align 8
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @Body.Type)
  %53 = load %Body*, %Body** %2, align 8
  %54 = getelementptr inbounds %Body, %Body* %53, i64 %j.0, i32 1, i32 0
  %55 = load double, double* %54, align 8
  %56 = getelementptr inbounds %Body, %Body* %53, i64 %i.0, i32 2
  %57 = load double, double* %56, align 8
  %58 = fmul double %10, %57
  %59 = fmul double %28, %58
  %60 = fadd double %55, %59
  store double %60, double* %54, align 8
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @Body.Type)
  %61 = load %Body*, %Body** %2, align 8
  %62 = getelementptr inbounds %Body, %Body* %61, i64 %j.0, i32 1, i32 1
  %63 = load double, double* %62, align 8
  %64 = getelementptr inbounds %Body, %Body* %61, i64 %i.0, i32 2
  %65 = load double, double* %64, align 8
  %66 = fmul double %15, %65
  %67 = fmul double %28, %66
  %68 = fadd double %63, %67
  store double %68, double* %62, align 8
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @Body.Type)
  %69 = load %Body*, %Body** %2, align 8
  %70 = getelementptr inbounds %Body, %Body* %69, i64 %j.0, i32 1, i32 2
  %71 = load double, double* %70, align 8
  %72 = getelementptr inbounds %Body, %Body* %69, i64 %i.0, i32 2
  %73 = load double, double* %72, align 8
  %74 = fmul double %20, %73
  %75 = fmul double %28, %74
  %76 = fadd double %71, %75
  store double %76, double* %70, align 8
  br label %head1

tail3:                                            ; preds = %head1
  %77 = add nuw i64 %i.0, 1
  br label %head

head4:                                            ; preds = %head, %body5
  %i.1 = phi i64 [ %100, %body5 ], [ 0, %head ]
  %78 = icmp slt i64 %i.1, %1
  br i1 %78, label %body5, label %tail6

body5:                                            ; preds = %head4
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @Body.Type)
  %79 = load %Body*, %Body** %2, align 8
  %80 = getelementptr inbounds %Body, %Body* %79, i64 %i.1, i32 0, i32 0
  %81 = load double, double* %80, align 8
  %82 = getelementptr inbounds %Body, %Body* %79, i64 %i.1, i32 1, i32 0
  %83 = load double, double* %82, align 8
  %84 = fmul double %83, 1.000000e-02
  %85 = fadd double %81, %84
  store double %85, double* %80, align 8
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @Body.Type)
  %86 = load %Body*, %Body** %2, align 8
  %87 = getelementptr inbounds %Body, %Body* %86, i64 %i.1, i32 0, i32 1
  %88 = load double, double* %87, align 8
  %89 = getelementptr inbounds %Body, %Body* %86, i64 %i.1, i32 1, i32 1
  %90 = load double, double* %89, align 8
  %91 = fmul double %90, 1.000000e-02
  %92 = fadd double %88, %91
  store double %92, double* %87, align 8
  tail call void @mvs_array_uniq(%_AnyArray* %0, %_Metatype* nonnull @Body.Type)
  %93 = load %Body*, %Body** %2, align 8
  %94 = getelementptr inbounds %Body, %Body* %93, i64 %i.1, i32 0, i32 2
  %95 = load double, double* %94, align 8
  %96 = getelementptr inbounds %Body, %Body* %93, i64 %i.1, i32 1, i32 2
  %97 = load double, double* %96, align 8
  %98 = fmul double %97, 1.000000e-02
  %99 = fadd double %95, %98
  store double %99, double* %94, align 8
  %100 = add nuw nsw i64 %i.1, 1
  br label %head4

tail6:                                            ; preds = %head4
  ret void
}

; Function Attrs: nounwind
declare void @mvs_array_uniq(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #5

; Function Attrs: nounwind
define private fastcc double @_energy1(%_AnyArray* nocapture readonly %0, i64 %1) unnamed_addr #5 {
entry:
  %2 = bitcast %_AnyArray* %0 to %Body**
  br label %head

head:                                             ; preds = %tail3, %entry
  %i.0 = phi i64 [ 0, %entry ], [ %52, %tail3 ]
  %e.0 = phi double [ 0.000000e+00, %entry ], [ %e.1, %tail3 ]
  %3 = icmp slt i64 %i.0, %1
  br i1 %3, label %body, label %tail

body:                                             ; preds = %head
  %4 = load %Body*, %Body** %2, align 8
  %5 = getelementptr inbounds %Body, %Body* %4, i64 %i.0, i32 2
  %6 = load double, double* %5, align 8
  %7 = fmul double %6, 5.000000e-01
  %8 = getelementptr inbounds %Body, %Body* %4, i64 %i.0, i32 1, i32 0
  %9 = load double, double* %8, align 8
  %10 = fmul double %9, %9
  %11 = getelementptr inbounds %Body, %Body* %4, i64 %i.0, i32 1, i32 1
  %12 = load double, double* %11, align 8
  %13 = fmul double %12, %12
  %14 = fadd double %10, %13
  %15 = getelementptr inbounds %Body, %Body* %4, i64 %i.0, i32 1, i32 2
  %16 = load double, double* %15, align 8
  %17 = fmul double %16, %16
  %18 = fadd double %14, %17
  %19 = fmul double %7, %18
  %20 = fadd double %e.0, %19
  br label %head1

tail:                                             ; preds = %head
  ret double %e.0

head1:                                            ; preds = %body2, %body
  %21 = phi %Body* [ %4, %body ], [ %44, %body2 ]
  %e.1 = phi double [ %20, %body ], [ %51, %body2 ]
  %j.0.in = phi i64 [ %i.0, %body ], [ %j.0, %body2 ]
  %j.0 = add i64 %j.0.in, 1
  %22 = icmp slt i64 %j.0, %1
  br i1 %22, label %body2, label %tail3

body2:                                            ; preds = %head1
  %23 = getelementptr inbounds %Body, %Body* %21, i64 %i.0, i32 0, i32 0
  %24 = load double, double* %23, align 8
  %25 = getelementptr inbounds %Body, %Body* %21, i64 %j.0, i32 0, i32 0
  %26 = load double, double* %25, align 8
  %27 = fsub double %24, %26
  %28 = getelementptr inbounds %Body, %Body* %21, i64 %i.0, i32 0, i32 1
  %29 = load double, double* %28, align 8
  %30 = getelementptr inbounds %Body, %Body* %21, i64 %j.0, i32 0, i32 1
  %31 = load double, double* %30, align 8
  %32 = fsub double %29, %31
  %33 = getelementptr inbounds %Body, %Body* %21, i64 %i.0, i32 0, i32 2
  %34 = load double, double* %33, align 8
  %35 = getelementptr inbounds %Body, %Body* %21, i64 %j.0, i32 0, i32 2
  %36 = load double, double* %35, align 8
  %37 = fsub double %34, %36
  %38 = fmul double %27, %27
  %39 = fmul double %32, %32
  %40 = fadd double %38, %39
  %41 = fmul double %37, %37
  %42 = fadd double %40, %41
  %43 = tail call fastcc double @_sqrt(double %42)
  %44 = load %Body*, %Body** %2, align 8
  %45 = getelementptr inbounds %Body, %Body* %44, i64 %i.0, i32 2
  %46 = load double, double* %45, align 8
  %47 = getelementptr inbounds %Body, %Body* %44, i64 %j.0, i32 2
  %48 = load double, double* %47, align 8
  %49 = fmul double %46, %48
  %50 = fdiv double %49, %43
  %51 = fsub double %e.1, %50
  br label %head1

tail3:                                            ; preds = %head1
  %52 = add nuw i64 %i.0, 1
  br label %head
}

; Function Attrs: nounwind
define private i64 @_run2(i64 %0, i8* nocapture readnone %1) #5 {
tail:
  %2 = alloca %_AnyArray, align 8
  %3 = alloca %_AnyArray, align 8
  call void @mvs_array_init(%_AnyArray* nonnull %2, %_Metatype* nonnull @Body.Type, i64 5, i64 64)
  %4 = bitcast %_AnyArray* %2 to %Body**
  %5 = load %Body*, %Body** %4, align 8
  %.sroa.8207.0..sroa_idx208 = getelementptr inbounds %Body, %Body* %5, i64 0, i32 2
  %6 = bitcast %Body* %5 to i8*
  call void @llvm.memset.p0i8.i64(i8* nonnull align 1 dereferenceable(48) %6, i8 0, i64 48, i1 false)
  store double 0x4043BD3CC9BE45DE, double* %.sroa.8207.0..sroa_idx208, align 1
  %.sroa.9209.0..sroa_idx210 = getelementptr inbounds %Body, %Body* %5, i64 0, i32 3
  store double 0.000000e+00, double* %.sroa.9209.0..sroa_idx210, align 1
  %.sroa.0156.0..sroa_idx = getelementptr inbounds %Body, %Body* %5, i64 1, i32 0, i32 0
  store double 0x40135DA0343CD92C, double* %.sroa.0156.0..sroa_idx, align 1
  %.sroa.3157.0..sroa_idx158 = getelementptr inbounds %Body, %Body* %5, i64 1, i32 0, i32 1
  store double 0xBFF290ABC01FDB7C, double* %.sroa.3157.0..sroa_idx158, align 1
  %.sroa.4159.0..sroa_idx160 = getelementptr inbounds %Body, %Body* %5, i64 1, i32 0, i32 2
  store double 0xBFBA86F96C25EBF0, double* %.sroa.4159.0..sroa_idx160, align 1
  %.sroa.5161.0..sroa_idx162 = getelementptr inbounds %Body, %Body* %5, i64 1, i32 1, i32 0
  store double 0x3FE367069B93CCBC, double* %.sroa.5161.0..sroa_idx162, align 1
  %.sroa.6163.0..sroa_idx164 = getelementptr inbounds %Body, %Body* %5, i64 1, i32 1, i32 1
  store double 0x40067EF2F57D949B, double* %.sroa.6163.0..sroa_idx164, align 1
  %.sroa.7165.0..sroa_idx166 = getelementptr inbounds %Body, %Body* %5, i64 1, i32 1, i32 2
  store double 0xBF99D2D79A5A0715, double* %.sroa.7165.0..sroa_idx166, align 1
  %.sroa.8167.0..sroa_idx168 = getelementptr inbounds %Body, %Body* %5, i64 1, i32 2
  store double 0x3FA34C95D9AB33D8, double* %.sroa.8167.0..sroa_idx168, align 1
  %.sroa.9169.0..sroa_idx170 = getelementptr inbounds %Body, %Body* %5, i64 1, i32 3
  store double 0.000000e+00, double* %.sroa.9169.0..sroa_idx170, align 1
  %.sroa.0116.0..sroa_idx = getelementptr inbounds %Body, %Body* %5, i64 2, i32 0, i32 0
  store double 0x4020AFCDC332CA67, double* %.sroa.0116.0..sroa_idx, align 1
  %.sroa.3117.0..sroa_idx118 = getelementptr inbounds %Body, %Body* %5, i64 2, i32 0, i32 1
  store double 0x40107FCB31DE01B0, double* %.sroa.3117.0..sroa_idx118, align 1
  %.sroa.4119.0..sroa_idx120 = getelementptr inbounds %Body, %Body* %5, i64 2, i32 0, i32 2
  store double 0xBFD9D353E1EB467C, double* %.sroa.4119.0..sroa_idx120, align 1
  %.sroa.5121.0..sroa_idx122 = getelementptr inbounds %Body, %Body* %5, i64 2, i32 1, i32 0
  store double 0xBFF02C21B8879442, double* %.sroa.5121.0..sroa_idx122, align 1
  %.sroa.6123.0..sroa_idx124 = getelementptr inbounds %Body, %Body* %5, i64 2, i32 1, i32 1
  store double 0x3FFD35E9BF1F8F13, double* %.sroa.6123.0..sroa_idx124, align 1
  %.sroa.7125.0..sroa_idx126 = getelementptr inbounds %Body, %Body* %5, i64 2, i32 1, i32 2
  store double 0x3F813C485F1123B4, double* %.sroa.7125.0..sroa_idx126, align 1
  %.sroa.8127.0..sroa_idx128 = getelementptr inbounds %Body, %Body* %5, i64 2, i32 2
  store double 0x3F871D490D07C637, double* %.sroa.8127.0..sroa_idx128, align 1
  %.sroa.9129.0..sroa_idx130 = getelementptr inbounds %Body, %Body* %5, i64 2, i32 3
  store double 0.000000e+00, double* %.sroa.9129.0..sroa_idx130, align 1
  %.sroa.076.0..sroa_idx = getelementptr inbounds %Body, %Body* %5, i64 3, i32 0, i32 0
  store double 0x4029C9EACEA7D9CF, double* %.sroa.076.0..sroa_idx, align 1
  %.sroa.377.0..sroa_idx78 = getelementptr inbounds %Body, %Body* %5, i64 3, i32 0, i32 1
  store double 0xC02E38E8D626667E, double* %.sroa.377.0..sroa_idx78, align 1
  %.sroa.479.0..sroa_idx80 = getelementptr inbounds %Body, %Body* %5, i64 3, i32 0, i32 2
  store double 0xBFCC9557BE257DA0, double* %.sroa.479.0..sroa_idx80, align 1
  %.sroa.581.0..sroa_idx82 = getelementptr inbounds %Body, %Body* %5, i64 3, i32 1, i32 0
  store double 0x3FF1531CA9911BEF, double* %.sroa.581.0..sroa_idx82, align 1
  %.sroa.683.0..sroa_idx84 = getelementptr inbounds %Body, %Body* %5, i64 3, i32 1, i32 1
  store double 0x3FEBCC7F3E54BBC5, double* %.sroa.683.0..sroa_idx84, align 1
  %.sroa.785.0..sroa_idx86 = getelementptr inbounds %Body, %Body* %5, i64 3, i32 1, i32 2
  store double 0xBF862F6BFAF23E7C, double* %.sroa.785.0..sroa_idx86, align 1
  %.sroa.887.0..sroa_idx88 = getelementptr inbounds %Body, %Body* %5, i64 3, i32 2
  store double 0x3F5C3DD29CF41EB3, double* %.sroa.887.0..sroa_idx88, align 1
  %.sroa.989.0..sroa_idx90 = getelementptr inbounds %Body, %Body* %5, i64 3, i32 3
  store double 0.000000e+00, double* %.sroa.989.0..sroa_idx90, align 1
  %.sroa.036.0..sroa_idx = getelementptr inbounds %Body, %Body* %5, i64 4, i32 0, i32 0
  store double 0x402EC267A905572A, double* %.sroa.036.0..sroa_idx, align 1
  %.sroa.337.0..sroa_idx38 = getelementptr inbounds %Body, %Body* %5, i64 4, i32 0, i32 1
  store double 0xC039EB5833C8A220, double* %.sroa.337.0..sroa_idx38, align 1
  %.sroa.439.0..sroa_idx40 = getelementptr inbounds %Body, %Body* %5, i64 4, i32 0, i32 2
  store double 0x3FC6F1F393ABE540, double* %.sroa.439.0..sroa_idx40, align 1
  %.sroa.541.0..sroa_idx42 = getelementptr inbounds %Body, %Body* %5, i64 4, i32 1, i32 0
  store double 0x3FEF54B61659BC4A, double* %.sroa.541.0..sroa_idx42, align 1
  %.sroa.643.0..sroa_idx44 = getelementptr inbounds %Body, %Body* %5, i64 4, i32 1, i32 1
  store double 0x3FE307C631C4FBA3, double* %.sroa.643.0..sroa_idx44, align 1
  %.sroa.745.0..sroa_idx46 = getelementptr inbounds %Body, %Body* %5, i64 4, i32 1, i32 2
  store double 0xBFA1CB88587665F6, double* %.sroa.745.0..sroa_idx46, align 1
  %.sroa.847.0..sroa_idx48 = getelementptr inbounds %Body, %Body* %5, i64 4, i32 2
  store double 0x3F60A8F3531799AC, double* %.sroa.847.0..sroa_idx48, align 1
  %.sroa.949.0..sroa_idx50 = getelementptr inbounds %Body, %Body* %5, i64 4, i32 3
  store double 0.000000e+00, double* %.sroa.949.0..sroa_idx50, align 1
  %7 = load %Body*, %Body** %4, align 8
  %8 = getelementptr inbounds %Body, %Body* %7, i64 0, i32 2
  %9 = load double, double* %8, align 8
  %10 = getelementptr inbounds %Body, %Body* %7, i64 1, i32 2
  %11 = load double, double* %10, align 8
  %12 = getelementptr inbounds %Body, %Body* %7, i64 2, i32 2
  %13 = load double, double* %12, align 8
  %14 = getelementptr inbounds %Body, %Body* %7, i64 3, i32 2
  %15 = load double, double* %14, align 8
  %16 = getelementptr inbounds %Body, %Body* %7, i64 4, i32 2
  %17 = load double, double* %16, align 8
  %18 = getelementptr inbounds %Body, %Body* %7, i64 0, i32 1, i32 2
  %19 = load double, double* %18, align 8
  %20 = fmul double %9, %19
  %21 = fadd double %20, 0.000000e+00
  %22 = getelementptr inbounds %Body, %Body* %7, i64 1, i32 1, i32 2
  %23 = load double, double* %22, align 8
  %24 = fmul double %11, %23
  %25 = fadd double %21, %24
  %26 = getelementptr inbounds %Body, %Body* %7, i64 2, i32 1, i32 2
  %27 = load double, double* %26, align 8
  %28 = fmul double %13, %27
  %29 = fadd double %25, %28
  %30 = getelementptr inbounds %Body, %Body* %7, i64 3, i32 1, i32 2
  %31 = load double, double* %30, align 8
  %32 = fmul double %15, %31
  %33 = fadd double %29, %32
  %34 = getelementptr inbounds %Body, %Body* %7, i64 4, i32 1, i32 2
  %35 = load double, double* %34, align 8
  %36 = fmul double %17, %35
  %37 = fadd double %33, %36
  %38 = getelementptr inbounds %Body, %Body* %7, i64 0, i32 1, i32 1
  %39 = load double, double* %38, align 8
  %40 = fmul double %9, %39
  %41 = fadd double %40, 0.000000e+00
  %42 = getelementptr inbounds %Body, %Body* %7, i64 1, i32 1, i32 1
  %43 = load double, double* %42, align 8
  %44 = fmul double %11, %43
  %45 = fadd double %41, %44
  %46 = getelementptr inbounds %Body, %Body* %7, i64 2, i32 1, i32 1
  %47 = load double, double* %46, align 8
  %48 = fmul double %13, %47
  %49 = fadd double %45, %48
  %50 = getelementptr inbounds %Body, %Body* %7, i64 3, i32 1, i32 1
  %51 = load double, double* %50, align 8
  %52 = fmul double %15, %51
  %53 = fadd double %49, %52
  %54 = getelementptr inbounds %Body, %Body* %7, i64 4, i32 1, i32 1
  %55 = load double, double* %54, align 8
  %56 = fmul double %17, %55
  %57 = fadd double %53, %56
  %58 = getelementptr inbounds %Body, %Body* %7, i64 0, i32 1, i32 0
  %59 = load double, double* %58, align 8
  %60 = fmul double %59, %9
  %61 = fadd double %60, 0.000000e+00
  %62 = getelementptr inbounds %Body, %Body* %7, i64 1, i32 1, i32 0
  %63 = load double, double* %62, align 8
  %64 = fmul double %63, %11
  %65 = fadd double %61, %64
  %66 = getelementptr inbounds %Body, %Body* %7, i64 2, i32 1, i32 0
  %67 = load double, double* %66, align 8
  %68 = fmul double %67, %13
  %69 = fadd double %65, %68
  %70 = getelementptr inbounds %Body, %Body* %7, i64 3, i32 1, i32 0
  %71 = load double, double* %70, align 8
  %72 = fmul double %71, %15
  %73 = fadd double %69, %72
  %74 = getelementptr inbounds %Body, %Body* %7, i64 4, i32 1, i32 0
  %75 = load double, double* %74, align 8
  %76 = fmul double %75, %17
  %77 = fadd double %73, %76
  call void @mvs_array_uniq(%_AnyArray* nonnull %2, %_Metatype* nonnull @Body.Type)
  %78 = load %Body*, %Body** %4, align 8
  %79 = fdiv double %77, 0x4043BD3CC9BE45DE
  %80 = fsub double 0.000000e+00, %79
  %81 = fdiv double %57, 0x4043BD3CC9BE45DE
  %82 = fsub double 0.000000e+00, %81
  %83 = fdiv double %37, 0x4043BD3CC9BE45DE
  %84 = fsub double 0.000000e+00, %83
  %.sroa.0.0..sroa_idx = getelementptr inbounds %Body, %Body* %78, i64 0, i32 1, i32 0
  store double %80, double* %.sroa.0.0..sroa_idx, align 1
  %.sroa.3.0..sroa_idx4 = getelementptr inbounds %Body, %Body* %78, i64 0, i32 1, i32 1
  store double %82, double* %.sroa.3.0..sroa_idx4, align 1
  %.sroa.4.0..sroa_idx5 = getelementptr inbounds %Body, %Body* %78, i64 0, i32 1, i32 2
  store double %84, double* %.sroa.4.0..sroa_idx5, align 1
  br label %head1

head1:                                            ; preds = %body2, %tail
  %i.1 = phi i64 [ 0, %tail ], [ %86, %body2 ]
  %85 = icmp slt i64 %i.1, %0
  br i1 %85, label %body2, label %tail3

body2:                                            ; preds = %head1
  call fastcc void @_advance0(%_AnyArray* nonnull %2, i64 5)
  %86 = add nuw nsw i64 %i.1, 1
  br label %head1

tail3:                                            ; preds = %head1
  %87 = bitcast %_AnyArray* %3 to i64*
  store i64 0, i64* %87, align 8
  call void @mvs_array_copy(%_AnyArray* nonnull %3, %_AnyArray* nonnull %2)
  %88 = call fastcc double @_energy1(%_AnyArray* nonnull %3, i64 5)
  call void @mvs_array_drop(%_AnyArray* nonnull %3, %_Metatype* nonnull @Body.Type)
  %89 = fmul double %88, 1.000000e+05
  %90 = call fastcc i64 @_ftoi(double %89)
  call void @mvs_array_drop(%_AnyArray* nonnull %2, %_Metatype* nonnull @Body.Type)
  ret i64 %90
}

; Function Attrs: argmemonly nounwind willreturn writeonly
declare void @llvm.memset.p0i8.i64(i8* nocapture writeonly %0, i8 %1, i64 %2, i1 immarg %3) #8

; Function Attrs: nounwind
declare void @mvs_array_init(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1, i64 %2, i64 %3) local_unnamed_addr #5

; Function Attrs: nounwind
declare void @mvs_array_copy(%_AnyArray* nocapture %0, %_AnyArray* nocapture readonly %1) local_unnamed_addr #5

; Function Attrs: nounwind
declare void @mvs_array_drop(%_AnyArray* nocapture %0, %_Metatype* nocapture readonly %1) local_unnamed_addr #5

; Function Attrs: nounwind
define private fastcc void @_noinline_verify3(%_AnyArray* nocapture readonly %0, i64 %1, i64 %2) unnamed_addr #5 {
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

; Function Attrs: alwaysinline argmemonly norecurse nounwind readonly
define private i64 @_Int.te_equal(i8* nocapture readonly %0, i8* nocapture readonly %1) #9 {
entry:
  %2 = bitcast i8* %0 to i64*
  %3 = load i64, i64* %2, align 4
  %4 = bitcast i8* %1 to i64*
  %5 = load i64, i64* %4, align 4
  %6 = icmp eq i64 %3, %5
  %7 = zext i1 %6 to i64
  ret i64 %7
}

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

; Function Attrs: norecurse nounwind readnone
define private void @_run2.drop(%_AnyClosure* nocapture %0) #10 {
entry:
  ret void
}

; Function Attrs: norecurse nounwind readonly
define private i64 @_run2.equal(%_AnyClosure* nocapture readonly %0, %_AnyClosure* nocapture readonly %1) #1 {
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
attributes #1 = { norecurse nounwind readonly }
attributes #2 = { alwaysinline nounwind }
attributes #3 = { alwaysinline argmemonly nounwind }
attributes #4 = { alwaysinline norecurse nounwind readonly }
attributes #5 = { nounwind }
attributes #6 = { alwaysinline }
attributes #7 = { alwaysinline norecurse nounwind readnone }
attributes #8 = { argmemonly nounwind willreturn writeonly }
attributes #9 = { alwaysinline argmemonly norecurse nounwind readonly }
attributes #10 = { norecurse nounwind readnone }
