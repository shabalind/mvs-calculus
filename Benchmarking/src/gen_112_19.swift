  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [[s1]]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v7: s2 = v0
    let v4: [[s1]] = v0.p1
    v7.p1 = v4
    let v2: s1 = v7.p0
    let v5: [s0] = v2.p0
    let v9: s0 = v5[0]
    v7.p0 = v2
    let v25: [[Double]] = v9.p0
    var v40: s0 = v9
    var v33: s0 = v40
    let v46: [[Double]] = v33.p0
    let v100: [Double] = v46[0]
    let v151: [[Double]] = v33.p0
    var v93: [[Double]] = v151
    v40.p0 = v93
    v40.p0 = v25
    let v77: Double = v100[0]
    return v77
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [s0(p0: [[0.0]])]), p1: [[s1(p0: [s0(p0: [[1.0]])])]])
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
