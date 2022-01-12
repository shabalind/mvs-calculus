  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s5 {
    var p0: [s0]
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    let v4: [s0] = v0.p0
    let v7: [s0] = v0.p0
    let v6: s0 = v4[0]
    let v24: s0 = v7[1]
    let v19: [[Double]] = v24.p0
    let v14: [[Double]] = v6.p0
    let v30: [Double] = v19[0]
    var v51: [[Double]] = v14
    let v60: [Double] = v51[0]
    v51[0] = v30
    let v81: Double = v60[0]
    return v81
  }
  func benchmark() {
    let v0: s5 = s5(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])])
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
