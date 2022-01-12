  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v3: Double = v1
    let v6: [s0] = v0.p1
    let v5: [Double] = [v1, v1, v3, v1, v3]
    let v9: s0 = v6[2]
    let v17: Double = v5[1]
    let v16: [[Double]] = v9.p1
    let v29: [Double] = v16[0]
    let v25: Double = v29[0]
    let v49: Double = v17 - v25
    var v54: Double = v49
    return v54
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])])
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
