  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v7: s0 = v0[0]
    var v13: Double = v1
    let v9: [[Double]] = v7.p0
    let v20: [Double] = v9[1]
    v13 = v1
    let v41: [Double] = [v13, v1]
    var v49: [Double] = v41
    let v37: Double = v1 + v13
    var v118: [Double] = v49
    let v127: Double = v20[0]
    v118[1] = v127
    var v128: [Double] = v118
    let v179: Double = v128[0]
    v118[1] = v37
    return v179
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])]
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
