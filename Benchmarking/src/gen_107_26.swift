  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v6: [s0] = v0[0]
    let v15: s0 = v6[0]
    let v5: [[Double]] = v15.p1
    let v16: [Double] = v5[2]
    let v13: [[Double]] = v15.p1
    var v33: [[Double]] = v13
    v33[2] = v16
    v33[0] = v16
    let v86: [Double] = v33[2]
    let v58: Double = v86[0]
    return v58
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]]
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
