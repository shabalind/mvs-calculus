  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  func f61(_ v0: s0) -> s0 {
    var v2: s0 = v0
    var v1: s0 = v2
    var v5: s0 = v1
    var v15: s0 = v0
    let v13: [[Double]] = v1.p0
    let v10: Double = v5.p1
    v5.p1 = v10
    v15.p0 = v13
    var v29: Double = v10
    var v24: [[Double]] = v13
    v1.p0 = v24
    let v20: Double = v29 / v29
    let v35: [[Double]] = v15.p0
    let v39: s0 = s0(p0: v35, p1: v20)
    v15.p1 = v10
    return v39
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v7: s0 = v0[0]
    var v3: [s0] = v0
    v3[0] = v7
    let v5: s0 = v3[0]
    v3[0] = v7
    v3[0] = v5
    let v11: s0 = f61(v5)
    let v9: s0 = f61(v11)
    v3[0] = v9
    let v42: s0 = f61(v9)
    let v58: Double = v42.p1
    return v58
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: 1.0)]
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
