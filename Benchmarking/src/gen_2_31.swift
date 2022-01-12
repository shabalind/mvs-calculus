  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v9: s2 = v0[0]
    let v10: s0 = v9.p1
    let v8: [[Double]] = v10.p0
    let v2: [Double] = v8[1]
    let v40: [[Double]] = v10.p0
    let v21: Double = v2[0]
    let v104: [Double] = v40[1]
    var v60: Double = v21
    let v72: Double = v104[0]
    let v124: Double = v60 * v72
    return v124
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]))]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
