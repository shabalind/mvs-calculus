  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double, _ v2: s1, _ v3: s1) -> Double {
    let v4: [s0] = v3.p0
    let v8: s0 = v4[2]
    let v17: [[Double]] = v8.p1
    let v15: [[Double]] = v8.p0
    var v29: [[Double]] = v15
    let v16: [Double] = v17[0]
    let v33: [Double] = v29[0]
    let v81: Double = v33[0]
    let v110: Double = v16[0]
    let v98: Double = v81 / v110
    var v107: Double = v98
    return v107
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])], p1: [[s0(p0: [[6.0]], p1: [[7.0]])], [s0(p0: [[8.0]], p1: [[9.0]])]])
    let v1: Double = 10.0
    let v2: s1 = s1(p0: [s0(p0: [[11.0]], p1: [[12.0]]), s0(p0: [[13.0]], p1: [[14.0]]), s0(p0: [[15.0]], p1: [[16.0]])], p1: [[s0(p0: [[17.0]], p1: [[18.0]])], [s0(p0: [[19.0]], p1: [[20.0]])]])
    let v3: s1 = s1(p0: [s0(p0: [[21.0]], p1: [[22.0]]), s0(p0: [[23.0]], p1: [[24.0]]), s0(p0: [[25.0]], p1: [[26.0]])], p1: [[s0(p0: [[27.0]], p1: [[28.0]])], [s0(p0: [[29.0]], p1: [[30.0]])]])
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[21.0]], [[22.0]]]), StructValue(Name(str='s0', ty=None), [[[23.0]], [[24.0]]]), StructValue(Name(str='s0', ty=None), [[[25.0]], [[26.0]]])], [[StructValue(Name(str='s0', ty=None), [[[27.0]], [[28.0]]])], [StructValue(Name(str='s0', ty=None), [[[29.0]], [[30.0]]])]]])
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
