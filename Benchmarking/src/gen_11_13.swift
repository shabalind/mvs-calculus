  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: s0
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s3, _ v2: Double) -> Double {
    let v12: s0 = v1.p0
    let v3: [[Double]] = v12.p0
    let v15: s0 = v1.p0
    let v35: [[Double]] = v15.p0
    let v17: [Double] = v35[0]
    let v21: Double = v17[0]
    let v72: Double = v17[0]
    let v32: Double = v21 / v72
    let v54: [Double] = v3[1]
    let v71: Double = v54[0]
    let v177: Double = v71 - v32
    return v177
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]))
    let v1: s3 = s3(p0: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]))
    let v2: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
