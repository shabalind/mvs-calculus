  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v2: s0 = v0
    let v5: Double = v1 - v1
    let v4: [[Double]] = v2.p1
    v2.p1 = v4
    let v7: [Double] = v4[0]
    var v6: Double = v1
    var v12: Double = v1
    var v13: Double = v6
    var v25: Double = v6
    var v32: Double = v5
    var v19: Double = v32
    let v47: [Double] = [v32, v25, v19, v25, v12, v13]
    let v56: Double = v7[0]
    let v28: Double = v47[4]
    v13 = v56
    return v28
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
