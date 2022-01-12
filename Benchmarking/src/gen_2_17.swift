  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  func f82(_ v0: s0) -> s0 {
    return v0
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v9: [[Double]] = v0.p1
    let v7: [Double] = v9[2]
    var v10: [[Double]] = v9
    let v18: s0 = f82(v0)
    let v15: [[Double]] = v18.p2
    let v27: [Double] = v10[0]
    let v37: [Double] = v15[0]
    v10[1] = v7
    var v75: [Double] = v37
    let v74: Double = v27[0]
    let v86: Double = v75[0]
    var v77: Double = v74
    let v82: Double = v77 - v86
    return v82
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0]])
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
