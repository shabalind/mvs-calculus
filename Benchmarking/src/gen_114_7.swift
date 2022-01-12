  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v5: s3 = v0
    let v4: s0 = v5.p1
    let v2: [[Double]] = v4.p0
    v5.p1 = v4
    let v3: s0 = v5.p0
    v5.p1 = v4
    let v9: [Double] = v2[2]
    v5.p1 = v3
    v5 = v0
    v5.p1 = v3
    let v20: Double = v9[0]
    return v20
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0], [1.0], [2.0]]), p1: s0(p0: [[3.0], [4.0], [5.0]]))
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
