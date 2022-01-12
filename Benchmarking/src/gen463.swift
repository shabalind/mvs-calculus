  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [[s0]], _ v2: Double) -> Double {
    let v10: [[Double]] = v0.p0
    let v18: [Double] = v10[2]
    let v14: Double = v18[0]
    let v28: [[Double]] = v0.p1
    var v41: [[Double]] = v28
    let v15: Double = v14 - v14
    let v21: [Double] = v41[1]
    var v72: [Double] = v21
    v72[0] = v14
    v72[0] = v14
    var v183: Double = v14
    v72[0] = v15
    let v79: Double = v72[0]
    v72[0] = v79
    let v148: Double = v14 + v79
    let v87: [Double] = [v148, v183, v183]
    let v236: Double = v87[2]
    return v236
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])
    let v1: [[s0]] = [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])]]
    let v2: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
