  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double, _ v2: s1) -> Double {
    let v6: [[s0]] = v0.p1
    let v4: [s0] = v6[0]
    let v3: s0 = v4[0]
    var v12: Double = v1
    let v17: [[Double]] = v3.p0
    let v52: [Double] = v17[0]
    let v39: Double = v52[0]
    let v81: Double = v52[0]
    let v146: Double = v81 * v39
    var v78: Double = v12
    let v97: Double = v146 - v78
    return v97
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]])
    let v1: Double = 15.0
    let v2: s1 = s1(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0], [20.0]]), p1: [[s0(p0: [[21.0], [22.0]], p1: [[23.0], [24.0], [25.0]])], [s0(p0: [[26.0], [27.0]], p1: [[28.0], [29.0], [30.0]])]])
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[16.0], [17.0]], [[18.0], [19.0], [20.0]]]), [[StructValue(Name(str='s0', ty=None), [[[21.0], [22.0]], [[23.0], [24.0], [25.0]]])], [StructValue(Name(str='s0', ty=None), [[[26.0], [27.0]], [[28.0], [29.0], [30.0]]])]]])
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
