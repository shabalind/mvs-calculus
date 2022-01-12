  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v5: Double = v1 * v1
    let v7: [[Double]] = v0.p0
    let v6: [[Double]] = v0.p0
    let v8: [Double] = v7[1]
    let v12: [Double] = v7[1]
    var v47: [Double] = v8
    v47 = v12
    v47[0] = v5
    let v21: [Double] = v6[0]
    let v26: Double = v47[0]
    v47 = v12
    v47 = v21
    return v26
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
