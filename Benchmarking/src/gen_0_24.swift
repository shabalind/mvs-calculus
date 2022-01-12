  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f44(_ v0: s1) -> s1 {
    let v2: [s0] = v0.p0
    let v13: s1 = s1(p0: v2, p1: v2)
    let v22: [s0] = v0.p0
    let v86: [s0] = v13.p1
    let v64: s1 = s1(p0: v86, p1: v22)
    var v203: s1 = v64
    return v203
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v2: s1 = f44(v0)
    var v3: Double = v1
    let v9: [s0] = v2.p1
    let v4: s0 = v9[1]
    let v29: [[Double]] = v4.p1
    var v22: [[Double]] = v29
    let v28: [Double] = v22[0]
    let v27: [Double] = v22[0]
    let v26: Double = v27[0]
    let v40: [Double] = v22[0]
    v22[0] = v40
    let v58: Double = v28[0]
    let v48: Double = v58 * v3
    let v81: Double = v1 * v48
    let v89: Double = v26 / v81
    return v89
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], p1: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
