  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v2: s0 = v0.p0
    let v3: [[Double]] = v2.p0
    var v6: [[Double]] = v3
    let v5: [Double] = v6[0]
    let v7: [Double] = [v1, v1, v1, v1, v1, v1, v1]
    var v4: [Double] = v5
    var v19: [Double] = v7
    let v48: Double = v19[2]
    let v20: Double = v4[0]
    let v30: Double = v20 * v48
    return v30
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))
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
