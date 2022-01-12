  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s6 {
    var p0: [[s1]]
    var p1: s0
  }
  func f60(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    var v4: s0 = v0
    let v5: [[Double]] = v4.p1
    v4.p1 = v5
    v4.p1 = v5
    v4.p0 = v6
    v4.p1 = v5
    v4.p0 = v6
    v4.p0 = v6
    let v8: [Double] = v5[1]
    let v3: [Double] = v5[1]
    v4.p1 = v5
    v4.p0 = v6
    var v1: [[Double]] = v5
    v1[0] = v8
    v1[1] = v3
    v4.p0 = v6
    var v12: s0 = v4
    let v41: [[Double]] = v12.p1
    v4.p1 = v1
    let v29: [Double] = v1[0]
    v1[1] = v29
    var v39: s0 = v12
    let v32: [[Double]] = v0.p0
    v12 = v4
    v4 = v12
    v39.p0 = v32
    v12.p1 = v41
    return v39
  }
  func f38(_ v0: [[s6]]) -> [[s6]] {
    var v2: [[s6]] = v0
    var v4: [[s6]] = v2
    let v3: [[[s6]]] = [v2, v4, v2, v0, v4, v0, v4]
    var v7: [[[s6]]] = v3
    let v55: [[s6]] = v7[3]
    v7[6] = v2
    return v55
  }
  func f18(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    let v4: [[Double]] = v0.p1
    let v3: [Double] = v4[1]
    let v7: [Double] = v4[1]
    let v8: s0 = f60(v0)
    let v13: [[Double]] = v0.p0
    let v9: [Double] = v5[0]
    var v14: [[Double]] = v13
    v14[0] = v7
    v14 = v5
    v14[1] = v3
    v14[0] = v3
    v14[0] = v9
    let v55: s0 = f60(v0)
    let v27: [[Double]] = v55.p0
    let v50: s0 = f60(v8)
    v14[2] = v3
    var v179: s0 = v50
    v179.p0 = v27
    v179.p0 = v14
    v179.p1 = v4
    return v179
  }
  func f11(_ v0: s6) -> s6 {
    let v8: [s6] = [v0, v0, v0, v0, v0, v0]
    let v10: [[s6]] = [v8, v8, v8, v8, v8, v8, v8]
    let v18: [[[s6]]] = [v10, v10]
    let v12: [[s6]] = v18[0]
    let v16: [[s6]] = v18[1]
    var v72: [[s6]] = v16
    v72[6] = v8
    let v37: [s6] = v72[6]
    v72 = v16
    var v100: [s6] = v37
    let v133: [s6] = v12[4]
    let v146: s6 = v133[5]
    var v139: [s6] = v100
    v139[0] = v146
    let v212: s6 = v139[1]
    return v212
  }
  @inline(never)
  func f0(_ v0: Double, _ v1: [[s6]]) -> Double {
    var v2: [[s6]] = v1
    let v7: [s6] = v2[0]
    let v8: [[s6]] = f38(v2)
    v2[2] = v7
    let v5: [[s6]] = f38(v8)
    var v10: [[s6]] = v5
    v10[2] = v7
    let v11: [s6] = v5[2]
    var v16: [s6] = v11
    let v17: [s6] = v8[2]
    let v18: [[s6]] = f38(v10)
    var v26: [s6] = v7
    v2[2] = v11
    v10 = v2
    let v24: s6 = v7[0]
    v10[0] = v17
    let v25: [[s1]] = v24.p0
    var v59: s6 = v24
    v59.p0 = v25
    let v21: [s6] = v18[0]
    let v35: s6 = f11(v59)
    let v30: [[s1]] = v59.p0
    v59.p0 = v30
    let v19: [s1] = v25[0]
    let v20: s0 = v35.p1
    v59.p1 = v20
    var v32: s6 = v59
    let v54: [s1] = v30[0]
    v59.p0 = v25
    let v58: s1 = v54[0]
    let v50: [s6] = [v59, v35, v32]
    let v49: s6 = v50[2]
    v59.p0 = v25
    v10[1] = v21
    v2[1] = v16
    v2[1] = v21
    let v61: s0 = v58.p1
    v26[0] = v49
    v2[2] = v21
    let v62: [[Double]] = v20.p1
    let v64: s6 = v50[1]
    let v180: [Double] = v62[1]
    v59.p0 = v30
    let v43: s0 = v58.p0
    var v72: [s6] = v21
    let v81: s0 = v35.p1
    v59.p1 = v20
    v10[0] = v26
    v59.p0 = v30
    let v38: s0 = f18(v61)
    let v84: s0 = f60(v43)
    let v69: [[s1]] = v64.p0
    let v126: s0 = f60(v84)
    v59.p1 = v81
    v32.p1 = v20
    v10[2] = v26
    v10[0] = v21
    let v82: Double = v180[0]
    let v113: s6 = v72[0]
    v59.p1 = v38
    v59.p0 = v69
    var v108: [[s1]] = v69
    v108[0] = v19
    let v75: [s1] = v30[0]
    let v121: Double = v82 / v82
    v10[1] = v11
    v26[0] = v32
    var v131: s6 = v113
    v72[0] = v24
    v59.p0 = v108
    let v192: [[s1]] = v131.p0
    v108[0] = v75
    v131.p1 = v126
    v26[0] = v24
    v59.p0 = v192
    v16[0] = v35
    v26[0] = v32
    v131.p0 = v192
    return v121
  }
  func benchmark() {
    let v0: Double = 0.0
    let v1: [[s6]] = [[s6(p0: [[s1(p0: s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0]]))]], p1: s0(p0: [[11.0], [12.0], [13.0]], p1: [[14.0], [15.0]]))], [s6(p0: [[s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0], [20.0]]), p1: s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0], [25.0]]))]], p1: s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0], [30.0]]))], [s6(p0: [[s1(p0: s0(p0: [[31.0], [32.0], [33.0]], p1: [[34.0], [35.0]]), p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0]]))]], p1: s0(p0: [[41.0], [42.0], [43.0]], p1: [[44.0], [45.0]]))]]
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = [[StructValue(Name(str='s6', ty=None), [[[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[1.0], [2.0], [3.0]], [[4.0], [5.0]]]), StructValue(Name(str='s0', ty=None), [[[6.0], [7.0], [8.0]], [[9.0], [10.0]]])])]], StructValue(Name(str='s0', ty=None), [[[11.0], [12.0], [13.0]], [[14.0], [15.0]]])])], [StructValue(Name(str='s6', ty=None), [[[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[16.0], [17.0], [18.0]], [[19.0], [20.0]]]), StructValue(Name(str='s0', ty=None), [[[21.0], [22.0], [23.0]], [[24.0], [25.0]]])])]], StructValue(Name(str='s0', ty=None), [[[26.0], [27.0], [28.0]], [[29.0], [30.0]]])])], [StructValue(Name(str='s6', ty=None), [[[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[31.0], [32.0], [33.0]], [[34.0], [35.0]]]), StructValue(Name(str='s0', ty=None), [[[36.0], [37.0], [38.0]], [[39.0], [40.0]]])])]], StructValue(Name(str='s0', ty=None), [[[41.0], [42.0], [43.0]], [[44.0], [45.0]]])])]]
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
