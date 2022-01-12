  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  func f33(_ v0: s0) -> s0 {
    let v5: [Double] = v0.p1
    var v2: s0 = v0
    v2.p1 = v5
    v2.p1 = v5
    let v7: [Double] = v0.p1
    v2.p1 = v7
    v2.p1 = v5
    let v21: [[Double]] = v2.p0
    v2.p1 = v5
    v2 = v0
    let v15: [[Double]] = v0.p0
    let v16: [[Double]] = v2.p0
    let v12: [Double] = v0.p1
    let v18: s0 = s0(p0: v16, p1: v12)
    v2.p0 = v21
    v2.p0 = v15
    return v18
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v2: s2 = v0[2]
    let v6: s0 = v2.p1
    let v8: s0 = f33(v6)
    let v11: [[Double]] = v8.p0
    let v32: [Double] = v11[0]
    let v64: Double = v32[0]
    var v85: Double = v64
    return v85
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [[0.0]], p1: [1.0, 2.0]), p1: s0(p0: [[3.0]], p1: [4.0, 5.0])), s2(p0: s0(p0: [[6.0]], p1: [7.0, 8.0]), p1: s0(p0: [[9.0]], p1: [10.0, 11.0])), s2(p0: s0(p0: [[12.0]], p1: [13.0, 14.0]), p1: s0(p0: [[15.0]], p1: [16.0, 17.0]))]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
