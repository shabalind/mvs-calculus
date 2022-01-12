  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v2: s0 = v0[1]
    let v9: [[Double]] = v2.p1
    var v10: Double = v1
    let v29: [Double] = v9[0]
    let v12: Double = v10 - v1
    let v15: Double = v29[0]
    let v55: Double = v12 / v10
    let v101: [Double] = [v1, v55, v1, v12, v10]
    let v35: Double = v101[0]
    let v158: Double = v15 - v35
    return v158
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])]
    let v1: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
