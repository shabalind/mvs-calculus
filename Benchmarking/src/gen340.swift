  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v7: [[Double]] = v1.p1
    let v8: [[[Double]]] = [v7, v7, v7]
    let v4: [[Double]] = v8[0]
    let v6: [Double] = v4[0]
    var v22: [[Double]] = v7
    let v11: [Double] = v22[0]
    var v19: [Double] = v6
    v22 = v7
    let v14: Double = v11[0]
    let v24: [[Double]] = v1.p0
    v19[0] = v14
    v19[0] = v2
    let v25: [Double] = v24[1]
    v22[2] = v25
    let v41: Double = v2 - v14
    v19[0] = v14
    v19[0] = v2
    let v80: Double = v2 / v41
    v22[0] = v19
    return v80
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])
    let v1: s0 = s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])
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
