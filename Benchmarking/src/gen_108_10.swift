  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s1]
  }
  struct s3 {
    var p0: [[s2]]
  }
  struct s4 {
    var p0: s0
  }
  struct s5 {
    var p0: s0
    var p1: s4
  }
  struct s7 {
    var p0: Double
    var p1: s1
  }
  struct s8 {
    var p0: [[s4]]
    var p1: s3
  }
  func f95(_ v0: s0) -> s0 {
    return v0
  }
  func f60(_ v0: s1, _ v1: s1) -> s1 {
    let v7: s0 = v1.p0
    var v6: s1 = v1
    var v4: s1 = v6
    v6.p0 = v7
    var v2: s1 = v6
    let v8: s0 = f95(v7)
    v4.p0 = v8
    v6.p1 = v7
    let v14: s0 = v2.p0
    v4.p1 = v14
    v2.p1 = v8
    let v21: s0 = f95(v7)
    let v25: s0 = f95(v21)
    let v48: s0 = v2.p1
    var v29: s1 = v4
    let v65: [s1] = [v6, v1, v29, v29, v2]
    let v94: s1 = v65[4]
    var v40: [s1] = v65
    let v56: s1 = v40[3]
    let v68: s0 = v94.p1
    var v79: s1 = v0
    v79 = v56
    v6.p1 = v68
    v2.p0 = v48
    v29.p0 = v25
    return v79
  }
  func f54(_ v0: s1) -> s1 {
    let v7: s1 = f60(v0, v0)
    let v6: s1 = f60(v0, v0)
    let v10: s1 = f60(v0, v7)
    let v41: s1 = f60(v6, v10)
    let v35: s1 = f60(v41, v6)
    var v34: s1 = v35
    return v34
  }
  func f36(_ v0: s0) -> s0 {
    let v4: s0 = f95(v0)
    let v61: s0 = f95(v4)
    let v77: s1 = s1(p0: v4, p1: v61)
    let v35: s1 = f54(v77)
    let v50: s1 = f60(v35, v77)
    let v66: s1 = f60(v50, v50)
    let v93: s0 = v66.p1
    return v93
  }
  func f18(_ v0: s1) -> s1 {
    let v4: s1 = f54(v0)
    let v7: s0 = v4.p1
    let v3: [[Double]] = v7.p1
    var v1: s1 = v0
    let v6: s0 = f36(v7)
    let v9: s0 = v1.p1
    v1.p1 = v9
    var v8: s0 = v6
    let v17: [Double] = v3[0]
    var v13: [[Double]] = v3
    var v12: s0 = v8
    var v33: s1 = v1
    let v16: s0 = f95(v9)
    v12.p0 = v13
    v13[0] = v17
    let v26: s0 = f36(v16)
    v33.p0 = v12
    v33.p1 = v26
    return v33
  }
  @inline(never)
  func f0(_ v0: Double, _ v1: [s5], _ v2: s2, _ v3: [[s7]], _ v4: s7, _ v5: [s8]) -> Double {
    let v8: s0 = v2.p0
    let v9: s0 = f36(v8)
    let v23: s1 = s1(p0: v9, p1: v8)
    let v31: s1 = f18(v23)
    let v43: s0 = v31.p0
    let v66: [[Double]] = v43.p0
    let v89: [Double] = v66[0]
    let v115: Double = v89[0]
    return v115
  }
  func benchmark() {
    let v0: Double = 0.0
    let v1: [s5] = [s5(p0: s0(p0: [[1.0]], p1: [[2.0]]), p1: s4(p0: s0(p0: [[3.0]], p1: [[4.0]]))), s5(p0: s0(p0: [[5.0]], p1: [[6.0]]), p1: s4(p0: s0(p0: [[7.0]], p1: [[8.0]]))), s5(p0: s0(p0: [[9.0]], p1: [[10.0]]), p1: s4(p0: s0(p0: [[11.0]], p1: [[12.0]])))]
    let v2: s2 = s2(p0: s0(p0: [[13.0]], p1: [[14.0]]), p1: [s1(p0: s0(p0: [[15.0]], p1: [[16.0]]), p1: s0(p0: [[17.0]], p1: [[18.0]])), s1(p0: s0(p0: [[19.0]], p1: [[20.0]]), p1: s0(p0: [[21.0]], p1: [[22.0]])), s1(p0: s0(p0: [[23.0]], p1: [[24.0]]), p1: s0(p0: [[25.0]], p1: [[26.0]]))])
    let v3: [[s7]] = [[s7(p0: 27.0, p1: s1(p0: s0(p0: [[28.0]], p1: [[29.0]]), p1: s0(p0: [[30.0]], p1: [[31.0]])))], [s7(p0: 32.0, p1: s1(p0: s0(p0: [[33.0]], p1: [[34.0]]), p1: s0(p0: [[35.0]], p1: [[36.0]])))]]
    let v4: s7 = s7(p0: 37.0, p1: s1(p0: s0(p0: [[38.0]], p1: [[39.0]]), p1: s0(p0: [[40.0]], p1: [[41.0]])))
    let v5: [s8] = [s8(p0: [[s4(p0: s0(p0: [[42.0]], p1: [[43.0]]))]], p1: s3(p0: [[s2(p0: s0(p0: [[44.0]], p1: [[45.0]]), p1: [s1(p0: s0(p0: [[46.0]], p1: [[47.0]]), p1: s0(p0: [[48.0]], p1: [[49.0]])), s1(p0: s0(p0: [[50.0]], p1: [[51.0]]), p1: s0(p0: [[52.0]], p1: [[53.0]])), s1(p0: s0(p0: [[54.0]], p1: [[55.0]]), p1: s0(p0: [[56.0]], p1: [[57.0]]))])]]))]
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = [StructValue(Name(str='s8', ty=None), [[[StructValue(Name(str='s4', ty=None), [StructValue(Name(str='s0', ty=None), [[[42.0]], [[43.0]]])])]], StructValue(Name(str='s3', ty=None), [[[StructValue(Name(str='s2', ty=None), [StructValue(Name(str='s0', ty=None), [[[44.0]], [[45.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[46.0]], [[47.0]]]), StructValue(Name(str='s0', ty=None), [[[48.0]], [[49.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[50.0]], [[51.0]]]), StructValue(Name(str='s0', ty=None), [[[52.0]], [[53.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[54.0]], [[55.0]]]), StructValue(Name(str='s0', ty=None), [[[56.0]], [[57.0]]])])]])]]])])]
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
