  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v3: s1 = v0.p0
    let v6: [s0] = v3.p0
    let v16: s0 = v6[0]
    let v20: [[Double]] = v16.p0
    let v27: s0 = v3.p1
    let v23: [Double] = v20[0]
    let v50: [[Double]] = v27.p0
    let v33: Double = v23[0]
    var v56: [Double] = v23
    var v41: [Double] = v56
    v56[0] = v33
    let v130: [Double] = v50[0]
    v41 = v130
    let v82: Double = v23[0]
    v41[0] = v82
    let v278: Double = v41[0]
    return v278
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: [s0(p0: [[0.0]])], p1: s0(p0: [[1.0]])), p1: [s0(p0: [[2.0]]), s0(p0: [[3.0]]), s0(p0: [[4.0]])])
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
