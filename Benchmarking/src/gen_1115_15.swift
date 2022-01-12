  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f13(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v1: [[Double]] = v6.p0
    var v2: s0 = v6
    v2.p1 = v1
    let v9: [Double] = v1[0]
    let v8: [[Double]] = v6.p1
    let v7: [Double] = v8[0]
    let v13: [[Double]] = v0.p1
    var v4: s0 = v2
    let v12: [[Double]] = v2.p1
    let v16: [[Double]] = v0.p0
    v4.p0 = v8
    var v21: [Double] = v9
    var v10: [[Double]] = v13
    v2.p0 = v16
    let v23: Double = v7[0]
    v10[0] = v21
    v21[0] = v23
    v2 = v4
    let v24: [Double] = v1[0]
    let v54: [[Double]] = v2.p0
    let v55: s0 = s0(p0: v8, p1: v54)
    v4.p1 = v16
    v6 = v55
    let v34: s0 = s0(p0: v12, p1: v10)
    v2.p0 = v10
    v10[0] = v24
    return v34
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: Double) -> Double {
    let v7: s0 = v1[0]
    let v4: s0 = f13(v7)
    let v6: [[Double]] = v4.p0
    let v12: [Double] = v6[0]
    let v40: Double = v12[0]
    return v40
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: [s0] = [s0(p0: [[2.0]], p1: [[3.0]])]
    let v2: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
