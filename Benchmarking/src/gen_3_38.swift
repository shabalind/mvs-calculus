  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f80(_ v0: Double) -> Double {
    var v2: Double = v0
    var v1: Double = v0
    var v4: Double = v0
    let v5: Double = v4 - v2
    var v7: Double = v1
    var v13: Double = v2
    var v8: Double = v7
    v13 = v5
    var v52: Double = v2
    let v34: Double = v8 - v13
    v2 = v52
    return v34
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: Double = f80(v1)
    var v3: Double = v7
    v3 = v1
    v3 = v1
    let v179: Double = f80(v3)
    return v179
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
